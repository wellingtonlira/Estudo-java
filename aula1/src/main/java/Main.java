import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //*Entrada de dados//

        //para separar double por ponto "."
        //Locale.setDefault(Locale.US);

        //Objeto Scarnner para receber dados que o usuario digitar
        Scanner sc = new Scanner(System.in);

        String x, s1, s2, s3;
        int y;
        double z;
        char a;

        //ler texto
        //x = sc.next();

        //ler numeros inteiros
        y = sc.nextInt();

        //numeros com ponto flutuantes
        //para separar por ponto deve usar: Locale.setDefault(Locale.US);
        //z = sc.nextDouble();

        //a = sc.next().charAt(1);

        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        //System.out.println("Voce digitou: " + x);
        System.out.println("numero: " + y);
        //System.out.printf("numero quebrado: %.2f%n", z);
        //System.out.println("char: " + a);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }

}
