
public interface OperacaoMatematica {

	static int soma(int valor1, int valor2) {
		int resultado = valor1 + valor2 ;
		System.out.println(resultado);
		return resultado;
		
	}
	
	static int subtracao(int valor1, int valor2) {
		int resultado = valor1 - valor2;
		System.out.println(resultado);
		return resultado;
	}
	
	static int multiplicacao(int valor1, int valor2) {
		int resultado = valor1 * valor2;
		System.out.println(resultado);
		return resultado;
	}
	
	static int divisao(int valor1, int valor2) {
		int resultado = valor1 / valor2;
		System.out.println(resultado);
		return resultado;
	}
	
}
