package se.pilsnerboll.database;

import android.content.Context;

import com.orm.SugarRecord;

public class RoundsPlayers extends SugarRecord<RoundsPlayers> {

	Round round;
	Player player;
	
	public RoundsPlayers(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public RoundsPlayers(Context ctx, Round round, Player player)
	{
		super(ctx);
		this.round = round;
		this.player = player;
	}

}
