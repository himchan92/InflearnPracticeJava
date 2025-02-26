package middle1.lang.enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();

        for(AuthGrade authGrade : authGrades) {
            System.out.println(authGrade.name() + " : " + authGrade.getLevel() + ", " + authGrade.getDescription());
        }
    }

}