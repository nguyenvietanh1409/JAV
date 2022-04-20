package Java1_11;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day,int month, int year){
        if (day>=1 && day <=31){
            this.day = day;
        }
        else {
            System.out.println("Incorrect day");
        }
        if (month>=1 && month <=12){
            this.month = month;
        }
        else {
            System.out.println("Incorrect month");
        }
        if (year>=1900 && year <=9999){
            this.year = year;
        }
        else {
            System.out.println("Incorrect year");
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day>=1 && day <=31){
            this.day = day;
        }
        else {
            System.out.println("Incorrect day");
        }
    }

    public void setMonth(int month) {
        if (month>=1 && month <=12){
            this.month = month;
        }
        else {
            System.out.println("Incorrect month");
        }
    }

    public void setYear(int year) {
        if (year>=1900 && year <=9999){
            this.year = year;
        }
        else {
            System.out.println("Incorrect year");
        }
    }
    public void setDate(int day, int month, int year){
        if (day>=1 && day <=31){
            this.day = day;
        }
        else {
            System.out.println("Incorrect day");
        }
        if (month>=1 && month <=12){
            this.month = month;
        }
        else {
            System.out.println("Incorrect month");
        }
        if (year>=1900 && year <=9999){
            this.year = year;
        }
        else {
            System.out.println("Incorrect year");
        }
    }

    public String toString(){
        return day+"/"+month+"/"+year;
    }
}
