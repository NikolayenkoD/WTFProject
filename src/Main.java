import java.util.Scanner;

public class Main {


    public static void main(String... arg) {

        Scanner in = new Scanner(System.in);
        System.out.println("Ведите колличество конфет : ");
        int k = in.nextInt();
        System.out.println("Ведите курс обмена :  ");
        int c = in.nextInt();

        int h = 0;// фантики
        int b = k; //всего фантиков

        while (b >= c)
        {
            h = b % c;
            k = k + b/c;
            b = b / c + h;

        }
        System.out.println(k + " сожрали");
        System.out.println(b + " остаток фантиков");
    }
}