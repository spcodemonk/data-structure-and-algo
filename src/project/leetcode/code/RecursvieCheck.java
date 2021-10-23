package project.leetcode.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", importance=" + importance + ", subordinates=" + subordinates + "]";
	}
    
    
};

public class RecursvieCheck {

	public static void main(String[] args) {
		
		int id=1;
		
		List<Employee> employees= new ArrayList<>();
		
		Employee emp1 = new Employee();
		emp1.id=1;
		emp1.importance=5;		
		List<Integer> subordinates1=new ArrayList<>();
		subordinates1.add(2);
		subordinates1.add(3);
		emp1.subordinates=subordinates1;
		employees.add(emp1);
		
		System.out.println(emp1);
		Employee emp2 = new Employee();
		emp2.id=2;
		emp2.importance=3;		
		List<Integer> subordinates2=new ArrayList<>();
		emp2.subordinates=subordinates2;
		employees.add(emp2);
		System.out.println(emp2);
		Employee emp3 = new Employee();
		emp3.id=3;
		emp3.importance=3;		
		List<Integer> subordinates3=new ArrayList<>();
		emp3.subordinates=subordinates3;
		employees.add(emp3);
		System.out.println(emp3);
		
		Map<Integer,Employee> mapData =new HashMap<>();
		
		for(Employee emp:employees) {
			
			mapData.put(emp.id, emp);
		}
		
	int sum = 	mapData.get(id).importance + getImpartanceCount(mapData.get(id).subordinates, mapData);
	System.out.println(sum);	

	}
	
	public static int getImpartanceCount(List<Integer> subordinates,Map<Integer,Employee> mapData) {
		
		int importanceValue=0;
		for(Integer subordinateId:subordinates) {
			
			importanceValue+= mapData.get(subordinateId).importance + getImpartanceCount(mapData.get(subordinateId).subordinates,mapData);
		}
		
		return importanceValue;
	}

}
