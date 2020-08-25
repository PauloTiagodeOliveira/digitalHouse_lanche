import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche{
	List <String> ingredientes = new ArrayList<>();

	
	public Sanduiche(double _preco,  int distancia, List<String> ingredientes) {
		super(_preco, 15, distancia);
		this.ingredientes = ingredientes;
		

	}

	
}
