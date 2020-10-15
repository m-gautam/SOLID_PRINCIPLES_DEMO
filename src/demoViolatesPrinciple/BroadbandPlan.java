package demoViolatesPrinciple;

import lombok.Getter;
import lombok.Setter;

// this class violates single responsibility principle
public class BroadbandPlan implements Broadband {

    @Getter
    @Setter
    public String speed;

    @Getter
    @Setter
    public int durationInMonths;

    public BroadbandPlan() { }

    public BroadbandPlan(String speed, int durationInMonths) {
        this.speed = speed;
        this.durationInMonths = durationInMonths;
    }


    void getSubscription(String BroadbandType){
        if(BroadbandType.equals("DSL")){
            System.out.println("You have opted for DSL broadband");
        }
        else if(BroadbandType.equals("CableMode")){
            System.out.println("You have opted for DSL broadband");
        }
    }

    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        double calculatedCost  = 2*plan.durationInMonths*3;

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    // this violates open closed principle
    @Override
    public void getSetTopBoxTvCost() {
        System.out.println("You have to opt out separately for this ");
        double setTopBoxCost = 700;
        System.out.println("You will be charged " + setTopBoxCost + " monthly");
    }
}
