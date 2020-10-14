package demoPrincipleFollows;

// this class follows single responsibility principle
public class Subscriber {

    public BroadbandPlan getBroadbandTypeObject(String broadbandType){

        switch (broadbandType) {
            case "DSL":
                System.out.println("You have opted for DSL broadband");
                return new DslBroadband();
            case "CableModem":
                System.out.println("You have opted for Cable Modem broadband");
                return new CableModemBroadband();
            default:
                System.out.println("give valid broadband type");
                return null;
        }
    }
}
