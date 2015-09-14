package com.example.mypegasus.learnsurfaceview.gameview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by MyPegasus on 2015/9/14.
 */
public class Rect extends Container {

    private Paint paint = null;

    public Rect() {
        super();
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    protected void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawRect(0, 0, 100, 100, paint);
        this.setY(getY() + 1);
    }
}
