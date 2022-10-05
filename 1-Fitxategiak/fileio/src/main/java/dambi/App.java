package dambi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     * @throws IOException
     */
    public static void main( String[] args ) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("File I/O");
            System.out.println("====================================");
            System.out.println("1.- Karpeta edo fitxeroa bilatu.");
            System.out.println("2.- Karpetaren edukia bistaratu.");
            System.out.println("3.- Fixategia sortu.");
            
            System.out.println("4.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    karpetaBilatu();
                    break;
                case 2:
                    edukiaBistaratu();
                    break;
                case 3:
                    fitxategiaSortu();
                case 4:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
}

    private static void karpetaBilatu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu karpeta edo fitxategiaren path absolutoa.");

        String path = in.next();
        File fitxeroa = new File(path);

        if (fitxeroa.exists()){
            System.out.println("Fitxeroa existitxen da. ");
        }else{
            System.out.println("Fitxeroa ez da existitxen");
        }
    }

    private static void edukiaBistaratu() {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Sartu karpeta edo fitxategiaren path absolutoa.");
    String path = in.next();
    File carpeta = new File(path);
    String[] edukia = carpeta.list();
    
    if (edukia == null || edukia.length == 0) {
    System.out.println("No hay elementos dentro de la carpeta actual");
    return;
    }
    else {
        for (int i=0; i< edukia.length; i++) {
            System.out.println(edukia[i]);
        }
    }
        }

        public static void fitxategiaSortu() throws IOException{
            Scanner in = new Scanner(System.in);
        
            System.out.println("Zer zoaz deskribatzera?");   
            String karpeta= in.next();
        
            System.out.println("Zein?");   
            String fitxategia= in.next();
        
            System.out.println("Nolakoa da?");
            in.nextLine();
            String deskribapena= in.nextLine();
        
            if(karpeta.toLowerCase().equals("arrainak") || karpeta.toLowerCase().equals("ugaztunak")){
        
                File f = new File("C:\\Users\\otero.haritz\\Desktop\\DAM-2HaritzOtero\\DatuAtzipena\\DatuAtzipenaHaritzOtero22-23\\1-Fitxategiak\\fileio\\src\\main\\java\\dambi\\karpeta_berriak\\animaliak\\" + karpeta + "\\" + fitxategia + ".txt" );
                    if(f.createNewFile()){
                        BufferedWriter obj = new BufferedWriter(new FileWriter(f));
                        obj.write(deskribapena);
                        obj.close();
                        System.out.println("Fitxategia gorde da.");
                    }
        
        
        
            }
        
            if(karpeta.toLowerCase().equals("barazkiak") || karpeta.toLowerCase().equals("esnekiak")){
        
                File f = new File("C:\\Users\\otero.haritz\\Desktop\\DAM-2HaritzOtero\\DatuAtzipena\\DatuAtzipenaHaritzOtero22-23\\1-Fitxategiak\\fileio\\src\\main\\java\\dambi\\karpeta_berriak\\elikagaiak\\" + karpeta + "\\" + fitxategia + ".txt" );
                if(f.createNewFile()){
                    BufferedWriter obj = new BufferedWriter(new FileWriter(f));
                    obj.write(deskribapena);
                    obj.close();
                    System.out.println("Fitxategia gorde da.");
                }
        
        
            }

            
        
        
        }
    }
