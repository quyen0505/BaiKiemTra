package basic.dev;

public class Teacher extends Person {
	private double hsl;
	private static final double LUONG_CO_BAN = 1800000;

	public Teacher(String name, int age, double hsl) {
		super(name, age);
		this.hsl = hsl;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public double tinhLuong() {
		return LUONG_CO_BAN * hsl;
	}
}

class Main {
	public static void main(String[] args) {
		// Tạo một đối tượng Student
		Student student = new Student("Quyền", 18, 8.5, 7.5, 9.0);
		// In ra thông tin của sinh viên và điểm trung bình
		System.out.println("Student Name: " + student.getName());
		System.out.println("Student Age: " + student.getAge());
		System.out.println("Math: " + student.getMath());
		System.out.println("Physics: " + student.getPhysics());
		System.out.println("Chemistry: " + student.getChemistry());
		System.out.println("Average Score: " + student.diemTrungBinh());

		// Tạo một đối tượng Teacher
		Teacher teacher = new Teacher("Bình", 35, 2.5);
		// In ra thông tin của giáo viên và mức lương
		System.out.println("\nTeacher Name: " + teacher.getName());
		System.out.println("Teacher Age: " + teacher.getAge());
		System.out.println("Salary Coefficient: " + teacher.getHsl());
		System.out.println("Salary: " + teacher.tinhLuong());
	}
}