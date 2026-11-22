package weekly_assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}

public class Assign_6_JavaStremAPI {

	public static void main(String[] args) 
	{
		List<Employee> employees = Arrays.asList(
			    new Employee("Rahul", "IT", 60000),
			    new Employee("Priya", "HR", 45000),
			    new Employee("Amit", "IT", 75000),
			    new Employee("Neha", "Finance", 55000),
			    new Employee("Karan", "IT", 60000),
			    new Employee("Simran", "HR", 50000),
			    new Employee("Rohit", "Finance", 75000),
			    new Employee("Ankit", "IT", 40000));

		System.out.println("Employee more than 50000 Salary");
		employees.stream().filter(e->e.getSalary()>50000)
		.forEach(e->System.out.println(e.getName()));
		
		System.out.println("\nEmployee Working in IT department with name");
		employees.stream().filter(e->e.getDepartment().equals("IT"))
		.map(e->e.getName())
		.forEach(name->System.out.println(name));
		
		/*
		System.out.println("\nEmployees by salary with name in ascending order");
		employees.stream().sorted((a,b)->a.getSalary().compateTo(b.getSalary()))
				.foreach(e->System.out.println(e.getName()+"-"+e.getSalary()));
		*/
		
		System.out.println("\nEmployees salary with unique salary and remove duplicate");
		employees.stream()
		.map(e->e.getSalary())
		.sorted()
		.distinct()
		.forEach(e->System.out.println(e));
		
		System.out.println("\nEmployees salary grater or equal to 50000; with names, departments");
		employees.stream()
		.filter(e->e.getSalary()>=50000)
		.map(e->e.getDepartment())
		.sorted()
		.distinct()
		.forEach(e->System.out.println(e));
	}

}
