package wby.com.one.widget;

import android.os.Bundle;

import wby.com.one.R;

/**
 * Created by 王炳炎 on 2017/10/31.
 */

public class HistoryFragment extends RxLazyFragment{
    @Override
    public int getLayoutResId() {
        return R.layout.te;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }

    public static HistoryFragment newInstance() {
        return new HistoryFragment();
    }
}
