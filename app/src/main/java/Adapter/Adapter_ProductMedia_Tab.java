package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.siamsmile.mobileagentsiamsmile.ProductMedia_FragmentTab_1;
import com.siamsmile.mobileagentsiamsmile.ProductMedia_FragmentTab_2;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Adapter_ProductMedia_Tab extends FragmentPagerAdapter {



    public Adapter_ProductMedia_Tab(FragmentManager fm) {
        super( fm );
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ProductMedia_FragmentTab_1 tab1 = new ProductMedia_FragmentTab_1();
                return tab1;
            case 1:
                ProductMedia_FragmentTab_2 tab2 = new ProductMedia_FragmentTab_2();
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
                return "สือและผลิตภัณฑ์";
            case 1:
                return "คู่มือการขาย";


        }
        return null;
    }


}
