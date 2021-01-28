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

    }

}
