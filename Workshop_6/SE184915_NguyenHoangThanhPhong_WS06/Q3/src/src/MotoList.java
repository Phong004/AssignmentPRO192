
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MotoList extends HashMap<String, Motorbike> {

    public void addElement(Motorbike m) {
        //TODO: add one Motorbike object in the values list
        String key = m.getLicencePlate();
        this.put(key, m);
    }

    public void listByDistrict(String distCode) {
        //TODO: print all of Motorbike objects by district code (the third character at the licencePlate is code of district
        for (String k : this.keySet()) {
            if (k.toLowerCase().contains(distCode.toLowerCase())) {
                System.out.printf("%s - %s - %s\n", this.get(k).getLicencePlate(),
                        this.get(k).getOwner(), this.get(k).getValue());
            }
        }
    }

    public long totalValue() {
        //TODO: return a total of values in the list object.
        long value = 0;
        for (Motorbike motor : this.values()) {
            value += motor.getValue();
        }
        return value;
    }

}
