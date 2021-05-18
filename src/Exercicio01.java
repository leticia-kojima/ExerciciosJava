import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Para um ano de nascimento fornecido pelo usuário, informe a idade que ele terá no dia 31 de dezembro de 2021.
		
		Scanner leitor = new Scanner(System.in);
		int diaDezembro = 31, mesDezembro = 12, anoDezembro = 2021;
		String diaNascimento, mesNascimento, anoNascimento;
		int idadeDezembro = 0;
		String dataNascimento;
				
		System.out.println("Por favor, insira sua data de nascimento no formato dd/mm/yyyy: ");
		
		dataNascimento = leitor.next();
		
		String[] parts = dataNascimento.split("/");
		diaNascimento = parts[0]; //dia
		mesNascimento = parts[1]; //mes
		anoNascimento = parts[2]; //ano
		
		int diaNascimentoInt = Integer.parseInt(diaNascimento);
		int mesNascimentoInt = Integer.parseInt(mesNascimento);
		int anoNascimentoInt = Integer.parseInt(anoNascimento);
		
		if (mesNascimentoInt < mesDezembro || (mesNascimentoInt == mesDezembro && diaNascimentoInt <= diaDezembro)) {
			idadeDezembro = anoDezembro - anoNascimentoInt;

		}else {
			idadeDezembro = (anoDezembro - anoNascimentoInt)-1;

		}
	
		System.out.println("Em 31/12/2021 você terá " + idadeDezembro + " anos!");
		
		leitor.close();

	}

}
