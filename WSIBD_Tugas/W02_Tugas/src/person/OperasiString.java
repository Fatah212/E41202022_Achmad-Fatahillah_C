package person;

public class OperasiString {

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        System.out.println("CompareTo : " + s1.compareTo(s2));
        System.out.println("Equals : " + s2.equals(s3));
        System.out.println(s3 == s1);
        System.out.println("CompareTo : " + s2.compareTo(s3));
        System.out.println("Equals : " + s3.equals(s1));
    }

}
