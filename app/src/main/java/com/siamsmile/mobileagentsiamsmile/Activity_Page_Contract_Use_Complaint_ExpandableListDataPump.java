package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class Activity_Page_Contract_Use_Complaint_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("ร้องเรียนเจ้าหน้าที่ / ศูนย์บริการ");
        cricket.add("ร้องเรียนค่าสินไหมทดแทน");
        cricket.add("ร้องเรียนบริการหลังการขาย");
        cricket.add("ร้องเรียนกรมธรรม์");
        cricket.add("ร้องเรียนการใช้งานแอพพลิเคชั่น");

        List<String> football = new ArrayList<String>();
        football.add("ชมเชยเจ้าหน้าที่ / ศูนย์บริการ");
        football.add("ชมเชยบริการหลังการขาย");
        football.add("ชมเชยสิทธิประโยชน์กรมธรรม์");
        football.add("ชมเชยการใช้งานแอพพลิเคชั่น");
        football.add("ชมเชยด้านอื่นๆ");

        List<String> basketball = new ArrayList<String>();
        basketball.add("สอบถามสิทธิประโยชน์");
        basketball.add("สอบถามการเรียกร้องสินไหม");
        basketball.add("สอบถามการชำระเบี้ยประกัน");
        basketball.add("สอบถามการใช้งานแอพพลิเคชั่น");
        basketball.add("สอบถามด้านอื่นๆ");
        basketball.add("สนใจทำประกันอื่น");

        List<String> test1 = new ArrayList<String>();
        test1.add("แนะนำการให้บริการ");
        test1.add("แนะนำผลิตภัณฑ์");
        test1.add("แนะนำข้อมูล");
        test1.add("แนะนำลูกค้า");
        test1.add("แนะนำ");




        expandableListDetail.put("ร้องเรียน", cricket);
        expandableListDetail.put("ชมเชย", football);
        expandableListDetail.put("สอบถาม", basketball);
        expandableListDetail.put("แนะนำ", test1);
        return expandableListDetail;
    }



}
