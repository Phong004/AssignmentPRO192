/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phong
 */
public class StringProcessor implements IMyString {

    @Override
    public boolean matchStudentId(String s) {
        s = s.trim();
        s = s.toLowerCase();
        return s.matches("[q|h|s]e\\d{4,6}"); //Exception 
    }

    @Override
    public String formatCamel(String s) {
        s = s.trim();
        String[] str = s.split("_");
        str[0] = str[0].toLowerCase();
        String ret = str[0];
        for (int i = 1; i < str.length; i++) {
            str[i] = str[i].toLowerCase();
            str[i] = Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1);
            ret += str[i];
        }
        return ret.trim();
    }
}
