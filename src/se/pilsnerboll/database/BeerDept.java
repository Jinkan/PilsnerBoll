package se.pilsnerboll.database;

import android.content.Context;

import com.orm.SugarRecord;

public class BeerDept extends SugarRecord<BeerDept> {

	long playerone;
	long playertwo;
	int dept;
	
	public BeerDept(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public BeerDept(Context ctx, Player player1, Player player2)
	{
		super(ctx);
		this.playerone = player1.getId();
		this.playertwo = player2.getId();
		this.dept = 0;
		
	}
	
	

}
