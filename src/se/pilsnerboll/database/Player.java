package se.pilsnerboll.database;

import java.util.List;

import android.content.Context;

import com.orm.SugarRecord;

public class Player extends SugarRecord<Player> {

	public String Name;
	public String Handicap;
	public Player(Context ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}

	public Player(Context ctx, String name, String handicap)
	{
		super(ctx);
		Name = name;
		Handicap = handicap;
	}
	
	
	
}
