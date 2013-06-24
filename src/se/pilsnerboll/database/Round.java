package se.pilsnerboll.database;

import android.content.Context;

import com.orm.SugarRecord;

public class Round extends SugarRecord<Round> {

	public Player player1;
	public Player player2;
	public Player player3;
	public Player player4;
	
	public Round(Context ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}
	
	public Round(Context ctx, Player player1, Player player2, Player player3, Player player4) {
		super(ctx);
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		// TODO Auto-generated constructor stub
	}
}
