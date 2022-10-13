import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //Exercicio 1
        //int valor1 = sc.nextInt();
        //int valor2 = sc.nextInt();

        //int soma = valor1 + valor2;

        //System.out.println("Soma = " + soma);


        //-----------------------------------------------------------------------------------

        //Exercicio 2
        //double raio = sc.nextDouble();
        //double TT = 3.14159;

       // double area = TT * raio * raio;


       // System.out.printf("Area= %.4f%n", area);

        //-------------------------------------------------------------------------------------

        //Exercicio 3
        //int A = sc.nextInt();
        //int B = sc.nextInt();
        //int C = sc.nextInt();
        //int D = sc.nextInt();


        //int diferenca = (A * B) - (C * D);

        //System.out.println("Diferenca = " + diferenca);


        //--------------------------------------------------------------------------------------

        //Exercicio 4

        //int numFunc = sc.nextInt();
        //int hrTrab= sc.nextInt();
        //double vlHora = sc.nextDouble();

        //double salario = hrTrab * vlHora;

        //System.out.println("Numero: " + numFunc);
        //System.out.printf("Salario = %.2f%n", salario);


        //-------------------------------------------------------------------------------------

        //Exercicio 5
        //int cod1, num1, cod2, num2;
        //double val1, val2;

        //cod1 = sc.nextInt();
        //num1 = sc.nextInt();
        //val1 = sc.nextDouble();

        //cod2 = sc.nextInt();
        //num2 = sc.nextInt();
        //val2 = sc.nextDouble();

        //double total = num1 * val1 + num2 * val2;

       // System.out.printf("valor = %.2f%n", total);

        //-------------------------------------------------------------------------------------

        //Exercicio 6

        double A;
        double B;
        double C;
        double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        double triangulo = A * C / 2.0;
        double circulo = pi * C * C;
        double trapezio = (A + B) / 2.0 * C;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("triangulo = %.3f%n", triangulo);
        System.out.printf("circulo = %.3f%n", circulo);
        System.out.printf("trapezio = %.3f%n", trapezio);
        System.out.printf("quadrado = %.3f%n", quadrado);
        System.out.printf("retangulo = %.3f%n", retangulo);


        sc.close();

    }

}
