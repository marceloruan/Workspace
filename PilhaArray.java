/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package pilhaarray;

/**
 *
 * @author marcelo
*/
import java.util.Scanner;
public class PilhaArray {
	
	private int[] pilha;
	private int topo;
	public PilhaArray(){
		pilha = new int[5];
		topo = -1;
	}
	
	public PilhaArray(int tamanho){
		pilha = new int[tamanho];
		topo = -1;
	}
	
	public String toString(){
		String saida = "";
		for (int i = topo; i >= 0; i--) {
			saida += "|" + pilha[i] + "|" + "\n";
		}
		saida += "|*|\n";
		return saida;
	}
	
	
	public void empilharPar(int elemento){
	
		if(elemento%2==0){
                topo++;
                pilha[topo] =elemento;
                    System.out.println(this);
                }else{
                    System.out.println("O elemento " + elemento + " Nao foi add");
                }
		
		
		}
	public void empilhar(int elemento){
			
		if((pilha.length > tamanhoPilha())&&(verificaPilha(elemento))== false  ){
			topo++;
			pilha[topo] = elemento;
			System.out.println(this);
		
		}else{
			System.out.println("O elemento " + elemento + " nao foi adicionado.");
		}
	
		
	
	}
	public boolean verificaPilha(int elemento){
		for(int y=0;y<pilha.length;y++){
			if(pilha[y]==elemento){

				return true;
			
				}
			
			
			}
		return false;
		
		}
	
	public int desempilhar(){
		if(!pilhaVazia()){
			int valor = pilha[topo];
			topo--;
			System.out.println(this);
			return valor;
		}else{
			System.out.println("Pilha esta vazia!!!");
			return -1;
		}
	}
	
	public boolean pilhaVazia(){
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
		//Array de tamanho fixo
		p.empilhar(8);
		p.empilhar(5);
		p.empilhar(3);
		p.empilhar(1);
		p.empilhar(4);
		p.empilhar(7);
		
		//Array de tamanho ajustavel
		System.out.print("Digite o tamanho do Array: ");
		int tamanho = teclado.nextInt();
		System.out.println("");
	PilhaArray p2 = new PilhaArray(tamanho);
			p2.empilhar(3);
			p2.empilhar(4);
			p2.empilhar(3);
			p2.empilhar(6);
			p2.empilhar(7);
			p2.empilhar(8);
			p2.desempilhar();
                        PilhaArray p3 = new PilhaArray(tamanho);
				System.out.println("Pilha Par");
		
			p3.empilharPar(3);
			p3.empilharPar(4);
			p3.empilharPar(10);
			p3.empilharPar(6);
			p3.empilharPar(7);
			p3.empilharPar(12);

	}

}

