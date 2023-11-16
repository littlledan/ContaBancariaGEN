package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
		while(true) {
			
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("                    BANCO ASGARD                     ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = scanner.nextInt();
			
			if(opcao == 9) {
				System.out.println("\nBanco Asgard - O seu futuro começa aqui!");
				sobre();
		scanner.close();
				System.exit(0);
			}
			
			switch(opcao) {
			
			case 1:
					System.out.println("Criar conta\n\n");
					
					break;
			case 2:
					System.out.println("Listar todas as Contas\n\n");
					
					break;
			case 3:
					System.out.println("Consultar dados da Conta - Por numero\n\n");
					
					break;
			case 4:
					System.out.println("Atualizar dados da Conta\n\n");
					
					break;
			case 5:
					System.out.println("Apagar a Conta\n\n");
					
					break;
			case 6:
					System.out.println("Saque\n\n");
					
					break;
			case 7:
					System.out.println("Depósito\n\n");
					
					break;
			case 8:
					System.out.println("Tranferência entre Contas\n\n");
					
					break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
				
			}

		}

	}
			public static void sobre() {
				System.out.println("\n_______________________________________________________");
				System.out.println("Projeto Desenvolvido por: Carlos Daniel de Lima Ferreira ");
				System.out.println("Generation Brasil - generation@generation.org");
				System.out.println("github.com/littlledan");
				System.out.println("_________________________________________________________");
			}

}
