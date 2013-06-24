package se.pilsnerboll.gui;

import se.pilsnerboll.gui.MainMenuButton.MainMenuItemActions;
import utilities.Convert;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.example.pilsnerboll.R;

public class MainMenu extends Activity {
	private LinearLayout layout;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout)this.findViewById(R.id.MainMenuButtonHolder);
        createMainMenu();
        //findViewById(android.R.id.content).invalidate();
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void createMainMenu()
    {

    	addButtonToMainMenu(this.getResources().getString(R.string.menu_player), MainMenuItemActions.PLAYERS, R.drawable.players);
    	addButtonToMainMenu(this.getResources().getString(R.string.menu_new_round), MainMenuItemActions.NEWROUND, R.drawable.scoreboard);
    	addButtonToMainMenu(this.getResources().getString(R.string.menu_rounds), MainMenuItemActions.ROUNDS, R.drawable.scoreboard);
    	addButtonToMainMenu(this.getResources().getString(R.string.menu_statistics), MainMenuItemActions.STATISTICS, R.drawable.statistics);
    	
    }
    
    public void addButtonToMainMenu(String text, MainMenuItemActions action, int iconId)
    {
    	MainMenuButton button = (MainMenuButton) this.getLayoutInflater().inflate(R.layout.menu_button, null);
    	button.setMainMenuButtonProperties(text, action, iconId);
    	LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
    	params.setMargins(Convert.GetPxForDp(7), Convert.GetPxForDp(7), Convert.GetPxForDp(7), Convert.GetPxForDp(7));
    	layout.addView(button, params);
    }
    
    public static void performAction(MainMenuItemActions action)
    {
    	switch(action)
    	{
    	case NEWROUND:
    		int i = 1;
    		break;
    	case ROUNDS:
    		break;
    	case STATISTICS:
    		break;
		default:
			break;
    	};
    }
    
}
