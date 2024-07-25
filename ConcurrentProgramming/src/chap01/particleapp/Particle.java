
package chap01.particleapp;

import java.awt.Graphics;
import java.util.Random;


/**
 * Particle class defines a completely unrealistic model of movable bodies.
 * @author emaph
 */
public class Particle {
    protected int x;
    protected int y;
    protected final Random rng = new Random();

    public Particle(int initalX, int initialY) {
        this.x = initalX;
        this.y = initialY;
    }

    public synchronized void move() {
        x += rng.nextInt(10) - 5;
        y += rng.nextInt(20) - 10;
    }

    public void draw(Graphics g) {
        int lx, ly;
        synchronized (this) { lx = x; ly = y; }
        g.drawRect(lx, ly, 10, 10);
    }
}
