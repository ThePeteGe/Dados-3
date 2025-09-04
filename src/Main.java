import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,suma;
        System.out.println("Digite el priemr numero");
        n1 = teclado.nextInt();
        System.out.println("Digite el segundo numero");
        n2 = teclado.nextInt();
        suma = n1 + n2;
        System.out.println("La suma es: " + suma);

        Random aleatorio = new Random();
        int a,b,c ;
        System.out.println("numero generado");
        a=aleatorio.nextInt(51);
        System.out.println("numero generado");
        b=aleatorio.nextInt((30-5)+1)+5;
        c= a + b ;
        System.out.println("a + b = "+c);



    }
}