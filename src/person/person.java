package person;

public class person {
	 private String name;
	    private int age;
	    public person() {
	        this.age = 18;
	    }
	    public person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public void displayPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	public static void main(String[] args) {
		person defaultPerson = new person();
        System.out.println("Default Person Details:");
        defaultPerson.displayPersonDetails();
        System.out.println();
        person customPerson = new person("John Doe", 25);
        System.out.println("Custom Person Details:");
        customPerson.displayPersonDetails();
    }

	}


