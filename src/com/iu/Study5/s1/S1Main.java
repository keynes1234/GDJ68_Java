package com.iu.Study5.s1;

public class S1Main {
	public static void main(String[] args) {
		
		Worrier worrier = new Worrier();
		worrier.getItem();
		
		Magician magician = new Magician();
		magician.getItem();
		
		Archer archer = new Archer();
		archer.getItem();
		
		//worrier.axe.name
		Character character = magician;
		character = worrier;
		
		magician.setMp(20);
		magician=(Magician)character;
		magician.setMp(0);
		
		
		
		
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician;
		
//		worrier = (Worrier)w[0];
//		magician = (Magician)w[1];
		
		magician = (Magician)w[1];
		magician.setMp(20);
		
		//-----------------------------
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
		
	}
}
