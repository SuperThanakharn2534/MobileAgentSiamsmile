package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 31-Oct-17.
 */

public class Activity_Page_PaymentReport_Fragment_1_PopUp_ExpandableListDataPump {




    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> insurance_01 = new ArrayList<String>();
        insurance_01.add("หน่วยงานที่ 1");
        insurance_01.add("หน่วยงานที่ 2");
        insurance_01.add("หน่วยงานที่ 3");
        insurance_01.add("หน่วยงานที่ 4");
        insurance_01.add("หน่วยงานที่ 5");

        List<String> insurance_02 = new ArrayList<String>();
        insurance_02.add("อำเภอที่ 1");
        insurance_02.add("อำเภอที่ 2");
        insurance_02.add("อำเภอที่ 3");
        insurance_02.add("อำเภอที่ 4");
        insurance_02.add("อำเภอที่ 5");

        List<String> insurance_03 = new ArrayList<String>();
        insurance_03.add("ตำบลที่ 1");
        insurance_03.add("ตำบลที่ 2");
        insurance_03.add("ตำบลที่ 3");
        insurance_03.add("ตำบลที่ 4");
        insurance_03.add("ตำบลที่ 5");



        expandableListDetail.put("หน่วยงาน", insurance_01);
        expandableListDetail.put("อำเภอ", insurance_02);
        expandableListDetail.put("ตำบล", insurance_03);
        return expandableListDetail;
    }




}
