import java.util.*;

class project
{

        Scanner ob = new Scanner(System.in);
	String username;
	String password;

	String customer_name[] = new String[10];
	int customer_age[] = new int[10];
	String customer_desc[] = new String[10];
	String customer_intime[] = new String[10];
	String customer_outtime[] = new String[10];

	/*customer_name = new String[10];	
	customer_age = new int[10];
	customer_desc = new String[10];
	customer_intime = new String[10];
	customer_outtime = new String[10];
	*/
	int record_counter=0;

void login()
{
 System.out.println("********************************************************************************************************************************************************");
  System.out.println("____  __ __  ___ ___      ___ ___   ____  ____     ____   ____    ___  ___ ___    ___  ____   ______       _____ __ __    _____ ______    ___  ___ ___");     
 System.out.println("/    ||  |  ||   |   |    |   |   | /    ||    \\  /    | /    |  /  _]|   |   |  /  _]|    \\ |       |     / ___/|  |  | / ___/|      |  /  _]|   |   |");    
System.out.println("|   __||  |  || _   _ |    | _   _ ||  o  ||  _  ||  o  ||   __| /  [_ | _   _ | /  [_ |  _  ||      |    (  \\_ |  |  |(  \\_ |      | /  [_ | _   _ |");    
System.out.println("|  |  ||  ~  ||  \\_/  |    |  \\_/  ||     ||  |  ||     ||  |  ||    _]|  \\_/  ||    _]|  |  ||_|  |_|     \\__  ||  ~  | \\__  ||_|  |_||    _]|  \\_/  |");    
System.out.println("|  |_ ||___, ||   |   |    |   |   ||  _  ||  |  ||  _  ||  |_ ||   [_ |   |   ||   [_ |  |  |  |  |       /  \\ ||___, | /  \\ |  |  |  |   [_ |   |   |");    
System.out.println("|     ||     ||   |   |    |   |   ||  |  ||  |  ||  |  ||     ||     ||   |   ||     ||  |  |  |  |       \\    ||     | \\    |  |  |  |     ||   |   |");    
System.out.println("|___,_||____/ |___|___|    |___|___||__|__||__|__||__|__||___,_||_____||___|___||_____||__|__|  |__|        \\___||____/   \\___|  |__|  |_____||___|___|");    
System.out.println("********************************************************************************************************************************************************");                                                                                                                                                        

	System.out.println("########################################");
	System.out.println("#                                      #");
	System.out.println("#                                      #");
	System.out.println("#          ****Login Page****          #");
	System.out.println("#                                      #");
	System.out.println("#                                      #");
	System.out.print("            Username : ");username = ob.next();                 
	System.out.print("            Password : ");password = ob.next();
	System.out.println("#                                      #");
	System.out.println("#                                      #");
	System.out.println("#                                      #");
	System.out.println("#                                      #");
	System.out.println("#                                      #");
	System.out.println("########################################");

	if(username.equals("admin") && password.equals("admin"))
	{
		System.out.println("Welcome to the Admin Panel!");
		String exit="Y";
 		do{
		System.out.println("*********************************************");
		System.out.println("* Choose what to do from the foll. menu :   *");
		System.out.println("* 1 : Enter a record                        *");
		System.out.println("* 2 : Delete a record                       *");
		System.out.println("* 3 : view a customer                       *");
		System.out.println("* 4 : Logout and Exit                       *");
		System.out.println("*********************************************");
		System.out.print("Enter a choice : ");
		int a = ob.nextInt();
		
        
		int i; // Record counter
		
		

		if(a==1)
		{
			System.out.print("Enter how many customer records to enter : ");
			int rec = ob.nextInt();
			for(i=0;i<rec;i++)
			{
				System.out.println("========================================");
				System.out.print("\nEnter customer name : ");
				customer_name[i] = ob.next();
				System.out.print("\nEnter customer's age : ");
				customer_age[i] = ob.nextInt();
				System.out.print("\nEnter customer's description : ");
				customer_desc[i] = ob.next();
				System.out.print("\nEnter last in-time (HH-MM-SS) : ");
				customer_intime[i] = ob.next();
				System.out.print("\nEnter last out-time (HH-MM-SS) : ");
				customer_outtime[i] = ob.next();
				System.out.println("========================================");
				record_counter++;

			}
			
		}

		else if(a==2)
		{
			System.out.println("choose a record from the below to delete : ");
			for(int j=0;j<record_counter;j++)
			{
				System.out.println(j+1 +" : "+customer_name[j]);
			}
		      System.out.print("\nChoose any of above to  delete : ");
		      int o = ob.nextInt();
		      System.out.println("Remember this will delete all the information for the particular record , continue?(Y/N) : ");
		      String kl = ob.next();
		      if(kl.equals("y") || kl.equals("Y"))
		      {
			customer_name[o-1]=null;
			customer_age[o-1]=0;
			customer_desc[o-1]=null;
			customer_intime[o-1]=null;
			customer_outtime[o-1]=null;
		      }
		}	
		else if(a==3)
		{
			System.out.println("Displaying the records : ");
			for(int j=0;j<record_counter;j++)
			{
				System.out.println(j+1 +" : "+customer_name[j]);
			}
 			System.out.println("Choose any of the above to display details : ");
			int n = ob.nextInt();
			System.out.println("Displaying record details : ");
			System.out.println("Customer name : " + customer_name[n-1]);
			System.out.println("Customer Age  : " + customer_age[n-1]);
			System.out.println("Customer Desc : " + customer_desc[n-1]);
			System.out.println("Last In-Time  : " + customer_intime[n-1]);
			System.out.println("Last Out-Time : " + customer_outtime[n-1]);
		}
		else if(a==4)
		{
			System.out.println("Thank you for using our Gym's management Portal!");
			System.out.println("Have a Dope time Working Out! Bye!");
			return;
		}
          }while(exit!="Y" || exit!="y");
	}
	else
        {
	System.out.println("\n*****Welcome to our Customer Panel "+username+"!! ******!!"); 
	System.out.println("\nHere's a list of all present members of our Gym!");
        String rem = "Y";
	while(rem.equals("Y") || rem.equals("y"))
		{
		for(int j=0;j<record_counter;j++)
			{
				System.out.println(j+1 +" : "+customer_name[j]);
			}
 			System.out.print("Choose any of your collegue's id to display their details : ");
			int n = ob.nextInt();
			System.out.println("\n\n\n===================================");
			System.out.println("Displaying record details : ");
			System.out.println("Customer name : " + customer_name[n-1]);
			System.out.println("Customer Age  : " + customer_age[n-1]);
			System.out.println("Customer Desc : " + customer_desc[n-1]);
			System.out.println("Last In-Time  : " + customer_intime[n-1]);
			System.out.println("Last Out-Time : " + customer_outtime[n-1]);	
			System.out.println("\n\n\n===================================");
			System.out.print("\n\nDo you want to return to previous page? (Y/N) : ");
			rem = ob.next();
    }
   }	
}

public static void main(String []args)
{
        Scanner ob = new Scanner(System.in);
	project obj = new project();
	String v = "Y";
	while(v.equals("Y") || v.equals("y"))
        {
	 obj.login();
	System.out.println("\n\n\n===================================");
	System.out.print("Do you want to login again??(Y/N) : ");
	v = ob.next();
	System.out.println("\n\n\n===================================");
	}
 
}
}
