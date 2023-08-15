import java.util.Scanner;

public class BankingApp{
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "\u1F3E6 Welcome to Smart Banking";
        final String CREATE_ACCOUNT = "Create New Account";
        final String DIPOSITS = "Deposits";
        final String WITHDRAWLS = "Withdrawls";
        final String TRANSFER = "Transfer";
        final String CHECK_BALANCE = "Check Account Balance";
        final String DELETE_ACCOUNT = "Delete Account";
        final String EXIT = "Exit";

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[] accountIds = new String[0];
        String[] accountNames = new String[0];
        
    }
}