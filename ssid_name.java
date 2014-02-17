import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ssid_name {
	public static ArrayList nom = new ArrayList();
	public static String output;
	
	public static void makeSpam(){
		System.out.println("Please name your file");
		Scanner input2 = new Scanner(System.in);
        output = input2.next();   
        System.out.println("How many SSIDs would you like to create?");
        int ssid = input2.nextInt();
        System.out.println("What would you like your SSID name to be?");
        String name = input2.next();
        output = output+".txt";
        
        String SSID="";
        int counter =0;
        while(counter <= ssid){
        	SSID=name+counter;
        	nom.add(SSID);
        	System.out.println(SSID);
        	counter++;
        }
        input2.close();
	}

	public static void main(String[] args) throws IOException {
		makeSpam();
		FileWriter writer = new FileWriter(output); 
		for(int i=0; i<nom.size(); i++) {
		  try {
			writer.write((String)nom.get(i));
			writer.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		writer.close();
	}
}
