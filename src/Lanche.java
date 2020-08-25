public abstract class Lanche {
	double preco;
	int tempoPreparo;
	int distancia;
	
	
	public Lanche (double preco, int tempoPreparo, int distancia) {
		setPreco (preco);
		setTempoPreparo(tempoPreparo);
		setDistancia(distancia);

	}
	
	public  int calculaTempoDeEntrega () {
		return 10 * getDistancia();
	}
	
	
	public  int getTempoPreparo() {
		return this.tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public  int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	
}
