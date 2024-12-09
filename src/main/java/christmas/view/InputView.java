package christmas.view;

import christmas.message.InputMessage;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String readScheduleInput() {
        System.out.println(InputMessage.SCHEDULE_INPUT_MESSAGE.getMessage());
        return Console.readLine();
    }

    public static String readOrderInput() {
        System.out.println(InputMessage.ORDER_INPUT_MESSAGE.getMessage());
        return Console.readLine();
    }
}