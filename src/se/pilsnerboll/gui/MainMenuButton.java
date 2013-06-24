package se.pilsnerboll.gui;

import utilities.Convert;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;

import com.example.pilsnerboll.R;

public class MainMenuButton extends Button {

	
	public enum MainMenuItemActions {
		NEWROUND,
		ROUNDS,
		STATISTICS,
		PLAYERS
	}
	
	public MainMenuItemActions action;
	public MainMenuButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public MainMenuButton(Context context, AttributeSet aSet) {
		super(context, aSet);
	}
	
	public void setMainMenuButtonProperties(String text, MainMenuItemActions action, int iconId)
	{
		this.setText(text);
		this.action=action;
		this.setCompoundDrawablesWithIntrinsicBounds(0, 0, iconId, 0);
		this.setBackgroundResource(R.drawable.menu_button_background);
		this.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MainMenu.performAction(MainMenuButton.this.action);
			}
		});
	}
}
