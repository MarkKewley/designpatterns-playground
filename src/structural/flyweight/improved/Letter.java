package structural.flyweight.improved;


public class Letter {

    private Character value;

    public Letter(Character value) {
        System.out.println("New letter created with value: "+value);
        this.value = value;
    }

    public Character getValue() {
        return value;
    }
}
