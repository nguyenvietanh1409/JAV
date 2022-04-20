package Java1_11;

public class TestDate {
    public static void main(String[] args){
        Date d1 = new Date(14,9,2003);
        System.out.println("Day: "+d1.getDay());
        System.out.println("Month: "+d1.getMonth());
        System.out.println("Year: "+d1.getYear());

        d1.setDay(20);
        d1.setMonth(4);
        d1.setYear(2022);
        d1.setDate(17,7,2003);
        System.out.println(d1.toString());

    }
}
