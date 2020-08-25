import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		String[] opcao = {"[1] Sandu�ches", "[2] Massas", "[3] Bolos"};
		System.out.println("Escolha uma das op��es abaixo: \n [1] Sandu�ches\n [2] Massas\n [3] Bolos\n");
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite um n�mero: ");
		String escolha = scanner.nextLine();	
	
	
		switch (escolha){
		
		case "1":
			int limit = 0;
			List <String> ingredientes = new ArrayList<>();
			Scanner scan = new Scanner(System.in);
			System.out.println("Sua op��o foi: "+ opcao[0]+"\n");
			
			String ingrediente = "";
			while (limit < 10) {
			System.out.print("Digite um ingrediente, ou enter para encerrar: ");
			ingrediente = scan.nextLine();
			System.out.println(ingrediente);
			if(ingrediente.equals("")) {
				System.out.println(ingredientes.size() + " ingredientes escolhidos");
				break;
			}
			ingredientes.add(ingrediente);
			limit++;
			}
			System.out.print("Digite a Distancia em KM: ");
			int distanciaSanduiche  = scanner.nextInt();
			System.out.println("");
			System.out.print("Digite o Pre�o: ");
			double precoSanduiche  = scanner.nextInt();
			System.out.println("");
			
			Sanduiche sanduiche  = new Sanduiche (precoSanduiche, distanciaSanduiche, ingredientes);
			int tempoSanduiche = sanduiche.calculaTempoDeEntrega();
			
			String ingredientesListados = ingredientes.get(0);
			ingredientes.remove(0);
			
			for (String i: ingredientes){
				ingredientesListados = String.join(", ", ingredientesListados, i);
				
			}
			
			
			
			System.out.println("O Pedido realizado foi de um Sanduiche com "+ingredientesListados+".");
			System.out.println("O tempo de entrega aproximado � de "+tempoSanduiche+ " minutos.");
			System.out.println("O valor total do pedido �: R$ " + precoSanduiche +".");
			
			
			break;
		
		case "2":
			System.out.println("Sua op��o foi: "+ opcao[1]);
			System.out.print("Escolha uma o��o de massa: ");
			System.out.println("\n [1] Macarr�o\n [2] Pizza\n [3] Lasanha\n");
			System.out.print("Digite um n�mero: ");
			int opMassa  = scanner.nextInt();
			scanner.nextLine();
	
			
	
			
			switch (opMassa) {
			case 1:
				System.out.print("Digite o molho: ");
				String molhoMacarrao = scanner.nextLine();
				

				System.out.println("");
				System.out.print("Digite a Distancia em KM: ");
				int distanciaMacarrao  = scanner.nextInt();
				System.out.println("");
				System.out.print("Digite o Pre�o: ");
				double precoMacarrao  = scanner.nextInt();
				System.out.println("");
				
				Macarrao macarrao = new Macarrao (precoMacarrao, molhoMacarrao, distanciaMacarrao);
				int tempoMacarrao = macarrao.calculaTempoDeEntrega();
				
				System.out.println("O Pedido realizado foi de um Macarr�o com molho "+molhoMacarrao+".");
				System.out.println("O tempo de entrega aproximado � de "+tempoMacarrao+ " minutos.");
				System.out.println("O valor total do pedido �: R$ " + precoMacarrao +".");
				
				
				break;
			case 2:
				
				System.out.print("Digite o Sabor da Pizza: ");
				String saborPizza = scanner.nextLine();
				
				System.out.print("Digite o molho: ");
				String molhoPizza = scanner.nextLine();

				System.out.println("");
				System.out.print("Digite a Distancia em KM: ");
				
				int distanciaPizza  = scanner.nextInt();
				System.out.println("");
				System.out.print("Digite o Pre�o: ");
				double precoPizza  = scanner.nextInt();
				System.out.println("");
				
				
				Pizza pizza = new Pizza (precoPizza, molhoPizza, distanciaPizza, saborPizza);
				int tempoPizza = pizza.calculaTempoDeEntrega();
				
				System.out.println("O Pedido realizado foi de uma Pizza de "+saborPizza+".");
				System.out.println("O tempo de entrega aproximado � de "+tempoPizza+ " minutos.");
				System.out.println("O valor total do pedido �: R$ " + precoPizza +".");
				break;
			case 3:
				System.out.print("Digite o molho: ");
				String molhoLasanha = scanner.nextLine();

				System.out.println("");
				System.out.print("Digite a Distancia em KM: ");
				
				int distanciaLasanha  = scanner.nextInt();
				System.out.println("");
				System.out.print("Digite o Pre�o: ");
				double precoLasanha  = scanner.nextInt();
				System.out.println("");
				

				
				
				Lasanha lasanha = new Lasanha (precoLasanha, molhoLasanha, distanciaLasanha);
				int tempoLasanha = lasanha.calculaTempoDeEntrega();
				
				System.out.println("O Pedido realizado foi de uma Lasanha.");
				System.out.println("O tempo de entrega aproximado � de "+tempoLasanha+ " minutos.");
				System.out.println("O valor total do pedido �: R$ " + precoLasanha+".");
				break;
				
			}
			
			
			break;
			
		case "3":
			System.out.println("Sua op��o foi: "+ opcao[2]+"\n");
			System.out.print("Digite a massa: ");
			String massa  = scanner.nextLine();
			System.out.println("");
			System.out.print("Digite o recheio : ");
			String recheio  = scanner.nextLine();
			System.out.println("");
			System.out.print("Digite a cobertura: ");
			String cobertura  = scanner.nextLine();
			System.out.println("");
			System.out.print("Digite a Distancia em KM: ");
			int distancia  = scanner.nextInt();
			System.out.println("");
			System.out.print("Digite o Pre�o: ");
			double preco  = scanner.nextInt();
			System.out.println("");
			
			Bolo bolo = new Bolo(preco, distancia, massa, recheio, cobertura);
			int tempo = bolo.calculaTempoDeEntrega();
			
			System.out.println("O Pedido realizado foi de um Bolo com a massa de "+massa+", recheio de "+recheio+" e cobertura de "+ cobertura+".");
			System.out.println("O tempo de entrega aproximado � de "+tempo+ " minutos.");
			System.out.println("O valor total do pedido �: R$ " + preco +".");
					
			break;
		
			}
		
			scanner.close();
				
		}
		
	}


