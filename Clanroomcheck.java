package Clansystem;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class Clanroomcheck {



public static boolean checkchan(String clanname) {
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("./Clansystem/clanroom.txt"));
			String data = null;
			while ((data = in.readLine()) != null) {
				if (clanname.equalsIgnoreCase(data)) {
clanroom = ""+clanname;
name = true;
roomcheck();
					return true;
				}
			}
		} catch (IOException e) {
			System.out.println("Critical error while checking for data!");
			
			e.printStackTrace();
		}
roomcheck();
		return false;
	}




public static void roomcheck(){

if(name){
name = false;
	System.out.println("room found");
allowjoin = true;
		} else {
	System.out.println("room not found");
allowjoin = false;

	}	
		}


public static String clanroom;
public static boolean name;
public static boolean allowjoin;



			


}
			