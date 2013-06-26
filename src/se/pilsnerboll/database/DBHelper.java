package se.pilsnerboll.database;

import java.util.List;

import android.content.Context;

public class DBHelper {

	private static DBHelper instance;
	private Context ctx;
	
	private DBHelper(Context ctx)
	{
		this.ctx = ctx;
	}
	
	public static synchronized DBHelper getInstance(Context ctx)
	{
		if(instance == null)
		{
			instance = new DBHelper(ctx);
		}
		return instance;
	}
	
	public Player CreateNewPlayer(String name, String handicap)
	{
		Player newPlayer = new Player(ctx, name,handicap);
		newPlayer.save();
		return newPlayer;
	}
	
	public Player GetPlayerByName(String name)
	{
		List<Player> list = Player.find(Player.class, "name = ?", new String[] {name});
		if(list.size() > 0)
		{
			list.get(0);
		}
		return null;
	}
	
	
	public List<Player> GetAllPlayers()
	{
		return Player.listAll(Player.class);
	}
}
