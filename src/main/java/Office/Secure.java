package Office;

public class Secure extends Employee implements Calcable, Permitable {
    public Secure(String name, BusinessPosition position, int salary) {
        super(name, position, salary);

    }


    @Override
    public int calculateSalary() {
        System.out.println( 2);
        return getSalary() * 2;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("-----------Secure---------");
        System.out.println("на кофе можно смотреть - пить нельзя ");

    }

    @Override
    public void allowing() {
        if (BusinessPosition.SECURE == getPosition()){
            System.out.println("нужно ходить везде, но пользоваться ничем нельзя");

        }
    }
}

