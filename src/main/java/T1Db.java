import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class T1Db {
    private Connection con;
    private Statement st;
    private ResultSet rs;

    public T1Db() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3305/task_1?autoReconnect=true&useSSL=false", "root", "1234");
            st = con.createStatement();

        } catch (Exception ex) {
            System.out.println("Errer : " + ex);

        }


    }

    public ArrayList<T1> getT1() {
        ArrayList<T1> arrayList = new ArrayList<>();
        try {

            String query = "select * from T1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                float revenues  = rs.getFloat("revenues");
                String atribueX = rs.getString("atribueX");
                String iDescription = rs.getString("iDescription");
                String projectType = rs.getString("projectType");

                T1 t1 = new T1( id, iDescription, atribueX,  revenues, projectType);
                arrayList.add(t1);

                //CREATE TABLE T1 (
                //id INT(6) AUTO_INCREMENT not null,
                //projectType VARCHAR(32) NOT NULL,
                //atribueX VARCHAR(32) NOT NULL,
                //iDescription VARCHAR(64) NOT NULL,
                //revenues float NOT NULL,
                //PRIMARY KEY(id));

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }


        return arrayList;


    }

}
