package com.kbiemas.kbiemas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.kbiemas.kbiemas.adapters.pager.HomePagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.activity_main_tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Beranda"));
        tabLayout.addTab(tabLayout.newTab().setText("Transaksi"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
       // tabLayout.setTabTextColors(ContextCompat.getColorStateList(this, R.color.tab_selector));

        viewPager = (ViewPager) findViewById(R.id.activity_main_viewpager);
        final HomePagerAdapter adapter = new HomePagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }


}
