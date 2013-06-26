package se.pilsnerboll.gui;

import se.pilsnerboll.database.DBHelper;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pilsnerboll.R;

public class PlayersActivity extends ListActivity {

	public static final int ADD_PLAYER = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.player_list_activity);
		DBHelper db = DBHelper.getInstance(this);
		this.setListAdapter(new PlayerAdapter(this, R.layout.player_list_row));
	}
	
	public void AddPlayer(View v)
	{
		startActivityForResult(new Intent(this, AddPlayerActivity.class), ADD_PLAYER);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		switch(requestCode)
		{
		case ADD_PLAYER:
			if(resultCode == RESULT_OK)
			{
				((PlayerAdapter) this.getListAdapter()).notifyDataSetChanged();
			}
			break;
		};
	}
}
