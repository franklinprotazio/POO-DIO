
public class Main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.setCor("Amarelo");
		carro1.setModelo("New Fiesta");
		carro1.setCapacidadeDoTanque(40);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeDoTanque());
		System.out.println(carro1.calcularTotalValorCombustivel(5.49));
		
		Carro carro2 = new Carro("Preto", "Fiesta", 35);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeDoTanque());
		System.out.println(carro2.calcularTotalValorCombustivel(5.49));
		
	}

}
