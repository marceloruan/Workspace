import java.util.Scanner;
public class PilhaArray {
	
	private int[] pilha;
	private int topo;
	private int TamPilha;
	public PilhaArray(){
		TamPilha =0;
		pilha = new int[TamPilha];
		topo = -1;
	}
	
//	public Pilha(int tamanho){
//		pilha = new int[tamanho];
//		topo = -1;
//	}
	
	public String toString(){
		String saida = "";
		for (int i = topo; i >= 0; i--) {
			saida += "|" + pilha[i] + "|" + "\n";
		}
		saida += "|*|\n";
		return saida;
	}
	
	public void empilhar(int elemento){
		if(pilha.length > tamanhoPilha()){
			topo++;
			pilha[topo] = elemento;
			System.out.println(this);
		}else{
			System.out.println("O elemento " + elemento + " nao foi adicionado.");
		}
	}
	
	public int desempilhar(){
		if(!listaVazia()){
			int valor = pilha[topo];
			topo--;
			System.out.println(this);
			return valor;
		}else{
			System.out.println("Pilha est vazia!!!");
			return -1;
		}
	}
	
	public boolean listaVazia(){
		if(tamanhoPilha() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public int tamanhoPilha(){
		return topo+1;
	}
	
	
	
	public static void main(String[] args) {
		PilhaArray p = new PilhaArray();
		Scanner teclado = new Scanner (System.in);
		int TamPilha = teclado.nextInt();
		p.empilhar(8);
		p.empilhar(5);
		p.empilhar(3);
		p.empilhar(1);
		p.empilhar(4);
		p.empilhar(7);
		
		PilhaArray p2 = new PilhaArray();
		
	}

}
