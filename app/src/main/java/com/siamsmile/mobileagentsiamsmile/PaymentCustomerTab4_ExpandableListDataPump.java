package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class PaymentCustomerTab4_ExpandableListDataPump {
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
        List<String> appid = new ArrayList<String>();
        appid.add( "0123456789" );
        appid.add( "1234567890" );
        appid.add( "9876543210" );
        return appid;
    }
    public  List<String> getName(){
        List<String> Name = new ArrayList<String>();
        Name.add("นายสมรัก ศรีทอง");
        Name.add("นางมา สมนึก");
        Name.add("นายสายเพชร ทองแท้");
        return Name;
    }

    public  List<String> getProduct(){
        List<String> Product = new ArrayList<String>();
        Product.add("502-Silver");
        Product.add("404-Silver2");
        Product.add("602-Silver6");
        return Product;
    }

    public  List<String> getexpire_date(){
        List<String> expire_date = new ArrayList<String>();
        expire_date.add("05/12/2017");
        expire_date.add("15/06/2018");
        expire_date.add("20/01/2018");
        return expire_date;
    }



}
