import org.apache.poi.ss.usermodel.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.*;
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
        File file = new File("c.xlsx");

        try {

            FileInputStream fip = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fip);

            if (file.isFile() && file.exists()) {
                Sheet sheet = workbook.getSheet("c1");
                Sheet sheet2 = workbook.getSheet("c2");
                sheet.createRow(0).createCell(0).setCellValue("hi");
                FileOutputStream outputStream = new FileOutputStream(file);

                ArrayList<Cell> cells = new ArrayList();
                ArrayList<Cell> cells2 = new ArrayList();
                Row row10 = sheet.getRow(4);

                Row row11 = sheet.getRow(7);

                try {

                    int i =15;
                    int d= 0;
                    while (i>=0){

                        System.out.println(i + " i  d "+ d);
                        int n=  arrayList.get(d).getId()%100;
                        int anne = arrayList.get(d).getId()/100;



                        cells.add(d,row10.createCell(i));

                        cells2.add(d,row11.createCell(i));
                        cells2.get(d).setCellValue(arrayList.get(d).getRevenues());

                        if(n<10){
                            cells.get(d).setCellValue(anne+"/0"+n);
                        }else {
                            cells.get(d).setCellValue(anne+"/"+n);
                        }
                        i=i-3;
                        d++;
                    }

                   sheet2.getRow(8).getCell(21).setCellValue(arrayList.get(6).getRevenues());


                    Row row13 = sheet2.getRow(5);
                    Cell cell = row13.getCell(21);
                    int n=  arrayList.get(6).getId()%100;
                    int anne = arrayList.get(6).getId()/100;
                    if(n<10){
                        cell.setCellValue(anne+"/0"+n);
                    }else {
                        cell.setCellValue(anne+"/"+n);

                    }










                }catch (Exception e){
                    System.out.println(e.getMessage());


                }

                // Show description - row  24 - 31 cell - s
                try {
                    ArrayList <Row>rows = new ArrayList();
                    for (int i =0; i<arrayList.size();i++){
                        rows.add(sheet.createRow(24+i));
                        Cell cell12 = rows.get(i).createCell(18);
                        cell12.setCellValue(arrayList.get(i).getDescription());


                    }
                }catch (Exception e){

                }

                //write data in the excel file

                 workbook.write(outputStream);


                System.out.println("Geeks.xlsx open");

            }
            else {
                System.out.println("Geeks.xlsx either not exist");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
//        System.out.println("---------------------------------------------------)-");
//        T1Db t1Db = new T1Db();
//     ArrayList <T1> arrayList= t1Db.getT1();
//        Collections.sort(arrayList,T1.T1IDComparator);
//            for (T1 t1 : arrayList){
//                System.out.println("---------------------------------------------------)-");
//                t1.show();
//                System.out.println("---------------------------------------------------)-");
//            }
//
//        System.out.println("---------------------------------------------------)-");
//
//        Workbook workbook = new HSSFWorkbook();
//        try {
//
//            Sheet sheet = workbook.createSheet("eggs");
//            C1 c1 = new C1(workbook,sheet);
//            FileOutputStream fileOutputStream = c1.makeC1(arrayList);
//            workbook.write(fileOutputStream);
//            fileOutputStream.close();
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }

}
