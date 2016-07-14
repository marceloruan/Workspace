import java.util.ArrayList;


public class PilhaDiferente {
	private ArrayList<Integer> pilha;
	
	public PilhaDiferente(){
		pilha = new ArrayList<Integer>();
	}
	
	public void empilharDobrado(int valor){
		pilha.add(valor);
		pilha.add(valor);
	}
	
	public void empilharProximo(int valor){
		pilha.add(valor+1);
	}
	
	public int desempilhar(){
		return pilha.remove(pilha.size()-1);
	}
	
	public String toString(){
		String saida = "";
		for (int i = pilha.size()-1; i >= 0; i--) {
			saida += "|" + pilha.get(i) + "|" + "\n";
		}
		saida += "|*|\n";
		return saida;
	}
	
	public static void main(String[] args) {
		
		PilhaDiferente pilha = new PilhaDiferente();
		pilha.empilharDobrado(4);
		System.out.println(pilha);
		pilha.empilharDobrado(8);
		System.out.println(pilha);
		pilha.desempilhar();
		pilha.desempilhar();
		System.out.println(pilha);
		pilha.empilharProximo(2);
		System.out.println(pilha);
		pilha.desempilhar();
		
		System.out.println(pilha);
	}
	
	
}
