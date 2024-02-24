package ex03.datastructure.grade;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
				
		int menu;
		boolean running = true;
		
		while (running) {
			menu = inputMenu();
			
			switch(menu) {
			case 1:
				input(exam);
				break;
			case 2:
				print(exam);
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

	private static void input(Exam exam) {
		
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
			
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
	}

	private static void print(Exam exam) {
		
		// 성적 출력 부분 
		System.out.println("┌────────────────────────────────┐");
		System.out.println("│          성적 출력             │");
		System.out.println("└────────────────────────────────┘");
		
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
		
	}

}
