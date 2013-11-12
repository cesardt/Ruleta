package ai.game.com;

import player.game.com.Player;
import model.game.com.Game;

public class Simulator {
	private Game game;
	private Player player;
	private int sample;
	private java.util.List<java.lang.Integer> durations, maxima;
	
	public Simulator(Game game, Player player){
		this.game=game;
		this.player=player;
	}
	
	public void gather(){
		
	}
	
	public java.util.List<java.lang.Integer> getDurations(){
		return this.durations;
	}
	
	public Game getGame(){
		return this.game;
		
	}
	
	public int getInitDuration(){
		return this.durations.get(0);
	}
	
	public int getInitStake(){
		return this.player.getStake();
	}
	
	public java.util.List<java.lang.Integer> getMaxima(){
		return this.maxima;
	}
	
	public Player getPlayer(){
		return this.player;
	}
	
	public int getSample(){
		return this.sample;
	}
	
	public java.util.List<java.lang.Integer> session(){
		
	}
	
	public void setDurations(java.util.List<java.lang.Integer> durations){
		this.durations=durations;
	}
	
	public void setGame(Game game){
		this.game=game;
	}
	
	public void setInitDuration(int initDuration){
		this.durations.set(0, initDuration);
	}
	
	public void setInitStake(int initStake){
		this.player.setStake(initStake);
	}
	
	public void setMaxima(java.util.List<java.lang.Integer> maxima){
		this.maxima=maxima;
	}
	
	public void setPlayer(Player player){
		this.player=player;
	}
	
	public void setSample(int sample){
		this.sample=sample;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
