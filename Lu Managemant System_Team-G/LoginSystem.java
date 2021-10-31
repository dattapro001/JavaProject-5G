package Chinmoy_Datta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginSystem {
    static Scanner scanner=new Scanner(System.in);
    public static String input,username,password;
    
    public static void main(String[] args) throws IOException {
    	File dir = new File("Details");
		dir.mkdir();                             
		String path = dir.getAbsolutePath();
		System.out.println("Folder Location ->" + path);  
		System.out.println("Folder Name ->" + dir.getName()); 
		System.out.println();
        while(true){
          
        	System.out.println("Enter '1' For -> login");
 	        System.out.println("Enter '2' For -> register");
 	        System.out.println("Enter '3' For -> Exit");
            input=scanner.next();
            if(input.equals("1")){
                Login();
            }else if(input.equals("2")){
                Reg();
            }else if(input.equals("3")) {
            	Exit();
        
            }else{
          System.out.println("Opss! May be You Enter Wrong Input, Please Re-enter Carefully.");
            }
        }
    }
    
    public static void Login() throws IOException{
    	System.out.print("Enter your user name -> ");
         username =scanner.next();
        System.out.print("Enter your password -> ");
         password=scanner.next();
        String info=username+" "+password;
        
File file=new File("C:\\Users\\User\\eclipse-workspace\\LoginSystem\\Details\\Information.txt");//Check this Location Carefully To find the file.
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        boolean isTrue=false;
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            if(line.equals(info)){
                isTrue=true;
            }
        }
        if(isTrue){
            System.out.println(username+" you successfully logged in");
        }else{
            System.out.println("Your Username and Password Not Match, Please Login Again");
        }
        
    }
    public static void Reg() throws IOException{
        System.out.print("Enter your user name -> ");
        username=scanner.next();
        System.out.print("Enter your password -> ");
        password=scanner.next();
        String info=username+" "+password;
        
   File file=new File("C:\\Users\\User\\eclipse-workspace\\LoginSystem\\Details\\Information.txt");
        FileWriter fileWriter=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.append(info);
        bufferedWriter.newLine();        
        bufferedWriter.close();
        System.out.println("You have registered success.Login Now!");
    }
    public static void Exit() {
    	
    	 System.exit(0);
    	 
    }
}