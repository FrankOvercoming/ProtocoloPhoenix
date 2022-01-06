package curso_programacao;

import java.util.Scanner;

public class _26EntradaDeDadosParte1ScannerConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarando objeto scanner para entrada de dados padrao
		// via console
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.print("Digite um texto: ");
		x = sc.nextLine();
		System.out.println("O texto digitado foi: " + x);
		
		// Rebendo um inteiro como entrada de dados com scanner
		int i;
		System.out.print("Insira um numero inteiro: ");
		i = sc.nextInt();
		System.out.println("Numero digitado foi: " + i);

		// Recebendo ponto flutuante, ele pega o separador de decimais do sistema
		// se quiser trocar de virgula para ponto como separador de decimais
		// precisa usar Locale
		
		double d;
		System.out.print("Insira um numero de ponto flutuante: ");
		d = sc.nextDouble();
		System.out.printf("O numero de ponto flutuante digitado foi: %.2f%n", d);

		// Pegando apenas o primeiro caracter do valor inserido
		char c;
		System.out.print("Insira um caracter: ");
		c = sc.next().charAt(0);
		System.out.println("O caracter digitado foi: " + c);
		
		// Pegando varios dados diferentes de cada linha
		System.out.println("Digite um texto, depois um numero inteiro e depois um numero de ponto flutuante: ");
		String texto;
		int dadosInt;
		double dadosDouble;
		texto = sc.nextLine();
		// Reset impede que o scanner pare de receber dados devido ao uso do nextLine
		sc.reset();
		dadosInt = sc.nextInt();
		dadosDouble = sc.nextDouble();
		System.out.printf("Dados informados foram: %n" + texto + "%n" + dadosInt + "%n%.2f%n", dadosDouble);

		sc.close();

	}

}
