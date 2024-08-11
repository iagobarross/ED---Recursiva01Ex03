package view;

import controller.ControllerFatorial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerFatorial contFat = new ControllerFatorial();
		Scanner sc = new Scanner(System.in);
		
		int numero = 100;
		while(numero > 12) {
			numero = sc.nextInt();
		}
		
		int resultado = contFat.fatorial(numero);
		System.out.println("O fatorial de " + numero + " é: " +resultado);
		
	}

}
