package staff;

public abstract class Employee {
    private String name;
    private String nationalInsurance;
    private double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise){
        if (raise >= 0) {
            this.salary += raise;
        }
    }

    public double payBonus(){
        return 0.01 * salary;
    }

    public void setName(String newName){
        if (newName.isEmpty()){return;}
        this.name = newName;
    }
}

