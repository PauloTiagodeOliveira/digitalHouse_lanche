
public class Pizza extends Massa {
	String nome = "Pizza";
	String sabor;
	

	public Pizza(double preco, String molho, int distancia, String sabor) {
		super(preco, molho, distancia);
		setSabor(sabor);
	
	}

	public String getNome() {
		return nome;
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}
