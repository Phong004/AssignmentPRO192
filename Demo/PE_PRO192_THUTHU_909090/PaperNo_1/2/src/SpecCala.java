/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SE162033 Nguyen Vuong Bach
 */
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
        super();
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.color;
    }

    public void setData() {
        String str = super.getOwner();
        String str3rd = Character.toString(str.charAt(2));
        str = str.replaceFirst(str3rd, "XX");
        super.setOwner(str);
    }

    public int getValue() {
        int price = this.getPrice();
        if (color % 2 != 0) {
            return price += 7;
        } else {
            return price += 3;
        }
    }

}
