/**
 * 
 */
package Exercícios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
@ autor Kaue Gonçalves *
 */
public class Media {

	public static void main(String[] args) {
		//<ctrl><shift><f> (alinhamento)
		//variáveis 
		double nota1, nota2, media;
		//Objeto leitor (usado para capturar dados)
		Scanner leitor = new Scanner(System.in);
		//Objeto formatador(Usado para formatar o resultado)
		DecimalFormat formatador = new DecimalFormat("0.0");
		System.out.println("Cálculo da média");
		//Entrada
		System.out.print("Digite a nota1: ");
		nota1=leitor.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2=leitor.nextDouble();
		//Processamento
		media = (nota1 + nota2) / 2;
		//Saída
		System.out.println("Média: " + formatador.format(media));
		if (media <2) {
		System.out.println("REPROVADO");	
		}
		else if (media >=2 && media < 5) {
			System.out.println("RECUPERAÇÂO");
		}
		else {
			System.out.println("APROVADO");
		}
		leitor.close();
	}

}
