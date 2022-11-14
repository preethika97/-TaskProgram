package Task;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;

	public class Interview  {
		static Scanner sc=new Scanner (System.in);
		static int totalsize =0;
		public static void main(String[] args) {
			
			System.out.println("Enter Number of interviewers: ");
			int noOfPeoples=sc.nextInt();
			addInterviewer(noOfPeoples);
		}

		static Queue <String>interview =new LinkedList<>();
		static Queue<String> WaitingRoom =new LinkedList<>();
		static Queue <String>interviewRoom =new LinkedList<>();

	public static  void addInterviewer(int n) 
	{
		while(n!=0)		
		{ 	
			String add=sc.next();
			interview.add(add);
			n--;
			}
		System.out.println("******Total Interviewers******\n");
		System.out.println(interview);
	    totalsize=interview.size()/2;
	      
	    WaitingRoom(totalsize);
	  }
	   
	public static void  WaitingRoom(int m) {
				
		while(m!=0)
		{     
			WaitingRoom.add(interview.poll());
			m--;
		}
		interviewRoom();
		
	}
	public static  void interviewRoom() {
		   interviewRoom.add(WaitingRoom.poll());
		display();
	}
	public static void display()
	{
		System.out.println("----Remaining Interviewers----\n");
		System.out.println(interview);
		System.out.println("-------WaitingRoom List-------\n");
		System.out.println(WaitingRoom);
		System.out.println("--------Interview Room--------\n");
		System.out.println(interviewRoom);
		System.out.println("\n");
	}
	}

