package Java1_11;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second){
        if (hour >=0 && hour <= 23){
            this.hour = hour;
        }
        else{
            System.out.println("Incorrect hour");
        }
        if (minute >=0 && minute <= 23){
            this.minute = minute;
        }
        else{
            System.out.println("Incorrect minute");
        }
        if (second >=0 && second <= 23){
            this.second = second;
        }
        else{
            System.out.println("Incorrect second");
        }
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=0 && hour <= 23){
            this.hour = hour;
        }
        else{
            System.out.println("Incorrect hour");
        }
    }

    public void setMinute(int minute) {
        if (minute >=0 && minute <= 23){
            this.minute = minute;
        }
        else{
            System.out.println("Incorrect minute");
        }
    }

    public void setSecond(int second) {
        if (second >=0 && second <= 23){
            this.second = second;
        }
        else{
            System.out.println("Incorrect second");
        }
    }
    public void setTime(int hour,int minute,int second){
        if (hour >=0 && hour <= 23){
            this.hour = hour;
        }
        else{
            System.out.println("Incorrect hour");
        }
        if (minute >=0 && minute <= 23){
            this.minute = minute;
        }
        else{
            System.out.println("Incorrect minute");
        }
        if (second >=0 && second <= 23){
            this.second = second;
        }
        else{
            System.out.println("Incorrect second");
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
    public void nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return;
        }
        if (minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
            return;
        }
        if (second == 59) {
            minute++;
            second = 0;
            return;
        }
        second++;
    }

    public void previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return;
        }
        second--;
    }
}
