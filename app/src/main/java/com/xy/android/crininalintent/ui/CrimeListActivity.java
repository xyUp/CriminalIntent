package com.xy.android.crininalintent;

import android.support.v4.app.Fragment;

/**
 * Created by xy on 2017/11/7.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment creatFragment() {
        return new CrimeListFragment();
    }
}
