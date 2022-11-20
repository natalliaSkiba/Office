package Office;

public class Worker extends Employee implements Calcable, Permitable {
    public Worker(String name, BusinessPosition position, int salary) {
        super(name, position, salary);

    }


    @Override
    public int calculateSalary() {
        System.out.println( 1);
        return getSalary() * 1;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("-----------Worker----------");
        System.out.println("ничего нельзя");

    }

    @Override
    public void allowing() {
        if (BusinessPosition.WORKER == getPosition()){
            System.out.println("никуда нельзя");

        }
    }
}

