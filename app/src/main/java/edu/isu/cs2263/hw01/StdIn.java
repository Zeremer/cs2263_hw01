package edu.isu.cs2263.hw01;

import java.util.Scanner;


public class StdIn implements Input{
        // Variables
        String exp;
        Scanner keyed = new Scanner(System.in);


        //Methods
        public void in(){
                System.out.println("Please insert the expression you would like to compute - ");
                exp = keyed.nextLine();
            }
        public String out(){
            return exp;
        }
        public Boolean done(){
            if(exp.isEmpty()){
                return true;
            }
            else {
                return false;
            }
        }
        public void close(){
            keyed.close();
        }
        public void passIn(String pass){
            exp = pass;
        }
        }
