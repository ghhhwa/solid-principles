package solid;

public class Main {
	public static void main() {
		
		// ocp ���� ������ ��ǻ��
		Computer computer = new Computer();
		computer.boot();
		
		// ocp ���� ������ ��ǻ��
		OcpComputer ocpCom = new OcpComputer();
		ocpCom.setMouse(new OcpMouse());
		ocpCom.boot();
	}
}
