package searching;
import java.util.Scanner;

public class searching_sequential {
    public static void main(String[] args){
        System.out.println("\t" + "***** SEQUENTIAL SEARCH *****" +"\n");
        String data[] = {"Galileo", "Archimedes", "AlKhawarizmi", "Aljabar", "Hanif", "Tesla"};
        String key;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        key = input.nextLine();
        
        System.out.print("Isi Data Adalah ; ");
          for (int i = 0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
       System.out.println("");
       System.out.println("");
       for (int i = 0; i<data.length; i++){
           if (key.equalsIgnoreCase(data[i])){
               System.out.println("Data " + key + "barada di indeks ke : "+i);
           break;
       }
       }
    System.out.println("\n");
    System.out.println("Hanif Bachtiar Martin");
    }
}
        

