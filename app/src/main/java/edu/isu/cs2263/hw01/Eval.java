package edu.isu.cs2263.hw01;

public class Eval {
    public int eval(String str) {
        int tot = 0;
        boolean initial = true;
        int i = -1;
        int digit;
        int op = 0;
        char chr;
        String digi = "";
        while (++i < str.length()) {
            System.out.println("inc");
            chr = str.charAt(i);
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
            } else {
                digi += chr;
                digit = Integer.parseInt(digi);
                if (initial){
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
                digi = "";
                op = 0;
            }

        }
            return tot;
    }
}
