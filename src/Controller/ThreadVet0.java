package Controller;

public class ThreadVet0 extends Thread {
 private int v;
 private int []vet;
 
 public ThreadVet0(int v, int []vet) {
	 this.v=v;
	 this.vet=vet;
	 
 }
 
 @Override
 // verifica se a thread é par ou impar 
	public void run() {
		if(v%2==0) {
			Threadpar();
		}else {
			ThreadImpar();
		}
		super.run();
	}
 // se for impar  
private void ThreadImpar() {
	double tempIni = System.nanoTime();// para ver o tempo que leva 
	long soma = 0;
	
	for (int i : vet) {
		soma = soma+ i;
	}
	
	double tempFi = System.nanoTime();
	double tempoTotal = tempFi - tempIni;
	tempoTotal /= Math.pow(10, 9);
	System.out.println("Tempo para percorrer vetor as Threads impar é de ====> : " + tempoTotal + "s.");
}
// se for par

private void Threadpar() {
	double tempIni = System.nanoTime();
	long s = 0;
	
	for (int i = 0; i < vet.length; i++) {
		s = s+ vet[i];
	}
	
	double tempFi = System.nanoTime();
	double tempoTotal = tempFi - tempIni;
	tempoTotal /= Math.pow(10, 9);
	System.out.println("Tempo para percorrer  vetor as Threads par é de ====> : " + tempoTotal + "s.");
}
	
}


