package equals.java;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Moscow", "Prospect", 78);
        Address address1 = new Address("Moscow", "Prospect", 78);
        if (address1.equals(address)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }
        System.out.println(address.hashCode());
        System.out.println(address1.hashCode());
    }
}
