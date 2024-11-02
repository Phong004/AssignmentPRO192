/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public interface Flower {

    final public static int unitPrice = 10;

    public int bloomAt(int currHour);

    public int fadeAt(int currHour);

    public int price(int numOfFlower);
}
