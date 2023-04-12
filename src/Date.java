/*
1) Being a Date means that you are an instance of the class date.
You have all your own values and can be accessed by using the memory address.
The term Date hold the memory address to the class with all the personalized variables,
not the actual values itself. This is why you cannot use operators like = to compare what is in
different class instances

2)The class can return and set the values of year, month, and day.

3)These should be class level variables because then we can access them at
any time by using the calling object.
 */
public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int m, int d, int y){
        this.month = m;
        this.day = d;
        this.year = y;
    }
    public Date(String newMonth, int newDay, int newYear){
        this.month = toInt(newMonth);
        this.day = newDay;
        this.year = newYear;
    }
    public Date(){
        this.month = 1;
        this.day = 1;
        this.year = 2000;
    }

    private int toInt(String month){
        if (month.equalsIgnoreCase("January")){
            return 1;
        } else if (month.equalsIgnoreCase("February")){
            return 2;
        } else if (month.equalsIgnoreCase("March")){
            return 3;
        } else if (month.equalsIgnoreCase("April")){
            return 4;
        } else if (month.equalsIgnoreCase("May")){
            return 5;
        } else if (month.equalsIgnoreCase("June")){
            return 6;
        } else if (month.equalsIgnoreCase("July")){
            return 7;
        } else if (month.equalsIgnoreCase("August")){
            return 8;
        } else if (month.equalsIgnoreCase("September")){
            return 9;
        } else if (month.equalsIgnoreCase("October")){
            return 10;
        } else if (month.equalsIgnoreCase("November")){
            return 11;
        } else if (month.equalsIgnoreCase("December")){
            return 12;
        } else {
            System.out.println("Not a valid month... Setting month to -1");
            return -1;
        }
    }
    public void setYear(int newYear){
        this.year = newYear;
    }
    public void setMonth(String newMonth){
        this.month = toInt(newMonth);
    }
    public void setMonth(int newMonth){
        if (newMonth < 1 || newMonth > 12){
            System.out.println("Not a valid month... Setting month to -1");
            this.month = -1;
        } else {
            this.month = newMonth;
        }
    }
    public void setDay(int newDay){
        this.day = newDay;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }

    public void report(){
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }
    public static void main(String[] args){
        Date date1 = new Date(5, 14, 2003);
        date1.report();
    }
}
