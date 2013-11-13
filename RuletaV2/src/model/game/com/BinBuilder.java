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
		
		for(int i = 0; i<12; i++){ 
			int n=3*i+1; //Odd
			//Left-right pairs
			Outcome split=new Outcome(n+","+(n+1)+"",17);
			wheel.getBin(n).add(split);
			wheel.getBin(n+1).add(split);
			//Up-down pairs
			split=new Outcome(n+","+(n+3)+"",17);
			wheel.getBin(n).add(split);
			wheel.getBin(n+3).add(split);
			//Street pairs
			split=new Outcome(n+","+(n+1)+","+(n+2),11);
			wheel.getBin(n).add(split);
			wheel.getBin(n+1).add(split);
			wheel.getBin(n+2).add(split);
			
			
			n=3*i+2; //Even
			//Left right pairs
			split=new Outcome(n+","+n+1+"",17);
			wheel.getBin(n).add(split);
			wheel.getBin(n+1).add(split);
			//Up down pairs
			split=new Outcome(n+","+n+3+"",17);
			wheel.getBin(n).add(split);
			wheel.getBin(n+3).add(split);
			//Street pairs
			split=new Outcome(n+","+(n+1)+","+(n+2),11);
			wheel.getBin(n).add(split);
			wheel.getBin(n+1).add(split);
			wheel.getBin(n+2).add(split);
			
			
			
		}
		
		for(int i=0;i<11;i++){
			int n=3*i+1;
			Outcome street=new Outcome(n+","+(n+1)+","+(n+3)+","+(n+4),8);
			wheel.getBin(n).add(street);
			wheel.getBin(n+1).add(street);
			wheel.getBin(n+3).add(street);
			wheel.getBin(n+4).add(street);
			
			n=3*i+2;
			street=new Outcome(n+","+(n+1)+","+(n+3)+","+(n+4),8);
			wheel.getBin(n).add(street);
			wheel.getBin(n+1).add(street);
			wheel.getBin(n+3).add(street);
			wheel.getBin(n+4).add(street);
		}
		for(int i=0;i<10;i++){
			int n=i*3+1;
			Outcome line=new Outcome(n+","+(n+1)+","+(n+2)+","+(n+3)+","+(n+4)+","+(n+5),5);
			wheel.getBin(n).add(line);
			wheel.getBin(n+1).add(line);
			wheel.getBin(n+2).add(line);
			wheel.getBin(n+3).add(line);
			wheel.getBin(n+4).add(line);
			wheel.getBin(n+5).add(line);
		}
		for(int i=0;i<3;i++){
			Outcome column=new Outcome(String.valueOf(i+1),2);
			for(int j=0;j<12;j++){
				wheel.getBin(3*j+i+1).add(column);
			}
		}
		
		temp = new Bin();
		temp.add(new Outcome("00",35));
		wheel.addBin(37, temp);
	}
	
	public static void main(String [] args){
		BinBuilder bb = new BinBuilder();
		Wheel wheel = new Wheel();a	Z
		bb.buildBins(wheel);
	}

}
