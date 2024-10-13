package myDate;
import java.util.Scanner;

public class myDate {
    int day;
    int month;
    int year;

    public myDate() {
    }

    public myDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }

        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    // getter, setter
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 1;
        }
    }

    Scanner sc = new Scanner(System.in);

    public void Input() {
        do {
            System.out.print("Nhap ngay: ");
            this.day = sc.nextInt();

            System.out.print("Nhap thang: ");
            this.month = sc.nextInt();

            System.out.print("Nhap nam: ");
            this.year = sc.nextInt();

            if (!isValidDate()) {
                System.out.println("Ngay thang nam khong hop le! Vui long thu lai!");
            }
        } while (!isValidDate());
    }

    private boolean isValidDate() {
        if (this.day < 1 || this.day > 31) {
            return false;
        }

        if (this.month < 1 || this.month > 12) {
            return false;
        }

        if (this.month == 2) {
            if (isLeapYear(this.year)) {
                return this.day <= 29;
            } else {
                return this.day <= 28;
            }
        } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
            return this.day <= 30;
        } else {
            return true;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    @Override
    public String toString() {
        return this.day + " / " + this.month + " / " + this.year;
    }
}
