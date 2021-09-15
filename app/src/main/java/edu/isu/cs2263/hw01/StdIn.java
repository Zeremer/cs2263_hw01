package edu.isu.cs2263.hw01;

import java.util.Scanner;

public class StdIn implements Input{
        // Variables
        String exp;

        //Methods
        public void in(){
            Scanner keyed = new Scanner(System.in);
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
        }
