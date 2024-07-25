package chap01.particleapp;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author emaph
 */
public class ParticleCanvas extends Canvas {

    private Particle[] particles = new Particle[0];

    ParticleCanvas(int size) {
        setSize(new Dimension(size, size));
    }

    // intended to be called by applet
    protected synchronized void setParticles(Particle[] ps) {
        if (ps == null) {
            throw new IllegalArgumentException("Cannot set null");
        }
        particles = ps;
    }

    protected synchronized Particle[] getParticles() {
        return particles;
    }

    @Override
    public void paint(Graphics g) { // override Canvas.paint

        Particle[] ps = getParticles();

        for (int i = 0; i < ps.length; ++i) {
            ps[i].draw(g);
        }
    }

}
