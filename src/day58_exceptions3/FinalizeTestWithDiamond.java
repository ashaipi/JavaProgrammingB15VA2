package day58_exceptions3;

import day54_polymorphism.Diamond;

public class FinalizeTestWithDiamond {
    public static void main(String[] args) {
        Diamond d1 = new Diamond();
        Diamond d2 = new Diamond();
        Diamond d3 = new Diamond();

        d1 = null;
        d2 = null;
        d3 = null;

        System.gc(); // Invite/Suggest GC to do clean up

    }
}
