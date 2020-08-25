
public class Bolo extends Lanche{
	String massa;
	String recheio;
	String cobertura;
	
	public Bolo(double _preco, int distancia, String _massa, String _recheio, String _cobertura) {
		super(_preco, 10, distancia);
		setMassa(_massa);
		setRecheio(_recheio);
		setCobertura(_cobertura);
	}

	public String getMassa() {
		return massa;
	}


	public void setMassa(String massa) {
		this.massa = massa;
	}


	public String getRecheio() {
		return recheio;
	}


	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}


	public String getCobertura() {
		return cobertura;
	}


	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}


};
	
