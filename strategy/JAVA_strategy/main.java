import java.io.*; 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0.0;
		CashSuper csSuper = CashFactory.createCashAccept("正常收费");
		double totalPrice =0;
		totalPrice = csSuper.acceptCash(100);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
		csSuper = CashFactory.createCashAccept("打八折");
		totalPrice = csSuper.acceptCash(100);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
		csSuper = CashFactory.createCashAccept("满300返100");
		totalPrice = csSuper.acceptCash(300);
		System.out.println("当钱收费价格为"+Double.toString(totalPrice));
	}

}
