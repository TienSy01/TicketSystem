public class TicketSystem {
    public static double getPrice(Location place, boolean isAdult, int quantity) {
        double tax = 0.3;
        double basicCharge, otherCharge;
        switch(place){
            case HANOI:
                basicCharge = 23000;
                otherCharge = 23000;
                break;
            case CANTHO:
                basicCharge = 1300000;
                otherCharge = 600000;
                break;
            case DALAT:
                basicCharge = 760000;
                otherCharge = 450000;
                break;
            case HAIPHONG:
                basicCharge = 150000;
                otherCharge = 50000;
                break;
            case TPHCM:
                basicCharge = 1000000;
                otherCharge = 540000;
                break;
            default:
                basicCharge = 0;
                otherCharge = 0;
                break;
        }
        if(!isAdult) {
            basicCharge = 0.5 * basicCharge;
            otherCharge = 0;
        }
        double price = quantity * ((basicCharge + otherCharge) * (1 + tax));
        return price;
    }
}
