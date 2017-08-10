/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aosqlshell;

import aosqldriver.AoSQLConnector;
import java.util.Scanner;

/**
 *
 * @author amharb
 */
public class AoSQLShell {

    public static void main(String[] args) {

        AoSQLConnector conn1 = new AoSQLConnector();
        try {
            conn1.connect();
            String r = conn1.test();
            System.out.println(r);
        } catch (Exception e) {
            System.out.println(e);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            final String s = scanner.nextLine(); //will be used to input data from command line
            if (s.equals("exit")) { //if user type exit 
                System.exit(0);
            } else if (s.startsWith("test")) {
                AoSQLConnector conn = new AoSQLConnector();
                try {
                    conn.connect("asdasd");
                    String r = conn.test();
                    System.out.println(r);
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                System.out.println("unknown command");
            }
        }

    }
}
