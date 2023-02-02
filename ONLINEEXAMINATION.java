package khushi23;
import java.util.*;
public class ONLINEEXAMINATION {
    
	public static void main(String[] args) {
		
		
				
			    Scanner sc = new Scanner(System.in);
				String realid="XYZ",realpassword="444";
				while(true){
					System.out.println("Welcome to Login");
					
					System.out.print("Enter LoginId:");
					String id,password;
					id=sc.next();
					System.out.print("Enter Password: ");
					password=sc.next();
					if(id.equals(realid) && password.equals(realpassword)){
					
						Integer count=0;
						
						System.out.println("Welcome to Exam Portal");
						
					
						while(true){
							System.out.println("1.Exam\n2.Update Profile\n3.Logout");
							System.out.print("Enter Your Choice:");
							Integer n=sc.nextInt();
							if(n==1){
								long examstarttime=System.currentTimeMillis();//Timer and auto submit
								long endtime=examstarttime+30*1000;
								while(System.currentTimeMillis()<endtime){
									
									System.out.println("Your Exam Exactly Starts Now and Your timer was on mode.\nCurrent time:"+System.currentTimeMillis());
									
									System.out.println("1._nglish \n1.e 2.a 3.n 4.k 5.m");
									System.out.print("Enter Suitable letter: ");
									String s=sc.next();
									if(s.equals("1")){
										count+=1;
									}
									
									System.out.println("Your Submitted First Question Successfully.\nNow Current time:"+System.currentTimeMillis());
									
									System.out.println("2.or_nge \n1.e 2.a 3.n 4.c 5.m");
									System.out.print("Enter Suitable letter: ");
									s=sc.next();
									if(s.equals("2")){
										count+=1;
									}
									
									System.out.println("Your Submitted Second Question Successfully.\nNow Current time:"+System.currentTimeMillis());
									
									System.out.println("3.e_t \n1.e 2.a 3.n 4.c 5.m");
									System.out.print("Enter Suitable letter: ");
									s=sc.next();
									if(s.equals("2")){
										count+=1;
									}
									
									System.out.println("Your Submitted Third Question Successfully.\nNow Current time:"+System.currentTimeMillis());
								    System.out.println("4.h_me \n1.e 2.o 3.n 4.y 5.m");
									System.out.print("Enter Suitable letter: ");
									s=sc.next();
									if(s.equals("2")){
										count+=1;
									}
									
									System.out.println("Your Submitted Fourth Question Successfully.\nNow Current time:"+System.currentTimeMillis());
									
									System.out.println("5.A_ple \n1.e 2.a 3.n 4.m 5.p");
									System.out.print("Enter Suitable letter: ");
									s=sc.next();
									if(s.equals("5")){
										count+=1;
									}
									
									System.out.println("Your Submitted Fifth Question Successfully.\nNow Current time:"+System.currentTimeMillis());
									
								}
								System.out.println("Your Exam Finishes.\nYou Scored:"+(count*10));
							}
							else if(n==2){
								try{
									System.out.print("Enter Updated Id:");
									realid=sc.next();
									System.out.print("Enter Updated Password");
									realpassword=sc.next();
									System.out.println("Details Updated Successfully");
								}
								catch(Exception e){
									System.out.println("Failed to Update Details");
								}
								
							}
							else if(n==3){
								System.exit(0); 
							}
							else{
								System.out.println("Enter valid choices");
							}
						}
					}
					else{
						System.out.println("Your Entered Details are Invalid.Try Again");
					}
				}
			}
		
	}








