package curso_programacao;

public class _34ExpressoesLogicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Uso do || que executa apenas a primeira condição dando certo não executa a segunda
			int x = 1, y =2;
			
			System.out.println("(x=x+1)=2 || (y=y+2)=4: " + ((x=x+1)==2 || (y=y+2)==4));
			System.out.println("Valor de x: " + x + " -- Valor de y:" + y);
			System.out.printf("X era 1 foi acrescido de 1 e y era 2 foi acrescido de 2"
					+ "%n apenas o valor de X mudou pois usando o operador duplo ou ||"
					+ "%n se o primeiro valor der true será executado apenas o primeiro valor"
					+ "%n e a segunda expressão lógica não será executada");
			System.out.println("Para executar as duas expressões deve se usar apenas |");
			System.out.printf("%n%n%n");
			
			
			// Uso do && que executar apenas a primeira condição se ela for falsa
			int z = 1, o = 2;
			System.out.println("(z=z+1)=2 && (o=o+2)=4: " + ((z=z+1)==3 && (o=o+2)==4));
			System.out.println("Valor de z: " + x + " -- Valor de o:" + y);
			System.out.printf("Z era 1 foi acrescido de 1 e o era 2 foi acrescido de 2"
					+ "%n apenas o valor de Z mudou pois usando o operador duplo ou &&"
					+ "%n se o primeiro valor der false será executado apenas o primeiro valor"
					+ "%n e a segunda expressão lógica não será executada");
			System.out.println("Para executar as duas expressões deve se usar apenas |");
			
			
	}

}
