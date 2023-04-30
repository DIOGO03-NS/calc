import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("----------------MENU-----------------");
        System.out.println("1-------------------------------INFIXA");
        System.out.println("2------------------------------POSFIXA");
        System.out.println("3------------------------------PREFIXA");
        System.out.printf("DIGITE A OPÇÃO: ");
        int tipo = input.nextInt();
        input.nextLine();

        if(tipo == 1){
            Infixa calculadora = new Infixa();
            System.out.println("DIGITE A OPERAÇÃO: ");
            String operacao = input.nextLine();
            double resultado = calculadora.calcular(operacao);
            System.out.println("O RESULTADO É: " + resultado);
        }else if(tipo == 2){
            Posfixa calculadora = new Posfixa();
            System.out.println("DIGITE A OPERAÇÃO: ");
            String operacao = input.nextLine();
            double resultado = calculadora.calcular(operacao);
            System.out.println("O RESULTADO É: " + resultado);
        }else if(tipo == 3){
            Prefixa calculadora = new Prefixa();
            System.out.println("DIGITE A OPERAÇÃO: ");
            String operacao = input.nextLine();
            double resultado = calculadora.calcular(operacao);
            System.out.println("O RESULTADO É: " + resultado);
            

        }
    }
}
