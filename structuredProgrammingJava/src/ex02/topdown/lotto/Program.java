package ex02.topdown.lotto;

public class Program {

	public static void main(String[] args) {
		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while (running) {
			menu = InputMenu();
			switch(menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottosManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			default:
			}
		}

	}
	
	private static int InputMenu() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static int[][] createLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}





}
