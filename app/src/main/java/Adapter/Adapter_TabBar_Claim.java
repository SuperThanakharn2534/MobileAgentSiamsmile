package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.siamsmile.mobileagentsiamsmile.Claim_FragmentTab_1;
import com.siamsmile.mobileagentsiamsmile.Claim_FragmentTab_2;
import com.siamsmile.mobileagentsiamsmile.Claim_FragmentTab_3;
import com.siamsmile.mobileagentsiamsmile.Claim_FragmentTab_4;
import com.siamsmile.mobileagentsiamsmile.Claim_FragmentTab_5;
import com.siamsmile.mobileagentsiamsmile.Claim_FragmentTab_6;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Adapter_TabBar_Claim extends FragmentPagerAdapter {



    public Adapter_TabBar_Claim(FragmentManager fm) {
        super( fm );
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Claim_FragmentTab_1 tab1 = new Claim_FragmentTab_1();
                return tab1;
            case 1:
                Claim_FragmentTab_2 tab2 = new Claim_FragmentTab_2();
                return tab2;
            case 2:
                Claim_FragmentTab_3 tab3 = new Claim_FragmentTab_3();
                return tab3;
            case 3:
                Claim_FragmentTab_4 tab4 = new Claim_FragmentTab_4();
                return tab4;
            case 4:
                Claim_FragmentTab_5 tab5 = new Claim_FragmentTab_5();
                return tab5;
            case 5:
                Claim_FragmentTab_6 tab6 = new Claim_FragmentTab_6();
                return tab6;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "แจ้งเคลม";
            case 1:
                return "รอการอนุมัติ";
            case 2:
                return "อนุมัติ";
            case 3:
                return "ไม่อนุมัติ";
            case 4:
                return "ชำระค่าสินไหมสำเร็จ";
            case 5:
                return "ทั้งหมด";


        }
        return null;
    }


}
