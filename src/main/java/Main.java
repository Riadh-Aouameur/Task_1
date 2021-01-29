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
            FileOutputStream fileOutputStream = new FileOutputStream("t.xls");
            Sheet sheet = workbook.createSheet("eggs");

            sheet.addMergedRegion(new CellRangeAddress(0,0,0,19));
            sheet.addMergedRegion(new CellRangeAddress(1,1,0,19));
            sheet.addMergedRegion(new CellRangeAddress(3,5,18,19));


            sheet.addMergedRegion(new CellRangeAddress(4,4,0,2));
            sheet.addMergedRegion(new CellRangeAddress(4,4,3,5));
            sheet.addMergedRegion(new CellRangeAddress(4,4,6,8));
            sheet.addMergedRegion(new CellRangeAddress(4,4,9,11));
            sheet.addMergedRegion(new CellRangeAddress(4,4,12,14));
            sheet.addMergedRegion(new CellRangeAddress(4,4,15,17));

            sheet.addMergedRegion(new CellRangeAddress(40,40,18,19));
            sheet.addMergedRegion(new CellRangeAddress(41,41,18,19));

            for( int i = 6 ;i<78 ;i++){
                sheet.addMergedRegion(new CellRangeAddress(i,i,0,2));
                sheet.addMergedRegion(new CellRangeAddress(i,i,3,5));
                sheet.addMergedRegion(new CellRangeAddress(i,i,6,8));
                sheet.addMergedRegion(new CellRangeAddress(i,i,9,11));
                sheet.addMergedRegion(new CellRangeAddress(i,i,12,14));
                sheet.addMergedRegion(new CellRangeAddress(i,i,15,17));
            }




            CellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
            cellStyle.setAlignment(HorizontalAlignment.CENTER);
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue("- 5 ج 1 -");
            cell.setCellStyle(cellStyle);

            Row row1 = sheet.createRow(1);
            Cell cell1 = row1.createCell(0);
            cell1.setCellValue("القســــــــــــم الفـــــــــــرعي للتجهيـــــــــــــز العمـــــــــــومي - ورقــــــــة ج - البـــــرامـج  الجـــــــــــــديــــــــــــدة");
            cell1.setCellStyle(cellStyle);

            Row row2 = sheet.createRow(3);
            Cell cell2 = row2.createCell(18);
            cell2.setCellValue("تــــبــــيـــــــــــان");
            cell2.setCellStyle(cellStyle);

            Row row3 = sheet.createRow(7);
            Cell cell3 = row3.createCell(18);
            cell3.setCellValue("مجموع النفقات............................");
            cell3.setCellStyle(cellStyle);

            Row row4 = sheet.createRow(11);
            Cell cell4 = row4.createCell(18);
            cell4.setCellValue("ج 212 - اقتنـــــــاء العـــقــارات ");
            cell4.setCellStyle(cellStyle);

            Row row5 = sheet.createRow(15);
            Cell cell5 = row5.createCell(18);
            cell5.setCellValue("ج 214 - اقتنـــــــاء المنقـــــــولات و العتـــــاد الكبيــــــر");
            cell5.setCellStyle(cellStyle);

            Row row6 = sheet.createRow(23);
            Cell cell6 = row6.createCell(18);
            cell6.setCellValue("ج 230 أشـــــــــغـــــــال جــــديـــــــدة ");
            cell6.setCellStyle(cellStyle);


            Row row7 = sheet.createRow(31);
            Cell cell7 = row7.createCell(18);
            cell7.setCellValue("ج 231 - تصليحــــــــــات كبــــــــــرى");
            cell7.setCellStyle(cellStyle);

            Row row8 = sheet.createRow(40);
            Cell cell8 = row8.createCell(18);
            cell8.setCellValue("ج   260 - اقتـــــنـــاء سنــــــــــــدات الــــدولــة أو المـؤسســـات العمـوميــة");
            cell8.setCellStyle(cellStyle);

            Row row9 = sheet.createRow(41);
            Cell cell9 = row9.createCell(18);
            cell9.setCellValue("الـــوطنيـــة..........................................................................................");
            cell9.setCellStyle(cellStyle);

             ArrayList<Row> rows = new ArrayList();
             ArrayList<Cell> cells = new ArrayList();
            Row row10 = sheet.createRow(4);
            try {
            for (int i =0 ;i<=6;i++){

                    int n=  arrayList.get(i).getId()%100;
                    int anne = arrayList.get(i).getId()/100;
                    System.out.println("N = "+n);
                    System.out.println("Anne = "+anne);

                    int k= i*3;
                    cells.add(i,row10.createCell(k));
                    if(n<10){
                        cells.get(i).setCellValue(anne+"/0"+n);
                    }else {
                        cells.get(i).setCellValue(anne+"/"+n);
                    }
                    cells.get(i).setCellStyle(cellStyle);



            }

            }catch (Exception e){
                System.out.println(e.getMessage());


            }






            workbook.write(fileOutputStream);
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
