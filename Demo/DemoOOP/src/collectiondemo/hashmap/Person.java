package collectiondemo.hashmap;

public class Person {

    String nickName, name;
    int age;

    public Person(String nickName, String name, int age) {
        this.nickName = nickName;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return nickName + ", " + name + ", " + age;
    }

}
