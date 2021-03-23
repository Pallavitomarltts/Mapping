package com.ltts.Player.Model;

public class Player {

	
	private int playerNo;
	private String playerName;
	private String playerteam;
	
	
	public Player() {
		super();
	}
	public Player(int playerNo, String playerName, String playerteam) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.playerteam = playerteam;
	}
	public int getPlayerNo() {
		return playerNo;
	}
	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerteam() {
		return playerteam;
	}
	public void setPlayerteam(String playerteam) {
		this.playerteam = playerteam;
	}
	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", playerteam=" + playerteam + "]";
	}
	

	
}