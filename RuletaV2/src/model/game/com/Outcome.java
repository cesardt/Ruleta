package model.game.com;

public class Outcome implements Comparable {
	
	String name;
	int odds;
	
	public Outcome(java.lang.String name, int odds){
		this.name = name;
		this.odds = odds;
	}
	
	public int compareTo(java.lang.Object o){
		if(this.equals(o)){
			return 0;
		}
		else{
			return ((Outcome)o).getName().compareTo(this.name);
		}
	}
	
	public boolean equals(java.lang.Object obj){
		return this.name==((Outcome)obj).getName();
	}
	
	public java.lang.String getName(){
		return this.name;
	}
	
	public int getOdds(){
		return this.odds;
	}
	
	public int hashCode(){
		return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
	            // if deriving: appendSuper(super.hashCode()).
	            append(name).
	            append(age).
	            toHashCode();
	}
	
	public void setName(java.lang.String name){
		this.name = name;
	}
	
	public void setOdds(int odds){
		this.odds = odds;
	}
	
	public java.lang.String toString(){
		return name+" ("+odds+":1)";
	}
	
	public int winAmount(int amount){
		return amount * odds;
	}
	
	public static void main(String[] args){
		Outcome test1 = new Outcome("Red",1);
		Outcome test2 = new Outcome("Red",1);
		System.out.println(test1);
		System.out.println(test1);
		System.out.println(test1.compareTo(test2));
		System.out.println(test1.hashCode());
	}

}
