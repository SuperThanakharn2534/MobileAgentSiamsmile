package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.siamsmile.mobileagentsiamsmile.Activity_Page_Notification_Tab_FragmentTab_1;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Notification_Tab_FragmentTab_2;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Notification_Tab_FragmentTab_3;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Adapter_TabBar_Activity_Page_Notification_Tab extends FragmentPagerAdapter {



    public Adapter_TabBar_Activity_Page_Notification_Tab(FragmentManager fm) {
        super( fm );
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Activity_Page_Notification_Tab_FragmentTab_1 tab1 = new Activity_Page_Notification_Tab_FragmentTab_1();
                return tab1;

            case 1:
                Activity_Page_Notification_Tab_FragmentTab_2 tab2 = new Activity_Page_Notification_Tab_FragmentTab_2();
                return tab2;
            case 2:
                Activity_Page_Notification_Tab_FragmentTab_3 tab3 = new Activity_Page_Notification_Tab_FragmentTab_3();
                return tab3;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Test1";
            case 1:
                return "Test2";
            case 2:
                return "Test3";

        }
        return null;
    }


}
