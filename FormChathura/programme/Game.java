import java.util.Scanner;
public class Game{
	public static Scanner sc=new Scanner(System.in);
	public static String player1,player2;
	public static int A,B,C;
	static String a,b,c;
	static String from;
	public static int move;
	static int k=1;
	public static void main(String[] args){
		System.out.println(" \t\t\t\t | Welcome to the Game 2020 |\n\n");
		menu();
	}
	public static void new1(){
		System.out.println("please enter your name : player1");
		player1=sc.next();
		System.out.println("please enter your name : player2");
		player2=sc.next();
		System.out.println("\n\t\t\t| Welcome to the new game "+player1+" & "+player2+" |");
		newgame();
		play();
	}
	public static void menu(){
		System.out.println("\n\t| MENU |");
		System.out.println("(01)Play a new game press 1 : ");
		System.out.print("(02)Exit the game press 2 : ");
		int m=sc.nextInt();
			if(m==1){
				new1();
			}else{
				menu();
			}

	}
	public static void error1(){
		System.out.println("\t\nyou enterd invalid block name!! please try again");
	}
	public static void error2(){
		System.out.println("\t\nyou enterd invalid moves!! please try again");
	}
	public static void newgame(){
		System.out.println("(1)please select stars do you want for block A? ");
		A=sc.nextInt();
		System.out.println("(1)please select stars do you want for block B? ");
		B=sc.nextInt();
		System.out.println("(1)please select stars do you want for block C? ");
		C=sc.nextInt();
		System.out.println("\n\n");
	}
	public static void play(){
		System.out.println("\t | Block A |");
			for(int i=0;i<A;i++){
				System.out.print("* ");
			}
		System.out.println("\n\t | Block B |");
			for(int i=0;i<B;i++){
				System.out.print("* ");
			}
		System.out.println("\n\t | Block C |");
			for(int i=0;i<C;i++){
				System.out.print("* ");
			}
				System.out.println("\n");
		playing();
	}
	public static void playing(){
			while(A>0||B>0||C>0){
				System.out.println("\t\t\tEnter : |Block name(a,b,c)| & | Stars | you want to move ");
					if(k%2==1){
						System.out.println("\nNow "+player2+" turns :");
					}
					if(k%2==0){
						System.out.println("\nNow "+player1+" turns :");
					}
				System.out.print("\tEnter the block name a<="+A+" or b<="+B+" or c=<"+C+" you want to move from : ");
				from=sc.next();
					if(from.equals("a")||from.equals("b")||from.equals("c")){
						System.out.print("\tEnter the stars you want to move stars :");
						move=sc.nextInt();
					}else{
						error1();
						playing();
					}
					if(from.equals("a")){
						if(move<=A){
							A=A-move;
						}
						else{
							error2();
							playing();
						}
					}
					if(from.equals("b")){
						if(move<=B){
							B=B-move;
						}
						else{
							error2();
							playing();
						}
					}
					if(from.equals("c")){
						if(move<=C){
							C=C-move;
						}
						else{
							error2();
							playing();
						}
					}
				k++;
				play();
				break;
			}
				if(k%2==1){
					System.out.println("\t\t\tCongratulations "+player1+" you are won!");
					menu();
				}
				else{
					System.out.println("\t\t\tCongratulations "+player2+" you are won!");
					menu();
				}

	}

}

