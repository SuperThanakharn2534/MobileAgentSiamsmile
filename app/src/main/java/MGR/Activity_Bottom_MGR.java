package MGR;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.siamsmile.mobileagentsiamsmile.Activity_Page_ClaimTypeMenu;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Main;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Ranking;
import com.siamsmile.mobileagentsiamsmile.Activity_Page_Statistics;
import com.siamsmile.mobileagentsiamsmile.R;

/**
 * Created by aligndev on 19-Oct-17.
 */

public class Activity_Bottom_MGR extends AppCompatActivity {


    private Intent myIntent;



    public   String[] MenuText(){

        String[] itemname ={

                "หน้าหลัก",
                "แจ้งสินไหม",
                "แรงค์",
                "รายงานสถิติ",
        };
        return  itemname ;
    }


    public  Integer[] MenuImg() {
        final Integer[] arrImg = {
                R.drawable.menu_1,
                R.drawable.menu_10,
                R.drawable.menu_7,
                R.drawable.menu_11,

        };
        return arrImg;
    }


    public  void  CustomerBottomSelect(int position , Activity activity ) {

        Log.i("ERROR 0", "SHOW ERROR");

        switch (position) {
            case 0:
                Log.i("ERROR ", "SHOW ERROR");
                Toast.makeText(activity, " หน้าหลัก ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Main.class);
                activity.startActivity(myIntent);
                break;
            case 1:
                //loadSelection(position);
                //Toast.makeText(this," ข้อมูลส่วนตัว ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แจ้งสินไหม ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_ClaimTypeMenu.class);
                activity.startActivity(myIntent);
                break;

            case 2:
                //Toast.makeText(this,"ชำระเบีย ", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " แรงค์ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Ranking.class);
                activity.startActivity(myIntent);
                break;
            case 3:
                // Toast.makeText(this,"ประกาศ / ข้อมูลการแข่งขัน", Toast.LENGTH_SHORT).show();
                Toast.makeText(activity, " รายงานสถิติ ", Toast.LENGTH_SHORT).show();
                myIntent = new Intent(activity, Activity_Page_Statistics.class);
                activity.startActivity(myIntent);
                break;

            default:
                break;

        }
    }






}
