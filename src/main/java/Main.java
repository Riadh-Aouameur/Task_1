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






            workbook.write(fileOutputStream);
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

    }

}
