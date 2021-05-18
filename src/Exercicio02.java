import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, solicite ao usuário que digite o tempo de um filme em minutos e informe a duração desse filme em horas e em segundos.
		
		Scanner leitor = new Scanner(System.in);
		
		int segundosFilme= 0, horasFilme=0;
		int minutosDigitados=0;
		
		System.out.println("Por favor, digite a duração do filme em minutos:");
		
		minutosDigitados = leitor.nextInt();
		
		horasFilme = minutosDigitados / 60;
		
		segundosFilme = (horasFilme % minutosDigitados) * 60;
		
		System.out.println("A duração do filme é de "+ horasFilme + " horas e " + segundosFilme + " segundos!");
		
		leitor.close();

	}

}
