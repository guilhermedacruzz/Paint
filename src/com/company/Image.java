package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Image {

    public static final int WIDTH = 250;
    public static final int HEIGHT = 250;

    public static final float INCREMENT = 18f;
    public static final int AMOUNTOFPOINTS = 360 / (int)INCREMENT;
    public static final int X = (WIDTH / 2) * Game.SCALE;
    public static final int Y = (HEIGHT / 2) * Game.SCALE;

    private Point start;
    private Point end;

    private BufferedImage sprite;

    private Point points[];

    public Image() {
        this.setSprite(new SpriteSheet("res/escudo.jpg").getSprite(0, 0, WIDTH, HEIGHT));
        this.setPoints(new Point[AMOUNTOFPOINTS]);

        double angle = 0;
        for(int i = 0; i < AMOUNTOFPOINTS; i++) {
            this.getPoints()[i] = new Point(angle);
            angle += INCREMENT;
        }

        this.setStart(this.getPoints()[0]);
    }

    public void renderLine(Graphics2D graphics2D, Line line){
        graphics2D.setColor(Color.RED);

        for(int i = 0; i < AMOUNTOFPOINTS; i++) {
            if(this.getPoints()[i] != this.start) {
                graphics2D.drawLine((int) this.getStart().getX(), (int) this.getStart().getY(), (int) this.getPoints()[i].getX(), (int) this.getPoints()[i].getY());
            }
        }

        this.setEnd(this.getPoints()[new Random().nextInt(AMOUNTOFPOINTS)]);
        this.setStart(this.getEnd());

    }

    public void render(Graphics2D graphics2D) {
        for (int i = 0; i < AMOUNTOFPOINTS; i++) {
            graphics2D.setColor(Color.BLUE);
            graphics2D.fillRect((int) this.points[i].getX(), (int) this.points[i].getY(), 5, 5);
        }
    }

    public void setSprite(BufferedImage image) { this.sprite = image; }

    public BufferedImage getSprite() { return sprite; }

    public Point getStart() { return start; }

    public void setStart(Point start) { this.start = start; }

    public Point getEnd() { return end; }

    public void setEnd(Point end) { this.end = end; }

    public Point[] getPoints() { return points; }

    public void setPoints(Point[] points) { this.points = points; }
}
