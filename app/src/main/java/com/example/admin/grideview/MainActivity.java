package com.example.admin.grideview;

import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 *   fragment + viewpager + GridView网格布局
 */
public class MainActivity extends AppCompatActivity {
    private ViewPager mViewpager;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        //拿到Gridview
        mViewpager = findViewById(R.id.vp);
        mRadioGroup = findViewById(R.id.rg);
        final HomeVpAdapter vpAdapter = new HomeVpAdapter(getSupportFragmentManager());
        mViewpager.setAdapter(vpAdapter);

        //设置viewPager监听
        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //viewPager切换中 设置rg的显示
                ((RadioButton) mRadioGroup.getChildAt(position)).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //设置RadioGroup的监听  点击的时候 可以切换fragment
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                // 根据点击的id  设置vp当前显示
                int pos;
                if (i == R.id.rb1) {
                    pos = 0;
                } else if (i == R.id.rb2) {
                    pos = 1;
                } else if (i == R.id.rb3) {
                    pos = 2;
                } else {
                    pos = 3;
                }
                mViewpager.setCurrentItem(pos);
            }
        });
    }
}
