package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
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
			
			opcao = scanner.nextInt();
			
			if(opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Valhalla - O seu futuro começa aqui!");
				sobre();
		scanner.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Criar conta\n\n");
					
					break;
			case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");
					
					break;
			case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - Por numero\n\n");
					
					break;
			case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
					
					break;
			case 5:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
					
					break;
			case 6:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
					
					break;
			case 7:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
					
					break;
			case 8:
					System.out.println(Cores.TEXT_WHITE_BOLD + "Tranferência entre Contas\n\n");
					
					break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
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

}
