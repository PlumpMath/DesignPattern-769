import java.io.*; 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0.0;
		CashContext cc=null;
		cc = new CashContext(new CashNormal());
		double totalPrice =0;
		totalPrice = cc.getResult(100);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
		cc = new CashContext(new CashRebate("0.8"));

		totalPrice = cc.getResult(100);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
		cc = new CashContext(new CashReturn(300,50));
		
		totalPrice = cc.getResult(300);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
	}

}
