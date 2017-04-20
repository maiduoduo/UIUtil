package com.d.uiutil.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.d.uiutil.R;

/**
 * TabView Test
 * Created by D on 2017/4/20.
 */

public class TabViewTest extends LinearLayout implements TabView.OnTabSelectedListener {
    private Context context;

    public TabViewTest(Context context) {
        this(context, null);
    }

    public TabViewTest(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TabViewTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        View view = LayoutInflater.from(context).inflate(
                R.layout.layout_tab_view_test, this, true);
        TabView tabView = (TabView) view.findViewById(R.id.tabv_tab);
        tabView.setOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(int position) {
        Toast.makeText(context, "onTab:" + position, Toast.LENGTH_SHORT).show();
    }
}