package inheritance;

public class Person {

    protected String name;
    protected String address;
    protected String birthDate;
    protected String idNumber;

    public Person() {
    }

    public Person(String name, String address, String birthDate, String idNumber) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
    }

    public static void run() {
        System.out.println("Person run!");
    }

    public void cry() {
        System.out.println("Person cry!");
    }

    public void eat() {
        System.out.println("Person eat!");
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", birthDate=" + birthDate + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
