import java.util.Scanner;

public class ConversorTemperatura{

 public static void main(String[] args) {
    

    //Declaração de variáveis
    int n1, n2, total, op;

    //Criação e instância do objeto de entrada
    Scanner entrada = new Scanner(System.in);
do{

    System.out.println("n\t\t\t -- Conversor de Temperatura -- \n");

    System.out.println("1. Celsius");
    System.out.println("2. Fahrenheit");
    System.out.println("3. Sair");
    
    System.out.println("Opção: ");
    op = entrada.nextInt();

    if(op == 1){
        System.out.println("\n\t\t\t -- Celsius --\n");
    }else if(op == 2){
    System.out.println("\n\t\t\t -- Fahrnenheit -- \n");
    } else if(op == 3){
        System.out.println("Forte abraço!");
    }else{
        System.out.println("Opção" + op + "Incorreta!");
    }

}while(op!=5);

 }
 
}