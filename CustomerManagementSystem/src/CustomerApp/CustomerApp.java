package CustomerApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Customer.Customer;
import com.Customer.Serviceplans;
import com.Rules.ValidationRules;

public class CustomerApp {

	public static void main(String[] args) {
		try (Scanner sc =new Scanner(System.in)){
			
		
			boolean exit =false;
			List<Customer> customerList=new ArrayList <>();
			while (!exit)
			{
				System.out.println("Option:1 Customer sign up\n 2.display\n 3.Login \n 0.exit");
				System.out.println("choose");
				try {
					switch(sc.nextInt()) {
					
					
					case 1:
						System.out.println("enter customer details: first_name,last_name, email, passward, registrationAmount, dob, plan");
						//p d pd 234 1000 2020-12-12 SILVER
					   Customer customer = ValidationRules.validateinpute(sc.next(), sc.next(), sc.next(),sc.next(),
							   sc.nextDouble(), sc.next(),sc.next(), customerList) ;
					   customerList.add(customer);
					   System.out.println("customer registred successful1");
					   break;
					case 2://display all
						for (Customer c: customerList)
							System.out.println(c);
						break;
						
					case 3: //login
						System.out.println("enter email and password");
						customer=ValidationRules.authenticationCustomer(sc.next(),sc.next(),customerList);
						System.out.println(customer);
						break;
					case 4://change password
						System.out.println();
						customer=ValidationRules.changepasswordCustomer(sc.next(),sc.next(),customerList);
						customer.setPassward(sc.next());
					}
					
				}catch(Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}
		}

	}

}
