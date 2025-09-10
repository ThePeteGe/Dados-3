import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int a,b,c;
        int suma1=0;
        int suma2=0;
        int suma3=0;
        for(int i=1;   i<=20; i++){
        a=aleatorio.nextInt(6)+1;
        suma1+=a ;
        b=aleatorio.nextInt(6)+1;
        suma2+=b ;
        c=aleatorio.nextInt(6)+1;
        suma3+=c ;
            System.out.println("------------------------------");
        System.out.println("DADO A : " +suma1);
        System.out.println("DADO B : " +suma2);
            System.out.println("DADO C : "+suma3);
            System.out.println("------------------------------");
        }
        if (suma1>suma2 && suma1>suma3) {
            System.out.println("Dado A gana");
        } else if (suma2>suma1 && suma2>suma3) {
            System.out.println("Dado B gana");
        } else if (suma3>suma1 && suma3>suma2) {
            System.out.println("Dado C gana");
        } else {
            System.out.println("empate");


        }



    }
}