package test;

public class Calculator {
	private static int result; //静态变量，用于存储运行结果
	public void add(int n){
		result=result+n;
		System.out.println("和："+result);
	}
	public void substract(int n){
		result=result-n; 
		System.out.println("减："+result);
	}
	public void multiply(int n){
		result=result*n; 
		System.out.println("乘："+result);
	}
	public void divide(int n)throws Exception{
		if(n==0)
			throw new Exception("除数不能为0");
		result=result/n;
		System.out.println("除："+result);
	}
	public void square(int n){
		result=n*n;
		System.out.println("平方："+result);
	}
	public void squareRoot(int   n){
		for(;;);         //Bug:死循环
		System.out.println("死循环");
	}
	public void clear(){  //将结果清零
		result=0;
		System.out.println("清空："+result);
	}
}
