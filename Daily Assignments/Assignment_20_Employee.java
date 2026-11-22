package daily_assignments;

import java.util.ArrayList;
import java.util.List;

class Employee
{
	String name;
	double salary;
	
	Employee(String name, double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
	
public class Assignment_20_Employee {
	public static void main(String[] args) 
		{
			Employee e1 = new Employee("Amit",45000);
			Employee e2 = new Employee("Rahul",65000);
			Employee e3 = new Employee("Anjali",75000);
			Employee e4 = new Employee("Priya",40000);
			
			ArrayList<Employee>list=new ArrayList<Employee>();
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			
			List<Employee>Employee=list.stream().filter(s->s.salary>50000).toList();
			Employee.stream().forEach(s1->System.out.println(s1.name+":"+s1.salary));
			
		}

	}


