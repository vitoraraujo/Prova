import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;

class TabuleiroTestDrive2{
	private int x;
	private int y;
	Tabuleiro t = new Tabuleiro();

	public static void main(String[] args) {
		TabuleiroTestDrive gui = new TabuleiroTestDrive();
		gui.go();
		
		try{
			File mf = new File("MyText.txt");
			FileReader fr = new FileReader(mf);

			BufferedReader reader = new BufferedReader(fr);

			String line = null;

			while((line = reader.readLine()) != null){
				// O valor lido seria atribuido aos x e y
			}
			reader.close();
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
		peca1.setXY(rand.nextInt(5),rand.nextInt(3)); 
		peca2.setXY(rand.nextInt(5),rand.nextInt(3));
		peca3.setXY(rand.nextInt(5),rand.nextInt(3));
		peca4.setXY(rand.nextInt(5),rand.nextInt(3));
		peca5.setXY(rand.nextInt(5),rand.nextInt(3));
		peca6.setXY(rand.nextInt(5),rand.nextInt(3));
		peca7.setXY(rand.nextInt(5),rand.nextInt(3));
		peca8.setXY(rand.nextInt(5),rand.nextInt(3));

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