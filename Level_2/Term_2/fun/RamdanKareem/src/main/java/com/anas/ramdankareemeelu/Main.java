package com.anas.ramdankareemeelu;

import com.anas.jcolorfulconsole.ConsoleManager;
import com.anas.jcolorfulconsole.color.TextColor;
import com.anas.jcolorfulconsole.managers.DefaultConsoleManager;

public class Main {
    private static ConsoleManager consoleManager = new DefaultConsoleManager();
    private static boolean n1 = true, n2 = false;

    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        while (true) {
            printLines(14);
            printHead(i++);
            printTheBody();
            printTheBase();

            Thread.sleep(85);

            printLines(16);

            printHead(i++);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);


            printHead(i++);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);


            printHead(i++);
            printTheBody();
            printTheBase();

            System.out.println();


            Thread.sleep(85);


            printLines(16);

            printHead(i++);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);

            printHead(i);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);


            printHead(i++);
            printTheBody();
            printTheBase();

            System.out.println();


            Thread.sleep(85);

            printLines(10);

            printHead(i);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);
            printHead(i);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);


            printHead(--i);
            printTheBody();
            printTheBase();

            System.out.println();


            Thread.sleep(85);


            printLines(16);

            printHead(i++);
            printTheBody();
            printTheBase();


            Thread.sleep(85);


            printLines(16);

            printHead(i);
            printTheBody();
            printTheBase();

            System.out.println();


            Thread.sleep(150);


            printLines(16);

            printHead(i);
            printTheBody();
            printTheBase();

            Thread.sleep(150);

            System.out.println();
            System.out.println();
            i = 1;
        }

    }

    private static void printTheBody() {
        consoleManager.print("     \\........", TextColor.LIGHT_CYAN);
        consoleManager.print("EELU", TextColor.LIGHT_BLUE);
        consoleManager.println("......./", TextColor.LIGHT_CYAN);
        consoleManager.println("      \\................./", TextColor.LIGHT_CYAN);
        consoleManager.print("       \\..", TextColor.LIGHT_CYAN);
        consoleManager.print("رمضان كريم", TextColor.LIGHT_RED);
        consoleManager.println("../", TextColor.LIGHT_CYAN);

        consoleManager.print("        \\..../", TextColor.DARK_GREEN);
        consoleManager.print(n1 ? "" : "*", TextColor.DARK_MAGENTA);
        consoleManager.print("_");
        consoleManager.print(n2 ? "" : "*", TextColor.DARK_MAGENTA);
        consoleManager.println("\\..../", TextColor.DARK_GREEN);
        printlll(1);
        printlll(2);
        printlll(3);
        consoleManager.println("            \\-----/", TextColor.LIGHT_YELLOW);
        n1 = !n1;
        n2 = !n2;
    }

    private static void printlll(int n) {
        String s = switch (n) {
            case 1 -> "...";
            case 2 -> "..";
            case 3 -> ".";
            default -> throw new IllegalStateException("Unexpected value: " + n);
        };
        consoleManager.print((n == 2? " " : (n == 3 ? "  " : ""))
                + "         \\" + s, TextColor.DARK_GREEN);
        consoleManager.print("|||", TextColor.DARK_MAGENTA);
        consoleManager.println( s + "./", TextColor.DARK_GREEN);
    }

    private static void printTheBase() {
        consoleManager.println("            /.....\\", TextColor.LIGHT_GREEN);
        consoleManager.println("           /.......\\", TextColor.LIGHT_GREEN);
        consoleManager.println("          /.........\\", TextColor.LIGHT_GREEN);
        consoleManager.println("         /___________\\", TextColor.LIGHT_GREEN);
    }

    private static void printHead(int i) {
        consoleManager.println("            /.....\\", TextColor.DARK_MAGENTA);
        consoleManager.println("           /" + ((i >= 2)? ".......\\" : "       \\"), TextColor.DARK_MAGENTA);
        consoleManager.println("          /" + ((i >= 3)? ".........\\" : "         \\"), TextColor.DARK_MAGENTA);
        consoleManager.println("         /" + ((i >= 4)? "...........\\" : "           \\"), TextColor.DARK_MAGENTA);
        consoleManager.println("        /" + ((i >= 5)? ".............\\" : "             \\"), TextColor.DARK_MAGENTA);
        consoleManager.println("       /" + ((i >= 6)? "...............\\" : "               \\"), TextColor.DARK_MAGENTA);
        consoleManager.println("      /.................\\", TextColor.DARK_MAGENTA);
    }

    private static void printLines(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println();
        }
    }
}
