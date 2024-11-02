
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class Item implements IService {

    private String id;
    private String name;
    private int size;

    public Item(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    @Override
    public String formatSize() {
        id = id.toUpperCase();
        switch (id) {
            case "ZARA":
                if (size >= 0 && size <= 4) {
                    return "XS";
                } else if (size > 4 && size <= 6) {
                    return "S";
                }
            case "MANGO":
                if (size >= 0 && size <= 4) {
                    return "S";
                } else if (size > 4 && size <= 6) {
                    return "M";
                }
            default:
                return "L";
        }
    }

    @Override
    public String formatName() {
        name = name.trim();
        String str[] = name.split(" ");
        String ret = "";
        for (String s: str) {
            if (!s.equals("")) {
                ret += s + " ";
            }
        }
        return String.format("[%s]", ret.trim());
    }
}
