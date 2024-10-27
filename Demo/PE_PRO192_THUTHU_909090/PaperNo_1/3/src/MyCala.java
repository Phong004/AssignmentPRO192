
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SE162033 Nguyen Vuong Bach
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int number = 0;
        for (Cala cala : t) {
            if (Character.isLetter(cala.getOwner().charAt(1))) {
                number += 1;
            }
        }
        return number;
    }

    @Override
    public void f2(List<Cala> t) {
        int i = 0;
        int min = t.get(0).getPrice();

        int count = 0;
        for (i = 1; i < t.size(); i++) {
            if (t.get(i).getPrice() < min) {
                min = t.get(i).getPrice();
            }
        }
        for (i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() == min) {
                count++;
            }
            if(count ==2){
                t.remove(i);
                break;
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
       Comparator com = new Comparator<Cala>() {
           @Override
           public int compare(Cala o1, Cala o2) {
               if(o2.getOwner().length()>=2 && o1.getOwner().length()>=2){
                   return o1.getOwner().charAt(1)-o2.getOwner().charAt(1);
               }
               return Integer.MAX_VALUE;    
           }
       }; 
       Collections.sort(t,com);
    }

}
