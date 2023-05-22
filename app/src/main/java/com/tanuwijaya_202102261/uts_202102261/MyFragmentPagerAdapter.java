package com.tanuwijaya_202102261.uts_202102261;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


    private WebResmiFragment _webResmiFragment = new WebResmiFragment();
    private Context _context;
    private WebInternalFragment _webInternalFragment = new WebInternalFragment();
    private int _tabCount;

    /**
     * Constructor for {@link FragmentPagerAdapter} that sets the fragment manager for the adapter.
     * This is the equivalent of calling  and
     * passing in {@link #BEHAVIOR_SET_USER_VISIBLE_HINT}.
     *
     * <p>Fragments will have {@link Fragment#setUserVisibleHint(boolean)} called whenever the
     * current Fragment changes.</p>
     *
     * @deprecated use  with
     * {@link #BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT}
     */
    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount) {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return _webResmiFragment;
            case 1:
                return _webInternalFragment;
        }

        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return _tabCount;
    }
}
