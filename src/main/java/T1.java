import java.util.Comparator;

public class T1 {

    String id;
    String description;
    String atribueX;
    Float revenues;
    Float expenses;
    String projectType;

    public T1(String id, String description, String atribueX, Float revenues, Float expenses, String projectType) {
        this.id = id;
        this.description = description;
        this.atribueX = atribueX;
        this.revenues = revenues;
        this.expenses = expenses;
        this.projectType = projectType;
    }
    public static Comparator<T1> T1IDUNVERSEComparator = new Comparator<T1>() {

        public int compare(T1 s1, T1 s2) {
            String[] sp1 = s1.getId().split("/");
            String[] sp2 = s2.getId().split("/");
            int year1 = Integer.parseInt(sp1[0]);
            int year2 = Integer.parseInt(sp2[0]);
            int nb1 = Integer.parseInt(sp2[1]);
            int nb2 = Integer.parseInt(sp2[1]);


            if(year1==year2){
                if(nb1<nb2){
                    return -1;

                }
                else{
                    return 1;

                }


            }else {

                return year2-year1;
            }

        }
    };
    public static Comparator<T1> T1IDComparator = new Comparator<T1>() {

        public int compare(T1 s1, T1 s2) {


            String[] sp1 = s1.getId().split("/");
            String[] sp2 = s2.getId().split("/");
                int year1 = Integer.parseInt(sp1[0]);
                int year2 = Integer.parseInt(sp2[0]);
                int nb1 = Integer.parseInt(sp2[1]);
                int nb2 = Integer.parseInt(sp2[1]);


                if(year1== year2){
                    if(nb1<nb2){
                        return -1;

                    }
                    else{
                            return 1;

                    }


                }else {

                    return year1-year2;
                }








        }
    };
    void show() {
        System.out.println("id : " + this.id);

//        System.out.println("description : " + this.description);
//        System.out.println("atribueX : " + this.atribueX);
//        System.out.println("revenues : " + this.revenues);
//        System.out.println("expenses : " + this.expenses);
//        System.out.println("projectType : " + this.projectType);

    }

    public Float getExpenses() {
        return expenses;
    }

    public void setExpenses(Float expenses) {
        this.expenses = expenses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAtribueX() {
        return atribueX;
    }

    public void setAtribueX(String atribueX) {
        this.atribueX = atribueX;
    }

    public Float getRevenues() {
        return revenues;
    }

    public void setRevenues(Float revenues) {
        this.revenues = revenues;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }


}
