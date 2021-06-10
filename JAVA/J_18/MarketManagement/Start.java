import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start{
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Market m = new Market();
	FileReadWriteDemo frwd = new FileReadWriteDemo();
	
		
	System.out.println("-----Welcome to our Console Market Application-----");
	
	int choice, option1, option2, option3, option4;
	boolean repeat = true;
		
	while(repeat){
		System.out.println("What do you want to do?\n");
		System.out.println("	1. Employee Management");
		System.out.println("	2. Shop Management");
		System.out.println("	3. Shop Product Management");
		System.out.println("	4. Product Quantity Add-Sell");
		System.out.println("	5. Exit\n");		
		
		try{
			System.out.print("Your Choice: ");
			choice = sc.nextInt();
		}
		catch(InputMismatchException ime){
			choice = 0;
			String s = sc.next();
		}
		
		switch(choice){
				
				
			case 1:
				
			System.out.println("--------------------------------");
			System.out.println("You have choosen Employee Management");
					
			System.out.println("Choose any one Option from the followings\n");
			System.out.println("	1. Insert New Employee");
			System.out.println("	2. Remove Exsisting Employee");
			System.out.println("	3. Show All Employees");
			System.out.println("	4. Search an Employee");
			System.out.println("	5. Go Back\n");
				
			try{	
				System.out.print("Your Option: ");
				option1 = sc.nextInt();
			}	
			catch(InputMismatchException ime){
				option1 = 0;
				String s = sc.next();
			}
			
			
			switch(option1){
						
				case 1:
						
				System.out.println("########################");
				System.out.println("Insert New Employee");
				
				String empId1;
				String name1;
				double salary1;
				
				try{			
				System.out.print("Enter Employee ID: ");
				empId1 = sc.next();
				System.out.print("Enter Employee Name: ");
				name1 = sc.next();
				System.out.print("Enter Employee Salary: ");
				salary1 = sc.nextDouble();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
					break;
				}
				catch(InputMismatchException ime){
					System.out.println("Input is Invalid");
					System.out.println("Going Back......");
					salary1 = 0.00;
					String s = sc.next();
					break;
				}
				
				Employee e1 = new Employee();
				e1.setEmpId(empId1);
				e1.setName(name1);
				e1.setSalary(salary1);
					
				m.insertEmployee(e1);
							
				System.out.println("########################");
				break;
							
				case 2:
							
				System.out.println("########################");
				System.out.println("Remove an Existing Employee");
				
				String empId2;
				
				try{
					System.out.print("Enter Employee ID: ");
					empId2 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
					break;
				}	
					
				Employee e2 = m.getEmployee(empId2);
							
				if(e2 != null){
					m.removeEmployee(e2);
				}
				System.out.println("########################");
				break;
						
							
				case 3:
						
				System.out.println("########################");
				System.out.println("Show All Employees");
				m.showAllEmployees();
				System.out.println("########################");
				break;
							
				case 4:
						
				System.out.println("########################");
				System.out.println("Get An Employee");
				
				String empId3;
				
				try{			
					System.out.print("Enter Employee ID: ");
					empId3 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
					break;
				}
				
				Employee e3 = m.getEmployee(empId3);
							
				if(e3 !=null){
					System.out.println();
					System.out.println("Employee ID: "+e3.getEmpId());
					System.out.println("Employee Name: "+e3.getName());
					System.out.println("Employee Salary: "+e3.getSalary());
					System.out.println();
				}
							
				System.out.println("########################");
				break;
							
				case 5:
						
				System.out.println("########################");
				System.out.println("Going Back......");
				System.out.println("########################");
				break;
							
				default:
						
				System.out.println("########################");
				System.out.println("Invalid Option");
				System.out.println("########################");
				break;
			}
					
			System.out.println("--------------------------------");
			break;
					
			case 2:
				
			System.out.println("--------------------------------");
			System.out.println("You have choosen Customer Management");
					
			System.out.println("Choose any one Option from the followings:\n");
			System.out.println("	1. Insert New Shop");
			System.out.println("	2. Remove Exsisting Shop");
			System.out.println("	3. Show All Shops");
			System.out.println("	4. Search a Shop");
			System.out.println("	5. Go Back\n");
					
			try{	
				System.out.print("Your Option: ");
				option2 = sc.nextInt();
			}	
			catch(InputMismatchException ime){
				option2 = 0;
				String s = sc.next();
				break;
			}
					
			switch(option2){
						
				case 1:
						
				System.out.println("########################");
				System.out.println("Insert New Shop");
				
				String sid1;
				String name1;
				
				try{		
					System.out.print("Enter Shop Id: ");
					sid1 = sc.next();
					System.out.print("Enter Shop Name: ");
					name1 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
					break;
				}
				
				Shop s1 = new Shop();
				s1.setSid(sid1);
				s1.setName(name1);
						
				m.insertShop(s1);
					
				System.out.println("########################");
				break;
						
				case 2:
						
				System.out.println("########################");
				System.out.println("Remove Existing Shop");
				
				String sid2;
				
				try{	
					System.out.print("Enter Shop Id: ");
					sid2 = sc.next();
				}		
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
					break;
				}
				
				Shop s2 = m.getShop(sid2);
						
				if(s2 != null){
					m.removeShop(s2);
				}
						
				System.out.println("########################");
						
				case 3:
						
				System.out.println("########################");
				System.out.println("Show All Shop");
				m.showAllShops();
				System.out.println("########################");
				break;
							
				case 4:
						
				System.out.println("########################");
				System.out.println("Search a Shop");
				
				String sid3;
				
				try{
					System.out.print("Enter Shop Id: ");
					sid3 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
					break;
				}
							
				Shop s3 = m.getShop(sid3);
							
				if(s3 !=null){
					
					System.out.println();
					System.out.println("Customer NID: "+s3.getSid());
					System.out.println("Customer Name: "+s3.getName());
					s3.showAllProducts();
					System.out.println();
				}
							
				System.out.println("########################");
				break;
						
				case 5:
						
				System.out.println("########################");
				System.out.println("Going Back......");
				System.out.println("########################");
				break;
						
				default:
						
				System.out.println("########################");
				System.out.println("Invalid Option");
				System.out.println("########################");
				break;
			}
					
			System.out.println("--------------------------------");
			break;				
			
			case 3:
				
			System.out.println("--------------------------------");
			System.out.println("You have choosen Shop Product Management");
					
			System.out.println("Choose any one Option from the followings:\n");
			System.out.println("	1. Insert New Product");
			System.out.println("	2. Remove Existing Product");
			System.out.println("	3. Search All Product");
			System.out.println("	4. Search a Product");
			System.out.println("	5. Go Back\n");
				
			try{
				System.out.print("Your Option: ");
				option3 = sc.nextInt();
			}
			catch(InputMismatchException ime){
				option3 = 0;
				String s = sc.next();
			}
			
			switch(option3){
				
				case 1:
				
				System.out.println("########################");
				System.out.println("Insert New Product for a Shop\n");
				
				Product p = null;
				
				System.out.println("Which Type Of Product do you want to Insert?\n");
				System.out.println("	1. Local Product");
				System.out.println("	2. Imported Product");
				System.out.println("	3. Go Back");
				
				int type;
				
				try{
					System.out.print("Enter Type: ");
					type = sc.nextInt();
				}
				catch(InputMismatchException ime){
					System.out.println("Input is Invalid");
					System.out.println("Going Back......");
					type = 0;
					String s = sc.next();
					break;
				}
				
				if(type == 1){
					
					LocalProduct lp = new LocalProduct();
					String pid1 = null;
					String pName1 = null;
					int aq1 = 0;
					double p1 = 0;
					double dR1 = 0;
					
					try{
						System.out.print("Enter Procut Id: ");
						pid1 = sc.next();
						System.out.print("Enter Product Name: ");
						pName1 = sc.next();
						System.out.print("Enter Available Quantity: ");
					
						System.out.print("Enter Available Quantity: ");		
						aq1 = sc.nextInt();
						System.out.print("Enter Product Price: ");
						p1 = sc.nextDouble();
						System.out.print("Enter Discount Rate: ");
						dR1 = sc.nextDouble();
					}
					catch(NullPointerException npe){
						System.out.println("Invalid Input");
					}
					catch(InputMismatchException ime){
						System.out.println("Input is Invalid");
						System.out.println("Going Back......");
						aq1 = 0;
						p1 = 0;
						dR1 = 0;
						String s = sc.next();
						break;
					}
					
					lp.setPid(pid1);
					lp.setName(pName1);
					lp.setAvailableQuantity(aq1);
					lp.setPrice(p1);
					lp.setDiscountRate(dR1);
					
					p = lp;
				}
				
				else if(type == 2){
					
					ImportedProduct ip = new ImportedProduct();
					String pid1 = null;
					String pName1 = null;
					int aq1 = 0;
					double p1 = 0;
					String cn1 = null;
					
					try{
						System.out.print("Enter Procut Id: ");
						pid1 = sc.next();
						System.out.print("Enter Product Name: ");
						pName1 = sc.next();
						System.out.print("Enter Available Quantity: ");
						aq1 = sc.nextInt();
						System.out.print("Enter Product Price: ");
						p1 = sc.nextDouble();
						System.out.print("Enter Country Name: ");
						cn1 = sc.next();
					}
					catch(InputMismatchException ime){
						System.out.println("Input is Invalid");
						System.out.println("Going Back......");
						aq1 = 0;
						p1 = 0;
						String s = sc.next();
						break;
					}
					catch(NullPointerException npe){
						System.out.println("Invalid Input");
					}
					
					ip.setPid(pid1);
					ip.setName(pName1);
					ip.setAvailableQuantity(aq1);
					ip.setPrice(p1);
					ip.setCountryName(cn1);
					
					p = ip;
				}
	
				else if(type == 3){
					System.out.println("Going Back.......");
				}
				
				else{
					System.out.println("Invalid Type");
				}
				
				String sid1 = null;
				
				if(p != null){
					try{
						System.out.print("Enter Shop Id: ");
						sid1 = sc.next();
					}
					catch(NullPointerException npe){
						System.out.println("Invalid Input");
					}
					m.getShop(sid1).insertProduct(p);
				}
				System.out.println("########################");
				break;
				
				case 2:
				
				System.out.println("########################");
				System.out.println("Remove Existing Product");
				
				String sid2 = null;
				String pid2 = null;
				
				try{
					System.out.print("Enter Shop Id: ");
					sid2 = sc.next();
					System.out.print("Enter Product Id: ");
					pid2 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
				}
				m.getShop(sid2).removeProduct(m.getShop(sid2).getProduct(pid2));
				
				System.out.println("########################");
				break;
				
				case 3: 
				
				System.out.println("########################");
				System.out.println("Show All Product of a Shop");
				
				String sid3 = null;
				
				try{
					System.out.print("Enter Shop ID: ");
					sid3 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Input");
				}
				
				m.getShop(sid3).showAllProducts();
				
				System.out.println("########################");
				break;
				
				case 4:
				
				System.out.println("########################");
				System.out.println("Search a Product\n");
				
				String sid4 = null;
				String pid4 = null;
				
				try{
					System.out.print("Enter Shop ID: ");
					sid4 = sc.next();
					System.out.print("Enter Product ID: ");
					pid4 = sc.next();
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Option");
				}
				
				Product p4 = m.getShop(sid4).getProduct(pid4);
				
				if(p4 != null){
					p4.showInfo();
				}
				System.out.println("########################");
				break;
				
				case 5:
						
				System.out.println("########################");
				System.out.println("Going Back..");
				System.out.println("########################");
				break;
							
				default:
						
				System.out.println("########################");
				System.out.println("Invalid Option");
				System.out.println("########################");
				break;
			}
			
			System.out.println("--------------------------------");
			break;
			
			case 4:
				
			System.out.println("--------------------------------");
			System.out.println("Product Quantity Add-Sell");
					
			System.out.println("Choose any one Option from the followings:\n");
			System.out.println("	1. Add Product");
			System.out.println("	2. Sell Product");
			System.out.println("	3. Show Add Sell History");
			System.out.println("	4. Go Back\n");
			
			try{		
				System.out.print("Your Option: ");
				option4 = sc.nextInt();
			}
			catch(InputMismatchException ime){
					option4 = 0;
					String s = sc.next();
			}	
			
			switch(option4){
				
				case 1:
				
				System.out.println("#########################");
				System.out.println("Add Product");
				
				String sid1 = null;
				String pid1 = null;
				int number1 = 0;
				
				try{
					System.out.print("Enter Shop ID: ");
					sid1 = sc.next();
					System.out.print("Enter Product ID: ");
					pid1 = sc.next();
					System.out.print("Enter Quantity Number for Adding: ");
					number1 = sc.nextInt();
				}
				catch(InputMismatchException ime){
					System.out.println("Input is Invalid");
					System.out.println("Going Back......");
					number1 = 0;
					String s = sc.next();
					break;
					
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Option");
				}
				
				if(number1>0){
					
					m.getShop(sid1).getProduct(pid1).addQuantity(number1);
					frwd.writeInFile(number1+"product has been adeed to the product ID "+ pid1);	
				}
				
				System.out.println("#########################");
				break;
				
				case 2:
				System.out.println("#########################");
				System.out.println("Sell Product");
				
				String sid2 = null;
				String pid2 = null;
				int number2 = 0;
				
				try{
					System.out.print("Enter Shop ID: ");
					sid2 = sc.next();
					System.out.print("Enter Product ID: ");
					pid2 = sc.next();
					System.out.print("Enter Quantity Number of Selling: ");
					number2 = sc.nextInt();
				}
				catch(InputMismatchException ime){
					System.out.println("Input is Invalid");
					System.out.println("Going Back......");
					number2 = 0;
					String s = sc.next();
					break;
				}
				catch(NullPointerException npe){
					System.out.println("Invalid Option");
				}
				
				if(number2>0 && number2<=m.getShop(sid2).getProduct(pid2).getAvailableQuantity()){
					m.getShop(sid2).getProduct(pid2).sellQuantity(number2);
					frwd.writeInFile(number2+" has been Sold from Product ID "+ pid2);
				}
				System.out.println("#########################");
				break;
				
				case 3: 
				
				System.out.println("#########################");
				System.out.println("Show Add Sell History\n");
				frwd.readFromFile();
				System.out.println("\n#########################");
				break;
							
				case 5:
						
				System.out.println("#########################");
				System.out.println("Going Back");
				System.out.println("#########################");
				break;
							
				default:
						
				System.out.println("#########################");
				System.out.println("Invalid Option");
				System.out.println("#########################");
				break;
			}

			
			System.out.println("--------------------------------");
			break;	
				
			case 5:
				
			System.out.println("--------------------------------");
			System.out.println("You have choosen to Exit");
			repeat = false;
			System.out.println("--------------------------------");
			break;
					
			default:
				
			System.out.println("--------------------------------");
			System.out.println("Invalid Choice");
			System.out.println("--------------------------------");
			break;	
				
				
			}
		}
	}			
}








