import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        String nomeSobrenome;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome e sobrenome: ");
        nomeSobrenome = input.nextLine();

        String nome = nomeSobrenome.substring(0,nomeSobrenome.indexOf(" "));
        String sobrenome = nomeSobrenome.substring(nomeSobrenome.indexOf(" ") +1,nomeSobrenome.length());

        String diana = "Diana";
        String wayne = "Wayne";
        String kent = "Kent";
        if(nome.equalsIgnoreCase(diana)){
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else if (sobrenome.equalsIgnoreCase(wayne)) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equalsIgnoreCase(kent)) {
            System.out.println("Saí daí, mané!");
        }else{
            System.out.println("Cai fora!");
        }


    }
}