import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero para ver a tabuada: ");
		int numero = scanner.nextInt();

		System.out.println(
		    "Digite até quanto será multiplicado (se digitar 0 será feito até 10:");
		int multiplo = scanner.nextInt();

		System.out.println(
		    "Multiplicação do "+numero+" :");

		if (multiplo == 0) {
			for (int i = 0; i<=10; i++) {
				System.out.println(numero + " x "+ i+" = "+
				                   (numero *i));
			}
		} else {
			for (int i = 0; i<=multiplo; i++) {
				System.out.println(numero + " x "+ i+" = "+
				                   (numero *i));
			}
		}
	}
}