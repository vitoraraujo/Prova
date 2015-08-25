import java.util.*;
import java.awt.*;
import java.io.*;

class Tabuleiro implements Serializable{
	ArrayList<Cavalo> pecasCavalo = new ArrayList<Cavalo>();

	public void addPecas(Cavalo pecas){
		pecasCavalo.add(pecas);
	}
}