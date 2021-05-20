import java.util.Scanner;

public class Mycaptian {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF MINUTES");
        double min = sc.nextDouble();
        long years = (long) (min/(60*24*365));
        long days  = (long) (min/(60*24)%365);

        System.out.println(min + " minutes is approx " + years + " years and " + days + " days!!!....");

    }

}
