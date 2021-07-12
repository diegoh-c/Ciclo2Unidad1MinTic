import java.util.Scanner;

public class Taller1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        int numero = Scanner.nextInt();
        System.out.println(resultado);
    }

    public static int calculardigitos (int numero) {
        int cifras = 0;
        while (numero != 0){
            numero /= 10;
            cifras ++;
        }
        return cifras;
    }   

}
