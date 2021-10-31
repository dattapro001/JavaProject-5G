import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class LoginSystem {
	 static Scanner scanner=new Scanner(System.in);
	 public static String input,username,password;
	
	 
	LoginSystem() throws IOException {
		 
	     File dir = new File("Details");
			dir.mkdir();                             
			String path = dir.getAbsolutePath();
			System.out.println("Folder Location ->" + path);  
			System.out.println("Folder Name ->" + dir.getName()); 
			System.out.println();

			System.out.println("Enter '1' For -> login");
 	        System.out.println("Enter '2' For -> register");
 	        System.out.println("Enter '3' For -> Exit");
 	        input = scanner.next();
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
 
     void Login ()  throws IOException {
    	
    	System.out.print("Enter your user name -> ");
         username =scanner.next();
        System.out.print("Enter your password -> ");
         password=scanner.next();
        String info=username+" "+password;
        
File file=new File("C:\\Users\\User\\eclipse-workspace\\FinalManagement\\Details\\Information.txt");//Check this Location Carefully To find the file.
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
	
    
    void Reg() throws IOException{
        System.out.print("Enter your user name -> ");
        username=scanner.next();
        System.out.print("Enter your password -> ");
        password=scanner.next();
        String info=username+" "+password;
        
   File file=new File("C:\\Users\\User\\eclipse-workspace\\FinalManagement\\Details\\Information.txt");
        FileWriter fileWriter=new FileWriter(file,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.append(info);
        bufferedWriter.newLine();        
        bufferedWriter.close();
        System.out.println("You have registered success.Login Now!");
       Login();
        
    }
    
    void Exit() {
    	
    	 System.exit(0);
    	 
    }
	}
class Semester{

    

    Scanner sc = new Scanner(System.in);
    
    Semester(){
    	
      
    System.out.println("\t\t\t\t======================================");
    System.out.println("\t\t\t\t|| Course Offer List for Summer-2021||\n\t\t\t\t||\t Program: BSC in CSE\t    ||");

    System.out.println("\t\t\t\t======================================");

     
      System.out.println(" 1. 1st Semester \n 2. 2nd Semester \n 3. 3rd Semester \n 4. 4th Semester \n 5. 5th Semester \n 6. 6th Semester \n 7. 7th Semester \n 8. 8th Semester \n 9. 9th Semester \n 10. 10th Semester \n 11. 11th Semester \n 12. 12th Semester \n");

      System.out.println("Enter your choice (1-12) =>  ");
      int choice = sc.nextInt();
      System.out.println("\n");

      switch (choice) {

      case 1:
         SM1();
        break;

      case 2:
         SM2();
        break;

      case 3:
         SM3();
        break;

      case 4:
         SM4();
        break;
      case 5:
        SM5();
        break;
      case 6:
        SM6();
        break;
      case 7:
         SM7();
        break;
      case 8:
         SM8();
        break;
      case 9:
         SM9();
        break;
      case 10:
         SM10();
        break;
      case 11:
         SM11();
        break;
      case 12:
         SM12();
        break;

      default: {
        System.out.println("Invalid,Please try again.");
      }

      }
     

    }

 


void SM1() {

    System.out.println("\t\t\t\t 1st Semester \n");

    System.out.println("Course Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("ENG-1111 \t\tEnglish Reading and Speaking        \t\t\t3 ");
    System.out.println("ART-1111 \t\tBangladesh Studies                  \t\t\t3  ");
    System.out.println("CSE-1111 \t\tIntroduction to Computers           \t\t\t2  ");
    System.out.println("CSE-1112 \t\tIntroduction to Computers Sessional \t\t\t1  ");
    System.out.println("MAT-1111 \t\tDifferential and Integral Calculus  \t\t\t3 ");
    System.out.println("CEE-2110 \t\tEngineering drawing                 \t\t\t1.5 ");
    System.out.println("\t\t\t\t\t\t                         Total:13.5 credit");

  }

  void SM2() {

    System.out.println("\t\t\t\t 2nd Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("CSE-1213 \t\tComputer Programming                 \t\t\t3 ");
    System.out.println("CSE-1214 \t\tComputer Programming Sessional       \t\t\t1  ");
    System.out.println("CSE-1215 \t\tDiscrete Mathematics                 \t\t\t3  ");
    System.out.println("ART-2213 \t\tProfessional Ethics                  \t\t\t3  ");
    System.out.println("MAT-1213 \t\tLinear Algebra & Complex Analysis    \t\t\t3 ");
    System.out.println("\t\t\t\t\t\t                          Total:13 credit");

  }

  void SM3() {

    System.out.println("\t\t\t\t 3rd Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("ENG-1311 \t\tEnglish Writing and Listening         \t\t\t3 ");
    System.out.println("ART-1311 \t\tIntroduction to Sociology             \t\t\t3  ");
    System.out.println("CSE-1315 \t\tData Structures                       \t\t\t3  ");
    System.out.println("CSE-1316 \t\tData Structures Sessional             \t\t\t1  ");
    System.out.println("MAT-1315 \t\tDifferential Equations and Fourier Analysis \t\t3 ");
    System.out.println("\t\t\t\t\t\t                          Total:13 credit");

  }

  void SM4() {

    System.out.println("\t\t\t\t 4th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("ENG-1311 \t\tEnglish Writing and Listening         \t\t\t3 ");
    System.out.println("ART-1311 \t\tIntroduction to Sociology             \t\t\t3  ");
    System.out.println("MAT-1315 \t\tDifferential Equations and Fourier Analysis \t\t3  ");
    System.out.println("CSE-2117 \t\tComputer Algorithms and Complexity    \t\t\t3 ");
    System.out.println("CSE-2118 \t\tComputer Algorithms and Complexity Sessional \t\t1 ");
    System.out.println("\t\t\t\t\t\t                          Total:13 credit");

  }

  void SM5() {

    System.out.println("\t\t\t\t 5th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("ECO-2211 \t\tPrincipals of Economics                   \t\t\t3 ");
    System.out.println("MAT-2111 \t\tCo-Ordinate Geometry and Vector Analysis  \t\t\t3 ");
    System.out.println("CSE-2213 \t\tObject Oriented Programming               \t\t\t3 ");
    System.out.println("CSE-2214 \t\tObject Oriented Programming Sessional     \t\t\t1 ");
    System.out.println("EEE-1215 \t\tElectronics                               \t\t\t3 ");
    System.out.println("EEE-1215 \t\tElectronics Sessional\t\t1 ");
    System.out.println("\t\t\t\t\t\t                          Total:14 credit");

  }

  void SM6() {

    System.out.println("\t\t\t\t 6th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("ACC-2111 \t\tPrinciples of Accounting        \t\t\t3 ");
    System.out.println("EEE-1111 \t\tElectrical Circuits I           \t\t\t3 ");
    System.out.println("EEE-1112 \t\tElectrical Circuits I Sessional \t\t\t1 ");
    System.out.println("CSE-2319 \t\tDatabase Management System      \t\t\t3 ");
    System.out.println("CSE-2320 \t\tDatabase Management System Sessional \t\t\t1 ");
    System.out.println("CSE-2321 \t\tData Communication              \t\t\t3 ");
    System.out.println("\t\t\t\t\t\t                          Total:14 credit");

  }

  void SM7() {

    System.out.println("\t\t\t\t 7th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("CSE-3117 \t\tComputer Architecture and Design     \t\t\t3 ");
    System.out.println("CSE-3227 \t\tTheory of Computation                \t\t\t3 ");
    System.out.println("CSE-3115 \t\tComputer Networks                    \t\t\t3 ");
    System.out.println("CSE-3116 \t\tComputer Networks Sessional          \t\t\t1 ");
    System.out.println("CSE-3111 \t\tNumerical Methods                    \t\t\t3 ");
    System.out.println("CSE-3112 \t\tNumerical Methods Sessional          \t\t\t1 ");
    System.out.println("\t\t\t\t\t\t                          Total:14 credit");

  }

  void SM8() {

    System.out.println("\t\t\t\t 8th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("EEE-2317 \t\tDigital Electronics                  \t\t\t3 ");
    System.out.println("EEE-2318 \t\tDigital Electronics Sessional        \t\t\t1.5 ");
    System.out.println("CSE-3211 \t\tOperating System                     \t\t\t2 ");
    System.out.println("CSE-3212 \t\tOperating System Sessional           \t\t\t1 ");
    System.out.println("ART-1111 \t\tBangladesh Studies                   \t\t\t3 ");
    System.out.println("CSE-3317 \t\tJava Programming                     \t\t\t3 ");
    System.out.println("CSE-3318 \t\tJava Programming Sessional           \t\t\t1 ");
    System.out.println("\t\t\t\t\t\t                          Total:14.5 credit");

  }

  void SM9() {

    System.out.println("\t\t\t\t 9th Semester \nCourse Code \t\t\tCourse Title                \t\t\t\tCredit \n");

    System.out.println("EEE-3211 \t\tMicroprocessor, Assembly Language and Computer Interfacing \t\t3 ");
    System.out.println("EEE-3212 \t\tMicroprocessor, Assembly Language and Computer Interfacing Sessional \t1");
    System.out.println("CSE-3315 \t\tCompiler Design and Construction                    \t\t\t3");
    System.out.println("CSE-3316 \t\tCompiler Design and Construction Sessional          \t\t\t1 ");
    System.out.println("CSE-4111 \t\tManagement Information System                       \t\t\t3 ");
    System.out.println("CSE-3300 \t\tProject-I                                           \t\t\t2 ");
    System.out.println("\t\t\t\t\t\t                                            Total:13 credit");

  }

  void SM10() {

    System.out.println("\t\t\t\t 10th Semester \nCourse Code \t\t\tCourse Title                \t\t\t\tCredit \n");
    System.out.println("CSE-3213 \t\tDigital Signal Processing                     \t\t\t3 ");
    System.out.println("CSE-3214 \t\tDigital Signal Processing Sessional           \t\t\t1");
    System.out.println("CSE-3319 \t\tSoftware Engineering and Information System Design  \t\t3");
    System.out.println("CSE-3320 \t\tSoftware Engineering and Information System Design Sessional  \t1 ");
    System.out.println("CSE-4113 \t\tComputer Graphics                             \t\t\t3 ");
    System.out.println("CSE-4114 \t\tComputer Graphics  Sessional                  \t\t\t1 ");
    System.out.println("\t\t\t\t\t\t                                            Total:12 credit");
  }

  void SM11() {

    System.out.println("\t\t\t\t 11th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");
    System.out.println("CSE-4119 \t\tArtificial Intelligence                     \t\t\t3 ");
    System.out.println("CSE-4315 \t\tComputer Security & Cryptography            \t\t\t3  ");
    System.out.println("CSE-4223 \t\tNeural Network & Fuzzy Logic                \t\t\t3  ");
    System.out.println("CSE-4800 \t\tProject / Thesis (part 1)                  \t\t\t1  ");
    System.out.println("\t\t\t\t\t\t                          Total:13 credit");

  }

  void SM12() {
    System.out.println("\t\t\t\t 12th Semester \nCourse Code \t\t\tCourse Title                \t\t\tCredit \n");

    System.out.println("CSE-4801 \t\tProject / Thesis (part 2)               \t\t\t3     ");
    System.out.println("\t\t\t\t\t\t                          Total:3 credit");

  }


 


}


 

// 2. grade 

class Grade {

String grade = "";
    int sub;
     
    double credit=0;
    double gp=0;
    double subGp=0; 
    double totalPoint=0;
    double totalCredit=0;
    double cgpa;
       
    Scanner sc = new Scanner (System.in);
        
    Grade(){
    	
    
           
          System.out.println("\n\nEnter number of Subjects:");
        sub = sc.nextInt();
      
        for(int i=1; i<=sub; i++){
     
        System.out.println("Enter Your Grade "+i+"(Capital Letter):");   
          grade = sc.next();          
        System.out.println("Enter Your Credit "+i+": ");
        credit = sc.nextDouble();
        
        

        if(grade.equals("A+"))
          gp=4.0;
        else if(grade.equals("A"))
          gp=3.75;
        else if(grade.equals("A-"))
          gp=3.50;
          else if(grade.equals("B+"))
          gp=3.25;
        else if(grade.equals("B"))
          gp=3.00;
        else if(grade.equals("B-"))
          gp=2.75;
        else if(grade.equals("C+"))
          gp=2.50;
        else if(grade.equals("C"))
          gp=2.25;
        else if(grade.equals("D"))
          gp=2.00;          
        else
          System.out.println("Invalid,try again");
        

        subGp= gp * credit;
        totalPoint =totalPoint+subGp;
        totalCredit =totalCredit+credit;

        }
        cgpa= totalPoint / totalCredit;
        
        System.out.println("Total Grade Point: " + totalPoint);
        System.out.println("Total Credit: " + totalCredit);
        System.out.printf("Your CPGA: %.2f", + cgpa);
        
        
    
    }

}

class MoreInfo{
	
	
	MoreInfo(){
		
	
	System.out.println("\n                                   Department of CSE");
	System.out.println("Batch Section  Representative 1                                      Representative 2");
	System.out.println("               Name                      Student ID   Phone Number   Name                       Student ID       Phone Number  ");
	System.out.println("42nd    -      Shuvo Sarker              1622020028   01929329721    Marsura Jehin              1622020031       01990689705   ");
	System.out.println("43rd    -      Mohammed Abdul Mohsin     1632020002   01683793358             -                    -                   -        ");
	System.out.println("44th    A      MD Nazmul Huda            1712020035   01823561991             -                    -                   -        ");
	System.out.println("44th    B      S.M.Musharaf Hussain Sadi 1712020035   01764754903    Mustak Ahmed Rashel        1712020067        01716249806  ");
	System.out.println("44th    C      MdTawsif UI Hye Chowdhury 1712020094   01775286080    Chowdhury Fabia Hayet      1712020122        01731390184  ");                                                                                          
    System.out.println("44th    D      Rafiqur Rahman            1712020176   01740789951             -                     -                 -        ");                                                                                                                                                                                                                                                  
	System.out.println("44th   E+F     Tahmid Hussain            1712020184   01688565557             -                     -                 -        " );
	System.out.println("45th    -      Md.Sahidul Islam Shaikot  1722020022   01715236701             -                     -                 -        " );
	System.out.println("46th    -      Md.Mehedi Hasan Shuhag    1732020014   01759608905    Md.Mahmudul Hasan Rahat     1732020016      01680100979 ");
	System.out.println("47th    A      Md.Kamrul Alom            1812020030   01792771413             -                     -                 -      ");
	System.out.println("47th    B      Tanim Ahmed               1812020049   01632644928    Tanvir Hussain              1812020075      01820946080  ");
	System.out.println("47th    C      A.S.M.Wasim               1812020119   01756376101    Md.Mahfujur Rahman          1812020131      01716670801  ");              
	System.out.println("47th    D      Showhan Ibn saif Anik     1812020156   01798413657    Tanzil Ebad Chowdhury       1812020179      01746545650  ");
	System.out.println("47th   E+F     kamrul Hasan Chowdhury    1812020181   0173418190     Akash Chanda Tushar         1812020192      01776774988 ");
	System.out.println("48th    -      Al Ikram Hussain          1822020019   01717925670             -                      -               -        ");
	System.out.println("49th    -      Sanzida Parbin Shorna     1832020015   01757089101    Maruf Ahmed                 1832020018      01767068737");
	System.out.println("50th    A      Raiyan Ahmed              1912020037   01791271560    Taslima Sultana Juli        1912020007      01995961841");        
	System.out.println("50th    B      Nakib Islam Chowdhury     1912020056   01307664678             -                      -                 -    ");
	System.out.println("50th    C      Naeem Ahsan Chowdhury     1912020107   01779875412             -                      -                 -     ");
	System.out.println("50th    D      Jalal Uddin Chowdhury     1912020138   01646705394    Anisha Jahan                1912020171      01746465748   ");
	System.out.println("50th    E      Tamim Iqbal Chowdhury     1912020183   01752456532             -                      -                  -    ");
	System.out.println("51st    -      Abdullah                  1922020016   01733720541             -                      -                  - ");
	System.out.println("52nd    -      MD Shahinur Rahman        1932020044   01646884879             -                      -                  -  ");
	System.out.println("53rd    A      Rafiq Ai Raiyan           2012020024   01799482872             -                      -                  -   ");
	System.out.println("53rd    B      Afia  Sultana Promi       2012020082   01789353791             -                      -                  -  ");
	System.out.println("53rd    C      Mahdi Hossain Hira        2012020106   01772757936    Tanjid Islam                2012020147      01753222156 ");
	System.out.println("53rd    D      Abu Shalehin MD.Rayat     2012020162   01625750124             -                      -                  -  ");
	System.out.println("53rd    E      Md.Akter Hosen            2012020234   01779862713             -                      -                  -    ");
	System.out.println("53rd    F      Sujoy Chandra Das         2012020269   01738980447    Touhid Hasan Badhon         2012020296      01302910575  ");
	System.out.println("53rd    G      Sajid Abdhullah           2012020308   01722100839             -                      -                  -   ");
	System.out.println("53rd    H      Sandip Chakraborty        2012020365   01720264931    Md Mijanur Rahman Chowdhury 2012020351      01772289407 ");
	System.out.println("54th    -      Ahnaf Rafid               2022020002   01680004770             -                      -                  -    ");
	System.out.println("55th    -      Mohammad Rakibul Islam    2032020002   01732133168    Asharaf Ahamed              2032020001      01749290616  ");
	System.out.println("56th    -      Aminoor Rahim             2112020027   01301954563             -                      -                  -     ");
	System.out.println("57th    A      Sadia Abu                 21220200230  01609374079    Syed Abu Raiyan Sarhad      2122020035      01768305939 ");
		
	}
}

public class FinalManagement {

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner sc = new Scanner(System.in);
	     char a; 
	 
	      System.out.println("\t\t\t Welcome to LU Management\n");
	      System.out.println("\t\t\t===========================");
	     
	      
	       
	      
	       LoginSystem ls = new LoginSystem();
	    	 
	      do {
	      System.out.println("\n\n\n\t\t\t\t Main Menu \n\n");
	     
	        
	        System.out.println("1.Course Offering \n2.Calculate Grade\n3.Add/Delete/Modify/View Information\n4.See more info  \n");
	 
	 
	        System.out.println("Enter your Choice: ");
	      int p=sc.nextInt();
	       
	        
	       switch(p){
	            
	       case 1:
	       Semester semester= new Semester();
	        break;
	        
	        case 2:
	        Grade grade = new Grade();
	         break;
	         
	        case 3:
	       // Student student = new Student();
	        break;
	         
	        case 4:
	        MoreInfo moreinfo= new MoreInfo();
	        break;
	        	
	        	
	         default:
	          {
	            System.out.println("Invalid, Please try again.");
	        }
	          

	        }System.out.println("\n\nDo you want to continue again:(y / n)=>  ");
			a = sc.next().charAt(0);
	      }while (a == 'y');
	    }
	
	
}



