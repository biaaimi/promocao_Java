package exercicios;
import java.util.Scanner;

public class promocao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double valorProduto;
		double valorPrestacao;
		
		int parcelas = 5; 
		
		
		System.out.print("Digite o valor da compra: ");
		valorProduto = input.nextDouble();
		
		
		valorPrestacao= valorProduto/parcelas;
		
		
		
		System.out.print("O valor de cada parcela é: "+valorPrestacao + "R$");
		
	}

}
