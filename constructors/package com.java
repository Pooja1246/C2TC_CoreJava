package com;
public class Amazon extends Main{
    @override
    void account() {
        system.out.println("Amazon primeaccount doesn't have delivery charge");

    }
    class nonprime extends Main{
        @override
        void account() {
            system.out.println("Non-Prime Account have the delivery charge");
        }
    }
}