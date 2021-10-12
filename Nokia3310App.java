package chapterSix;

import java.util.Scanner;

public class Nokia3310App {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        String menuPrompt = """
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminder
                11. Clock
                12. Profiles
                13. SIM services
                """;
        System.out.println(menuPrompt);
        int userResponse = collect.nextInt();
        switch (userResponse) {
            case 1:
                System.out.println(" Phone book");
                String phoneBookPrompt = """
                        1. Search book
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8.Options
                        9. Speed dial
                        10. Voice tags
                        """;
                System.out.println(phoneBookPrompt);
                int Options = collect.nextInt();
                if (Options == 8) {
                    System.out.println("Type of view");
                   System.out.println("Memory status");
                }
                int response = collect.nextInt();
                switch (response) {
                    case 2:
                        System.out.println("Message");
                        String messagePrompt = """
                                1. Write message
                                2. Inbox
                                3. Outbox
                                4. Picture message
                                5. Templates
                                6. Smileys
                                7. Message setting
                                8. Info service
                                9. Voice mailbox number
                                10. Service command editor                       
                                """;
                        System.out.println(messagePrompt);
                        int messageSetting = collect.nextInt();
                        if(messageSetting == 7)
                            System.out.println("Set");

                }
            case 3: System.out.println("Chat");

                int input = collect.nextInt();
                switch (input){
                    case 4: System.out.println("Call register");
                    String callRegisterPrompt = """
                            1. Missed calls
                            2. Received calls
                            3. Dialed numbers
                            4. Erase recent call lists
                            5. Show call duration
                            6. Show call costs
                            7. Call cost settings
                            8. Prepaid credit
                            """;
                        System.out.println(callRegisterPrompt);
                }
                int user = collect.nextInt();
                switch (user) {
                    case 5:
                        System.out.println("Tones");
                }
                break;
            case 6: System.out.println("Settings");
                break;
            case 7: System.out.println("Call divert");
                break;
            case 8: System.out.println("Games");
                break;
            case 9: System.out.println("Calculator");
                break;
            case 10: System.out.println("Reminder");
                break;
            case 11: System.out.println("Clock");
                break;
            case 12: System.out.println("Profiles");
                break;
            case 13: System.out.println("SIM services");


        }
    }
}
