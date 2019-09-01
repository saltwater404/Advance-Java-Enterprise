import java.io.IOException;

import com.serialization.SerializationDerializationFunction;

public class App {
	public static void main(String args[]) {
		Student s = new Student();
		s.setId(1090);
		s.setName("Richard");
		s.setAddress("Dhaka");
		s.setSalary(50000);
		System.out.println(s);
		try {
			SerializationDerializationFunction.serialize("student.txt",s);
			
			Student student = (Student) SerializationDerializationFunction.deSerialize("student.txt");
			System.out.println(student);
		} catch (IOException exp) {
			exp.printStackTrace();
		} catch (ClassNotFoundException exp) {
			exp.printStackTrace();
		}
	}
}