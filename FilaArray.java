/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package filaarray;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
		
		public class FilaArray {
		
			private int[] fila;
			private int inicio;
			private int fim;
			
			public FilaArray(){
				fila = new int[5];
				inicio = 0;
				fim = 0;
			}
			
			public FilaArray(int tamanho){
				fila = new int[tamanho];
				inicio = 0;
				fim = 0;
			}
		
		private boolean existeElemento(int elemento){
			for (int i = 0; i < fila.length; i++) {
				if(fila[i] == elemento){
					return true;
				}
			}
			return false;
		}
		
		public boolean ehPar(int valor){
			if(valor %2==0){
				return true;
				}else{
					return false;
					}
			
			}
			
			public void enfileiraPar(int elemento){
				if(ehPar(elemento)){
					enfileirar(elemento);
					}else{
                                
                                System.err.println("O numero nao eh par");
                                }	
					
				
				}
				
			public void enfileiraImpar(int elemento){
				if(!ehPar(elemento)){
					enfileirar(elemento);
					}else{
                                System.err.println("Numero nao eh impar");
                                }
				
				}
		
		public void enfileirar(int elemento){
			
				if((inicio < fila.length) &&(!existeElemento(elemento))){
					fila[inicio] = elemento;
					inicio++;
				}else if(inicio == fim){
					inicio = 0;
					fim = 0;
				} 
			
		}
		
		public int desenfileirar(){
			if(fim > 0){
				int valor = fila[fim];
				fim++;
				if(inicio == fim){
					inicio = 0;
					fim = 0;
				}
				return valor;
			}else{
                            int erro = -1;
                            System.err.println("Nao se pode desenfileirar");
				return erro;
                              
			}
			
		}
		
		public String toString(){
			String toReturn = "|*|";
			for (int i = fim; i < inicio; i++) {
				toReturn += fila[i] + " ";
			}
			return toReturn;
		}
		
		public boolean estaVazia(){
			if(inicio == fim){
				return true;
			}else{
				return false;
			}
		}
		
		public int tamanho(){
			return inicio-fim;
		}
		
		public static void main(String[] args) {
			FilaArray fila = new FilaArray();
                        Scanner teclado = new Scanner(System.in);
                            int tamanho = teclado.nextInt();
                            FilaArray fila2 = new FilaArray(tamanho);//Fila para passar paramentro do tamanho
                            
              
                          fila2.enfileirar(4);
                        System.out.println(fila2);
                        System.out.println(fila);	
			
		}
		
	}
	

