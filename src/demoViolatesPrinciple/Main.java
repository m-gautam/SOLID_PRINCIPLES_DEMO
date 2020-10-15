package demoViolatesPrinciple;

public class Main {

    public static void main(String [] args){

        BroadbandPlan broadbandPlan;
//        broadbandPlan.getSubscription("DSL");
//
//        DslBroadband dslBroadband = new DslBroadband("LOW_SPEED", 4);


        broadbandPlan = new CableModemBroadband();
        broadbandPlan.setSpeed("LOW_SPEED");
        broadbandPlan.setDurationInMonths(6);

        broadbandPlan.getBroadbandCost(broadbandPlan);
        broadbandPlan.getSubscription("CableModem");

    }
}
