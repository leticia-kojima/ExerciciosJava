import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom �DIADEFESTA�. Fa�a um programa onde o funcion�rio digite o valor da compra e um cupom, informando o valor final a ser pago.
		
		Scanner leitor = new Scanner(System.in);
		
		double valorCompra = 0, valorFinal = 0;
		String cupom;
		
		System.out.println("Por favor, digite o valor da compra:");
		
		valorCompra = leitor.nextDouble();
		
		System.out.println("Por favor, digite o cupom:");
		
		cupom = leitor.next();
		
		if (cupom.equalsIgnoreCase("DIADEFESTA")) {
			System.out.println("Parab�ns, voc� ganhou 3% de desconto!");
			valorFinal = valorCompra * 0.97;
		}else {
			System.out.println("Cupom inv�lido!");	
			valorFinal = valorCompra;
		}
		
		System.out.println("O valor total da compra � de R$" + valorFinal + " reais!");
		
		leitor.close();		

	}

}
