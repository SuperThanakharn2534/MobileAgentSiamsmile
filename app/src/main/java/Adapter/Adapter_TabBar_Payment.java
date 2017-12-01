package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.siamsmile.mobileagentsiamsmile.FragmentTab_1;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_2;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_3;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_4;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_5;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_6;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_7;
import com.siamsmile.mobileagentsiamsmile.FragmentTab_8;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Adapter_TabBar_Payment extends FragmentPagerAdapter {



    public Adapter_TabBar_Payment(FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentTab_1 tab1 = new FragmentTab_1();
                return tab1;
            case 1:
                FragmentTab_2 tab2 = new FragmentTab_2();
                return tab2;
            case 2:
                FragmentTab_3 tab3 = new FragmentTab_3();
                return tab3;
            case 3:
                FragmentTab_4 tab4 = new FragmentTab_4();
                return tab4;
            case 4:
                FragmentTab_5 tab5 = new FragmentTab_5();
                return tab5;
            case 5:
                FragmentTab_6 tab6 = new FragmentTab_6();
                return tab6;
            case 6:
                FragmentTab_7 tab7 = new FragmentTab_7();
                return tab7;
            case 7:
                FragmentTab_8 tab8 = new FragmentTab_8();
                return tab8;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "PROS PECT";
            case 1:
                return "APP แห้ง";
            case 2:
                return "NEW APP สมบูรณ์ ";
            case 3:
                return "คัดกรองผ่าน ";
            case 4:
                return "ไม่ผ่านคัดกรอง";
            case 5:
                return "ยกเลิก ";
            case 6:
                return "ทั้งหมด";
            case 7:
                return "ใกล้หมดอายุ ";

        }
        return null;
    }


}
