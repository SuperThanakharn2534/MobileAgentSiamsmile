package MGR;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.siamsmile.mobileagentsiamsmile.Activity_Page_AgentLogin;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_AlertMe_List;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_ClaimTypeMenu;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_ContractUse;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_FAQ;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Main;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_NewAppList;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Notification_Tab;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_PaySearch_1_Tab;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_PaySearch_2_Tab;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_PaymentReport_Tab;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_ProductMedia;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_ProspectList;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Ranking;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_SearchAgentLocation;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Setting;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Statistics;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_UserProfile;
import com.siamsmile.mobileagentsiamsmile.R;
import com.siamsmile.mobileagentsiamsmile.Tab;

/**
 * Created by aligndev on 27-Sep-17.
 */

public class Activity_Menu_MGR extends AppCompatActivity {
    private Intent myIntent;

    public  Integer[] MenuImg(){
        final Integer[] arrImg = {
                R.drawable.menu_1 ,
                R.drawable.menu_4,
                R.drawable.menu_7,
                R.drawable.menu_2,
                R.drawable.menu_13,
                R.drawable.menu_10,
                R.drawable.menu_5,
                R.drawable.premium,
                R.drawable.menu_11,
                R.drawable.paymentreport,
                R.drawable.menu_8,
                R.drawable.menu_3,
                R.drawable.menu_14,
                R.drawable.productmedia,
                R.drawable.menu_12,
                R.drawable.menu_15,
                R.drawable.menu_16,
                R.drawable.menu_17,

        };
        return arrImg ;
    }

    public   String[] MenuText(){

        String[] itemname ={

                "หน้าหลัก",
                "แจ้งเตือน",
                "แรงค์",
                "บันทึก NewApp",
                "บันทึกลูกค้ามุ้งหวัง",
                "บันทึกสินไหม",
                "บันทึกชำระเบี้ยประกัน",
                "ส่งเบี้ยเข้าสำนักงานใหญ่",
                "รายงานสถิติ",
                "รายงานจัดเก็บ",
                "รายงานลูกค้า",
                "โน๊ตของฉัน",
                "ข้อมูลส่วนตัว",
                "สือและผลิตภัณฑ์",
                "ค้นหาสถานที่/ตัวแทน",
                "ช่องทางติดต่อ",
                "FAQ",
                "Setting",

        };
        return  itemname ;
    }

//    public  Integer[]  MenuCount(){
//
//         final  Integer [] countNumber = {
//                 10,
//                 20,
//                 30,
//                 40,
//                 50,
//                 60,
//                 70,
//                 80,
//                 90,
//                 100,
//                 110,
//                 120
//            };
//        return countNumber;
//    }



    public  void  CustomerMenuSelect(int position , Activity activity ) {

        Log.i("ERROR 0", "SHOW ERROR");

        switch (position) {
            case 0:
                Log.i("ERROR ", "SHOW ERROR");
                Toast.makeText(activity, " หน้าหลัก ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Main.class);
                activity.startActivity(myIntent);
                break;

            case 1:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แจ้งเตือน ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Notification_Tab.class);
                activity.startActivity(myIntent);
                break;
            case 2:
                //Toast.makeText(this," Log Out ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " ข้อมูลการแข่งขัน ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Ranking.class);
                activity.startActivity(myIntent);
                break;
            case 3:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " New App ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_NewAppList.class);
                activity.startActivity(myIntent);
                break;
            case 4:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " ผู้มุ่งหวัง ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_ProspectList.class);
                activity.startActivity(myIntent);
                break;
            case 5:
                // Toast.makeText(this," บันทึกสินไหม page 01", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " รับเรื่องสินไหม ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_ClaimTypeMenu.class);
                activity.startActivity(myIntent);
                break;
            case 6:
                // Toast.makeText(this," บันทึกสินไหม page 01", Toast.LENGTH_SHORT).show();
                //Log.i("ERROR 1", "SHOW ERROR");
                Toast.makeText(activity, " ชำระเบี้ยประกัน ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_PaySearch_1_Tab.class);
                //Log.i("ERROR 2", "SHOW ERROR");
                activity.startActivity(myIntent);
                break;
            case 7:
                // Toast.makeText(this,"แก้ไขรหัสผ่าน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " ส่งเบีย ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_PaySearch_2_Tab.class);
                activity.startActivity(myIntent);
                break;
            case 8:
                //Toast.makeText(this," ข้อมูลเพิ่มเติม", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " Statistics ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Statistics.class);
                activity.startActivity(myIntent);
                break;
            case 9:
                //Toast.makeText(this,"ข้อมูลส่วนตัว", Toast.LENGTH_SHORT).show();
                //Log.i("ERROR 1", "SHOW ERROR");
                Toast.makeText(activity, " รายงานจัดเก็บ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_PaymentReport_Tab.class);
                //Log.i("ERROR 2", "SHOW ERROR");
                activity.startActivity(myIntent);
                break;
            case 10:
                // Toast.makeText(this,"ข้อมูลส่วนตัว", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " รายงานลูกค้า ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Tab.class);
                activity.startActivity(myIntent);
                break;
            case 11:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " โน๊ตของฉัน ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_AlertMe_List.class);
                activity.startActivity(myIntent);
                break;

            case 12:
                //loadSelection(position);
                //Toast.makeText(this," ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_UserProfile.class);
                activity.startActivity(myIntent);
                break;

            case 13:
                //loadSelection(position);
                //Toast.makeText(this," บริการเครมสุขภาพ ON MOBILE ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " สือและผลิตภัณฑ์ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_ProductMedia.class);
                //myIntent = new Intent(activity, Activity_Page_ProductMedia_Tab.class);
                activity.startActivity(myIntent);
                break;
            case 14:
                //Toast.makeText(this," Log Out ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " ค้นหาสถานที่/ตัวแทน ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_SearchAgentLocation.class);
                activity.startActivity(myIntent);
                break;

            case 15:
                //loadSelection(position);
                //Toast.makeText(this," บริการเครมสุขภาพ ON MOBILE ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " ช่องทางการติดต่อ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_ContractUse.class);
                activity.startActivity(myIntent);
                break;
            case 16:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " FAQ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_FAQ.class);
                activity.startActivity(myIntent);
                break;
            case 17:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " Setting ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Setting.class);
                activity.startActivity(myIntent);
                break;
            case 18:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " Exit ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_AgentLogin.class);
                activity.startActivity(myIntent);
                break;
            default:
                break;

        }
    }



}
