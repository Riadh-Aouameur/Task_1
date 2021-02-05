//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.hssf.util.HSSFColor;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.ss.util.CellRangeAddress;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//
//public class C1 {
//
//    Workbook workbook ;
//    FileOutputStream fileOutputStream ;
//    Sheet sheet;
//
//    public C1(Workbook workbook, Sheet sheet) {
//        this.workbook = workbook;
//        try {
//            this.fileOutputStream =  new FileOutputStream("t.xls");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        this.sheet = sheet;
//    }
//
//    public  FileOutputStream makeC1( ArrayList <T1>arrayList){
//
//        sheet.setColumnWidth(1, 600);
//
//        sheet.addMergedRegion(new CellRangeAddress(0,0,0,19));
//        sheet.addMergedRegion(new CellRangeAddress(1,1,0,19));
//        sheet.addMergedRegion(new CellRangeAddress(3,5,18,19));
//
//        sheet.addMergedRegion(new CellRangeAddress(4,4,0,2));
//        sheet.addMergedRegion(new CellRangeAddress(4,4,3,5));
//        sheet.addMergedRegion(new CellRangeAddress(4,4,6,8));
//        sheet.addMergedRegion(new CellRangeAddress(4,4,9,11));
//        sheet.addMergedRegion(new CellRangeAddress(4,4,12,14));
//        sheet.addMergedRegion(new CellRangeAddress(4,4,15,17));
//
//        sheet.addMergedRegion(new CellRangeAddress(40,40,18,19));
//        sheet.addMergedRegion(new CellRangeAddress(41,41,18,19));
//
//
//        for( int i = 6 ;i<78 ;i++){
//            sheet.addMergedRegion(new CellRangeAddress(i,i,0,2));
//            sheet.addMergedRegion(new CellRangeAddress(i,i,3,5));
//            sheet.addMergedRegion(new CellRangeAddress(i,i,6,8));
//            sheet.addMergedRegion(new CellRangeAddress(i,i,9,11));
//            sheet.addMergedRegion(new CellRangeAddress(i,i,12,14));
//            sheet.addMergedRegion(new CellRangeAddress(i,i,15,17));
//        }
//
//        sheet.addMergedRegion(new CellRangeAddress(42,42,18,19));
//        sheet.addMergedRegion(new CellRangeAddress(43,43,18,19));
//        sheet.addMergedRegion(new CellRangeAddress(44,44,18,19));
//        sheet.addMergedRegion(new CellRangeAddress(45,45,18,19));
//        sheet.addMergedRegion(new CellRangeAddress(46,46,18,19));
//        sheet.addMergedRegion(new CellRangeAddress(47,47,18,19));
//        sheet.getPrintSetup().setPaperSize(PrintSetup.A4_PAPERSIZE);
//
//
//
//
//        CellStyle cellStyle = workbook.createCellStyle();
//
//        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
//        cellStyle.setAlignment(HorizontalAlignment.CENTER);
//        Font font = workbook.createFont();
//        font.setColor(HSSFColor.HSSFColorPredefined.GREEN.getIndex());
//        cellStyle.setFont(font);
//
//        CellStyle style = workbook.createCellStyle();
//        style.setBorderBottom(BorderStyle.THIN);
//        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderLeft(BorderStyle.THIN);
//        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderRight(BorderStyle.THIN);
//        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderTop(BorderStyle.THIN);
//        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
//
//
//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("- 5 ج 1 -");
//        cell.setCellStyle(cellStyle);
//
//        Row row1 = sheet.createRow(1);
//        Cell cell1 = row1.createCell(0);
//        cell1.setCellValue("القســــــــــــم الفـــــــــــرعي للتجهيـــــــــــــز العمـــــــــــومي - ورقــــــــة ج - البـــــرامـج  الجـــــــــــــديــــــــــــدة");
//       cell1.setCellStyle(style);
//
//        Row row2 = sheet.createRow(3);
//        Cell cell2 = row2.createCell(18);
//        cell2.setCellValue("تــــبــــيـــــــــــان");
//        cell2.setCellStyle(cellStyle);
//
//        Row row3 = sheet.createRow(7);
//        Cell cell3 = row3.createCell(18);
//        cell3.setCellValue("مجموع النفقات............................");
//        cell3.setCellStyle(cellStyle);
//
//        Row row4 = sheet.createRow(11);
//        Cell cell4 = row4.createCell(18);
//        cell4.setCellValue("ج 212 - اقتنـــــــاء العـــقــارات ");
//        cell4.setCellStyle(cellStyle);
//
//        Row row5 = sheet.createRow(15);
//        Cell cell5 = row5.createCell(18);
//        cell5.setCellValue("ج 214 - اقتنـــــــاء المنقـــــــولات و العتـــــاد الكبيــــــر");
//        cell5.setCellStyle(cellStyle);
//
//        Row row6 = sheet.createRow(23);
//        Cell cell6 = row6.createCell(18);
//        cell6.setCellValue("ج 230 أشـــــــــغـــــــال جــــديـــــــدة ");
//        cell6.setCellStyle(cellStyle);
//
//
//        Row row7 = sheet.createRow(31);
//        Cell cell7 = row7.createCell(18);
//        cell7.setCellValue("ج 231 - تصليحــــــــــات كبــــــــــرى");
//        cell7.setCellStyle(cellStyle);
//
//        Row row8 = sheet.createRow(40);
//        Cell cell8 = row8.createCell(18);
//        cell8.setCellValue("ج   260 - اقتـــــنـــاء سنــــــــــــدات الــــدولــة أو المـؤسســـات العمـوميــة");
//        cell8.setCellStyle(cellStyle);
//
//        Row row9 = sheet.createRow(41);
//        Cell cell9 = row9.createCell(18);
//        cell9.setCellValue("الـــوطنيـــة..........................................................................................");
//        cell9.setCellStyle(cellStyle);
//
//
//        ArrayList<Cell> cells = new ArrayList();
//        Row row10 = sheet.createRow(4);
//        try {
//
//            int i =5;
//            int d= 0;
//            while (d<=arrayList.size()){
//
//
//                int n=  arrayList.get(d).getId()%100;
//                int anne = arrayList.get(d).getId()/100;
//                System.out.println("N = "+n);
//                System.out.println("Anne = "+anne);
//                int k= i*3;
//
//
//                cells.add(d,row10.createCell(k));
//                cells.get(d).setCellValue("kkkkk");
//                if(n<10){
//                    cells.get(d).setCellValue(anne+"/0"+n);
//                }else {
//                    cells.get(d).setCellValue(anne+"/"+n);
//                }
//
//
//
//                i--;
//                d++;
//            }
//
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//
//
//        }
//
//        ArrayList <Row>rows = new ArrayList();
//            for (int i =0; i<7;i++){
//                rows.add(sheet.createRow(24+i));
//                Cell cell12 = rows.get(i).createCell(18);
//                cell12.setCellValue("jjjj");
//
//
//            }
//
//
//        Row row11 = sheet.createRow(42);
//        Cell cell11 = row11.createCell(18);
//        cell11.setCellValue("مجموع الايــرادات......................");
//        cell11.setCellStyle(cellStyle);
//
//        Row row12 = sheet.createRow(43);
//        Cell cell12 = row12.createCell(18);
//        cell12.setCellValue(" ج 0820 - فائض مـــرحل................................................");
//        cell12.setCellStyle(cellStyle);
//
//        Row row13 = sheet.createRow(44);
//        Cell cell13 = row13.createCell(18);
//        cell13.setCellValue("ج     01 - نقل من القسم الفرعي للاستثمار الاقتصادي.........");
//        cell13.setCellStyle(cellStyle);
//
//        Row row14 = sheet.createRow(45);
//        Cell cell14 = row14.createCell(18);
//        cell14.setCellValue("ج    100 - الاقتطاع من أيـــرادات التسييـــر.......................");
//        cell14.setCellStyle(cellStyle);
//
//        Row row15 = sheet.createRow(46);
//        Cell cell15 = row15.createCell(18);
//        cell15.setCellValue(" ج    103 - هـــــبــــات و وصـــــــايا...............................");
//        cell15.setCellStyle(cellStyle);
//
//        Row row16 = sheet.createRow(47);
//        Cell cell16 = row16.createCell(18);
//        cell16.setCellValue(" ج 105 - اعــــــــــانــــــات");
//        cell16.setCellStyle(cellStyle);
//
//        Row row17 = sheet.createRow(49);
//        Cell cell17 = row17.createCell(18);
//        cell17.setCellValue(" ج 1050 - اعــــانــــات الــــدولــــــــة.....................");
//        cell17.setCellStyle(cellStyle);
//
//
//
//
//
//
//
//        Row row18 = sheet.createRow(56);
//        Cell cell18 = row18.createCell(18);
//        cell18.setCellValue(" ج 1051-اعــــــانـــــات الـــــــولايــــــة");
//        cell18.setCellStyle(cellStyle);
//
//
//
//
//
//        Row row19 = sheet.createRow(61);
//        Cell cell19 = row19.createCell(18);
//        cell19.setCellValue("ج 1052 - أمـــوال  للتضــــــــــامـــن................................");
//        cell19.setCellStyle(cellStyle);
//
//        Row row21 = sheet.createRow(66);
//        Cell cell21 = row21.createCell(18);
//        cell21.setCellValue("ج 1059 - اعــــــــــــانـــــات أخـــــــــرى........................");
//        cell21.setCellStyle(cellStyle);
//
//        Row row22 = sheet.createRow(68);
//        Cell cell22 = row22.createCell(18);
//        cell22.setCellValue("ج 160 - نــــــــاتـــــــج الاقتـــــــراضــــــــات");
//        cell22.setCellStyle(cellStyle);
//
//        Row row23 = sheet.createRow(70);
//        Cell cell23 = row23.createCell(18);
//        cell23.setCellValue("ج 212 - التـــصــــرف في العــقـــارات");
//        cell23.setCellStyle(cellStyle);
//
//
//        Row row24 = sheet.createRow(72);
//        Cell cell24 = row24.createCell(18);
//        cell24.setCellValue("ج 240 - التصــرف فــي المنقــــولات و العتــــاد الكبيـــــــر");
//        cell24.setCellStyle(cellStyle);
//
//        Row row25 = sheet.createRow(74);
//        Cell cell25 = row25.createCell(18);
//        cell25.setCellValue("ج 240 - تـــعـــويض أضــــرار الــكـــوارث......................");
//        cell25.setCellStyle(cellStyle);
//
//        Row row26 = sheet.createRow(75);
//        Cell cell26 = row26.createCell(18);
//        cell26.setCellValue("ج 260 - التصـــرف في سنــــدات الــــدولــــة أو المـــؤسســات العمــوميــــة");
//        cell26.setCellStyle(cellStyle);
//
//        Row row27 = sheet.createRow(76);
//        Cell cell27 = row27.createCell(18);
//        cell27.setCellValue("الـــوطنيـــة..........................................................");
//        cell27.setCellStyle(cellStyle);
//
//        Row row28 = sheet.createRow(77);
//        Cell cell28 = row28.createCell(18);
//        cell28.setCellValue("ج 0850 - فـــــــائـــض الايــــــــرادات...........................");
//        cell28.setCellStyle(cellStyle);
//
//        return this.fileOutputStream;
//
//    }
//}
