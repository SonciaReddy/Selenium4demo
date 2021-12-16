package groupsdemo;

import org.testng.annotations.Test;

public class Testgroup1 {
	
	@Test(groups=("smoke"))
	public void Test1() {
		System.out.println("My first smoke Test case");
	}
	
	@Test(groups=("smoke"))
	public void Test2() {
		System.out.println("My second smoke Test case");
	}
	
	@Test(groups=("functional"))
	public void Test3() {
		System.out.println("My first functional Test case");
	}
	
	@Test(groups=("regression"))
	public void Test4() {
		System.out.println("My first regression Test case");
	}

}
