package com.kbiemas.kbiemas.adapters.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.kbiemas.kbiemas.fragments.home.ViewHomeFragment;
import com.kbiemas.kbiemas.fragments.home.TransactionHomeFragment;

/**
 * Created by hilda on 22/11/2016.
 */

public class BuyPagerAdapter extends FragmentStatePagerAdapter {
    final int PAGE_COUNT;

    public BuyPagerAdapter(FragmentManager fm, int PAGE_COUNT) {
        super(fm);
        this.PAGE_COUNT = PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ViewHomeFragment homeFragment = new ViewHomeFragment();
                return homeFragment;
            case 1:
                TransactionHomeFragment transactionHomeFragment = new TransactionHomeFragment();
                return transactionHomeFragment;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
