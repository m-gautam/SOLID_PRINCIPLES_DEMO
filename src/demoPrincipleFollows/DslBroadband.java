package demoPrincipleFollows;

// this class follows open closed principle
public class DslBroadband  extends BroadbandPlan {

    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        CostCalculation cost = new CostCalculation();
        double calculatedCost  = cost.getPlanCost(plan, 2);

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

}
