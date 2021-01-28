import java.util.Comparator;

public class T1 {
    public static Comparator<T1> T1RevenuesComparator = new Comparator<T1>() {

        public int compare(T1 s1, T1 s2) {
           Float StudentName1 = s1.getRevenues();
            Float StudentName2 = s2.getRevenues();


            return StudentName1.compareTo(StudentName2);

        }};
    public static Comparator<T1> T1IDComparator = new Comparator<T1>() {

        public int compare(T1 s1, T1 s2) {

            int rollno1 = s1.getId();
            int rollno2 = s2.getId();


            return rollno1-rollno2;


        }};
    int id;
    String description;
    String atribueX;
    Float revenues;
    String projectType;

    public T1(int id, String description, String atribueX, Float revenues, String projectType) {
        this.id = id;
        this.description = description;
        this.atribueX = atribueX;
        this.revenues = revenues;
        this.projectType = projectType;
    }

    void show (){
        System.out.println("id : "+this.id);
        System.out.println("description : "+this.description);
        System.out.println("atribueX : "+this.atribueX);
        System.out.println("revenues : "+this.revenues);
        System.out.println("projectType : "+this.projectType);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
