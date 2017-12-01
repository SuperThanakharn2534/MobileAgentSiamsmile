package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class FragmentTab_1_Detail_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


        List<String> football = new ArrayList<String>();
        football.add("ประกันสังคม 1");
        football.add("ประกันสังคม 2");
        football.add("ประกันสังคม 2");
        football.add("ประกันสังคม 3");
        football.add("ประกันสังคม 4");
        football.add("ประกันประเภท 1");
        football.add("ประกันประเภท 2");
        football.add("ประกันประเภท 3");
        football.add("ประกันประเภท 4");

        expandableListDetail.put("สิทธิ์ความคุ้มครอง", football);

        return expandableListDetail;
    }



}
