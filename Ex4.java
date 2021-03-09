package view;

import controller.ThreadToad;

public class Ex4 {
	static int i=0;
	static int[] ordem=new int[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int y =0;y<5;y++){
			Thread tsapo= new ThreadToad(y);
			tsapo.start();
		}
	}
	public static void recebe(int sapo){
		
		System.out.println("Sapo "+sapo+" - "+(i+1)+"º posição");
		i++;
	}

}
