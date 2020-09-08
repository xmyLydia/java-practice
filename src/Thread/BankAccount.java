package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) {
//        synchronized (this) {
//            balance += amount;
//        }

//        lock.lock();
//        try {
//            balance += amount;
//        } finally {
//            lock.unlock();
//        }
        boolean status = false;
        try {
            boolean isLockAcquired = lock.tryLock(1000, TimeUnit.MILLISECONDS);

            if (isLockAcquired) {
                try {
                    balance += amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get lock");
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Status: " + status);
    }

    public void withdraw(double amount) {
//        synchronized (this) {
//            balance -= amount;
//        }
//        lock.lock();
//        try {
//            balance -= amount;
//        } finally {
//            lock.unlock();
//        }
        boolean status = false;
        try {
            boolean isLockAcquired = lock.tryLock(1000, TimeUnit.MILLISECONDS);
            if (isLockAcquired) {
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Couldn't get lock");
            }
        } catch (InterruptedException e) {

        }
        System.out.println("Status: " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number: " + accountNumber);
    }
}
