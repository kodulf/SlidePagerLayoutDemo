package bjpkten.slidepagerlayoutdemo.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SlidingPaneLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

import bjpkten.slidepagerlayoutdemo.customerview.AddedFragment;
import bjpkten.slidepagerlayoutdemo.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private ArrayList<AddedFragment> mFragments;
    private SlidingPaneLayout mSlidingPanelLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mFragments = new ArrayList<>();
        mFragments.add(new AddedFragment("AAAAAA"));
        mFragments.add(new AddedFragment("BBBBBBBBBBB"));
        mFragments.add(new AddedFragment("CCCCCCCCCCCCCCCC"));

        mViewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));

        mSlidingPanelLayout = (SlidingPaneLayout) findViewById(R.id.slidingPaneLayout);


    }

    public void jumpToDrawerLayoutDemo(View view) {

        startActivity(new Intent(this,DrawerLayoutDemo.class));
    }

    public void jumpToSlidingCustomerDemo(View view) {
        startActivity(new Intent(this,SlidingCustomerActivity.class));

    }

    class MyViewPagerAdapter extends FragmentPagerAdapter{

        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return mFragments.get(i);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
    }
}
