package lotto

enum class ErrorMessage(val message : String) {
    MONEY_ERROR("[ERROR] 금액을 1000원 이상 다시 입력해 주세요."),
    MONEY_VALID_ERROR("[ERROR] 올바른 금액을 다시 입력해주세요."),
    MONEY_DIVIDE_ERROR("[ERROR] 금액의 단위는 1000원 단위로 입력해 주세요.")
}