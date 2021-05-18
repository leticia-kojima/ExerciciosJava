import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles deve ser carregado pelo drone.

		Scanner leitor = new Scanner(System.in);
		
		double peso1 = 0, peso2 = 0, peso3 = 0, maiorPeso = 0;
		
		System.out.println("Por favor, digite o primeiro peso:");
		
		peso1 = leitor.nextDouble();
		
		System.out.println("Por favor, digite o segundo peso:");
		
		peso2 = leitor.nextDouble();
		
		System.out.println("Por favor, digite o terceiro peso:");
		
		peso3 = leitor.nextDouble();
		
		if (peso1 > peso2 && peso1 > peso3 ){
			maiorPeso = peso1;
			System.out.println("O drone irá carregar o primeiro peso, equivalente ao peso: "+ maiorPeso);
		}else {
			if (peso2 > peso1 && peso2 > peso3) {
				maiorPeso = peso2;
				System.out.println("O drone irá carregar o segundo peso, equivalente ao peso: "+ maiorPeso);
			}else {
				if (peso3 > peso2 && peso3 > peso1){
					maiorPeso = peso3;
					System.out.println("O drone irá carregar o terceiro peso, equivalente ao peso: "+ maiorPeso);
				}
			}
		}
		
		leitor.close();
		
	}

}
