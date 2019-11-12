package bez.dev.logutils;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "AWESOME_APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
