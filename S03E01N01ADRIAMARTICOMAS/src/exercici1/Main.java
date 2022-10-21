package exercici1;

public class Main {

	public static void main(String[] args) {
		Undo comandes = Undo.getInstancia();
		
		System.out.println("LLISTA COMANDES\n");
		comandes.list.add("Comanda 1");
		comandes.list.add("Comanda 2");
		
		System.out.println(comandes);
		comandes.desfer();
				
		System.out.println("Undo " +comandes);
		comandes.refer();
		
		System.out.println("Redo " +comandes +"\n");


		Undo comandes2 = Undo.getInstancia();
		comandes2.list.add("nova comanda 1");
		comandes2.list.add("nova comanda 2");
		
		System.out.println(comandes2);
		comandes2.desfer();
		
		System.out.println("Undo " +comandes2);
		comandes2.refer();

		System.out.println("Redo " +comandes2);
		
	}
	
}

