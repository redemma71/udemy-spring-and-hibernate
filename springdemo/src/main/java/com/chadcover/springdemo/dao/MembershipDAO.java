package com.chadcover.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addAccount() {
        System.out.println(getClass() + ": Doing my job by adding the membership . . . ");
    }

    public void addNumbers() {
        System.out.println(String.format("The sum is %s", String.valueOf(42)));
    }
}
