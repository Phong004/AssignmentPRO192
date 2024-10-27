package collectiondemo.hashmap;

public class PersonMng {

    public static void main(String[] args) {

        // initialize an empty person group
        PersonHashMap group = new PersonHashMap();

        // add some person
        Person p = new Person("Stick", "Helen", 18);
        group.put(p.nickName, p);
        p = new Person("Pork", "Till", 19);
        group.put(p.nickName, p);
        p = new Person("Bee", "Rosa", 21);
        group.put(p.nickName, p);
        p = new Person("Goat", "Minh", 19);
        group.put(p.nickName, p);
        p = new Person("Johhni", "J", 20);
        group.put(p.nickName, p);
        p = new Person("Johhni", "Ji", 20);
        group.put(p.nickName, p);

        // printing the group in default format 
        //System.out.println(group);
        group.printList_K();
        System.out.println(group.size() + " persons");

        // Search operation
        String nick = "Pipi";
        p = group.searchNick(nick);
        if (p == null) {
            System.out.println("Not found,");
        } else {
            System.out.println("Found: " + p);
        }

        nick = "Johhni";
        p = group.searchNick(nick);
        if (p == null) {
            System.out.println("Not found,");
        } else {
            System.out.println("Found: " + p);
        }

        // Traversals
        System.out.println("\nTraversing based on keyset");
        group.printList_K();

        // Remove
        group.removeNick(nick); // remove "Bee"
        System.out.println("\nTraversing based on values");

        group.printList_V();
        System.out.println(group.size() + " persons");

        //Update
        p = new Person("Goat", "Ji", 20);
        group.put(p.nickName, p);
        group.printList_V();
        System.out.println(group.size() + " persons");
    }
}
