import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> naoPrimos = new ArrayList<>();
        String decis = "S";
        while (decis.equals("S")) {
            System.out.println("\n\n\n\n");
            primos.clear();
            naoPrimos.clear();
            System.out.println("Entre com um numero menor que 10000 e maior que 0. ");
            System.out.print(">> ");
            int num = sc.nextInt();
            while (num > 10000 || num < 1) {
                System.out.println("Você digitou um valor inválido.\n");
                System.out.println("Entre com um numero menor que 10000 e maior que 0.");
                System.out.print(">> ");
                num = sc.nextInt();
            }
            naoPrimos.add(1);
            for (int i = 2; i <= num; i++) {
                boolean primo = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                    }
                }
                if (primo) {
                    primos.add(i);
                } else {
                    naoPrimos.add(i);
                }
            }
            System.out.println("\n");
            System.out.println("Digite 1 para primos,");
            System.out.println("2 para nao primos");
            System.out.print(">> ");
            int resp = sc.nextInt();
            if (resp == 1) {
                for (int numeros : primos) {
                    System.out.println(numeros);
                }
            } else {
                for (int numeros : naoPrimos) {
                    System.out.println(numeros);
                }
            }
            System.out.println("Deseja continuar? [S/N]");
            System.out.print(">> ");
            decis = sc.next().toUpperCase();
        }
    }
}