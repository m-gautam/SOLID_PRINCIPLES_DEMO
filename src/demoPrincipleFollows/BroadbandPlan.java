package demoPrincipleFollows;

import lombok.Getter;
import lombok.Setter;

// this class follows single responsibility principle
// class naming best practices (used noun)
public class BroadbandPlan implements Broadband{

    @Getter
    @Setter
    public String speed;

    @Getter
    @Setter
    public int durationInMonths;

    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        CostCalculation cost = new CostCalculation();
        double calculatedCost  = cost.getPlanCost(plan, 1);

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }
}
