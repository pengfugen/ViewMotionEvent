package test.pfg.com.viewmotionevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by FPENG3 on 2018/8/20.
 */

public class LinearViewGroup extends LinearLayout {

    private String TAG = "LinearViewGroup";

    public LinearViewGroup(Context context) {
        super(context);
    }

    public LinearViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LinearViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        MyLog.logd(TAG, "dispatchTouchEvent==ev:"+ev);
        boolean result = super.dispatchTouchEvent(ev);
        MyLog.logd(TAG, "dispatchTouchEvent result:"+result);
        return result;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean result = super.onInterceptTouchEvent(ev);
        MyLog.logd(TAG, "onInterceptTouchEvent result:"+result);
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        MyLog.logd(TAG, "onTouchEvent result:"+result);
        return result;
    }
}
