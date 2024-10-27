/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192;

/**
 *
 * @author nguye
 */
public class IntPoint {

    private int x;
    private int y;

    public IntPoint() {

    }

    public IntPoint(int z) {
        this.x = z;
        this.y = z;
    }

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void testDefault(){}
    protected void testProtected(){}
    private void testPrivate(){}
    
    @Override
    public String toString() {
        return "IntPoint{" + "x=" + x + ", y=" + y + '}';
    }

}
