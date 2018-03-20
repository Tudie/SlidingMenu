package com.wo.slidingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.tudie.slidingmenu.SlidingMenu;

public class MainActivity extends AppCompatActivity {
    private View slideview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSlideMeun();

    }

    SlidingMenu menu;

    private void initSlideMeun() {
        // configure the SlidingMenu
        menu = new SlidingMenu(this);
        slideview= LayoutInflater.from(this).inflate(R.layout.act_sldeview,null);
        menu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);
        menu.setShadowWidthRes(R.dimen.shadow_width);
        menu.setShadowDrawable(R.color.transparent);

        // 设置滑动菜单视图的宽度
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值
        menu.setFadeDegree(0.35f);
        /**
         * SLIDING_WINDOW will include the Title/ActionBar in the content
         * section of the SlidingMenu, while SLIDING_CONTENT does not.
         */
        //为侧滑菜单设置布局
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenus(slideview);

    }
}
