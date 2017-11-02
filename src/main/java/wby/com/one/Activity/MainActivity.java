package wby.com.one.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import wby.com.one.R;
import wby.com.one.widget.AttentionPeopleFragment;
import wby.com.one.widget.CircleImageView;
import wby.com.one.widget.ConsumeHistoryFragment;
import wby.com.one.widget.HistoryFragment;
import wby.com.one.widget.HomePageFragment;
import wby.com.one.widget.IFavoritesFragment;
import wby.com.one.widget.SettingFragment;
import wby.com.one.widget.tt;

public class MainActivity extends RxBaseActivity implements NavigationView.OnNavigationItemSelectedListener {
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.navigation_view)
    NavigationView mNavigationView;

    private Fragment[] fragments;
    private int currentTabIndex;
    private int index;
    private long exitTime;
    private HomePageFragment mHomePageFragment;
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //初始化Fragment
        initFragments();
        //初始化侧滑菜单
        initNavigationView();
    }

    private void initNavigationView() {
        mNavigationView.setNavigationItemSelectedListener(this);
        View headerView = mNavigationView.getHeaderView(0);
        CircleImageView mUserAvatarView = (CircleImageView) headerView.findViewById(R.id.user_avatar_view);
        TextView mUserName = (TextView) headerView.findViewById(R.id.user_name);
        TextView mUserSign = (TextView) headerView.findViewById(R.id.user_other_info);
        ImageView mSwitchMode = (ImageView) headerView.findViewById(R.id.iv_head_switch_mode);
//        //设置头像
//        mUserAvatarView.setImageResource(R.drawable.ic_hotbitmapgg_avatar);
//        //设置用户名 签名
//        mUserName.setText(getResources().getText(R.string.hotbitmapgg));
//        mUserSign.setText(getResources().getText(R.string.about_user_head_layout));
//        //设置日夜间模式切换
//        mSwitchMode.setOnClickListener(v -> switchNightMode());
//        boolean flag = PreferenceUtil.getBoolean(ConstantUtil.SWITCH_MODE_KEY, false);
//        if (flag) {
//            mSwitchMode.setImageResource(R.drawable.ic_switch_daily);
//        } else {
//            mSwitchMode.setImageResource(R.drawable.ic_switch_night);
//        }

    }

    private void initFragments() {
        mHomePageFragment = HomePageFragment.newInstance();
        IFavoritesFragment mFavoritesFragment = IFavoritesFragment.newInstance();
        HistoryFragment mHistoryFragment = HistoryFragment.newInstance();
        AttentionPeopleFragment mAttentionPeopleFragment = AttentionPeopleFragment.newInstance();
        ConsumeHistoryFragment mConsumeHistoryFragment = ConsumeHistoryFragment.newInstance();
        SettingFragment mSettingFragment = SettingFragment.newInstance();
        fragments = new Fragment[]{
                mHomePageFragment,
                mFavoritesFragment,
                mHistoryFragment,
                mAttentionPeopleFragment,
                mConsumeHistoryFragment,
                mSettingFragment
        };
        // 添加显示第一个fragment
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, mHomePageFragment)
                .show(mHomePageFragment).commit();
    }

    @Override
    public void initToolBar() {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mDrawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()) {
            case R.id.item_1:
                // 主页
                changeFragmentIndex(item, 0);
                return true;
            case R.id.item_2:
                // 离线缓存
//                startActivity(new Intent(MainActivity.this, OffLineDownloadActivity.class));
                return true;
            case R.id.item_3:
                //大会员
//                startActivity(new Intent(MainActivity.this, VipActivity.class));
                return true;
            case R.id.item_4:
                // 我的收藏
                changeFragmentIndex(item, 1);
                return true;
            case R.id.item_5:
                // 历史记录
                changeFragmentIndex(item, 2);
                return true;
            case R.id.item_6:
                // 关注的人
                changeFragmentIndex(item, 3);
                return true;
            case R.id.item_7:
                // 我的钱包
                changeFragmentIndex(item, 4);
                return true;
            case R.id.item_8:
                // 主题选择
                return true;
            case R.id.item_9:
                // 应用推荐
                return true;
        }
        return false;
    }

    private void changeFragmentIndex(MenuItem item, int i) {
        index = i;
        switchFragment();
        item.setChecked(true);
    }

    private void switchFragment() {
        FragmentTransaction trx = getSupportFragmentManager().beginTransaction();
        trx.hide(fragments[currentTabIndex]);
        if (!fragments[index].isAdded()) {
            trx.add(R.id.container, fragments[index]);
        }
        trx.show(fragments[index]).commit();
        currentTabIndex = index;

    }

    /**
     * DrawerLayout侧滑菜单开关
     */
    public void toggleDrawer() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            mDrawerLayout.openDrawer(GravityCompat.START);
        }
    }

}
