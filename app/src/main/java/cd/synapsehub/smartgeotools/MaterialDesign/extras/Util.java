package cd.synapsehub.smartgeotools.MaterialDesign.extras;

import android.os.Build;

/**
 * Created by user on 8/11/15.
 */
public class Util {
    public static boolean isLollipopOrGreater(){
        return Build.VERSION.SDK_INT>=21 ? true : false;
    }
    public static boolean isJellyBeanOrGreater(){
        return Build.VERSION.SDK_INT>=16 ? true : false;
    }
}
