package model.game.com;

public class NonRandom extends java.util.Random {
	private int value;
	public NonRandom(){
		
	}
	
	protected int next(int bits){
		return value;
	}
	
	public void setSeed(long seed){
		this.value = (int) seed;
	}

}
