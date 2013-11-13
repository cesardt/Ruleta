package model.game.com;

public class Wheel {
	private java.util.Vector<Bin> bins = new java.util.Vector<Bin>(38);
	private java.util.Random rng;
	public Wheel(){
	}
	
	public Wheel(java.util.Random rng){
		this.rng=rng;
	}
	
	public void addBin(int binPosition, Bin bin){
		
	}
	
	public void addOutcome(int bin, Outcome outcome){
		bins.get(bin).add(outcome);
	}
	
	public Bin getBin(int bin){
		return this.bins.get(bin);
	}
	/*
	public Outcome getOutcome(String name){
		
	}
	*/
	public java.util.Random getRng(){
		return rng;
	}
	
	public Bin next(){
		return bins.get(rng.nextInt(38));
	}

}
