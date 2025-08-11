package Date_31_07;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equalmethods {
	int id;
	String name;
	Equalmethods(int id, String name){
		this.id = id;
		this.name = name;
	}
	public boolean equals(Equalmethods o) {
		if(this == o) return true;
		if(o == null || getClass()!= o.getClass()) return false;

		 Equalmethods other  = (Equalmethods) o;
		 return this.id == other.id && this.name.equals(other.name);
	}
	
	@Override
	 public int hashCode() {
		 return Objects.hash(id ,name);
	 }
	
	 @Override
	 public String toString() {
			return id+ "_" +name;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Equalmethods>  employees = new ArrayList<>();
		employees.add(new Equalmethods(103, "Ravi"));
		employees.add(new Equalmethods(101, "Amit"));
		employees.add(new Equalmethods(102, "Zara"));
		employees.add(new Equalmethods(102, "Zara"));
		employees.add(new Equalmethods(104, "John"));

		System.out.println(employees);
	}

}