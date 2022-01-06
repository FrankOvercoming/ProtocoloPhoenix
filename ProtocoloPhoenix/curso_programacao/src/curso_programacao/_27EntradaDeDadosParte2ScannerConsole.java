package curso_programacao;

import java.util.Scanner;

public class _27EntradaDeDadosParte2ScannerConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para auto identação usar Ctrl+Shift+F
		
		// Pegando varios dados pulando linha com o Scanner nextLine()
		Scanner sc = new Scanner(System.in);
		int i;
		String x, y, z;
		System.out.println("Digite um numero inteiro e depois 3 textos e de enter para cada novo dado: ");
		i = sc.nextInt();
		// Ao darmos enter para a entrada de dados referente ao numero inteiro i, o enter fica
		// no buffer e será consumido pelo x se não houver um nextLine() antes
		// então chamamos um sc.nextLine() para consumir esse enter e assim não preencher o x
		// apenas com um enter, faz a descarga do buffer
		sc.nextLine();
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println("Numero inteiro digitado: " + i);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}

}
