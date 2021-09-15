package edu.isu.cs2263.hw01;

public class Eval {
    public int eval(String str) {
        int tot = 0; // Total count
        boolean initial = true; // Is this the first run though
        int i = -1; // Start of increment
        int digit; // Number built from loops
        int op = 0; // Operation to be used
        char chr; // Character grabbed each loop
        String digi = ""; // We dont start with a character
        while (++i < str.length()) { // While there are character in the string, loop
//            System.out.println("inc"); // Test to see how many times the program loops
            chr = str.charAt(i); // Grab a character every loop
            if (chr == ' ') { // Check if blank
            } //Character was whitespace. Loop back.
            //operators
            else if (chr == '+') {
                op = 1;
            } else if (chr == '-') {
                op = 2;
            } else if (chr == '*') {
                op = 3;
            } else if (chr == '/') {
                op = 4;
            } else { // Math section
                digi += chr; // store character
                digit = Integer.parseInt(digi); // parse for a digit
                if (initial){ // first digit should be added to avoid dividing zero by a number
                    tot = digit;
                    initial = false;
                } else if (op == 1) {
                    tot = tot + digit;
                } else if (op == 2) {
                    tot = tot - digit;
                } else if (op == 3) {
                    tot = tot * digit;
                } else if (op == 4) {
                    if (tot == 0) {
                        tot = 1;
                    }
                    else{}
                    tot = tot / digit;
                } else {op = 5;} //Do nothing if no op
                digi = ""; // reset variables
                op = 0;
            }

        }
            return tot;
    }
}
