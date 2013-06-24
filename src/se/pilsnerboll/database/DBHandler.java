package se.pilsnerboll.database;

import java.util.List;

import android.content.Context;

public class DBHandler {

	private static DBHandler instance;
	private Context ctx;
	
	private DBHandler(Context ctx)
	{
		this.ctx = ctx;
	}
	
	public static synchronized DBHandler getInstance(Context ctx)
	{
		if(instance == null)
		{
			instance = new DBHandler(ctx);
		}
		return instance;
	}
	
	public void CreatePlayer(String name, String handicap)
	{
		Player newPlayer = new Player(ctx, name,handicap);
		newPlayer.save();
	}
	
	public List<Player> GetAllPlayers()
	{
		return Player.listAll(Player.class);
	}
}
