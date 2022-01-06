package curso_programacao;

import java.util.Locale;

public class _24SaidaDeDadosLocalePrintfFormatacao {

	public static void main(String[] args) {
		// Mudar configuração de localidade
		// Mudar ponto para virgula e vice versa
		// Mudar padrão de localização para numeros
		
		Locale.setDefault(Locale.US);
		int idade = 40;
		String nome = "Maria2";
		double salario = 4000.34;
		int y = 32; double saidaDouble = 10.875423;
		// Formatacao de numeros para saida na tela
		// formatacao printf
		// formata saida para numeros decimais
		System.out.println("Ola mundo e o y:" + y);
		System.out.println("Bom dia");
		System.out.printf("Saida Double: %.4f%n" , saidaDouble);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais", nome, idade, salario);
	}

}
