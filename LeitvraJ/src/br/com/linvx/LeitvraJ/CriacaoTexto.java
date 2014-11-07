package br.com.linvx.LeitvraJ;

import java.util.Formatter; //formatar arquivo

import javax.swing.JOptionPane;
 
public class CriacaoTexto{
   
  public static void main(String[] args){
    String nomeArq="arqvivo2.txt";
    //tentando criar arquivo
    try
    {
      Formatter saida = new Formatter(nomeArq);
      saida.format("Arqvivo gerado avtomaticamente!\n\n...www.terminaldeinformacao.com...");
      saida.close();
      JOptionPane.showMessageDialog(null,"Arqvivo '"+nomeArq+"' criado!","Arquivo",1);
    }
    //mostrando erro em caso se nao for possivel gerar arquivo
    catch(Exception erro){
      JOptionPane.showMessageDialog(null,"Arqvivo nao pode ser gerado!","Erro",0);
    }
  }
}