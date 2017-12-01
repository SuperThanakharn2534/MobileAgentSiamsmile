package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_1;
import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_3;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Adapter_TabBar_PaySearch_1 extends FragmentPagerAdapter {



    public Adapter_TabBar_PaySearch_1(FragmentManager fm) {
        super( fm );
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PaySearch_1_FragmentTab_1 tab1 = new PaySearch_1_FragmentTab_1();
                return tab1;

            case 1:
                PaySearch_1_FragmentTab_3 tab2 = new PaySearch_1_FragmentTab_3();
                return tab2;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Test1";
            case 1:
                return "Test2";


        }
        return null;
    }


}
