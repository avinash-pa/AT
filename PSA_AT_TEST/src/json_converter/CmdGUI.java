package json_converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CmdGUI extends Thread {

	private static void Menu() {

		Scanner menu = new Scanner(System.in);
		int menuoption = 0;

		boolean exit = true;

		while (exit == true) {
			System.out.println("");
			System.out.println("                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                    |                                |");
			System.out.println("                    |--------- *** MENU *** ---------|");
			System.out.println("                    |                                |");
			System.out.println("                    |  Select Below Options:         |");
			System.out.println("                    |                                |");
			System.out.println("                    |    1:   Create Json Payload    |");
			System.out.println("                    |                                |");
			System.out.println("                    |    2:   Create SQL Script      |");
			System.out.println("                    |                                |");
			System.out.println("                    |    3:   Create AT Script       |");
			System.out.println("                    |                                |");
			System.out.println("                    |    4:   Queue Status Check     |");
			System.out.println("                    |                                |");
			System.out.println("                    |    5:   Exit                   |");
			System.out.println("                    |                                |");
			System.out.println("                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			menuoption = menu.nextInt();

			if (menuoption == 1) {

				JSONMenu();

			} else if (menuoption == 2) {

				SQLMenu();

			} else if (menuoption == 3) {

				ATMenu();

			} else if (menuoption == 4) {

				QueueMenu();

			} else if (menuoption == 5) {

				try {
					System.out.print("       Exiting ..");
					sleep(1000);
					System.out.print("........");
					sleep(1000);
					System.out.print("........");

					exit = false;

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("                    ");
				System.out.println("                    Select Correct Options ");

				Menu();

			}

		}
	}

	private static void JSONMenu() {

		Scanner jsonmenu = new Scanner(System.in);
		int menuoption = 0;
		
		boolean exit = true;

		while (exit == true) {
			System.out.println("");
			System.out.println("                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("                    |                                |");
			System.out.println("                    |----------**JSON Menu**---------|");
			System.out.println("                    |                                |");
			System.out.println("                    |  Select Below Options:         |");
			System.out.println("                    |                                |");
			System.out.println("                    |    1:   Create Payload         |");
			System.out.println("                    |                                |");
			System.out.println("                    |    2:   Read Payload           |");
			System.out.println("                    |                                |");
			System.out.println("                    |    3:   Delete Payload         |");
			System.out.println("                    |                                |");
			System.out.println("                    |    4:   Validate Payload       |");
			System.out.println("                    |                                |");
			System.out.println("                    |    5:   Exit to Main Menu      |");
			System.out.println("                    |                                |");
			System.out.println("                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			JSONOperation jsonoperation = new JSONOperation();

			menuoption = jsonmenu.nextInt();

			if (menuoption == 1) {

				jsonoperation.JSONCreater();

			} else if (menuoption == 2) {

				jsonoperation.JSONReader();

			} else if (menuoption == 3) {

				jsonoperation.JSONDestroyer();

			} else if (menuoption == 4) {

				jsonoperation.JSONValidator();

			} else if (menuoption == 5) {

				try {
					System.out.print("........");
					sleep(1000);
					System.out.print("........");
					sleep(1000);
					System.out.print("Exiting to Menu..");
					sleep(1000);
					System.out.print("........");
					sleep(1000);
					System.out.print("........");

					exit = false;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else {
				System.out.println("                    ");
				System.out.println("                    Select Correct Options ");

				JSONMenu();

			}

		}
	
	}

	private static void SQLMenu() {

		System.out.println("B");

	}

	private static void ATMenu() {

		System.out.println("C");

	}

	private static void QueueMenu() {

		System.out.println("D");

	}

	public static void main(String[] args) {

		Menu();

	}

}
