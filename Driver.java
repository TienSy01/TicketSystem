import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Location place;
        boolean state ;
        do{
            state = true;
            System.out.println("Nhap noi can đen: ");
            System.out.println(" 1: Ha Noi \n 2: Hai Phong \n 3: Tp Ho Chi Minh \n 4: Da Lat \n 5: Can Tho \n-1: Thoat");
            int choices = sc.nextInt();
            switch(choices) {
                case -1:
                    System.out.println("Da thoat");
                    return;
                case 1:
                    place = Location.HANOI;
                    break;
                case 2:
                    place = Location.HAIPHONG;
                    break;
                case 3:
                    place = Location.TPHCM;
                    break;
                case 4:
                    place = Location.DALAT;
                    break;
                case 5:
                    place = Location.CANTHO;
                    break;
                default:
                    place = null;
                    System.out.println("Invalid choice, please undo");
                    state = false;
            }
        } while (state == false);
        
        System.out.println("So ve nguoi lon: ");
        int aldults_quantity = sc.nextInt();
        System.out.println("So ve tre em: ");
        int kids_quantity = sc.nextInt();

        double totalPrice = TicketSystem.getPrice(place, true, aldults_quantity) + TicketSystem.getPrice(place, false, kids_quantity);
        System.out.println("Gia ve cua quy khach la: " + totalPrice + " VND");
        sc.close();

    }
    
}
