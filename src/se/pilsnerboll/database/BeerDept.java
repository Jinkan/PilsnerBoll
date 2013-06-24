package se.pilsnerboll.database;

import android.content.Context;

import com.orm.SugarRecord;

public class BeerDept extends SugarRecord<BeerDept> {

	public Player player1;
	public Player player2;
	public int dept;
	
	public BeerDept(Context arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public BeerDept(Context ctx, Player player1, Player player2)
	{
		super(ctx);
		this.player1 = player1;
		this.player2 = player2;
		this.dept = 0;
		
	}
	
	

}
