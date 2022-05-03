package Roblox;
import java.util.Scanner;
public class Cores {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int azul=0, verde=0, vermelho=0;
		int cnt = 1;
		ler =  new Scanner(System.in);
		String cor;
		
		do
		{
			System.out.println(" ");
			System.out.println("Digite a cor da sua chave (MAIUSCULO): ");
			cor  = ler.nextLine();
			
			if(cor.equals("AZUL"))
			{
			System.out.println("Ir para a porta Azul!");
			azul ++;
			}
			if(cor.equals("VERDE"))
			{
			System.out.println("Ir para a porta Verde!");
			verde ++;
			}
			if(cor.equals("VERMELHO"))
			{
			System.out.println("Ir para a porta Vermelha!");
			vermelho ++;
			}

			cnt = cnt+1;
		}while(cnt <= 10);
				System.out.println("QUANTIDADE DE CHAVES"); 
				System.out.println("Azul: " + azul); 
				System.out.println("Vermelho: " + verde);
				System.out.println("Verde: " + vermelho);
	}
}
