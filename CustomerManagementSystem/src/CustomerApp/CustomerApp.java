package CustomerApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

import static com.InputCustomer.inputCustomer.populatedCustomer;
import com.Customer.Customer;
import com.Customer.Serviceplans;
import com.Rules.ValidationRules;

public class CustomerApp {

	public static void main(String[] args) {
		try (Scanner sc =new Scanner(System.in)){
			
		
			boolean exit =false;
			//List<Customer> customerList=new ArrayList <>();
			List<Customer> customerList=populatedCustomer();
			while (!exit)
			{
				System.out.println("Option:1 Customer sign up\n 2.display\n 3.Login \n 4. changing password\n 5.unsubscribe\n "
						+ "6. sorting customer by Date of birth and last name \n 7.sorted as per the email\n 0.exit");
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
						System.out.println("enter email and old password");
						customer=ValidationRules.authenticationCustomer(sc.next(),sc.next(),customerList);
						System.out.println("enter your new password");
						customer.setPassward(sc.next());
						System.out.println("New Password successful1");
						break;
					case 5: //unsubscribe 
						System.out.println("Enter your email and password");
						customer=ValidationRules.unsubscribeUser(sc.next(),sc.next(),customerList);
						System.out.println("Remove email successful1");
						break;
					case 6:
						System.out.println("sorting customer by Date of birth and last name");
						customerList.sort(new Comparator<Customer>() {
						public int compare(Customer c1,Customer c2) {
							int dobcomparison=c1.getDob().compareTo(c2.getDob());
							if (dobcomparison !=0) {
								return dobcomparison;
							}
							else
								return c1.getLast_name().compareTo(c2.getLast_name());
						}	
						});
						System.out.println("customer sorted successfully");
						break;
					case 7:
						System.out.println("sorted as per the email");
						Collections.sort(customerList);
						break;
					case 0:
						exit=true;
					}
					
				}catch(Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
			}
		}

	}

}
