/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bin;

/**
 *
 * @author Abhey Gupta
 */

import conn.MyConnection;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class UserBin {

         private String fname;
         private String lname;
         private String dob;
         private int age;
         private String address1;
         private String address2;
         private String city;
         private String state;
         private String country;
         private int pcode;

         public void readData(){
             
             try(Scanner input=new Scanner(new File("Assign.csv"))){
             
                 while(input.hasNextLine()){
                     fname="";
                     String line;
                     
                     line=input.nextLine();
                     
                     //process the line
                     try(Scanner data = new Scanner(line)){
                         while(!data.hasNextInt()){
                             fname += data.next()+" ";
                         
                         }
                     
                         fname = fname.trim();
                         
                         
                         
                           
                     if(data.hasNextLine()){
                         lname = data.nextLine();
                     
                     }
                      if(data.hasNextLine()){
                         dob = data.nextLine();
                     
                     }
                       if(data.hasNextLine()){
                         age = data.nextInt();
                     
                     }
                        if(data.hasNextLine()){
                         address1 = data.nextLine();
                     
                     }
                         if(data.hasNextLine()){
                         address2 = data.nextLine();
                     
                     }
                          if(data.hasNextLine()){
                         city = data.nextLine();
                     
                     }
                           if(data.hasNextLine()){
                         state = data.nextLine();
                     
                     }
                            if(data.hasNextLine()){
                         country = data.nextLine();
                     
                     }
                             if(data.hasNextLine()){
                         pcode = data.nextInt();
                     
                     }
                         
                         
                     }
                     
                 }
         
                  //Check data 
                     System.out.println(fname+"\t"+lname+"\t"+dob+"\t"+age+"\t"+address1+"\t"+address2+"\t"+city+"\t"+state+"\t"+country+"\t"+pcode);
                     
                 
         
         
             }catch(IOException e){
                 System.out.println(e);
             }
         }
         
     
         
         
     public UserBin(String fname, String lname, String dob, int age, String address1, String address2, String city, String state, String country, int pcode) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.age = age;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pcode = pcode;
    }

    public UserBin() {
        System.out.println("Created"); //To change body of generated methods, choose Tools | Templates.
    }
         
         

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    @Override
    public String toString() {
        return "UserBin{" + "fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", age=" + age + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state + ", country=" + country + ", pcode=" + pcode + '}';
    }
      
}


  class FDemo{
        public static void main(String[] args) {
              
                UserBin ub=new UserBin();
               
                try{
                    ub.readData();
                }catch(Exception e){
                    System.out.println(e);
                }
          }
              
              
          
      
      }