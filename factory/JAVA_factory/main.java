
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();
		oper.numberA = 1;
		oper.numberB = 2;
		double result = oper.getResult();
		System.out.println("计算结果为"+result+"");
		operFactory = new MulFactory();
		oper = operFactory.createOperation();
		oper.numberA = 1;
		oper.numberB = 2;
		result = oper.getResult();
		System.out.println("计算结果为"+result+"");
	}

}
