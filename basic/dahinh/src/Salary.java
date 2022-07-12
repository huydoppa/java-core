public class Salary extends Employee{
    private int salary;
    public Salary(String name, String address, int number,int salary) {
        super(name, address, number);
        setSalary(salary);

    }

    @Override
    public void mailcheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>0)
        salary = salary;
    }
    public int computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }

}
