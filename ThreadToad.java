package controller;

import java.util.Random;

import view.Ex4;

public class ThreadToad extends Thread{
	private int sapo;
	public ThreadToad(int sapo) {
		// TODO Auto-generated constructor stub
		this.sapo=sapo;
	}
	
	@Override
	public void run() {
		int distancia=0;
		int salto;
		// TODO Auto-generated method stub
		Random gerador=new Random();
		while(distancia<50){
			salto=gerador.nextInt(11);
			distancia=distancia+salto;
			System.out.println("Sapo "+sapo+" pulou: " +salto+ " Distancia: "+distancia);
		}
		//for(int i=0;i<5;i++){
		//	ordem[i]=sapo;
		//}

		System.out.println("Sapo "+sapo+" - Chegou - Distancia percorrida: "+distancia);
		Ex4.recebe(sapo);

	}
}
