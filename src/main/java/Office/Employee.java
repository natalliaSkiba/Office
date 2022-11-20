package Office;

public class Employee {
    private String name;
//    private String position;
    private BusinessPosition position;
    private int salary;
    private int year_begin;

    public Employee(String name, BusinessPosition position, int salary, int year_begin) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.year_begin = year_begin;
    }

    public Employee(String name, BusinessPosition position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, int year_begin) {
        this.name = name;
        this.year_begin = year_begin;
    }

    public Employee(int year_begin) {
        this.year_begin = year_begin;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getYear_begin() {
        return year_begin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusinessPosition getPosition() {
        return position;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void setYear_begin(int year_begin) {
        this.year_begin = year_begin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", year_begin=" + year_begin +
                '}';
    }


    public static void main(String[] args) {
        Employee employee = new Employee("Elena", BusinessPosition.ADMINISTRATION, 10000, 2000);
        System.out.println(employee);

        Administration boss = new Administration("Oly",BusinessPosition.ADMINISTRATION,1000);
        boss.drinkCoffee();
        System.out.println("зп босса с премией  = " + boss.calculateSalary());
        boss.allowing();

        Development development = new Development("Katy", BusinessPosition.SPECIALIST,1000 );
        development.drinkCoffee();
        System.out.println("зп специалиста с премией = " + development.calculateSalary());
        development.allowing();

        Secure secure = new Secure("Ivan", BusinessPosition.SECURE,1000 );
        secure.drinkCoffee();
        System.out.println("зп охранника с премией = " + secure.calculateSalary());
        secure.allowing();

        Worker worker = new Worker("Kolyn",BusinessPosition.WORKER,1000);
        worker.drinkCoffee();
        System.out.println("зп рабочего с премией = " + worker.calculateSalary());
        worker.allowing();

        DateBase dateBase = new DateBase("Oly", 1999);
        DateBase dateBase1 = new DateBase("Katy", 1900);
        DateBase dateBase2 = new DateBase("Ivan", 2010);
        DateBase dateBase3 = new DateBase("Kolyn", 2022);
        DateBase.createArray();



    }
}