

/* interface provides complete abstraction. 
 * abstract classes provide partial abstraction. 
 *  cannot initiate both
 */

/* default abstract and public*/
interface interOne{
	
	//public final static 
	int a=10;
	//hence once initialized, cannot be re-initialized or changed in any implementation
	
	/* complier treats them as:
	 * public abstract void method1();
	 */
	public void method1();

}

/* interface cannot implement another interface, only a class can*/
interface interTwo extends interOne{
	
	public void method2();
}

interface interThree{
	int a=30;
	public void method2();
}
/* here though the class implements the interTwo interface, 
 * but it has to implement the both the interface
 */

/* a class can implement any number of interface
 * interfaceDemo implemnets interone,intertwo, .... valid
 */
public class interfaceDemo implements interTwo,interThree{


	public void method1() {
		System.out.println(" method 1");
		
	}

	/* same method in two interface, single implemetation is sufficient
	 * same return type
	 * cannot have 2 method with same name but different return types
	 * (non-Javadoc)
	 * @see interTwo#method2()
	 */
	public void method2() {
		System.out.println(" method 2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interTwo inter=new interfaceDemo();
		inter.method2();	
		System.out.println(interOne.a);
		System.out.println(interThree.a);
		//a=20   error
	}		
}
