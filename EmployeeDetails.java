//import java.time.DateTimeException;
//import java.time.LocalDate;
//import java.time.Period;
//import  java.util.Scanner;
//
//public class EmployeeDetails {
//
//	String EmployeeId;
//	String EmployeeName;
//	String DateofBirth;
//	String DateofJoin;
//	String MobileNo;
//	String Email;
//
//	Scanner scanner = new Scanner(System.in);
//	static EmployeeDetails employeeDetails = new EmployeeDetails();
//	
//	protected static void getEmployeeDetails() {
//		employeeDetails.getEmployeeName();
//		employeeDetails.getDateofBirth(); 
//		employeeDetails.getEmployeeId(); 
//		employeeDetails.getDateofJoin(); 
//		employeeDetails.getMobileNo();
//		employeeDetails.getEmail();	
//		employeeDetails.displayEmployeeDetails(); 
//	 }
//	
//	private void getEmployeeId() {
//		System.out.println("Enter Employee Id :");
//		EmployeeId=scanner.next();
//		validateEmployeeId();	
//	 }	
// 
//	 private void getEmployeeName() {
//		System.out.println("Enter Employee Name :");
//		EmployeeName=scanner.nextLine();
//			validateEmployeeName();	
//	 }
//
//	 private void getDateofBirth() {
//		System.out.println("Enter Date of Birth as yyyy/mm/dd :");
//		DateofBirth=scanner.next();
//		validateDateofBirth();
//	 }
//
//	 private void getDateofJoin() {
//		System.out.println("Enter Date of Join as yyyy/mm/dd :");
//		DateofJoin=scanner.next();
//		validateDateofJoin();
//	 }
//
//	 private void getMobileNo() {
//		System.out.println("Enter Mobile No :");
//		MobileNo=scanner.next();
//		validateEmployeeMobileNo();
//	 }
//
//	 private void getEmail() {
//		System.out.println("Enter Email :");
//		Email=scanner.next();
//		validateEmail(); 
//	 }
//
//		private	void validateEmployeeName() {
//			String checkEmployeeName = "^[A-Z]{1}[a-z]+[\\s]{1}[A-Za-z]{1}[a-z]*"; 																
//			if(EmployeeName.matches(checkEmployeeName)) 
//				{
//					EmployeeName=EmployeeName;	
//				}//if
//			else { 
//					getEmployeeDetails();
//				}//else		
//	}//validate
//	
//	private void validateDateofBirth(){
//	String checkDateofBirth = "^[1-2]{1}[0-9]{3}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}";
//		try {
//			if(DateofBirth.matches(checkDateofBirth))
//				{
//				LocalDate EmployeeDateofBirth = LocalDate.of(
//						Integer.parseInt(DateofBirth.substring(0,4)),
//						Integer.parseInt(DateofBirth.substring(5,7)),
//						Integer.parseInt( DateofBirth.substring(8,10))); 
//				//specify year, month, date directly
//				LocalDate currentdate = LocalDate.now(); //gets localDate
//				Period calculate_date_difference = Period.between(EmployeeDateofBirth, currentdate); 
//				//difference between the dates is calculated
//		  			if(calculate_date_difference.getYears()<18)
//		  				{
//		  					System.out.println("You are too young to work"); //"Your Age : "+ calculate_date_diff.getYears()	
//		  					System.exit(0);
//		  				}
//		  			else if(calculate_date_difference.getYears()>60) 
//				  		{
//					  		System.out.println("Thank's for your service, now you are"
//					  		+ " free to enjoy your life "); //"Your Age :"+calculate_date_diff.getYears()
//					  		System.exit(0);
//				  		}
//		  			else {
//					  		DateofBirth=DateofBirth;
//				  		}
//				}//if		  
//		else { 
//				getDateofBirth(); 
//			}//else
//		}//try
//	catch(DateTimeException dateexception) 
//		{
//			System.out.println("Please Enter "
//					+ "Valid DateofBirth"+dateexception);
//			getDateofBirth(); 
//		}
//	}//validate
//
//
//	private void validateEmployeeId() {
//		String checkEmployeeID = "^[A]{1}[C]{1}[E]{1}[0-9]{4}";
//		if(EmployeeId.matches(checkEmployeeID) && !EmployeeId.equals("ACE0000"))
//			{
//				//getDateofJoin(); 
//				EmployeeId=EmployeeId; 
//			}
//		else 
//			{ 
//				getEmployeeId(); 
//			}//else
//	}//validate
//
//
//	private void validateDateofJoin() {
//		String checkDateofJoin = "[1-9]{1}[0-9]{3}/[0-1]{1}[0-9]{1}/[0-3]{1}[0-9]{1}";
//		try {
//			if(DateofJoin.matches(checkDateofJoin)) 
//				{  
//					LocalDate EmployeeDateofJoin = LocalDate.of(
//							Integer.parseInt(DateofJoin.substring(0,4)),
//							Integer.parseInt(DateofJoin.substring(5, 7)),
//							Integer.parseInt(DateofJoin.substring(8, 10))); 
//					//specify year, month, date directly
//					LocalDate currentdate = LocalDate.now(); //gets localDate
//					Period calculate_date_difference = Period.between(EmployeeDateofJoin, currentdate); 
//					//difference between the dates is calculated
//					int days_difference = calculate_date_difference.getDays();
//					if(days_difference<0) 
//						{
//							System.out.println("Please check the date, which should not be future date");
//							getDateofJoin();
//						}
//					else {
//					  //System.out.println("Exsisting Employee ");
//					  DateofJoin=DateofJoin;
//					  }
//				}//if
//		else {	
//			getDateofJoin(); 
//			}//else
//		}//try
//	catch(DateTimeException dateexception) 
//		{
//			System.out.println("Please enter "
//			+ "Valid DateofJoin"+dateexception);
//			getDateofJoin();
//		}//catch
//	}//validate
//
//	private	void validateEmployeeMobileNo() {
//		String checkMobile = "[6-9]{1}[0-9]{9}";
//		if(MobileNo.matches(checkMobile)) 
//			{
//				//System.out.println("Employee mobile :"+MobileNo);
//				MobileNo=MobileNo;
//			}//if
//		else 
//		{ 
//				getMobileNo(); 
//    		}//else
//	}//validate
//
//	private	void validateEmail() {
//		String checkEmail="[A-Za-z]{3,}[0-9]*[._-]*[a-z]*@(aspiresys|ASPIRESYS)+.(com|in)";
//		if(Email.matches(checkEmail))
//		{
//			//System.out.println("Email : "+Email);
//			//displayEmployeeDetails();
//			Email=Email;
//		}
//		else 
//		{ 
//			getEmail();
//			}//else
//	}//validate
//	
//	private void displayEmployeeDetails() {
//			System.out.print("\nYour Employee Details are :");
//			System.out.print("\nEmployee ID \t:" +EmployeeId+ "\n"+
//				"EmployeeName \t:"+EmployeeName +"\n" + "DateofBirth \t:"+DateofBirth
//				+"\n" + "DateOfJoin \t:"+DateofJoin+"\n" +"MobileNo \t:"+MobileNo +"\n"
//				+ "Email \t:"+Email);
//			System.out.print("\n \t Thank You ");
//			scanner.close();
//			System.exit(0);
//		}//displayEmployeeDetails
//	
//}
