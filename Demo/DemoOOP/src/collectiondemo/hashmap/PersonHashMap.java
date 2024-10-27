package collectiondemo.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class PersonHashMap extends TreeMap<String, Person> {

    public PersonHashMap() {
        super();
    }

    // search a person by nickName
    public Person searchNick(String nickName) {
        return this.get(nickName);

    }

    // Remove a person by nickName
    public Person removeNick(String nickName) {
        Person result = this.get(nickName);
        if (result != null) {
            this.remove(nickName);
        }
        return result;
    }
    
    // Traverse for printing persons using keys
    public void printList_K() {
        Set<String> keys = this.keySet();
        for (String K : keys) {
            System.out.println(this.get(K));
        }
    }
    
    // Traverse for printing persons using values
    public void printList_V() {
        Collection<Person> values = this.values();
        for (Person V : values) {
            System.out.println(V);
        }
    }
}
