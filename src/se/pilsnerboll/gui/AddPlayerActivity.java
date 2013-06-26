package se.pilsnerboll.gui;

import com.example.pilsnerboll.R;

import se.pilsnerboll.database.DBHelper;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayerActivity extends Activity {

	EditText name;
	EditText handicap;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_player_activity);
		name = (EditText) this.findViewById(R.id.editAddPlayerName);
		handicap = (EditText) this.findViewById(R.id.editAddPlayerHandicap);
	}
	
	public void SavePlayer(View v)
	{
		if(name.getText().length() != 0 && handicap.getText().length() != 0)
		{
			DBHelper helper = DBHelper.getInstance(this);
			if(helper.GetPlayerByName(name.getText().toString()) != null)
			{
				helper.CreateNewPlayer(name.getText().toString(), handicap.getText().toString());
				setResult(RESULT_OK);
				finish();
			}
			else
			{
				Toast.makeText(this, getApplicationContext().getResources().getString(R.string.save_player_player_exists), 2000).show();
			}
		}
		else
		{
			Toast.makeText(this, getApplicationContext().getResources().getString(R.string.save_player_no_text), 2000).show();
		}
	}
}
