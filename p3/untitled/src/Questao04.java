import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        double numero;
        Scanner input = new Scanner(System.in);
            System.out.println("Digite um numero:");
            numero = input.nextDouble();

            if(numero%2 ==0){
                numero = Math.cbrt(numero);
                System.out.println("A raiz cubica do par eh: "+numero);
            }else {
                numero = Math.sqrt(numero);
                System.out.println("A raiz quadrada do impar eh: "+numero);
            }

    }
}