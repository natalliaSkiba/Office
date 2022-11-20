package Office;

public class Administration extends Employee implements Calcable, Permitable {


    public Administration(String name, BusinessPosition position, int salary) {
        super(name, position, salary);

    }


    @Override
    public int calculateSalary() {

        System.out.println(6);
        return getSalary() * 6;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("------Administration------");
        System.out.println("сотрудники администрации могут пить кофе");

    }

    @Override
    public void allowing() {
        if (BusinessPosition.ADMINISTRATION == getPosition()){
            System.out.println("вам можно ходить везде - вы босс");

        }
    }
}
