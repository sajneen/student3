/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentlistJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        System.out.println("1. Show all student");
        System.out.println("2. Show random student");
        System.out.println("3. Show number of students");
        System.out.println("4. Add a student");
        System.out.println("5. Find a student");
         Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter option (1-5):");
        
        int option = sc.nextInt();
        
        if(option==1){
            File file = new File("student.txt");
            BufferedReader br = null;
            
            try{
                br = new BufferedReader(new FileReader(file));
            }catch(FileNotFoundException ex){
                 System.out.println("Exception : "+ex.toString());
            }
            String st;
            while((st=br.readLine())!=null){
                System.out.println(st);
            }
        }
      
    }
    
}
