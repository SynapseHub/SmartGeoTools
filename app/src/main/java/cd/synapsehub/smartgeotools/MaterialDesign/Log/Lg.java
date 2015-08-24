package cd.synapsehub.smartgeotools.MaterialDesign.Log;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by user on 8/16/15.
 */
public class Lg {

    public static void m(String message){
        Log.d("SmartGeo",""+message);}

    //For Toast Message
    public static void  t(Context context,String message){
        Toast.makeText(context,message+"", Toast.LENGTH_SHORT).show();
    }
    // For Toast message also
    public static void T(Context context, String message) {
        Toast.makeText(context, message + "", Toast.LENGTH_LONG).show();
    }

}
