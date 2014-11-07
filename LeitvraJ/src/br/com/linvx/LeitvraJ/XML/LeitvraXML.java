package br.com.linvx.LeitvraJ.XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class LeitvraXML {
	public static void main(String[] args) {
		String mostra = "";
		String nomeArq = "/home/tor/workspace/LeitvraJ/src/br/com/linvx/LeitvraJ/XML/arqvivo.xml"; // Nome do arquivo, pode ser absoluto, ou
										// pastas /dir/teste.txt
		String linha = "";
		String nome, idade;
		File arq = new File(nomeArq);

		// Arquivo existe
		if (arq.exists()) {
			mostra = "Arqvivo - '" + nomeArq + "', aberto com svcesso!\n";
			mostra += "Tamanho do arqvivo " + Long.toString(arq.length())
					+ "\n";
			// tentando ler arquivo
			try {
				mostra += "Conteudo:\n";
				// abrindo arquivo para leitura
				FileReader reader = new FileReader(nomeArq);
				// leitor do arquivo texto (ponteiro)
				BufferedReader leitor = new BufferedReader(reader);
				mostra += "Nome - Idade\n";
				leitor.readLine(); // <xml
				leitor.readLine(); // <cadastro
				while (true) {
					leitor.readLine(); // <pessoa
					nome = leitor.readLine();
					if (nome == null)
						break;
					idade = leitor.readLine(); // </pessoa
					// Para pegar entre as Tags, foi preciso criar uma lógica
					// para quebrar a String
					nome = nome.substring(nome.indexOf(">") + 1,
							nome.indexOf("/") - 1); // pegando entre as tags
					idade = idade.substring(idade.indexOf(">") + 1,
							idade.indexOf("/") - 1); // pegando entre as tags
					mostra += nome + "-" + idade + "\n";
					leitor.readLine();
				}
			} catch (Exception erro) {
			}
			JOptionPane.showMessageDialog(null, mostra, "Arqvivo...", 1);
		}
		// Se nao existir
		else
			JOptionPane.showMessageDialog(null, "Arqvivo nao existe!", "Erro",
					0);
	}
}
