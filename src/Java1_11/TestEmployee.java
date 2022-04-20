package Java1_11;

public class TestEmployee {
        public static void main(String[] args){
            Employee e1 = new Employee(1,"Viet Anh","Nguyen", 1500);
            System.out.println("Using get");
            System.out.println("ID: "+ e1.getId());
            System.out.println("First name: "+e1.getFirstName());
            System.out.println("Last name: "+e1.getLastName());
            System.out.println("Full name: "+e1.getName());
            System.out.println("Salary: "+e1.getSalary()+"$");

            e1.setSalary(3000);
            System.out.println("After set");
            System.out.println("Salary: "+ e1.getSalary()+"$");
            System.out.println(e1.getAnnualSalary());

            e1.raiseSalary(20);
            System.out.println(e1.toString());
        }
}
