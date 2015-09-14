package com.example.mypegasus.learnsurfaceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by MyPegasus on 2015/9/14.
 */
public class MyView2 extends SurfaceView implements SurfaceHolder.Callback {

    private Paint paint;

    public MyView2(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);

        getHolder().addCallback(this);
    }

    private Timer timer;

    private float degress;

    public float getDegress() {
        return degress;
    }

    public void setDegress(float degress) {
        this.degress = degress;
    }

    public void draw() {
        Canvas canvas = getHolder().lockCanvas();
        canvas.drawColor(0xffffffff);
        canvas.save();
        canvas.rotate(degress++, getWidth() / 2, getHeight() / 2);
        canvas.drawLine(0, getHeight() / 2, getWidth(), getHeight(), paint);
        canvas.restore();

        canvas.drawLine(0, getHeight() / 2 + 100, getWidth(), getHeight() + 100, paint);

        getHolder().unlockCanvasAndPost(canvas);
    }

    public void startTimer() {
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };
        timer.schedule(task, 100, 100);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        startTimer();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        if(timer != null) {
            timer.cancel();
            timer = null;
        }
    }
}
