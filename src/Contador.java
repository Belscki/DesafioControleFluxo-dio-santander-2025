import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Digite o primeiro numero:");
            int value_1 = scanner.nextInt();
            System.out.println("Digite o segundo numero:");
            int value_2 = scanner.nextInt();

            try {
                contar(value_1, value_2);    
            } catch (Exception e) {
                System.out.println("Erro: "+ e);
            }
        }
    }

    static void contar(int value_1, int value_2) throws ParametrosInvalidosExpection{ 
        if (value_1 > value_2) {
            int value_3 = value_1 - value_2;
            int index = 1;
            while (value_3 != 0 ) {
                System.out.println("Imprimindo numero: " + index);
                ++index;
                --value_3;
            }
        }else{
            throw new ParametrosInvalidosExpection("O segundo numero deve ser maior que o primeiro");
        }
    }

}
