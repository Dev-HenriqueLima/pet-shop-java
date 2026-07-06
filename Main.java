import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var option = -1;

        do {
            System.out.println(">>>>Escolha uma das opções<<<<");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verifica o shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar Pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

        } while (option != 0);

    }

    public void setPetInPetmachine(){
        System.out.println("");
    }
}
