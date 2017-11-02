package wby.com.one.widget;

import android.os.Bundle;

import wby.com.one.R;

/**
 * Created by 王炳炎 on 2017/10/31.
 */

public class AttentionPeopleFragment extends RxLazyFragment {
    public static AttentionPeopleFragment newInstance() {
        return new AttentionPeopleFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.te;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }
}
