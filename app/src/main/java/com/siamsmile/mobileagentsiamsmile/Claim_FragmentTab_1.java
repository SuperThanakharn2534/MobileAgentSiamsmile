package com.siamsmile.mobileagentsiamsmile;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.Adapter_ClaimTypeMenu_1_FragmentTab_1;
import Adapter.Adapter_ClaimType_1_FregmentTab_1_Spinner;

/**
 * Created by aligndev on 02-Nov-17.
 */

public class Claim_FragmentTab_1 extends android.support.v4.app.Fragment {

    View rootView;

    public Claim_FragmentTab_1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate( R.layout.claim_fragmenttab_1, container, false );
        ListView Datalist = (ListView)rootView.findViewById(R.id.expandableListView);

        //=====================================  set list =================================
        String[][] dataProspect = new String[][]{
                {String.valueOf(R.drawable.c1),"0123456789","CL5908005665","02-10-2017","รพ.สินแพทย์","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.c3),"0123456789","CL5908005665","02-10-2017","รพ.กล้วยน้ำไท 1","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.l1),"0123456789","CL5908005665","02-10-2017","รพ.วิภาวดี 1","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l2),"0123456789","CL5908005665","02-10-2017","รพ.บางปะกอก 9 อินเตอร์เนชั่นแนล\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l3),"0123456789","CL5908005665","02-10-2017","รพ.มิชชั่น\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.pos)},
                {String.valueOf(R.drawable.l3),"0123456789","CL5908005665","02-10-2017","รพ.ธนบุรี 2\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.pos)},
                {String.valueOf(R.drawable.l2),"0123456789","CL5908005665","02-10-2017","รพ.สมิติเวช ธนบุรี\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.l2),"0123456789","CL5908005665","02-10-2017","รพ.เจ้าพระยา\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.on)},
                {String.valueOf(R.drawable.c3),"0123456789","CL5908005665","02-10-2017","รพ.ธนบุรี 1\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.off)},
                {String.valueOf(R.drawable.l1),"0123456789","CL5908005665","02-10-2017","รพ.นครธน\n","OPD ทั่วไป(D)","นายสาคร ใจพอดี\n","นายสมชาย  มาเยอะ","ปวดหัวมากๆ","500 บาท",String.valueOf(R.drawable.pos)}};

        ArrayList<Integer> imageId = new ArrayList<>();
        ArrayList<String> AppId = new ArrayList<>();
        ArrayList<String> data1 = new ArrayList<>();
        ArrayList<String> data2 = new ArrayList<>();
        ArrayList<String> data3 = new ArrayList<>();
        ArrayList<String> data4 = new ArrayList<>();
        ArrayList<String> data5 = new ArrayList<>();
        ArrayList<String> data6 = new ArrayList<>();
        ArrayList<String> data7 = new ArrayList<>();
        ArrayList<String> data8 = new ArrayList<>();
        ArrayList<Integer> imageId2 = new ArrayList<>();




        for(int i = 0;i<10;i++){
            int image1 = Integer.parseInt(dataProspect[i][0]);
            imageId.add(image1);
            AppId.add(dataProspect[i][1]);
            data1.add(dataProspect[i][2]);
            data2.add(dataProspect[i][3]);
            data3.add(dataProspect[i][4]);
            data4.add(dataProspect[i][5]);
            data5.add(dataProspect[i][6]);
            data6.add(dataProspect[i][7]);
            data7.add(dataProspect[i][8]);
            data8.add(dataProspect[i][9]);
            int image2 = Integer.parseInt(dataProspect[i][10]);
            imageId2.add(image2);


        }

        Adapter_ClaimTypeMenu_1_FragmentTab_1 adapter = new Adapter_ClaimTypeMenu_1_FragmentTab_1(getActivity(),imageId
                ,AppId,data1,data2,data3,data4,data5,data6,data7,data8,imageId2);
        Datalist.setAdapter(adapter);


        Datalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //Toast.makeText(getActivity(),"Your Position:"+arg2,Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(), Claim_FragmentTab_2_Detail.class));
            }
        });

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated( view, savedInstanceState );







        Button button = (Button) view.findViewById( R.id.bt_searchandfilter );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // startActivity(new Intent(getActivity(),Claim_Fragment_1_Detail_PopUp.class));
                // Toast.makeText(getActivity(),"Your Position:"+view,Toast.LENGTH_SHORT).show();

                final Dialog dialog = new Dialog( getActivity() );
                dialog.requestWindowFeature( Window.FEATURE_NO_TITLE );
                // dialog.setContentView(R.layout.activity_page_paymentreport_fragmenttab_1_popup);fragmenttab_1_popup.xml
                dialog.setContentView( R.layout.claim_fragmenttab_1_detail_popup );
                dialog.setCancelable( true );

                final ArrayList<String> list_01 = new ArrayList<String>();
                list_01.add(" -เลือกกลุ่มผลิตภัณฑ์- ");
                for (int i = 0; i <= 10; i++) {
                    list_01.add( "กลุ่มผลิตภัณฑ์ที่ " + i );
                }

                final ArrayList<String> list_02 = new ArrayList<String>();
                    list_02.add(" -เลือกประเภทการเคลม- ");
                    list_02.add( "OPD ทั่วไป(D)");
                    list_02.add( "OPD อุบัติเหตุ(D)");
                    list_02.add( "IPD ค่ารักษา(D)");

                Button button1 = (Button) dialog.findViewById( R.id.bt_clickpage_2 );
                Button button2 = (Button) dialog.findViewById( R.id.bt_clickpage_1 );

                Spinner s = (Spinner) dialog.findViewById(R.id.Spinner_List_01);
                Adapter_ClaimType_1_FregmentTab_1_Spinner spiner = new  Adapter_ClaimType_1_FregmentTab_1_Spinner(getActivity(),list_01);
                s.setAdapter(spiner);

                Spinner s2 = (Spinner) dialog.findViewById(R.id.Spinner_List_02);
                Adapter_ClaimType_1_FregmentTab_1_Spinner spiner2 = new  Adapter_ClaimType_1_FregmentTab_1_Spinner(getActivity(),list_02);
                s2.setAdapter(spiner2);


                button1.setOnClickListener( new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText( getActivity(), "Click Cancel", Toast.LENGTH_SHORT ).show();
                        dialog.cancel();
                    }
                } );

                button2.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText( getActivity(), "Click Cancel", Toast.LENGTH_SHORT ).show();
                        dialog.cancel();
                    }
                } );


                dialog.show();
            }

        });

    }







}







