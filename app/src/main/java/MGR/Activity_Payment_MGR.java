package MGR;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.siamsmile.mobileagentsiamsmile.Activity_Page_Login;
import com.siamsmile.mobileagentsiamsmile.R;

/**
 * Created by aligndev on 24-Oct-17.
 */

public class Activity_Payment_MGR extends AppCompatActivity {

    private Intent myIntent;

    public  Integer[] MenuImg() {
        final Integer[] arrImg2 = {
                R.drawable.p6,
                R.drawable.p5,
                R.drawable.p4,
                R.drawable.p3,
                R.drawable.p2,
                R.drawable.p1,

        };
        return arrImg2;
    }



    public  void  CustomerNewAppPaymentSelect(int position , Activity activity ) {

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
