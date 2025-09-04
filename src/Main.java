import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int a,b;
        int suma1=0;
        int suma2=0;
        for(int i=1;   i<=20; i++){
        System.out.println("dado A generado");
        a=aleatorio.nextInt(7-1)+1;
        suma1+=a ;
        System.out.println("dado B generado");
        b=aleatorio.nextInt((7-1)+1);
        suma2+=b ;
        System.out.println("DADO A : " +suma1);
        System.out.println("DADO B : " +suma2);
        }



    }
}