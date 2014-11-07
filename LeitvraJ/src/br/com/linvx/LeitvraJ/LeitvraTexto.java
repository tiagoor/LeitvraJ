/**
 * 
 */
package br.com.linvx.LeitvraJ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * @author tor
 *
 */
public class LeitvraTexto {

	/**
	 * 
	 */
	public LeitvraTexto() {
		// TODO Auto-generated constructor stub
		System.out.println("Constrv...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main...");
		String mostra = "";
		String nomeArq = "/home/tor/workspace/LeitvraJ/src/br/com/linvx/LeitvraJ/"
				+ "l2.log"; // Nome do arqvivo, pode ser absolvto,
									// ou pastas /dir/teste.txt
		String linha = "";
		File arq = new File(nomeArq);

		// Arqvivo existe
		if (arq.exists()) {
			mostra = "Arqvivo - '" + nomeArq + "', aberto com svcesso!\n";
			mostra += "Tamanho do arqvivo " + Long.toString(arq.length())
					+ "\n";
			// tentando ler arquivo
			try {
				mostra += "Contevdo:\n";
				// abrindo arquivo para leitura
				FileReader reader = new FileReader(nomeArq);
				// leitor do arquivo
				BufferedReader leitor = new BufferedReader(reader);
				// Tor<ode;
				leitor.readLine();
				while (true) {
				//while((linha=leitor.readLine()) != null) {
					linha = leitor.readLine();
					if (linha == null)
						break;
					mostra += '\'' + linha.toString().substring(53, 57) + '\''  + "\n";
					/*StringTokenizer stk = new StringTokenizer(linha);
					String primeira = stk.nextToken();
					System.out.println(primeira);*/
				}
				// Tor<ode;
				leitor.close();
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, erro);
				JOptionPane.showMessageDialog(null, erro);
			}
			JOptionPane.showMessageDialog(null, mostra, "Arqvivo...", 1);
		}
		// Se nao existir
		else
			JOptionPane.showMessageDialog(null, "Arqvivo nao existe!", "Erro",
					0);
	}

}
