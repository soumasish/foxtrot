package io.soumasish;

import java.util.Scanner;

public class TaskRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter(";\\h*\\R");
        for (;;) {
            StringBuilder builder = new StringBuilder();
            System.out.print(">");
            if (! scanner.hasNext())
                break;
            String stmt = scanner.next();
            stmt = stmt.replaceAll("(?mU:^\\s+\\R)|(?U:\\s+$)", ""); // remove blank lines and trailing spaces
            stmt = stmt.replaceAll("\\r|\\n", " ");
            if (stmt.equalsIgnoreCase("quit") || stmt.equalsIgnoreCase("exit"))
                break;
            builder.append(stmt);
            System.out.println(builder.toString());
        }
        System.out.println("Done!");
    }
}
