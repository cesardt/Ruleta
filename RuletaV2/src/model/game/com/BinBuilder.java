package model.game.com;

public class BinBuilder {
	
	public BinBuilder(){
		
	}
	
	public void buildBins(Wheel wheel){
		
		Bin temp;
		java.util.Vector<Integer> redN = new java.util.Vector<Integer>((java.util.Arrays.asList(1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)));
		
		
		for(int i = 0; i<37; i++){ //Inicializa los bins de la rueda y agrega a ellos outcomes de los numeros
			temp = new Bin();
			temp.add(new Outcome(String.valueOf(i),35));
			wheel.addBin(i, temp);
			
			if((i%2) == 0){
				wheel.getBin(i).add(new Outcome("Even",1));
			}else{
				wheel.getBin(i).add(new Outcome("Odd",1));
			}
			
			if(i < 19){
				wheel.getBin(i).add(new Outcome("Low",1));
			}
			else{
				wheel.getBin(i).add(new Outcome("High",1));
			}
			
			if(redN.contains((Integer)i)){
				wheel.getBin(i).add(new Outcome("Red",1));
			}
			else{
				wheel.getBin(i).add(new Outcome("Black",1));
			}
		}
		temp = new Bin();
		temp.add(new Outcome("00",35));
		wheel.addBin(37, temp);
	}
	
	

}
