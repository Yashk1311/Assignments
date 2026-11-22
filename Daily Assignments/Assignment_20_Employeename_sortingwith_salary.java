package daily_assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee1
{
	String name;
	double salary;


Employee1(String name,double salary)
{
	this.name=name;
	this.salary=salary;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getSalary() {
	return salary;
}


public void setSalary(double salary) {
	this.salary = salary;
}

}

public class Assignment_20_Employeename_sortingwith_salary {
			
			public static void main(String[] args) 
			{
				Employee1 e1 = new Employee1("Rahul",50000);
				Employee1 e2 = new Employee1("Priya",70000);
				Employee1 e3 = new Employee1("Amit",60000);
				
				List<Employee1>list = new ArrayList<Employee1>();
				list.add(e1);
				list.add(e2);
				list.add(e3);
				
				System.out.println("EMPLOYEES BY SALARY IN ASC ORDER");
				list
				.stream()
				.sorted(Comparator.comparing(Employee1::getSalary))
				.forEach(e->System.out.println(e.name+" : "+e.salary));
				
				System.out.println("\nEMPLOYEES BY SALARY IN DESC ORDER");
				list
				.stream()
				.sorted(Comparator.comparing(Employee1::getSalary).reversed())
				.forEach(e->System.out.println(e.name+" : "+e.salary));
				
				double sum=
						list
						.stream()
						.map(Employee1::getSalary)
						.mapToDouble(Double::doubleValue)
						.sum();
			
				System.out.println("\nTotal Salary : "+sum);
				
	}

}
