package christmas.message;

public enum OutputMessage {
    WELCOME_MESSAGE("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다."),
    PRODUCT_INFO_MESSAGE("현재 보유하고 있는 상품입니다.\n"),
    TOTAL_AMOUNT_FORMAT("총구매액\t\t\t%d\t\t%,d\n"),
    PROMOTION_DISCOUNT_FORMAT("행사할인\t\t\t\t\t-%,d\n"),
    MEMBERSHIP_DISCOUNT_FORMAT("멤버십할인\t\t\t\t\t-%,d\n"),
    AMOUNT_FORMAT("내실돈\t\t\t\t\t%,d\n");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
