package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class ExpandableListDataPump  {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("MOTOR_1");
        cricket.add("MOTOR_2");
        cricket.add("MOTOR_3");
        cricket.add("MOTOR_4");
        cricket.add("MOTOR_5");

        List<String> football = new ArrayList<String>();
        football.add("HOME_1");
        football.add("HOME_2");
        football.add("HOME_3");
        football.add("HOME_4");
        football.add("HOME_5");

        List<String> basketball = new ArrayList<String>();
        basketball.add("แบบประกันสุขภาพ  PH502+");
        basketball.add("แบบประกันสุขภาพ  PH601+");
        basketball.add("สหสไมล์  VIP");
        basketball.add("PH902");
        basketball.add("PH502");

        expandableListDetail.put("SMILE MOTOR", cricket);
        expandableListDetail.put("SMILE HOME", football);
        expandableListDetail.put("SMILE HEALTH", basketball);
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

    public  List<String> getext(){
        List<String> date = new ArrayList<String>();
        date.add("502-Silver");
        date.add("404-Silver2");
        date.add("602-Silver6");
        return date;
    }


}
