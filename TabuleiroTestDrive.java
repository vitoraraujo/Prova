import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

class TabuleiroTestDrive{
	private int x;
	private int y;
	Tabuleiro t = new Tabuleiro();

	public static void main(String[] args) {
		TabuleiroTestDrive gui = new TabuleiroTestDrive();
		gui.go();
		try{
			FileOutputStream fs = new FileOutputStream("Arq.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.write(t); // Escreve o objeto t da classe tabuleiro acima
			os.write(t.pecasCavalo); // Escreve 
			os.close();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void go(){
		Random rand = new Random();

		Cavalo peca1 = new Cavalo();
		Cavalo peca2 = new Cavalo();
		Cavalo peca3 = new Cavalo();
		Cavalo peca4 = new Cavalo();
		Cavalo peca5 = new Cavalo();
		Cavalo peca6 = new Cavalo();
		Cavalo peca7 = new Cavalo();
		Cavalo peca8 = new Cavalo();
		
		//Diz que os lugares do tabuleiro sao no max 5 de largura e 3 de altura (no cavalo.java esta o metodo)
		peca1.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo); 
		peca2.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);
		peca3.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);
		peca4.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);
		peca5.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);
		peca6.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);
		peca7.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);
		peca8.setXY(rand.nextInt(5),rand.nextInt(3), t.pecasCavalo);

		t.addPecas(peca1);
		t.addPecas(peca2);
		t.addPecas(peca3);
		t.addPecas(peca4);
		t.addPecas(peca5);
		t.addPecas(peca6);
		t.addPecas(peca7);
		t.addPecas(peca8);
		
	}
}