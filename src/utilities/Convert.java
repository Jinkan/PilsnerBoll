package utilities;

import android.content.res.Resources;
import android.util.TypedValue;

public class Convert {
	public static int GetPxForDp(int dp)
	{
		Resources r = Resources.getSystem();
		return (int) TypedValue.applyDimension(
		        TypedValue.COMPLEX_UNIT_DIP,
		        dp, 
		        r.getDisplayMetrics()
		);
	}
}
