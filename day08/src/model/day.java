package model;

public class day {
    private int day, month, year;

    public day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public day(){};

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
        if (day <= 0) {
            System.out.println("Day can not be negative");
            return;
        }
        if(this.getMonth() == 1 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 2 && this.getYear() % 4 == 0 && day > 29) { //Năm nhuận
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 2 && this.getYear() % 4 != 0 && day > 28) { //Năm ko nhuận
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 3 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 4 && day > 30) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 5 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 6 && day > 30) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 7 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 8 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 9 && day > 30) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 10 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 11 && day > 30) {
            System.out.println("Invalid day");
            return;
        }
        if(this.getMonth() == 12 && day > 31) {
            System.out.println("Invalid day");
            return;
        }

        if(this.getMonth() == 1 && day > 31) {
            System.out.println("Invalid day");
            return;
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month <= 0) {
            System.out.println("Month can not be negative");
            return;
        }
        if (month > 12) {
            System.out.println("Month is between 1 and 12");
            return;
        }
        this.month = month;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Year can not be negative");
            return;
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
