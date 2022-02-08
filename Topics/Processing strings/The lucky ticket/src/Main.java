import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int sumAsc = 0;
        int sumDesc = 0;

        for (int i = 0, j = ticket.length() - 1; i < j; i++, j--) {
            String first = String.valueOf(ticket.charAt(i));
            String last = String.valueOf(ticket.charAt(j));
            sumAsc += Integer.parseInt(first);
            sumDesc += Integer.parseInt(last);
        }

        System.out.println(sumAsc == sumDesc ? "Lucky" : "Regular");
    }
}