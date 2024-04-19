import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Selecione a temperatura:\n 1) Celsius\n 2) Fahrenheit");
        System.out.print("\nOpção escolhida: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Número inválido. Digite 1 ou 2.");
        }

        double temperatura = 0;

        if (opcao == 1){
            System.out.printf("Celsius em Fahrenheit: %.1f", converteCelsius(temperatura));
        } else if (opcao == 2){
            System.out.printf("Fahrenheit para Celsius: %.1f", converteFahrenheit(temperatura));
        }

        scan.close();
    }

    // Converte Celsius para Fahrenheit
    public static double converteCelsius(double temperatura){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da temperatura em graus: ");
        double temp = scan.nextDouble();
        temp = (9*temp/5) + 32;

        scan.close();

        return temp;
    }

    // Converte Fahrenheit para Celsius
    public static double converteFahrenheit(double temperatura){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor da temperatura em graus: ");
        double temp = scan.nextDouble();
        temp = 5*(temp-32)/9;

        scan.close();

        return temp;
    }

}