package com.siamsmile.mobileagentsiamsmile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by aligndev on 30-Oct-17.
 */

public class Activity_Page_Notification_FragmentTab1_ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String,List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add ( "เริ่มคุ้มครอง :  02/05/2017\n"
                +"ความคุ้มครอง : XXXXXXX\n"
                +"บริษัทผู้รับประกัน : YYYYYYY\n"
                +"Date : xx/xx/xx หักบันชีไม่ได้ "+"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง sms" +"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง app");


        List<String> football = new ArrayList<String>();
        football.add( "เริ่มคุ้มครอง :  02/05/2017\n"
                +"ความคุ้มครอง : XXXXXXX\n"
                +"บริษัทผู้รับประกัน : YYYYYYY\n"
                +"Date : xx/xx/xx หักบันชีไม่ได้ "+"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง sms" +"+\n"
                +"Date : xx/xx/xx แจ้งเตือนทาง app");


        List<String> basketball = new ArrayList<String>();
        basketball.add( "เริ่มคุ้มครอง :  02/05/2017\n"
                +"ความคุ้มครอง : XXXXXXX\n"
                +"บริษัทผู้รับประกัน : YYYYYYY\n"
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
        Name.add("แจ้งจัดเก็บ");
        Name.add("แจ้งลูกค้าเข้าโรงพยาบาล");
        Name.add("แจ้งสถานะกรมธรรม์");
     return Name;
    }

    public  List<String> getProduct(){
        List<String> Product = new ArrayList<String>();
        Product.add("0001234569");
        Product.add("0012369874");
        Product.add("3214569871");
        return Product;
    }
    public  List<String> getexpire_Date(){
        List<String> expire_Date = new ArrayList<String>();
        expire_Date.add("502-Silver");
        expire_Date.add("404-Silver2");
        expire_Date.add("602-Silver6");
        return expire_Date;
    }
    public  List<String> getAlerttype(){
        List<String> Alerttype = new ArrayList<String>();
        Alerttype.add("นายทอง  จันศรีมา");
        Alerttype.add("นายเกียติชัย ศรีมหาโพธิ์");
        Alerttype.add("นางสมฤดี มีมากพอ");
        return Alerttype;
    }

    public  List<String> getName2(){
        List<String> Name2 = new ArrayList<String>();
        Name2.add("นางสุขศรี จันศรีมา");
        Name2.add("นางสมาธิ ศรีมหาโพธิ์");
        Name2.add("นายดนัย มีมากพอ");
        return Name2;
    }

    public  ArrayList<String> getImage(){
        ArrayList<String> Image = new ArrayList<String>();
        Image.add( String.valueOf( R.drawable.on ) );
        Image.add(String.valueOf( R.drawable.off ));
        Image.add(String.valueOf( R.drawable.pos ));
        return Image;
    }




}
