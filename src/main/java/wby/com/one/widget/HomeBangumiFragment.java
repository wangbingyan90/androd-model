package wby.com.one.widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import wby.com.one.R;

/**
 * Created by 王炳炎 on 2017/11/2.
 */

public class HomeBangumiFragment  extends RxLazyFragment{
    @Override
    public int getLayoutResId() {
        return R.layout.te;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }


    public static Fragment newInstance() {
        return new HomeBangumiFragment();
    }
}
