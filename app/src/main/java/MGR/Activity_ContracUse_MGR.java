package MGR;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.siamsmile.mobileagentsiamsmile.Activity_Page_Login;
import com.siamsmile.mobileagentsiamsmile.R;

/**
 * Created by aligndev on 22-Oct-17.
 */

public class Activity_ContracUse_MGR extends AppCompatActivity {

    private Intent myIntent;

    public   String[] MenuText(){

        String[] itemname ={
                "CALL CENTER",
                "ติดต่อตัวแทน",
                "STATUS AGENT",
                "LINE",
                "FACEBOOK",
                "YOUTUBE",
                "E-MAIL",
                "ALERT",
                "ร้องเรียน"};
        return  itemname ;
    }




    public  Integer[] MenuImg() {
        final Integer[] arrImg = {
                R.drawable.contrac1,
                R.drawable.contrac2,
                R.drawable.contrac3,
                R.drawable.contrac4,
                R.drawable.contrac5,
                R.drawable.contrac6,
                R.drawable.contrac7,
                R.drawable.contrac8,
                R.drawable.contrac9,

        };
        return arrImg;
    }

    public  void  CustomerContracUseSelect(int position , Activity activity ) {

        Log.i("ERROR 0", "SHOW ERROR");

        switch (position) {
            case 0:
                Log.i("ERROR ", "SHOW ERROR");
                Toast.makeText(activity, " หน้าหลัก ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;
            case 1:
                //loadSelection(position);
                //Toast.makeText(this," ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แจ้งสินไหม ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;

            case 2:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แรงค์ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;
            case 3:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " Report ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;
            case 4:
                //loadSelection(position);
                //Toast.makeText(this," ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แจ้งสินไหม ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;

            case 5:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แรงค์ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;
            case 6:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " Report ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;
            case 7:
                //loadSelection(position);
                //Toast.makeText(this," ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แจ้งสินไหม ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;

            case 8:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แรงค์ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Login.class);
                activity.startActivity(myIntent);
                break;


            default:
                break;

        }
    }


}
