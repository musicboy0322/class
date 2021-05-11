package first.practice.customer;

public class Customer {

    String name;
    String id;
    int amount;

    public Customer() {
        super();
    }

    public Customer(String name, String id ,int amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }

    public void getCost() {
        System.out.println(name + "\t" + id + "\t" + amount);
    }


}
