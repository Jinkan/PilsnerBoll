package se.pilsnerboll.database;

import java.sql.Date;

import android.content.Context;

import com.orm.SugarRecord;

public class Round extends SugarRecord<Round> {

	Date date;
	
	public Round(Context ctx) {
		super(ctx);
		// TODO Auto-generated constructor stub
	}
	
	public Round(Context ctx, Date date) {
		super(ctx);
		this.date = date;
		// TODO Auto-generated constructor stub
	}
}
