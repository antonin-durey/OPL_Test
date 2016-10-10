package random.name;
/**
 * This a the javadoc for the class AB
 * @author durey
 *
 */
public class A {
	/**
	 * this is the name of the element
	 */
	private String name;
	
	private int age;

	
	public A(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Get the name of the element
	 * @return
	 */
	public String getName(){
		return name;
	}
	

	public void setName(String name){
		this.name = name;
	}
}
