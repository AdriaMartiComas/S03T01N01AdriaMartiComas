package exercici1;

import java.util.ArrayList;

public class Undo {
	
	private static Undo instancia;
	ArrayList<String> list = new ArrayList<String>();
	String desfeta;
	
	private Undo() {
		
	}
	
	public static Undo getInstancia() {
		if(instancia == null) {
			instancia = new Undo();
		}
		return instancia;
	}
	

	
	public void desfer() {
		int i = list.size();
		desfeta = list.get(i-1);
		list.remove(i-1);
		
	}

	public void refer() {
		int i = list.size();
		if (!desfeta.equals(list.get(i-1))){
			list.add(desfeta);
		}
	}
	
	@Override
	public String toString() {
		return "list = " + list;
	}
	

} 
