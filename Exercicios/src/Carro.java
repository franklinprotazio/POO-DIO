
public class Carro {
	
	// Atributos
	
	String cor;
	String modelo;
	int capacidadeDoTanque;
	
	// Construtor
	
	Carro(){
		
	}
	
	Carro(String cor,String modelo ,int capacidadeDoTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	// Gets e Sets
	
	String getCor() {
		return cor;
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	String getModelo() {
		return modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	void setCapacidadeDoTanque(int capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}
	
	// Metodos
	
	double calcularTotalValorCombustivel(double valorCombustivel) {
		return capacidadeDoTanque * valorCombustivel;
	}	

}


