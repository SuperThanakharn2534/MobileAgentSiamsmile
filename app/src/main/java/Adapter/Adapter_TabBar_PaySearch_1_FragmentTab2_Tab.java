package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_2_TabFragment_1;
import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_2_TabFragment_2;
import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_2_TabFragment_3;
import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_2_TabFragment_4;
import com.siamsmile.mobileagentsiamsmile.PaySearch_1_FragmentTab_2_TabFragment_5;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Adapter_TabBar_PaySearch_1_FragmentTab2_Tab extends FragmentPagerAdapter {



    public Adapter_TabBar_PaySearch_1_FragmentTab2_Tab(FragmentManager fm) {
        super( fm );
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PaySearch_1_FragmentTab_2_TabFragment_1 tab1 = new PaySearch_1_FragmentTab_2_TabFragment_1();
                return tab1;
            case 1:
                PaySearch_1_FragmentTab_2_TabFragment_2 tab2 = new PaySearch_1_FragmentTab_2_TabFragment_2();
                return tab2;
            case 2:
                PaySearch_1_FragmentTab_2_TabFragment_3 tab3 = new PaySearch_1_FragmentTab_2_TabFragment_3();
                return tab3;
            case 3:
                PaySearch_1_FragmentTab_2_TabFragment_4 tab4 = new PaySearch_1_FragmentTab_2_TabFragment_4();
                return tab4;
            case 4:
                PaySearch_1_FragmentTab_2_TabFragment_5 tab5 = new PaySearch_1_FragmentTab_2_TabFragment_5();
                return tab5;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "test1";
            case 1:
                return "test2";
            case 2:
                return "test3";
            case 3:
                return "test4";
            case 4:
                return "test5";


        }
        return null;
    }


}
