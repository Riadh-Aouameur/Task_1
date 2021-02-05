import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class InsertDataIntoExcelFile {

    // Fun sort an array List

    public ArrayList <T1> sortT1Array(ArrayList <T1> arrayList) {

        ArrayList <T1> sortedArray = new ArrayList<>();
            int k=0;
            int j=0;
            int i=0;

        while (i<12){


            if (k==7&&arrayList.get(i).getAtribueX().equals("230")){
                return sortedArray;
            }else {
                if(arrayList.get(i).getAtribueX().equals("230")){
                    sortedArray.add(arrayList.get(i));
                    k++;

                }

            }


            if (j==4&&arrayList.get(i).getAtribueX().equals("214")){
                return sortedArray;
            }else {
                if(arrayList.get(i).getAtribueX().equals("214")){
                    sortedArray.add(arrayList.get(i));
                    j++;

                }

            }
            i++;


        }





        return sortedArray;
    }
    //Fun create array xyd
    public ArrayList <XYD> createArrayXYD(ArrayList <T1> arrayList ,int y ,int x,int y230,int y214 ){
        int i = x+1;
        int k=0;
        int j214=y214+1;
        int j230=y230+1;
        ArrayList <XYD> xyds = new ArrayList<>();
        while (k<arrayList.size()){
            xyds.add(new XYD(i,y,String.valueOf(arrayList.get(k).getId())) );

            if(arrayList.get(k).getAtribueX().equals("230")){
                xyds.add(new XYD(x,j230,arrayList.get(k).getDescription()) );

                xyds.add(new XYD(i,j230,arrayList.get(k).getRevenues().toString()) );
                j230++;

            }
            if(arrayList.get(k).getAtribueX().equals("214")){
                xyds.add(new XYD(x,j214,arrayList.get(k).getDescription()) );

                xyds.add(new XYD(i,j214,arrayList.get(k).getRevenues().toString()) );
                j214++;

            }
            i++;
            k++;
        }



        return xyds;
    }

    //Fun insert xyd in file.xlxs
    public void   insertXYDInFile( Sheet sheet ,ArrayList <XYD> xyds){

        for (XYD xyd: xyds){
            Row row = sheet.getRow(xyd.getY());
               Cell cell= row .createCell(xyd.getX());
               cell.setCellValue(xyd.getData());

        }


    }


}
