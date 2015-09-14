package com.example.mypegasus.learnsurfaceview.gameview;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPegasus on 2015/9/14.
 */
public class Container {

    private float x = 0, y = 0;
    private List<Container> children = null;

    public Container() {
        children = new ArrayList<Container>();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getX(), getY());

        childrenView(canvas);
        for (Container c :
                children) {
            c.draw(canvas);
        }
        canvas.restore();
    }

    protected void childrenView(Canvas canvas) {

    }

    public void addChildrenView(Container child) {
        children.add(child);
    }

    public boolean removeChildrenView(Container child) {
        return children.remove(child);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
