package wby.com.one;

import android.app.Application;

/**
 * Created by 王炳炎 on 2017/10/31.
 */

public class Oneapp extends Application{
    public static Oneapp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        init();
    }

    private void init() {
    }

    public static Oneapp getInstance() {
        return mInstance;
    }
}
