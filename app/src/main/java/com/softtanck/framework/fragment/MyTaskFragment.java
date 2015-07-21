package com.softtanck.framework.fragment;


import android.os.Bundle;
import android.view.View;

import com.softtanck.framework.R;

public class MyTaskFragment extends BaseFragment {

    @Override
    protected int getLayoutView() {
        return R.layout.fragment_my_task;
    }

    @Override
    protected void onAttaching() {

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        initTitleView(view);
    }


    /**
     * @param v
     */
    private void initTitleView(View v){
        holder.titleView.removeAllMenu();
        holder.titleView.setTitle("我的任务");
        holder.titleView.addLeftDrawableMenu(holder, R.mipmap.title_bar_menu_btn, 25, 25, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.showMenu();
            }
        });
        holder.titleView.addRightDrawableMenu(holder, R.mipmap.title_bar_filter_btn, 25, 25, new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }



}
