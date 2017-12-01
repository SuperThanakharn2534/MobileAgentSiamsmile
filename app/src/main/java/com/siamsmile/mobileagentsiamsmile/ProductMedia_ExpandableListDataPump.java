package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 31-Oct-17.
 */

public class ProductMedia_ExpandableListDataPump  {


    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> Product_expandableListDetail = new HashMap<String, List<String>>();

        List<String> insurance_01 = new ArrayList<String>();
        insurance_01.add("Health_1");
        insurance_01.add("Health_2");
        insurance_01.add("Health_3");
        insurance_01.add("Health_4");
        insurance_01.add("Health_5");

        List<String> insurance_02 = new ArrayList<String>();
        insurance_02.add("Accident_1");
        insurance_02.add("Accident_2");
        insurance_02.add("Accident_3");
        insurance_02.add("Accident_4");
        insurance_02.add("Accident_5");

        List<String> insurance_03 = new ArrayList<String>();
        insurance_03.add("Car_1");
        insurance_03.add("Car_2");
        insurance_03.add("Car_3");
        insurance_03.add("Car_4");
        insurance_03.add("Car_5");

        List<String> insurance_04 = new ArrayList<String>();
        insurance_04.add("Fire_1");
        insurance_04.add("Fire_2");
        insurance_04.add("Fire_3");
        insurance_04.add("Fire_4");
        insurance_04.add("Fire_5");


        Product_expandableListDetail.put("ประกันสุขภาพ", insurance_01);
        Product_expandableListDetail.put("ประกันอุบัติเหตุ", insurance_02);
        Product_expandableListDetail.put("ประกันรถยนต์", insurance_03);
        Product_expandableListDetail.put("ประกันอัคคีภัย", insurance_04);

        return Product_expandableListDetail;
    }




}
