package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class Activity_Page_PaySearch_2_FragmentTab_1_ExpandableListDataPump {
        public static HashMap<String, List<String>> getData() {
            HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

//            List<String> test9 = new ArrayList<String>();
//            List<String> test8 = new ArrayList<String>();
//            List<String> test7 = new ArrayList<String>();
//            List<String> test6 = new ArrayList<String>();
//            List<String> test5 = new ArrayList<String>();
//            List<String> test4 = new ArrayList<String>();
//            List<String> test3 = new ArrayList<String>();
//            List<String> test2 = new ArrayList<String>();
//            List<String> test1 = new ArrayList<String>();
//
//            expandableListDetail.put("App Id:7410852963 จำนวนเงิน : 380 บาท", test9);
//            expandableListDetail.put("App Id:1234567890 จำนวนเงิน : 420 บาท", test8);
//            expandableListDetail.put("App Id:9638527410 จำนวนเงิน : 380 บาท", test7);
//            expandableListDetail.put("App Id:8527894561 จำนวนเงิน : 600 บาท", test6);
//            expandableListDetail.put("App Id:8520741456 จำนวนเงิน : 380 บาท", test5);
//            expandableListDetail.put("App Id:9630285274 จำนวนเงิน : 540 บาท", test4);
//            expandableListDetail.put("App Id:7891234564 จำนวนเงิน : 500 บาท", test3);
//            expandableListDetail.put("App Id:9652154454 จำนวนเงิน : 740 บาท", test2);
//            expandableListDetail.put("App Id:7894561230 จำนวนเงิน : 380 บาท", test1);

            List<String> cricket = new ArrayList<String>();
            cricket.add("เลขที่กรมธรรม์ : 0123456789\n"
                    +"ชื่อผู้เอาประกัน : นายชิดชัย  ซ้ายขวา\n"
                    +"ชื่อผู้ชำระ : นางสายสิน มั่นคง\n"
                    +"แผนประกัน : 502-Silver\n"
                    +"Detail : รถยนต์ ป้ายทะเบียน 1234\n"
                    +"สถานะกรมธรรม์ : แจ้งจัดเก็บ\n"
                    +"ยอดของกรมธรรม์ที่ต้องชำระ : 450 บาท");
            List<String> football = new ArrayList<String>();
            football.add("เลขที่กรมธรรม์ : 0123456789\n"
                    +"ชื่อผู้เอาประกัน : นายชิดชัย  ซ้ายขวา\n"
                    +"ชื่อผู้ชำระ : นางสายสิน มั่นคง\n"
                    +"แผนประกัน : 502-Silver\n"
                    +"Detail : บ้าน บ้านเลขที่ 1234\n"
                    +"สถานะกรมธรรม์ : หมดอายุ\n"
                    +"ยอดของกรมธรรม์ที่ต้องชำระ : 600 บาท");

            List<String> basketball = new ArrayList<String>();
            basketball.add("เลขที่กรมธรรม์ : 0123456789\n"
                    +"ชื่อผู้เอาประกัน : นายชิดชัย  ซ้ายขวา\n"
                    +"ชื่อผู้ชำระ : นางสายสิน มั่นคง\n"
                    +"แผนประกัน : 502-Silver\n"
                    +"Detail : รถยนต์ ป้ายทะเบียน 1234\n"
                    +"สถานะกรมธรรม์ : ยกเลิก\n"
                    +"ยอดของกรมธรรม์ที่ต้องชำระ : 900 บาท");

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

    public  List<String> getdata1(){
        List<String> data1 = new ArrayList<String>();
        data1.add("502-Silver");
        data1.add("404-Silver2");
        data1.add("602-Silver6");
        return data1;
    }

    public  List<String> getdata2(){
        List<String> data2 = new ArrayList<String>();
        data2.add("500 บาท");
        data2.add("404 บาท");
        data2.add("602 บาท");
        return data2;
    }


}
