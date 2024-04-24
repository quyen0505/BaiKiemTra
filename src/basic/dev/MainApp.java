package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person persons[] = new Person[5];

		// Nhập thông tin cho danh sách persons
		input(persons);

		// Xuất thông tin danh sách persons
		print(persons);
	}

	// Hàm nhập thông tin cho danh sách persons
	public static void input(Person person[]) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < person.length; i++) {
			if (i < 3) {
				// Nhập thông tin cho Student
				System.out.println("Enter information for Student " + (i + 1) + ":");
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Age: ");
				int age = scanner.nextInt();
				scanner.nextLine(); // Consume newline character
				System.out.print("Math score: ");
				double math = scanner.nextDouble();
				System.out.print("Physics score: ");
				double physics = scanner.nextDouble();
				System.out.print("Chemistry score: ");
				double chemistry = scanner.nextDouble();
				scanner.nextLine(); // Consume newline character
				person[i] = new Student(name, age, math, physics, chemistry);
			} else {
				// Nhập thông tin cho Teacher
				System.out.println("Enter information for Teacher " + (i - 2) + ":");
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Age: ");
				int age = scanner.nextInt();
				scanner.nextLine(); // Consume newline character
				System.out.print("Salary Coefficient: ");
				double hsl = scanner.nextDouble();
				scanner.nextLine(); // Consume newline character
				person[i] = new Teacher(name, age, hsl);
			}
		}
		scanner.close();
	}

	// Hàm xuất thông tin danh sách persons
	public static void print(Person person[]) {
		System.out.println("\nThông tin học sinh 1:");
		for (int i = 0; i < person.length; i++) {
			System.out.println("Person " + (i + 1) + ":");
			System.out.println("Name: " + person[i].getName());
			System.out.println("Age: " + person[i].getAge());
			if (person[i] instanceof Student) {
				Student student = (Student) person[i];
				System.out.println("Type: Student");
				System.out.println("Math: " + student.getMath());
				System.out.println("Physics: " + student.getPhysics());
				System.out.println("Chemistry: " + student.getChemistry());
				System.out.println("Average Score: " + student.diemTrungBinh());
			} else if (person[i] instanceof Teacher) {
				Teacher teacher = (Teacher) person[i];
				System.out.println("Type: Teacher");
				System.out.println("Salary Coefficient: " + teacher.getHsl());
				System.out.println("Salary: " + teacher.tinhLuong());
			}
			System.out.println();
		}
	}
}
