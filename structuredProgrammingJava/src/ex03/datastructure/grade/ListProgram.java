package ex03.datastructure.grade;

import java.util.Scanner;

public class ListProgram {
	public static void main(String[] args) {
		
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
		
		
		int menu;
		int size = 2;
		boolean running = true;
		
		while (running) {
			
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputList(list);
				break;
			case 2:
				printList(list);
				break;
			case 3:
				printList(list, size);
				break;
			case 4:			
				running = false;
				break;
			default:
				System.out.println("메뉴입력 범위는 1~3입니다.");
			}
		}
		
	}


	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		// 메인 메뉴 부분
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          메인 메뉴             │");
		System.out.println("└────────────────────────────────┘");
		System.out.println("\t1.성적입력");
		System.out.println("\t2.성적출력");
		System.out.println("\t3.성적출력범위");
		System.out.println("\t4.종료");
		System.out.print("\t선택>");
		int menu = scan.nextInt();
		
		return menu;
		
	}
	
	private static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);
		
		// 성적 입력 부분
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 입력             │");
		System.out.println("└────────────────────────────────┘");
		
			
		int kor, eng, math;
		
			do{
				System.out.print("국어 :");
				kor = scan.nextInt();
			
				if (kor<0 || 100<kor) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(kor<0 || 100<kor);
			
			do{
				System.out.print("영어 :");
				eng = scan.nextInt();
			
				if (eng<0 || 100<eng) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(eng<0 || 100<eng);
			
			do{
				System.out.print("수학 :");
				math = scan.nextInt();
			
				if (math<0 || 100<math) {					
					System.out.println("성정범위(0~100)을 벗어났습니다.");
				}
				
			}while(math<0 || 100<math);
			
			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			Exam[] exams = list.exams;
			int size = list.current;
			
			// 1.배열의 크기가 capacity 와 같은가?
			if (exams.length == size) {
				// 2.크기가 5개 정도 더 큰 새로운 배열을 생성하시오.  
				Exam[] temp	= new Exam[size + 5];
				// 3.값을 옮겨준다.
				for(int i=0; i<size; i++) {
					temp[i] = exams[i];
				}
				// 4.새로만든 배열을 참조하도록 한다.
				list.exams = temp;
			}
			
			list.exams[list.current] = exam;
			list.current++;
		
	}
	

	private static void printList(ExamList list) {
		// 오버로딩함수 코드 집중 화  
		printList(list, list.current);
	}
	
	
	private static void printList(ExamList list, int size) {
		// 성적 출력 부분 
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 출력             │");
		System.out.println("└────────────────────────────────┘");
		
		Exam[] exams = list.exams;
		
		for(int i=0; i<size; i++) {
			
			Exam exam = exams[i];
		
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = exam.kor + exam.eng + exam.math;
			float avg = total / 3.0f;
			
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
	
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────────");
		}
		
	}
}
