package pedra_papel_ou_tesoura;

import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha pedra, papel ou tesoura");
		System.out.println("1 para pedra");
		System.out.println("2 para papel");
		System.out.println("3 para tesoura");
		
		int usuario = teclado.nextInt();
		teclado.close();
		Random random = new Random();
		int pc = random.nextInt(3)+1;

		System.out.printf("O usuário escolheu %s", usuario);
		System.out.println("");
		System.out.printf("O PC escolheu %s", pc);
		System.out.println("");
		
		if (pc == 1 & usuario == 1) {
			System.out.println("Não ouve vencedor");
		} else if (pc == 2 & usuario == 2) {
			System.out.println("Não ouve vencedor");
		} else if (pc == 3 & usuario == 3) {
			System.out.println("Não ouve vencedor");
		} else if (pc == 1 & usuario == 2) {
			System.out.println("Você venceu");
		} else if (pc == 1 & usuario == 3) {
			System.out.println("Pc venceu");
		} else if (pc == 2 & usuario == 1) {
			System.out.println("Pc venceu");
		} else if (pc == 2 & usuario == 3) {
			System.out.println("Você venceu");
		} else if (pc == 3 & usuario == 1) {
			System.out.println("Você venceu");
		} else if (pc == 3 & usuario == 2) {
			System.out.println("Pc venceu");
		} else {
			System.out.println("Número inválido");
		}

		
		
		
	}

}
