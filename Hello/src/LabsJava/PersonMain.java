package LabsJava;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Female and male 
		Gender gen = Gender.F;
		Gender g = Gender.M;
		
		Person p1 = new Person("Steph", "Cedillo", gen);
		Person p2 = new lab7Phone("Stephanie", "Cedillo", gen , "972-878-1111");
		Person p3 = new Person("Steven", "Estrada", g);
		
		System.out.println(p2);
		System.out.println(p1);
		System.out.println(p3);


	}

}
