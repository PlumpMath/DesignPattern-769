
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����������
		Originator o = new Originator();
		o.setState("on");
		System.out.println("��ǰ״̬Ϊ"+o.getState());
		//����������¼�߲�����
		Caretaker c = new Caretaker();
		c.setMemento(o.createMemento());
		//�����߸ı���״̬
		o.setState("off");
		System.out.println("��ǰ״̬Ϊ"+o.getState());
		o.setState("fdsadf");
		System.out.println("��ǰ״̬Ϊ"+o.getState());
		//�ָ�������֮ǰ
		o.setMemento(c.getMemento());
		System.out.println("��ǰ״̬Ϊ"+o.getState());
	}

}
