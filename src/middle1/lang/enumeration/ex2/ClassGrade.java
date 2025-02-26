package middle1.lang.enumeration.ex2;

public class ClassGrade {
    //변경불가 상수 선언위해 static final 부여
    //각각 인스턴스 생성(new)
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
}