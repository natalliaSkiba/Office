package Office;

public class Development extends Employee implements Calcable, Permitable {
        public Development(String name, BusinessPosition position, int salary) {
            super(name, position, salary);

        }


        @Override
        public int calculateSalary() {
            System.out.println( 5);
            return getSalary() * 5;
        }

        @Override
        public void drinkCoffee() {
            System.out.println("------Development------");
            System.out.println("разработчикам можно пить кофе с коньяком");

        }

        @Override
        public void allowing() {
            if (BusinessPosition.SPECIALIST == getPosition()){
                System.out.println("вам можно ходить в кафе и СПА - для расслабления и вдохновения");

            }
        }
    }

