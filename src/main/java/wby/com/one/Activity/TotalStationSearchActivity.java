package wby.com.one.Activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import wby.com.one.R;

public class TotalStationSearchActivity extends RxBaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.te;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {

    }

    public static void launch(Activity activity, String str) {
        Intent mIntent = new Intent(activity, TotalStationSearchActivity.class);
//        mIntent.putExtra(ConstantUtil.EXTRA_CONTENT, str);
        activity.startActivity(mIntent);
    }
}
