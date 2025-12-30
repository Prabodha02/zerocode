package lk.zerocode.bank_rest_api.controller.request;

public class AccountDepositRequest {

    private Long accountNumber;
    private Double balance;

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Long getAccountNumber() {
        return accountNumber;
    }
    public Double getBalance() {
        return balance;
    }
}
