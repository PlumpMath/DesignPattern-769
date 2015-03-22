import java.io.*; 
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person sb = new Person();
		sb.setName("xxx");
		System.out.println("¿ªÊ¼×°ÊÎ");
		BigTrouser bg = new BigTrouser();
		Tie tie = new Tie();
		TShirts ts = new TShirts();
		
		bg.decorate(sb);
		tie.decorate(bg);
		ts.decorate(tie);
		
		ts.show();
		
		
		
		
	}

}
