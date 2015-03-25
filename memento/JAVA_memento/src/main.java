
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建发起者
		Originator o = new Originator();
		o.setState("on");
		System.out.println("当前状态为"+o.getState());
		//创建管理备忘录者并备份
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		//发起者改变了状态
		o.setState("off");
		System.out.println("当前状态为"+o.getState());
		o.setState("fdsadf");
		System.out.println("当前状态为"+o.getState());
		//恢复到备份之前
		o.setMemento(c.getMemento());
		System.out.println("当前状态为"+o.getState());
	}

}
