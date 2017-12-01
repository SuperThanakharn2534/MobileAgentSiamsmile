package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class Activity_Page_PaymentReport_FragmentTab2_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add( "ธนาคาร : กรุงไทย\n"
                +"เบอร์โทรศัพท์ : 084-5221123\n"
                +"สถานะ : รอดำเนินการ\n"
                +"Date : xx/xx/xx หักบันชีไม่ได้ "+"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง sms" +"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง app");

        List<String> football = new ArrayList<String>();
        football.add( "ธนาคาร : กรุงไทย\n"
                +"เบอร์โทรศัพท์ : 084-5221123\n"
                +"สถานะ : รอดำเนินการ\n"
                +"Date : xx/xx/xx หักบันชีไม่ได้ "+"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง sms" +"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง app");

        List<String> basketball = new ArrayList<String>();
        basketball.add( "ธนาคาร : กรุงไทย\n"
                +"เบอร์โทรศัพท์ : 084-5221123\n"
                +"สถานะ : รอดำเนินการ\n"
                +"Date : xx/xx/xx หักบันชีไม่ได้ "+"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง sms" +"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง app");

        expandableListDetail.put("0123456789", cricket);
        expandableListDetail.put("1234567890", football);
        expandableListDetail.put("9876543210", basketball);
        return expandableListDetail;
    }



    public List<String> getAppid(){
        List<String> appid2 = new ArrayList<String>();
        appid2.add( "0123456789" );
        appid2.add( "1234567890" );
        appid2.add( "9876543210" );
        return appid2;
    }
    public  List<String> getName(){
        List<String> Name2 = new ArrayList<String>();
        Name2.add("นายสมรัก ศรีทอง");
        Name2.add("นางมา สมนึก");
        Name2.add("นายสายเพชร ทองแท้");
        return Name2;
    }

    public  List<String> getProduct(){
        List<String> Product2 = new ArrayList<String>();
        Product2.add("502-Silver");
        Product2.add("404-Silver2");
        Product2.add("602-Silver6");
        return Product2;
    }


}
