package demoViolatesPrinciple;

import demoPrincipleFollows.BroadbandPlan;
import demoPrincipleFollows.CostCalculation;
import lombok.Getter;
import lombok.Setter;

public class Broadband {

    @Getter
    @Setter
    public String speed;

    @Getter
    @Setter
    public int durationInMonths;

    public void getBroadbandCost(BroadbandPlan plan){
        CostCalculation cost = new CostCalculation();
        double calculatedCost  = cost.getPlanCost(plan, 2);

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    public void getSubscription(String BroadbandType){
        if(BroadbandType.equals("DSL")){
            System.out.println("You have opted for DSL broadband");
        }
        else if(BroadbandType.equals("CableMode")){
            System.out.println("You have opted for DSL broadband");
        }
    }
}
