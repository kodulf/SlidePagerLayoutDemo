package bjpkten.slidepagerlayoutdemo.customerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Kodulf on 2019/4/14.
 */
public class MyViewPager extends ViewPager {
    public MyViewPager(@NonNull Context context) {
        super(context);
    }

    public MyViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        float rawX = ev.getRawX();
        int width = getWidth();
        if(rawX >=width/10)
            if(ev.getAction() == MotionEvent.ACTION_DOWN)
            getParent().requestDisallowInterceptTouchEvent(true);

        return super.onTouchEvent(ev);
    }
}
