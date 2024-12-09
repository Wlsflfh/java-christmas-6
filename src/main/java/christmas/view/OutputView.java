package christmas.view;

import christmas.message.OutputMessage;

public class OutputView {
    public static void showWelcomeMessage() {
        System.out.println(OutputMessage.WELCOME_MESSAGE.getMessage());
    }
}
