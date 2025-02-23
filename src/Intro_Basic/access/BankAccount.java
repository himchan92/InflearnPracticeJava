package Intro_Basic.access;

// 캡슐화 예제 : 은행 잔고관리
public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //입금 메소드
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    
    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다");
        }
    }

    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야한다.
        return amount > 0;
    }
}
