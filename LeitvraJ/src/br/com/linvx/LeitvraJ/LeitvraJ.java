/**
 * tor@openstack.eti.br
 */
package br.com.linvx.LeitvraJ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author tor
 *
 */
public class LeitvraJ {

	/**
	 * 
	 */
	public LeitvraJ() {
		// TODO Auto-generated constructor stub
		System.out.println("Constrvtor...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main...");
		String mostra = "";
		String nomeArq = "arqvivo.txt"; // Nome do arqvivo, pode ser absolvto,
										// ou pastas /dir/teste.txt
		String linha = "";
		File arq = new File(nomeArq);

		JOptionPane.showMessageDialog(null, nomeArq + "-");
		JOptionPane.showMessageDialog(null, arq + "-");

		
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
				while (true) {
					linha = leitor.readLine();
					if (linha == null)
						break;
					mostra += linha + "\n";
				}
				//leitor.close();
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
