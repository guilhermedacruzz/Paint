package com.company;

public class Point {

    private double x;
    private double y;
    private double angle;

    public Point(double angle) {
        int w = Image.WIDTH / 2 * Game.SCALE;
        int h = Image.HEIGHT / 2 * Game.SCALE;
        this.setX(w + (w * Math.cos(angle)));
        this.setY(h + (h * Math.sin(angle)));
        this.setAngle(angle);
    }

    public double getX() { return x; }

    public void setX(double x) { this.x = x;}

    public double getY() { return y; }

    public void setY(double y) { this.y = y; }

    public double getAngle() { return angle; }

    public void setAngle(double angle) { this.angle = angle; }
}
