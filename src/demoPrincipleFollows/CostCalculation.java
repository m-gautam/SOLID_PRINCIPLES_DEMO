package demoPrincipleFollows;

// this class follows single responsibility principle
public class CostCalculation {

    // this function accepts only two arguments, so this follows good function structure
    public double getPlanCost(BroadbandPlan plan, int BroadbandFactor){
            double cost = 0;
            switch (plan.speed) {
                case "LOW_SPEED":
                    cost =  BroadbandFactor * plan.durationInMonths * 250;
                    break;
                case "HIGH_SPEED":
                    cost = BroadbandFactor * plan.durationInMonths * 350;
                    break;
                default:
                    System.out.println("Don't support this plan");
            }
            return cost;
    }
}
