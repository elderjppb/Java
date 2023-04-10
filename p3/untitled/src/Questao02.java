import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        double temp;
        int escala;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura: ");
        temp = input.nextDouble();

        System.out.println("\nSelecione a escala\n1 para Celsius\n2 para Fahrenheit\n3 para Kelvin\nEscolha: ");
        escala = input.nextInt();

        double celsius = 0 ;
        double fahrenheit = 0;
        double kelvin = 0;

        if(escala == 1){
            celsius = temp;
            fahrenheit = (celsius * 9/5)+32;
            kelvin = celsius +  273.15;
        } else if (escala == 2) {
            //Fahrenheit
            fahrenheit = temp;
            celsius = (fahrenheit - 32) / 1.8;
            kelvin = celsius +  273.15;
        } else if (escala == 3) {
            //Kelvin
            kelvin = temp;
            celsius = kelvin - 273.15;
            fahrenheit = (celsius * 9/5)+32;
        }else {
            System.out.println("Valor invalido.");
        }

        System.out.println("Celsius: "+celsius);
        System.out.println("Fahrenheit: "+fahrenheit);
        System.out.println("Kelvin: "+kelvin);
    }
}