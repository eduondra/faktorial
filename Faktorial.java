import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej cislo");

        int i,factorial=1;
        int number = sc.nextInt();
        for(i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}

