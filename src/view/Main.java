package view;

import Controller.ThreadVet0;

public class Main {

	public static void main(String[] args) {
int[] vet = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			vet[i] = (int) (Math.random() * 100) + 1;
		}
		Thread tVet1 = new ThreadVet0(1, vet);
		Thread tVet2 = new ThreadVet0(2, vet);
		tVet1.start();
		tVet2.start();

	}

}
