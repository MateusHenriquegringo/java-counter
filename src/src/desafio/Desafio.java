package src.desafio;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String tipoCofre = scanner.nextLine();

		if (tipoCofre.equalsIgnoreCase("digital")) {
			int senha = Integer.parseInt(scanner.nextLine());
			CofreDigital novo = new CofreDigital(senha);

			if (novo.validarSenha(senha)){
				novo.imprimirInformacoes();
				System.out.println("Cofre Aberto!");
			} else if (!novo.validarSenha(senha)){
				novo.imprimirInformacoes();
				System.out.println("Senha Incorreta!");
			}
		}
		if (tipoCofre.equalsIgnoreCase("fisico")){
			CofreFisico novo1 = new CofreFisico();
			novo1.imprimirInformacoes();
		}
	}
}
