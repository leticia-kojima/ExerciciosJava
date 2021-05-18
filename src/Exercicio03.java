import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		//Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar uma terceira variável, troque os valores de A e B entre si.
		
		Scanner leitor = new Scanner(System.in);
		
		int a = 0, b = 0;
		
		System.out.println("Por favor, digite o valor de A: ");
		
		a = leitor.nextInt();
		
		System.out.println("Por favor, digite o valor de B: ");
		
		b = leitor.nextInt();
		
		System.out.println("Inversão de valores");
		
		a = a + b;
		b = b + a;
		a = b - a;
		b = b - 2 * a;
		
		System.out.println("Valor de A: " + a);
		System.out.println("Valor de B: " + b);
		
		leitor.close();
		
	}

}
