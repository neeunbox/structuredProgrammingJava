package ex03.datastructure.grade;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		int current = 0;
		
		int menu;
		boolean running = true;
		
		while (running) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				inputList(exams, current);
				break;
			case 2:
				printList(exams, current);
				break;
			case 3:
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
		System.out.println("\t3.종료");
		System.out.print("\t선택>");
		int menu = scan.nextInt();
		
		return menu;
	}

	private static void inputList(Exam[] exams, int current) {
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
			
			exams[current] = exam;
			current++;
		
	}
	
	private static void printList(Exam[] exams, int size) {
		// 성적 출력 부분 
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 출력             │");
		System.out.println("└────────────────────────────────┘");
		
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
			System.out.println("──────────────────────────────────");
		}
		
	}



}
