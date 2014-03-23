package com.dubu.devart;

import android.app.Activity;
import android.graphics.*;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity
{

    private final int ID_IMAGEVIEW = 0x00000001;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final int maxFlowersCount  = 500;

       // mLocationClient = new LocationClient(this, this, this);

        final RelativeLayout root = new RelativeLayout(this);
        Bitmap original = BitmapFactory.decodeResource(getResources(), R.drawable.bg03);
//        Bitmap mask = BitmapFactory.decodeResource(getResources(), R.drawable.yoman03);
        //Bitmap result = Bitmap.createBitmap(mask.getWidth(), mask.getHeight(), Bitmap.Config.ARGB_8888);
        //Canvas mCanvas = new Canvas(result);

        final List<ImageView> flowers = new ArrayList<ImageView>();
        List poins = new ArrayList<Point>();
//        poins.add(new Point(100, 100));
//        poins.add(new Point(100, 200));
//        poins.add(new Point(100, 300));
//        poins.add(new Point(100, 400));
//        poins.add(new Point(100, 500));
//        poins.add(new Point(100, 600));


//        poins.add(new Point(50, 100));
//        poins.add(new Point(50, 200));
//        poins.add(new Point(50, 300));
//        poins.add(new Point(50, 400));
//        poins.add(new Point(50, 500));
//
//        poins.add(new Point(100, 100));
//        poins.add(new Point(100, 200));
//        poins.add(new Point(100, 300));
//        poins.add(new Point(100, 400));
//        poins.add(new Point(100, 500));
//
//
//        poins.add(new Point(150, 100));
//        poins.add(new Point(150, 200));
//        poins.add(new Point(150, 300));
//        poins.add(new Point(150, 400));
//        poins.add(new Point(150, 500));

//        poins.add(new Point(150, 100));
//        poins.add(new Point(20, 200));
//        poins.add(new Point(40, 340));
//        poins.add(new Point(90, 490));
//        poins.add(new Point(10, 230));
//
//        poins.add(new Point(100, 100));
//        poins.add(new Point(200, 200));
//        poins.add(new Point(100, 300));
//        poins.add(new Point(300, 400));
//        poins.add(new Point(320, 500));
//
//
//        poins.add(new Point(150, 100));
//        poins.add(new Point(250, 240));
//        poins.add(new Point(150, 320));
//        poins.add(new Point(410, 10));
//        poins.add(new Point(150, 200));
//
//
//        poins.add(new Point(200, 50));
//        poins.add(new Point(200, 100));
//
//        poins.add(new Point(120, 150));
//        poins.add(new Point(240, 160));
//        poins.add(new Point(160, 170));
//
//        poins.add(new Point(430, 200));
//        poins.add(new Point(120, 300));
//        poins.add(new Point(430, 400));
//
//        poins.add(new Point(130, 300));
//        poins.add(new Point(140, 600));
//        poins.add(new Point(162, 400));
//        poins.add(new Point(190, 500));
//
//        poins.add(new Point(100, 200));
//        poins.add(new Point(120, 300));
//        poins.add(new Point(130, 100));
//        poins.add(new Point(110, 400));
//        poins.add(new Point(140, 500));
//
//        poins.add(new Point(140, 30));
//        poins.add(new Point(330, 100));
//        poins.add(new Point(200, 210));
//        poins.add(new Point(330, 120));
//        poins.add(new Point(120, 50));

        for(int i= 0 ; i < maxFlowersCount ; i++){
            double randPositonX = Math.random()*500 + 1;
            double randPositonY = Math.random()*600 + 1;
            poins.add(new Point((int)randPositonX, (int)randPositonY));
        }

        Enum[] modes = new Enum[]{PorterDuff.Mode.ADD , PorterDuff.Mode.CLEAR ,PorterDuff.Mode.DARKEN,PorterDuff.Mode.DST,PorterDuff.Mode.DST_ATOP
                , PorterDuff.Mode.DST_IN,PorterDuff.Mode.DST_OUT,PorterDuff.Mode.DST_OVER,PorterDuff.Mode.LIGHTEN,PorterDuff.Mode.MULTIPLY
                ,PorterDuff.Mode.SCREEN,PorterDuff.Mode.SRC,PorterDuff.Mode.SRC_ATOP,PorterDuff.Mode.SRC_IN,PorterDuff.Mode.SRC_OUT
                ,PorterDuff.Mode.SRC_OVER,PorterDuff.Mode.XOR};

        //            * 'red', 'blue', 'green', 'black', 'white', 'gray', 'cyan', 'magenta', 'yellow', 'lightgray', 'darkgray
// '
        //String[] clo = new String[]{"red", "blue", "green", "black", "white", "gray", "cyan", "magenta", "yellow", "lightgray", "darkgray"};
        //String[] clo = new String[]{"red", "blue", "green",  "cyan", "magenta", "yellow","white"};
        //String[] clo = new String[]{"yellow", "white",  "cyan", "magenta", "yellow","white"};

        String[] clo = new String[]{ "cyan", "magenta", "yellow", "yellow"};

        int seq = 0;
        for (Object p : poins) {
            Point p1 = (Point) p;

            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            params.leftMargin = p1.x;
            params.topMargin = p1.y;

            ImageView bgImg02 = new ImageView(this);


            double randomRatio = Math.random()*2 + 1;

            int[] yomans =  new int[]{R.drawable.yoman03,R.drawable.yoman034,R.drawable.yoman035};

            //Bitmap mask = BitmapFactory.decodeResource(getResources(), R.drawable.yoman033);
            Bitmap mask = BitmapFactory.decodeResource(getResources(), yomans[(int)randomRatio]);


            //Bitmap result02 = Bitmap.createBitmap((int)(mask.getWidth()*randomRatio), (int)(mask.getHeight()*randomRatio), Bitmap.Config.ARGB_8888);
            Bitmap result02 = Bitmap.createBitmap(mask.getWidth(), mask.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas mCanvas = new Canvas(result02);
            Paint paint02 = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));


            bgImg02.setLayoutParams(params);
            //mCanvas.drawBitmap(original, -aix_x, -aix_y, null);
            Paint paint03 = new Paint(Paint.ANTI_ALIAS_FLAG);
            //paint03.setColorFilter(new PorterDuffColorFilter(tint, (PorterDuff.Mode) modes[seq++]));



            int tint = Color.parseColor("green");
            if(seq < clo.length ){
                tint = Color.parseColor(clo[seq++]);
                //tint = Color.parseColor("white"); // "red", "blue", "green",  "cyan", "magenta", "yellow","white"
            }else{
                tint = Color.parseColor(clo[seq++%clo.length]);
            }
            // 색 설정
            paint03.setColorFilter(new PorterDuffColorFilter(tint,PorterDuff.Mode.MULTIPLY));


            paint03.setAlpha(150);
            mCanvas.drawBitmap(original, -p1.x, -p1.y, paint03);
            mCanvas.drawBitmap(mask, 0, 0, paint02);
            paint02.setXfermode(null);
            bgImg02.setImageBitmap(result02);
            bgImg02.setScaleType(ImageView.ScaleType.MATRIX);

            // add list
            //root.addView(bgImg02);
            flowers.add(bgImg02);


        }
        root.setBackgroundColor(Color.WHITE);
        setContentView(root);

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ran = Math.random()*flowers.size();
                root.addView((ImageView)(flowers.get((int)ran)));
                flowers.remove((ImageView)flowers.get((int)ran));
//                try {
//                    Thread.sleep(500);
//                } catch(InterruptedException ex) {
//                    Thread.currentThread().interrupt();
//                }
            }
        });

    }




}

