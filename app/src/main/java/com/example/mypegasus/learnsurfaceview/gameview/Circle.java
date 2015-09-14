package com.example.mypegasus.learnsurfaceview.gameview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by MyPegasus on 2015/9/14.
 */
public class Circle extends Container {

    private Paint paint;

    public Circle() {
        super();
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void childrenView(Canvas canvas) {
        super.childrenView(canvas);
        canvas.drawCircle(50, 50, 50, paint);
    }
}
