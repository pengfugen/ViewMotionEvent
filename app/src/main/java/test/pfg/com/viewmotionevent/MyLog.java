package test.pfg.com.viewmotionevent;

import android.util.Log;

/**
 * Created by FPENG3 on 2018/8/20.
 */

public class MyLog {

    private static final String PRE_TAG = "ViewMotionEvent/";

    public static void logd(String tag, String msg) {
        Log.d(PRE_TAG+tag, msg);
    }
}
