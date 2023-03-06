package view;

public class StudentView {
    public static void displayMainWindow() {
        createHeader("What do you want to do?");
        BankUtil.createOrderedList(new String[]{
                "Update name", "Update surname", "Exit"
        });
    }

    public static String takeOption() {
        BankUtil.showTakeFunctionNumber();
        return BankUtil.scanner.nextLine();
    }

    public static void createHeader(String paragraph) {
        int width = 200;
        int part = ((width / 2) - (paragraph.length() / 2));
        String rightSide = "<".repeat(part);
        String leftSide = ">".repeat(part);
        String spaceArea = " ".repeat(3);
        System.out.println(rightSide + spaceArea + paragraph + spaceArea + leftSide);
    }
}
