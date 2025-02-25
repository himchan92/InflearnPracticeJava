package middle1.lang.immutable.test;

public class ImmuableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //불변객체는 값 복사로 변경안되어 변경 필요시 객체 생성하여 변경해야한다.
    public ImmuableMyDate withYear(int newYear) {
        return new ImmuableMyDate(newYear, month, day);
    }

    public ImmuableMyDate withMonth(int newMonth) {
        return new ImmuableMyDate(year, newMonth, day);
    }

    public ImmuableMyDate withDay(int newDay) {
        return new ImmuableMyDate(year, month, newDay);
    }

    // Object 제공 메소드로 객체 참조값 확인위해 사용
    @Override
    public String toString() {
        return "ImmuableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
