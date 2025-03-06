import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    int escolha = 0;
	    
	    while (escolha!= 3){
	        System.out.println("Menu");
	        System.out.println("1: Calcular área do quadrado");
	        System.out.println("2: Calcular área do circulo");
	        System.out.println("3: Sair");
	        System.out.println("Escolha uma opção: ");
	        escolha = scanner.nextInt();
	        
	        if (escolha ==1) {
	            System.out.println("Digite o lado do quadrado");
	            double lado = scanner.nextDouble();
	            double areaDoQuadrado = lado * lado;
	            System.out.println(
	                "A área do quadrado é: "+ areaDoQuadrado);
	      
	        }else if (escolha ==2){
	            System.out.println("Digite o raio do circulo");
	            double raio = scanner.nextDouble();
	            double areaDoCirculo = 3.1415 * raio;
	            System.out.println(
	                "A área do circulo é: "+ areaDoCirculo);
	        }else if (escolha == 3){
	            System.out.println("Encerrando o programa");
	        } else {
	            System.out.println(
	                "Opção inválida, tente novamente");
	        }
	        break;
	    }
	    
	}
}
