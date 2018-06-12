package com.example.admin.grideview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.admin.grideview.fragmenyt.DialogueFragment;
import com.example.admin.grideview.fragmenyt.EntryFragment;
import com.example.admin.grideview.fragmenyt.ReportFormFragment;
import com.example.admin.grideview.fragmenyt.SetUpFragment;

/**
 * Created by admin on 2018/4/10.
 */

public class HomeVpAdapter extends FragmentPagerAdapter {
    public HomeVpAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        //TODO 根据position 展示fragment  如果fragment的名字换了要换这个地方
        if (position == 0) {
            return new ReportFormFragment();
        } else if (position == 1) {
            return new EntryFragment();
        } else if (position == 2) {
            return new DialogueFragment();
        } else {
            return new SetUpFragment();
        }
    }

    @Override
    public int getCount() {
        //TODO 如果再次添加fragment的话 这里的size需要更改
        return 4;
    }
}
