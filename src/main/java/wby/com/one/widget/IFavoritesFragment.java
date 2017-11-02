package wby.com.one.widget;

import android.os.Bundle;

import wby.com.one.R;

/**
 * Created by 王炳炎 on 2017/10/31.
 */

public class IFavoritesFragment extends RxLazyFragment{
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_empty;
    }

    @Override
    public void finishCreateView(Bundle state) {

    }

    public static IFavoritesFragment newInstance() {
        return new IFavoritesFragment();
    }
}
