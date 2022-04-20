package Java1_11;

public class TestTime {
    public static void main(String[] args){
        Time t1 = new Time(15,45,50);
        System.out.println("Hour: "+ t1.getHour());
        System.out.println("Minute: "+ t1.getMinute());
        System.out.println("Second: "+ t1.getSecond());

        t1.setHour(16);
        t1.setMinute(30);
        t1.setSecond(40);

        System.out.println("After set");
        System.out.println("Hour: "+ t1.getHour());
        System.out.println("Minute: "+ t1.getMinute());
        System.out.println("Second: "+ t1.getSecond());

        t1.setTime(7,0,0);
        System.out.println("After setTime");
        System.out.println("Hour: "+ t1.getHour());
        System.out.println("Minute: "+ t1.getMinute());
        System.out.println("Second: "+ t1.getSecond());

        System.out.println(t1.toString());

        t1.nextSecond();
        System.out.println("After nextSecond");
        System.out.println(t1.toString());

        t1.setTime(7,0,0);
        t1.previousSecond();
        System.out.println("After previousSecond");
        System.out.println(t1.toString());
    }
}
