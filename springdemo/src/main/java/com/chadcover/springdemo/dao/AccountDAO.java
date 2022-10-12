package com.chadcover.springdemo.dao;

import com.chadcover.springdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    public void addAccount(Account theAccount, boolean isAVip) {
        System.out.println(getClass() + ": Doing my job by adding the account . . . ");
    }

    public int addNumbers(int num1, int num2) {
        System.out.println(String.format("The sum is %s",String.valueOf((num1+num2))));
        return (num1 + num2);
    }

    public int squareNumber(int num1) {
        System.out.println(String.format("The square of %s is %s",String.valueOf(num1),String.valueOf((num1*num1))));
        return num1 * num1;
    }

}
