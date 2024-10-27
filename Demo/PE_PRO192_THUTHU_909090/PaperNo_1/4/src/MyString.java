/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int result =0;
        String split[] = str.split(" ");
        for(String temp : split){
            if(temp.contains("0") ||temp.contains("2")||temp.contains("4")
                    ||temp.contains("6")||temp.contains("8")){
                result ++;
            }
        }
        return result;
    }

    @Override
    public String f2(String str) {
        String result = str;
        boolean check = false;
        String split[] = str.trim().split(" ");
        for(String temp : split){
            char[] c = temp.toCharArray();
            check = true;
            int len = c.length-1;
            for(int i = 0; i<= c.length/2 && check; i ++){
                if (c[i] != c[len - i]) {
                    check = false;
                }
            }
            if(check){
                result = result.replaceFirst(temp, "YY");
                break;
            }
        }
        return result;
    }
    
}
