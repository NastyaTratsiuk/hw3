package test1;
 import java.util.Scanner;
public class Time {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

        System.out.println("Input day:");
    int day = scanner.nextInt();
        System.out.println("Input month:" );
    int month = scanner.nextInt();
        System.out.println("Input year:");
    int year = scanner.nextInt();
    if (isDateValid (day, month, year)) {
        System.out.println( "Date is valid");
    }else {
        System.out.println( "Date is not valid");
    }
    }
public  static boolean  isDateValid( int day, int month, int year) {
    if (day < 1 || month > 12 || (year < 0)) {
        return false;
    }
    boolean valid = true;
    if ((month == 2) && (year % 4 != 0) && (day > 28)) {
        valid = false;

    } else if ((month == 2) && (year % 4 == 0 || year % 100 != 0 || year % 400 == 0) && (day > 29)) {
        valid = false;

    } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {
        valid = false;

    } else {
        if (day > 31) {
            valid = false;
        }
    }

            if (( month==1 || month==3 ||month==5 || month==7 || month==8 || month==10 ) && (day>=31)) {
                day =1;
                month++;

            } else if (( month==4 || month==6 || month==9 || month == 11) && ( day==30)){
                    day=1;
                    month++;

            } else if ((month==2) && ( year %4==0) && (day==29)) {
                    day = 1;
                    month++;

            } else if  ((month==2) && (year %4!=0) && (day==28)) {
                    day=1;
                    month++;

            } else if ((month==12) && (day==31)) {
                    day=1;
                    month=1;
                    year++;

            } else {
                day++;
            }

        System.out.printf( "%d.%d.%d" , day, month, year );

            return valid;
    }
}
