package random.name;

import java.io.PrintWriter;

/**
 * This a the javadoc for the class B
 * @author durey
 *
 */
public class B {
	
	PrintWriter writer;
	public B(PrintWriter writer){
		this.writer = writer;
	}
	
	/**
	 * Write the specified string with the writer
	 * @param string : the specified string
	 */
	public void write(String string){
		writer.write(string);
	}
	
	

}
