package Bridgelabz.AddressBookDay22_24;

import java.util.Scanner;

public class AddBookCollection {
	public static void main(String[] args) {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int choice;
		CreateAddBook detail = new CreateAddBook();
		do {
			System.out.println("Enter the choice : ");
			System.out.println("1.Add contact ");
			System.out.println("2.Display contact");
			System.out.println("3.Edit contact");
			System.out.println("4.Delete contact");
			System.out.println("5.Search by State");
			System.out.println("6.Search by City");
			System.out.println("7.View by State");
			System.out.println("8.View by City");
			ch= sc.nextInt();
			String state;
			String city;
			switch(ch) {
			case 1: 
				detail.readData();
				break;
			case 2:
				detail.DisplayContacts();
				break;
			case 3:
				System.out.println("\nEnter First Name you want to edit:- ");
				String name = sc.next();
				detail.editData(name);;
				break;
			case 4:
				detail.deleteData();
				break;
			case 5:
				System.out.println("\nEnter the state name to display details :- ");
				state = sc.next();
				detail.searchPersonByState(state);
				break;
			case 6:
				System.out.println("\nEnter the city name to display details :- ");
				city = sc.next();
				detail.searchPersonByCity(city);
				break;
			case 7:
				System.out.println("\nEnter the state name :- ");
				state = sc.next();
				detail.viewPersonByState(state);;
				break;
			case 8:
				System.out.println("\nEnter the city name :- ");
				city = sc.next();
				detail.viewPersonByCity(city);;
				break;
			}System.out.println("Do you want to continue? if yes press 1");
			choice = sc.nextInt();
		}while(choice == 1);
		sc.close();
	}
}
