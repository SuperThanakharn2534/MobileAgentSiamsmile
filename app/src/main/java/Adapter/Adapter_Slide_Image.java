package Adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.request.animation.GlideAnimation;
import com.siamsmile.mobileagentsiamsmile.R;

/**
 * Created by aligndev on 27-Sep-17.
 */

public class Adapter_Slide_Image extends PagerAdapter {

    private   Integer[]  image = {R.drawable.sc03,R.drawable.sc01,R.drawable.sc02,
            R.drawable.sc03,R.drawable.sc01,R.drawable.sc02,
            R.drawable.sc03,R.drawable.sc01,R.drawable.sc02,
            R.drawable.sc03,R.drawable.sc01,R.drawable.sc02};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public Adapter_Slide_Image(Context ctx)
    {
        this.ctx = ctx;

    }





    @Override
    public int getCount() {
        return  image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        //return (view ==(LinearLayout)object);
        return view ==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.model_slid_image,container,false);
        ImageView imgeView = (ImageView) item_view.findViewById(R.id.image);
        imgeView.setImageResource(image[position]);
       // container.addView(item_view);
        container.addView(item_view,0);

        imgeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position ==0){
                    Toast.makeText(ctx, "IMAGE_01", Toast.LENGTH_SHORT).show();
                }else if (position ==1){
                    Toast.makeText(ctx, "IMAGE_02", Toast.LENGTH_SHORT).show();
                }else if (position ==2){
                    Toast.makeText(ctx, "IMAGE_03", Toast.LENGTH_SHORT).show();
                }else if (position ==3){
                    Toast.makeText(ctx, "IMAGE_04", Toast.LENGTH_SHORT).show();
                }else if (position ==4){
                    Toast.makeText(ctx, "IMAGE_05", Toast.LENGTH_SHORT).show();
                }else if (position ==5){
                    Toast.makeText(ctx, "IMAGE_06", Toast.LENGTH_SHORT).show();
                }else if (position ==6){
                    Toast.makeText(ctx, "IMAGE_07", Toast.LENGTH_SHORT).show();
                }else if (position ==7){
                    Toast.makeText(ctx, "IMAGE_08", Toast.LENGTH_SHORT).show();
                }else if (position ==8){
                    Toast.makeText(ctx, "IMAGE_09", Toast.LENGTH_SHORT).show();
                }else if (position ==9){
                    Toast.makeText(ctx, "IMAGE_10", Toast.LENGTH_SHORT).show();
                }else if (position ==10){
                    Toast.makeText(ctx, "IMAGE_11", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(ctx, "IMAGE_12", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       // container.removeView((LinearLayout)object);
        ViewPager  viewPager = (ViewPager)container;
        View view =(View)object;
        viewPager.removeView(view);
    }





}
