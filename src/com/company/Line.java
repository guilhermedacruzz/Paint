package com.company;

import java.awt.*;
import java.util.ArrayList;

public class Line {

    private Point points[];

    public Line(Point point[]) {
        this.setPoints(point);
    }

    public  void renderLine(Graphics2D graphics2D) {
        graphics2D.setColor(Color.GREEN);
        for(int i = 0; i < Image.AMOUNTOFPOINTS; i++) {
            for(int f = 0; f < Image.AMOUNTOFPOINTS; f++) {
                if(this.getPoints()[i] != this.getPoints()[f]) {
                    graphics2D.drawLine(Game.WEIGH + (int)this.getPoints()[i].getX(), (int)this.getPoints()[i].getY(), Game.WEIGH + (int)this.getPoints()[f].getX(), (int)this.getPoints()[f].getY());
                }
            }
        }
    }

    public void render(Graphics2D graphics2D) {
        for (int i = 0; i < Image.AMOUNTOFPOINTS; i++) {
            graphics2D.setColor(Color.PINK);
            graphics2D.fillRect(Game.WEIGH + (int) this.getPoints()[i].getX(), (int) this.getPoints()[i].getY(), 5, 5);
        }
    }

    public Point[] getPoints() { return points; }

    public void setPoints(Point[] points) { this.points = points; }
}
