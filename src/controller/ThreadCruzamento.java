package controller;

import java.util.concurrent.Semaphore;

public class ThreadCruzamento extends Thread {
	private String direcao;
	private int carro;
	Semaphore semaforo;
	public ThreadCruzamento(String direcao, Semaphore semaforo, int carro){
		this.direcao = direcao;
		this.semaforo = semaforo;
		this.carro = carro;
		
	}
	public void run() {
		try {
			sleep(1000);
			semaforo.acquire();
			passaCruzamento();
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	
	public void passaCruzamento() {
		System.out.println("O carro " + carro + " Atravessou. Direção: " + direcao);
	}
	
}
