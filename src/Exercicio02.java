import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, solicite ao usu�rio que digite o tempo de um filme em minutos e informe a dura��o desse filme em horas e em segundos.
		
		Scanner leitor = new Scanner(System.in);
		
		int segundosFilme= 0, horasFilme=0;
		int minutosDigitados=0;
		
		System.out.println("Por favor, digite a dura��o do filme em minutos:");
		
		minutosDigitados = leitor.nextInt();
		
		horasFilme = minutosDigitados / 60;
		
		segundosFilme = (horasFilme % minutosDigitados) * 60;
		
		System.out.println("A dura��o do filme � de "+ horasFilme + " horas e " + segundosFilme + " segundos!");
		
		leitor.close();

	}

}
