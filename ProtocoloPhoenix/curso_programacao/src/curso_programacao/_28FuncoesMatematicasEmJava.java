package curso_programacao;

public class _28FuncoesMatematicasEmJava {
	
	
	public static void main(String[] args) {
		double x=3.5;
		double y=4.1;
		double z=-5;
		double A,B,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		
		System.out.println("Raiz quadrada de: " + x + " é: " + A );
		System.out.println("Raiz quadrada de: " + y + " é: " + B );
		System.out.println("Raiz quadrada de 25: " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a: " + y + " é: " + A);
		System.out.println(x + " elevado ao quadrado é: " + B);
		System.out.println("5 elevado ao quadrado é: " + C);
		// abs retorna o valor absoluto de um numero, isto é, o valor positivo dele
		// se for um numero negativo retorna ele como positivo e se for positivo retorna ele 
		// sem modificação
		A = Math.abs(x);
		B = Math.abs(y);
		C = Math.abs(z);
		
		System.out.println("Valor absoluto de: " + x + " é: " + A);
		System.out.println("Valor absoluto de: " + y + " é: " + B);
		System.out.println("Valor absoluto de: " + z + " é: " + C);
		
		// Calculo de delta e equação do segundo grau
		double delta;
		double a,b,c;
		a= 1;
		b = 3;
		c = -4;
		delta = Math.pow(b, 2) - 4*a*c;
		double x1, x2;
		x1 = (-b + Math.sqrt(delta)) / 2*a;
		x2 = (-b - Math.sqrt(delta)) / 2*a;
		System.out.println("Valor da equação do segundo grau: {" + x1 + "," + x2 + "}");
		
	}

}
