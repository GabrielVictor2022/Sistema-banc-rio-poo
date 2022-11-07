package aula05;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Aula05Treino {

	public static void main(String[] args) throws InterruptedException {
		ContaBancoTreino cb = new ContaBancoTreino();

		Scanner teclado = new Scanner(System.in);
		Scanner tecladoNome = new Scanner(System.in);

		int escolha;

		do {
			System.out.println("########BANCO#########");

			System.out.println("1 - Abrir Conta");
			System.out.println("2 - Fechar Conta");
			System.out.println("3 - Depositar");
			System.out.println("4 - Sacar");
			System.out.println("5 - Pagar Mensalidade");
			System.out.println("6 - Estado Atual da Conta");
			System.out.println("0 - Sair");
			System.out.print("Escolha sua opção: ");
			escolha = teclado.nextInt();

			System.out.println("####################");

			switch (escolha) {
			case 1:
				System.out.println("Abrindo conta...");
				TimeUnit.SECONDS.sleep(3);
				System.out.print("Qual tipo de conta você deseja(CC - CP)? ");
				cb.abrirConta(teclado.next());

				TimeUnit.SECONDS.sleep(2);
				System.out.print("Informe o número da conta: ");
				cb.setNumConta(teclado.next());

				TimeUnit.SECONDS.sleep(2);
				System.out.print("Informe o titular da conta: ");
				cb.setDono(tecladoNome.nextLine());
				break;
			case 2:
				System.out.println("Fechar Conta...");
				TimeUnit.SECONDS.sleep(3);
				cb.fecharConta();
				TimeUnit.SECONDS.sleep(3);
				break;
			case 3:
				System.out.println("Abrindo Depósito..");
				TimeUnit.SECONDS.sleep(3);
				System.out.print("Digite o valor para ser depositado: ");
				cb.depositar(teclado.nextDouble());
				TimeUnit.SECONDS.sleep(3);
				break;
			case 4:
				System.out.println("Abrindo Saque...");
				TimeUnit.SECONDS.sleep(3);
				System.out.print("Digite o valor que deseja sacar: ");
				cb.sacar(teclado.nextDouble());
				TimeUnit.SECONDS.sleep(3);
				break;
			case 5:
				System.out.println("Pagar mensalidade...");
				TimeUnit.SECONDS.sleep(3);
				cb.pagarMensal();
				TimeUnit.SECONDS.sleep(3);
				break;
			case 6:
				System.out.println("Imprimindo Estado Atual...");
				TimeUnit.SECONDS.sleep(3);
				cb.estadoAtual();
				TimeUnit.SECONDS.sleep(3);
				break;
			case 0:
				System.out.println("Saindo...");
				TimeUnit.SECONDS.sleep(3);
				System.out.println("Obrigado!");
				break;
			default:
				System.out.println("Opção inválida.");
				TimeUnit.SECONDS.sleep(3);
				break;
			}
		} while (escolha != 0);

		teclado.close();

	}

}
