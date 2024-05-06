package CustomerApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.naming.ldap.SortControl;

import static com.InputCustomer.inputCustomer.populatedCustomer;
import com.Customer.Customer;
import com.Customer.Serviceplans;
import com.Rules.ValidationRules;
import com.app.custom_ordering.CustomerDobAndNameComparator;

import static com.Rules.ValidationRules.*;

public class CustomerApp {

	public static void main(String[] args) {
		try (Scanner sc =new Scanner(System.in)){
			
		
			boolean exit =false;
			//List<Customer> customerList=new ArrayList <>();
			Map<String,Customer> customerList=populatedCustomer();
			while (!exit)
			{
				System.out.println("Option:1 Customer sign up\n 2.display\n 3.Login \n 4. changing password\n 5.unsubscribe\n "
						+ "6. sorting customer by Date of birth and last name \n 7.sorted as per the email\n 8. remove account via email\n "
						+ "9.remove from email or firstname 0.exit");
				System.out.println("choose");
				try {
					switch(sc.nextInt()) {
					
					
					case 1:
						System.out.println("enter customer details: first_name,last_name, email, passward, registrationAmount, dob, plan");
						//p d pd 234 1000 2020-12-12 SILVER
					   Customer customer = validateinpute(sc.next(), sc.next(), sc.next(),sc.next(),
							   sc.nextDouble(), sc.next(),sc.next(), customerList) ;
					   customerList.put(customer.getEmail(), customer);
					   System.out.println("customer registred successful1");
					   break;
					case 2://display all
						for (Customer c: customerList.values())
							System.out.println(c);
						break;
						
					case 3: //login
						System.out.println("enter email and password");
						customer=authenticationCustomer(sc.next(),sc.next(),customerList);
						System.out.println(customer);
						break;
					case 4://change password
						System.out.println("enter email and old password");
						customer=authenticationCustomer(sc.next(),sc.next(),customerList);
						System.out.println("enter your new password");
						customer.setPassward(sc.next());
						System.out.println("New Password successful1");
						break;
					case 5: //unsubscribe 
						System.out.println("Enter your email and password");
						customer=unsubscribeUser(sc.next(),sc.next(),customerList);
						System.out.println("Remove email successful1"+customer);
						break;
					case 6://sorted
						System.out.println("sorting customer by Date of birth and last name");
						ArrayList<Customer> custlist=new ArrayList<>(customerList.values());
						Collections.sort(custlist,new CustomerDobAndNameComparator()); 
						System.out.println("customer sorted successfully");
						for (Customer c : custlist)
							System.out.println(c);
						break;
					case 7://sorted 
						System.out.println("sorted as per the email");
						TreeMap<String,Customer> sortedlist = new TreeMap<>(customerList);
						for(Customer c : sortedlist.values())
							System.out.println(c);
						break;
						
					case 0:
						System.out.println("main overs");
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
