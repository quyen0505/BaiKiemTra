package basic.dev;

public class Person {
	 private String name;
	    private int age;
	 // Phương thức khởi tạo có đối số
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
}
	    public void setName (String name) {
	    	this.name = name;
	    	}
	    public void setAge(int age) {
	        this.age = age;
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    public int getAge() {
	    	return age;
	    	
	    }
	    
	    }
