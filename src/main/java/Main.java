import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------)-");
        T1Db t1Db = new T1Db();
     ArrayList <T1> arrayList= t1Db.getT1();
        Collections.sort(arrayList,T1.T1IDComparator);
            for (T1 t1 : arrayList){
                System.out.println("---------------------------------------------------)-");
                t1.show();
                System.out.println("---------------------------------------------------)-");
            }

        System.out.println("---------------------------------------------------)-");

        Workbook workbook = new HSSFWorkbook();
        try {

            Sheet sheet = workbook.createSheet("eggs");
            C1 c1 = new C1(workbook,sheet);
            FileOutputStream fileOutputStream = c1.makeC1(arrayList);
            workbook.write(fileOutputStream);
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
