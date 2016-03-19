package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	
	private UUID GameID;
	private Table TableID;
	private ArrayList<Player> GamePlayers;
	
	public Game(){
		
	}
	
	public Game(UUID gameID, Table tableID, ArrayList<Player> gamePlayers) {
		this.GameID = gameID;
		this.TableID = tableID;
		this.GamePlayers = gamePlayers;
	}

	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public Table getTableID() {
		return TableID;
	}

	public void setTableID(Table tableID) {
		TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public void AddPlayerToGame(Table table, Player player){
		
	}

}
