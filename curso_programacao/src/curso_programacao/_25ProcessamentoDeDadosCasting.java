package curso_programacao;

public class _25ProcessamentoDeDadosCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 2;
		double saida;
		
		saida = (x * y);
		System.out.println("Multiplicação: " + saida);
		
		// Area do trapézio
		// Para declarações explicitas em double usar .0 exemplo 6.0
		// para Float usar f no final do numero exemplo 5f
		double hBaseMenor = 6.0;
		float hBaseMaior = 8f;
		double altura = 5;
		double formulaSaida = ((hBaseMenor  +  hBaseMaior) / 2) * altura;
		
		System.out.printf("Area do trapézio é: %.2f%n", formulaSaida);
		
		// Casting
		int a = 5;
		int b = 2;
		// Aqui fazemos um teste de casting pois int c não aceitaria a
		// sem casting pois a está declarado como double
		double testeCasting = 10;
		int c = (int) testeCasting;
		
		// Fazendo casting senão não aparece casa decimal
		double saidaCasting = (double) a / b;
		
		System.out.println("Resultado usando casting senão não aparece casa decimal: " + saidaCasting);
		
	}

}
