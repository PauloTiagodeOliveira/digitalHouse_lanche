
public abstract class Massa extends Lanche {
	String molho;
	
	public Massa(double _preco, String _molho, int distancia) {
		super(_preco, 30, distancia);
		setMolho(_molho);
	}

	
	
	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

}
