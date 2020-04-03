package test1;
import java.util.Scanner;
public class formula {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a:");
        int a = scan.nextInt();
        System.out.println("Input b:");
        int b = scan.nextInt();
        System.out.println("Input c:");
        int c = scan.nextInt();
        System.out.println("the equation: " + a + "x2+" + b + "x+" + c + " = 0");
        int dis = discriminant(a, b, c);

        if (isPositive(dis)) {
            double koren1 = ((b * (-1) - Math.sqrt(dis)) / (a * 2));
            double koren2 = ((b * (-1) + Math.sqrt(dis)) / (a * 2));{
                System.out.println("дискриминант < 0, уравнение имеет 2 корня.");
                System.out.println("x1=" + koren1);
                System.out.println("x2" + koren2);
            }
        } else if( isZero(dis)) {
            double koren1 = ((b* (-1))/ (a*2));{
                System.out.println( "дискриминант = 0, уравнение имеет 1 корень");
                System.out.println( "x1=" +koren1);
            }
        }else {
            System.out.println( "дискриминант < 0, корней нет.");
        }


     }public static boolean isPositive ( int p){
            return (p > 0);

    }public static boolean isZero ( int z){
            return (z == 0);

    }public static int discriminant ( int a, int b, int c) {
            return (b * b - 4 * a * c);


    }

}

