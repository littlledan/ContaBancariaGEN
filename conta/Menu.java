package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "Carlin do grau", 1000.0f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(), 124, 1, "Maria do grau", 2000.0f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Julin do grau", 4000.0f, 12);
		contas.cadastrar(cp1);
		
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Isa do grau", 8000.0f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		
		while(true) {
			
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND 
					          +" _____________________________________________________ ");
			System.out.println("|                                                     |");
			System.out.println("|                   BANCO VALHALLA                    |");
			System.out.println("|                                                     |");
			System.out.println("|_____________________________________________________|");
			System.out.println("|                                                     |");
			System.out.println("|            1 - Criar Conta                          |");
			System.out.println("|            2 - Listar todas as Contas               |");
			System.out.println("|            3 - Buscar Conta por Numero              |");
			System.out.println("|            4 - Atualizar Dados da Conta             |");
			System.out.println("|            5 - Apagar Conta                         |");
			System.out.println("|            6 - Sacar                                |");
			System.out.println("|            7 - Depositar                            |");
			System.out.println("|            8 - Transferir valores entre Contas      |");
			System.out.println("|            9 - Sair                                 |");
			System.out.println("|                                                     |");
			System.out.println("|_____________________________________________________|");
			System.out.println("|   Entre com a opção desejada:                       |");
			System.out.println("|_____________________________________________________|" + Cores.TEXT_RESET);
			
			
			try {
				opcao = scanner.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}
			if(opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Valhalla - O seu futuro começa aqui!");
				sobre();
		scanner.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
					
					System.out.println("Digite o Numero da Agência: ");
					agencia = scanner.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					scanner.skip("\\R?");
					titular = scanner.nextLine();
					
					do {
						System.out.println("Digite o Tipo de Conta (1-CC ou 2-CP): ");
						tipo = scanner.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o Valor da Conta (R$): ");
					saldo = scanner.nextFloat();
					
					switch(tipo) {
						case 1 -> {
							System.out.println("Digite Limite de Credito(R$): ");
							limite = scanner.nextFloat();
							contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));	
						}
						case 2 -> {
							System.out.println("Digite o Dia do Aniversario da Conta: ");
							aniversario = scanner.nextInt();
							contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
						}
					}
					keyPress();
					break;
			case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
					contas.listarTodas();
					keyPress();
					break;
			case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - Por numero\n\n");
					
					keyPress();
					break;
			case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
					
					keyPress();
					break;
			case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
					
					keyPress();
					break;
			case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
					
					keyPress();
					break;
			case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
					
					keyPress();
					break;
			case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Tranferência entre Contas\n\n");
					
					keyPress();
					break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
				keyPress();
				break;
				
			}

		}

	}
			public static void sobre() {
				System.out.println(Cores.TEXT_BLACK + Cores.ANSI_WHITE_BACKGROUND + 
						         "\n _________________________________________________________ ");
				System.out.println("|Projeto Desenvolvido por: Carlos Daniel de Lima Ferreira |");
				System.out.println("|Daniel Lima - daniel799.dl@gmail.com                     |");
				System.out.println("|github.com/littlledan                                    |");
				System.out.println("|_________________________________________________________|");
			}
			
			public static void keyPress() {
				
				try {
					
					System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
					System.in.read();
					
				}catch (IOException e) {
					
					System.out.println("Você pressionou uma tecla diferente de Enter!");
				}
		}
}
