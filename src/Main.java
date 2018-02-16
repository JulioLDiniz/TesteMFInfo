import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
		ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
		
		//Scanner para capturar o que vier do teclado
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Digite um nome para Usuário: ");
			User u = new User();
			u.setName(sc.nextLine());
			System.out.println("Digite o código de identificação: ");
			u.setRegistration(sc.nextLine());
			System.out.println("Digite a nota da primeira avaliação: ");
			u.setT1(sc.nextDouble());
			System.out.println("Digite a nota da segunda avaliação: ");
			u.setT2(sc.nextDouble());
			System.out.println("Digite a nota da terceira avaliação: ");
			u.setT3(sc.nextDouble());
			
			String media = u.retorna_media(u.getT1(), u.getT2(), u.getT3());
			System.out.println("A média de "+u.getName()+" é: "+media);
		
			System.out.println("Imprimir em Json? Digite \"Sim\" ou \"Não\"");
			String opcao = sc.next();
			if(opcao.equals("Sim")) {
				
				//Código para escrita do arquivo Json
				OutputStream os = new FileOutputStream("user.json");
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw);
				
				bw.write(u.escreve_arquivo_saida_json());
				bw.close();
				
				System.out.println("Criado! Busque por \"user.json\" em seu diretório.");
			}
	
		
	}
}
