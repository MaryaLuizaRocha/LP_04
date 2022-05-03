package AvalTxt;
import java.util.Scanner;
public class AvaliaçãoText {

	public static void main(String[] args) {
		     
		Scanner ver = new Scanner (System.in);
		int opcional;
		String frases;
		int sentence =0, n;
				
				System.out.println("Digite sua frase:");
				frases = ver.nextLine();
		  
		    do	{
				System.out.println("---AVALIAÇÃO TEXTUAL---");
				System.out.println("ESCOLHA UMA OPÇÃO: ");
				System.out.println("1 - Número de sentenças (ponto final, exclamação e interrogação)");
				System.out.println("2 - Número de Palavras");
				System.out.println("3 - Número de Vogais");
				System.out.println("4 - Número de Consoantes");
				System.out.println("5 - Sair");
				opcional = ver.nextInt();
				
				
				switch (opcional)
				{
					case 1:
						System.out.println("--NÚMERO DE SENTENÇAS--");
						n = frases.length();
						for (int i=0; i<n; i++) {
							if ((frases.charAt(i)== '.') || (frases.charAt(i)== '?') || (frases.charAt(i)== '!'));
							sentence++;
						}
						System.out.println("Sua frase tem "+sentence+" palavras.\n");break;
					case 2:
						System.out.println("--NÚMERO DE PALAVRAS--");
						int var = frases.split(" ", -1).length - 1;
						System.out.println("Sua frase possui "+(var+1) + " palavras. \n");
						 break;
					case 3:
						System.out.println("--NÚMERO DE VOGAIS--");
				        int cons = 0, vog1=0;
				        
				        frases = frases.toLowerCase();
				        for(int i = 0; i < frases.length(); i++){
				            char c = frases.charAt(i);
				            if(c == 32) continue;
				            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
				                vog1++;
				                continue;
				            }
				            if(c >= 98 && c <= 122) cons++;
				        }
				        System.out.println("Na frase '"+frases+"' temos "+vog1+" vogais. \n");
						break;
					case 4:
						System.out.println("NÚMERO DE CONSOANTES");
				        int cons2 = 0, vog=0;
				        
				        frases = frases.toLowerCase();
				        for(int i = 0; i < frases.length(); i++){
				            char c = frases.charAt(i);
				            if(c == 32) continue;
				            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
				                vog++;
				                continue;
				            }
				            if(c >= 98 && c <= 122) cons2++;
				        }
				        System.out.println("Na frase '"+frases+"' temos "+cons2+" consoantes \n");
						break;
					case 5:
						System.out.println("Finalizando!");break;
					
				}
			}while (opcional != 5);
		}

	}

