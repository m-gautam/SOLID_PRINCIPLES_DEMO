package demoPrincipleFollows;

// this class follows Liskov substitution problem
public class CableModemBroadband extends BroadbandPlan {

    // function naming best practices(used verb, also small functions)
    @Override
    public void getBroadbandCost(BroadbandPlan plan) {
        CostCalculation cost = new CostCalculation();
        double calculatedCost  = cost.getPlanCost(plan, 2);

        System.out.println("Cost for plan you have selected will be " + calculatedCost);
    }

    // function naming best practices(used verb, also small functions)
    public void getSetTopBoxCost(){
        System.out.println("You have to opt out separately for this ");
        double setTopBoxCost = 700;
        System.out.println("You will be charged " + setTopBoxCost + " monthly");
    }
}
