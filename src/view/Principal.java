package view;

import java.util.concurrent.Semaphore;

import controller.ThreadCruzamento;

public class Principal {
	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		Thread carro1 = new ThreadCruzamento("direita", semaforo, 1);
		Thread carro2 = new ThreadCruzamento("esquerda", semaforo, 2);
		Thread carro3 = new ThreadCruzamento("baixo", semaforo, 3);
		Thread carro4 = new ThreadCruzamento("cima", semaforo, 4);
		carro1.start();
		carro2.start();
		carro3.start();
		carro4.start();
	}

}
