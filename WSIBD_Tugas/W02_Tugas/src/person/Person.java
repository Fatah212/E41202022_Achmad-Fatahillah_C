package person;
public class Person {

    String fName, lName, stuId, stuStatus;

    public Person(String fName, String lName, String stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    public static void main(String[] args) {

        String fName = "Lisa ";
        String lName = "Palombo";
        String stuStatus = "Active";
        int stuId = 123456789;

        System.out.println("Student Name: " + fName + lName);
        System.out.println("Student Status: " + stuStatus);
        System.out.println("Student ID: " + stuId);

    }

}
