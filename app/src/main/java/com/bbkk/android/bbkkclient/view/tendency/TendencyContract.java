package com.bbkk.android.bbkkclient.view.tendency;

import android.support.v4.app.Fragment;

public interface TendencyContract {

  interface View {
    void initView();
  }
  interface Presenter {
    Fragment tendencyFragmentGetItem(int position,int max);
  }
}
