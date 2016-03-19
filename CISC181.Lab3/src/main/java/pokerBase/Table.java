package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private ArrayList<Player> TablePlayers;
	
	public Table(){
		
	}
	
	public Table(UUID tableID, ArrayList<Player> tablePlayers) {
		this.TableID = tableID;
		this.TablePlayers = tablePlayers;
	}
	
	public UUID getTableID() {
		return TableID;
	}
	public void setTableID(UUID tableID) {
		TableID = tableID;
	}
	public ArrayList<Player> getTablePlayers() {
		return TablePlayers;
	}
	public void setTablePlayers(ArrayList<Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}
	
	public void AddPlayerToTable(Player player){
		
	}
	
}
