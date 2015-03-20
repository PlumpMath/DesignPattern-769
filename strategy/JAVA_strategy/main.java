import java.io.*; 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0.0;
		CashContext cc=null;
		cc = new CashContext("正常");
		double totalPrice =0;
		totalPrice = cc.getResult(100);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
		cc = new CashContext("打八折");

		totalPrice = cc.getResult(100);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
		cc = new CashContext("满300返100");
		
		totalPrice = cc.getResult(300);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
	}

}
