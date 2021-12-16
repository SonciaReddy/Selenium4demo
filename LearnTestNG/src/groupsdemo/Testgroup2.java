package groupsdemo;

import org.testng.annotations.Test;

public class Testgroup2 {
	
	@Test(groups=("smoke"))
	public void Test5() {
		System.out.println("My third smoke Test case");
	}
	
	@Test(groups=("regression"))
	public void Test6() {
		System.out.println("My second regression Test case");
	}
	
	@Test(groups=("functional"))
	public void Test7() {
		System.out.println("My second functional Test case");
	}
	
	@Test(groups=("regression"))
	public void Test8() {
		System.out.println("My third regression Test case");
	}
}
