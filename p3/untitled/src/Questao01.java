import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int resposta = 1;
        Scanner input = new Scanner(System.in);
        while(resposta !=0){
            System.out.println("Digite\n1 para Soma\n2 para subtracao\n3 para multiplicacao" +
                    "\n4 para divisao\n5 para potencializacao\n6 para raiz cubica\n7 para raiz quadrada" +
                    "\n0 para sair\nDigite um valor:");
            resposta = input.nextInt();

            double n1 = 0;
            double n2 = 0;
            double calculo = 0;
            if(resposta == 1){
                //SOMA
                System.out.println("Digite o primeiro valor: ");
                n1 = input.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = input.nextDouble();
                calculo = n1 + n2;
                System.out.println("O resultador foi: "+calculo);

            } else if (resposta == 2) {
                //SUBTRACAO
                System.out.println("Digite o primeiro valor: ");
                n1 = input.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = input.nextDouble();
                calculo = n1 - n2;
                System.out.println("O resultador foi: "+calculo);
            }else if (resposta == 3) {
                //MULTIPLICACAO
                System.out.println("Digite o primeiro valor: ");
                n1 = input.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = input.nextDouble();
                calculo = n1 * n2;
                System.out.println("O resultador foi: "+calculo);
            }else if (resposta == 4) {
                //DIVISAO
                System.out.println("Digite o primeiro valor: ");
                n1 = input.nextDouble();
                System.out.println("Digite o segundo valor: ");
                n2 = input.nextDouble();
                calculo = n1 / n2;
                System.out.println("O resultador foi: "+calculo);
            }else if (resposta == 5) {
                //POTENCIACAO
                System.out.println("Digite a base : ");
                n1 = input.nextDouble();
                System.out.println("Digite o expoente valor: ");
                n2 = input.nextDouble();
                calculo = Math.pow(n1,n2);
                System.out.println("O resultador foi: "+calculo);
            }else if (resposta == 6) {
                //RAIZ CUBICA

                System.out.println("Digite o numero : ");
                n1 = input.nextDouble();
                calculo = Math.cbrt(n1);
                System.out.println("O resultador foi: "+calculo);
            }else if (resposta == 7) {
                System.out.println("Digite o numero : ");
                n1 = input.nextDouble();
                calculo = Math.sqrt(n1);
                System.out.println("O resultador foi: "+calculo);
            }
        }

    }
}