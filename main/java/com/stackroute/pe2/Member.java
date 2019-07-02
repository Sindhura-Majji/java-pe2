package com.stackroute.pe2;

public class Member {
    String name;
    int age;
    double salary;


    public class MemberVariable {
        Member member = new Member();

        public Member setMember(String name, double salary, int age) {

            member.name = name;
            member.salary = salary;
            member.age = age;

            return member;
        }

    }
}

