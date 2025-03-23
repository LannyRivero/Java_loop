package dev.lanny.java_loop;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();

        int n = 5;
        System.out.println("Multiplication Table for " + n + ":");

        for (String row : table.generateTable(n)) {
            System.out.println(row);

        }

    }
}
