package se.pilsnerboll.gui;

import java.util.List;

import se.pilsnerboll.database.DBHelper;
import se.pilsnerboll.database.Player;
import android.content.ClipData.Item;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.pilsnerboll.R;

public class PlayerAdapter extends ArrayAdapter<Player> {

	private Context context;
	private List<Player> playerList;

	public PlayerAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
		this.context = context;
		playerList = DBHelper.getInstance(context).GetAllPlayers();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return playerList.size();
	}
	
	@Override
	public void notifyDataSetChanged() {
		// TODO Auto-generated method stub
		playerList = DBHelper.getInstance(context).GetAllPlayers();
		super.notifyDataSetChanged();
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;

		// first check to see if the view is null. if so, we have to inflate it.
		// to inflate it basically means to render, or show, the view.
		if (v == null) {
			LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inflater.inflate(R.layout.player_list_row, null);
		}

		/*
		 * Recall that the variable position is sent in as an argument to this method.
		 * The variable simply refers to the position of the current object in the list. (The ArrayAdapter
		 * iterates through the list we sent it)
		 * 
		 * Therefore, i refers to the current Item object.
		 */
		Player player = playerList.get(position);

		if (player != null) {

			// This is how you obtain a reference to the TextViews.
			// These TextViews are created in the XML files we defined.

			TextView name = (TextView) v.findViewById(R.id.player_lr_player);
			TextView handicap = (TextView) v.findViewById(R.id.player_lr_handicap);

			name.setText(player.Name);
			handicap.setText(player.Handicap);
		}

		// the view must be returned to our activity
		return v;
	}
	


	

}
