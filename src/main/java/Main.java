import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

                    // Load o objects from database and sort them
                        System.out.println("---------------------------------------------------)-");
                T1Db t1Db = new T1Db();
             ArrayList <T1> arrayList= t1Db.getT1();
                Collections.sort(arrayList,T1.T1IDUNVERSEComparator);
                    for (T1 t1 : arrayList){
                        System.out.println("---------------------------------------------------)-");
                        t1.show();

                        System.out.println("---------------------------------------------------)-");
                    }

                System.out.println("---------------------------------------------------)-");



        try {

            File file = new File("copyModel.xlsx");


            //open existing file c.xlxs
            FileInputStream fip = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fip);

            if (file.isFile() && file.exists()) {
                //get sheets from c.xlxs
                Sheet sheet = workbook.getSheet("Feuil1");
                FileOutputStream outputStream = new FileOutputStream(file);
                InsertDataIntoExcelFile insertDataIntoExcelFile = new InsertDataIntoExcelFile();
                ArrayList<T1> t1s = insertDataIntoExcelFile.sortT1Array(arrayList);
                ArrayList<XYD> xyds = insertDataIntoExcelFile.createArrayXYD(t1s, 3, 1, 22, 14);
                insertDataIntoExcelFile.insertXYDInFile( sheet, xyds);
                workbook.write(outputStream);
                outputStream.close();


            }
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }



    }}


