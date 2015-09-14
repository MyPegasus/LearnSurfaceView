package com.example.mypegasus.learnsurfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by MyPegasus on 2015/9/14.
 */
public class MyView extends SurfaceView implements SurfaceHolder.Callback{

    private Paint paint;

    public MyView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        getHolder().addCallback(this);
    }

    public void draw() {
        Canvas canvas = getHolder().lockCanvas();
        canvas.drawColor(Color.WHITE);
        canvas.drawRect(0 , 0, 100, 100, paint);
        getHolder().unlockCanvasAndPost(canvas);
    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        draw();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
