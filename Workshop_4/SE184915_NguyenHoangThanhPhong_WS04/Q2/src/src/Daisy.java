/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class Daisy implements Flower {

    @Override
    public int bloomAt(int currHour) {
        int bloomHour = currHour + 5;
        if (bloomHour > 24) {
            bloomHour -= 24;
        }
        return bloomHour;
    }

    @Override
    public int fadeAt(int currHour) {
        int fadeHour = currHour + 10;
        if (fadeHour > 24) {
            fadeHour -= 24;
        }
        return fadeHour;
    }

    @Override
    public int price(int numOfFlower) {
        return Flower.unitPrice * numOfFlower;
    }
}
