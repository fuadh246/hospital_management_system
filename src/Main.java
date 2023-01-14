import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner scanpos;

    public static void main(String[] args) {
        ArrayList <doctor> doctors = new ArrayList<doctor>();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int $number_of_doctors$ = scan.nextInt();
        for (int i = 0; i < $number_of_doctors$; i++) {
            doctors.add(new doctor());
            Scanner scanID = new Scanner(System.in);
            System.out.print("ID -> ");
            doctors.get(i).set$ID(scanID.nextInt());
            Scanner scanname = new Scanner(System.in);
            System.out.print("NAME -> ");
            doctors.get(i).setName(scanname.nextLine());
            Scanner scanpos = new Scanner(System.in);
            System.out.print("POSITION -> ");
            doctors.get(i).setPosition(scanpos.nextLine());
            System.out.print("ROOM NUMBER -> ");
            Scanner roomscan = new Scanner(System.in);
            doctors.get(i).set$roomNumber$(roomscan.nextInt());
            System.out.print("SALERY -> ");
            Scanner sal = new Scanner(System.in);
            doctors.get(i).setSalery(sal.nextDouble());
            System.out.print("PATIENT -> ");
            Scanner pas = new Scanner(System.in);
            doctors.get(i).set$assingPatients$(pas.nextLine());
        }
        System.out.println("The size of the array is "+doctors.size());
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println(doctors.get(i));
        }
        
    }
//    public int adddoctor(ArrayList doctors, int $number_of_doctors$){
//        for (int i = 1; i <= $number_of_doctors$; i++) {
//            doctors.add(new doctor());
//            Scanner scanID = new Scanner(System.in);
//            System.out.print("ID -> ");
//            doctors.get(i).set$ID(scanID.nextInt());
//            Scanner scanname = new Scanner(System.in);
//            System.out.print("NAME -> ");
//            doctors.get(i).setName(scanname.nextLine());
//            Scanner scanpos = new Scanner(System.in);
//            System.out.print("POSITION -> ");
//            doctors.get(i).setPosition(scanpos.nextLine());
//            System.out.print("ROOM NUMBER -> ");
//            Scanner roomscan = new Scanner(System.in);
//            doctors.get(i).set$roomNumber$(roomscan.nextInt());
//            System.out.print("SALERY -> ");
//            Scanner sal = new Scanner(System.in);
//            doctors.get(i).setSalery(sal.nextDouble());
//            System.out.print("PATIENT -> ");
//            Scanner pas = new Scanner(System.in);
//            doctors.get(i).set$assingPatients$(pas.nextLine());
//        }
//        return doctors.size();
//    }
}