package basic.dev;

public class Student extends Person {
	private double math;
	private double physics;
	private double chemistry;

	public Student(String name, int age, double math, double physics, double chemistry) {
		super(name, age);
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double diemTrungBinh() {
		return (math + physics + chemistry) / 3;
	}
}
