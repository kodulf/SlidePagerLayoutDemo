package bjpkten.slidepagerlayoutdemo.activitys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import bjpkten.slidepagerlayoutdemo.customerview.AddedFragment;
import bjpkten.slidepagerlayoutdemo.customerview.MySlidingPanelLayout;
import bjpkten.slidepagerlayoutdemo.R;

public class SlidingCustomerActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private ArrayList<AddedFragment> mFragments;
    private MySlidingPanelLayout mSlidingPanelLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_customer);


        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mFragments = new ArrayList<>();
        mFragments.add(new AddedFragment("AAAAAA"));
        mFragments.add(new AddedFragment("BBBBBBBBBBB"));
        mFragments.add(new AddedFragment("CCCCCCCCCCCCCCCC"));

        mViewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));

        mSlidingPanelLayout = (MySlidingPanelLayout) findViewById(R.id.slidingPaneLayout);
    }


    class MyViewPagerAdapter extends FragmentPagerAdapter {

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
