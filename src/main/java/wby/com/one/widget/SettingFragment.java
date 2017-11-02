package wby.com.one.widget;

import android.os.Bundle;

import wby.com.one.R;

/**
 * Created by 王炳炎 on 2017/10/31.
 */

public class SettingFragment extends RxLazyFragment{
    public static SettingFragment newInstance() {
        return new SettingFragment();
    }

    @Override
    public int getLayoutResId() {
        return  R.layout.te;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
