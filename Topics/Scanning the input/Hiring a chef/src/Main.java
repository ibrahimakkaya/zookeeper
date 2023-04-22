import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String name = scanner.nextLine();
        String year = scanner.nextLine();
        String area = scanner.nextLine();

        System.out.println("The form for " + name + " is completed. We will contact you" +
                " if we need a chef who cooks " + area + " dishes and has " + year + " years of experience.");
    }
}