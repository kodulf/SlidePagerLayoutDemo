package bjpkten.slidepagerlayoutdemo.customerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SlidingPaneLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Kodulf on 2019/4/14.
 */
public class MySlidingPanelLayout extends SlidingPaneLayout {
    public MySlidingPanelLayout(@NonNull Context context) {
        super(context);
    }

    public MySlidingPanelLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MySlidingPanelLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        float rawX = ev.getRawX();
        int width = getWidth();
        if(rawX <width/10||rawX>(width*9)/10)
            return super.onInterceptTouchEvent(ev);
        else
            return false;
    }
}
