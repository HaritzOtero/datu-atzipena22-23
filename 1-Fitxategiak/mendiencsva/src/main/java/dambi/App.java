package dambi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    
    public static final String SEPARATOR=";";
    public static final String QUOTE="\"";
    public static final ArrayList <Mendiak> mendiak = new ArrayList();
    public static void main( String[] args ) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Mendien zerrenda ikusi (taula formatuan)");
            System.out.println("2.- Mendirik altuena bistaratu");
            System.out.println("3.- Mendiak esportatu");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    MendienZerrendaIkusi();
                    break;
                case 2:
                    MendirikAltuena();
                    break;
                
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
}

    public static void MendienZerrendaIkusi() throws IOException {
        BufferedReader inputStream = null;
        

        try {
            inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
            

            String l;
            boolean firstLine = true;
            while ((l = inputStream.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] attributes = l.split(";");
                
                Mendiak mendia = new Mendiak(attributes[0],Integer.parseInt(attributes[1]),attributes[2]);
                mendiak.add(mendia);

                
        
                
            }

            System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %20s %10s", "MENDIA", "ALTUERA", "PROBINTZIA");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Mendiak mendiak: mendiak){
            System.out.format("%10s %20s %10s",
                    mendiak.getIzena(), mendiak.getAltuera(), mendiak.getProbintzia());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");
            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

        }

        
       
    }

    public static void MendirikAltuena() throws IOException {
        BufferedReader inputStream = null;
        

        try {
            inputStream = new BufferedReader(new FileReader("Mendiak.csv"));
            

            String l;
            boolean firstLine = true;
            while ((l = inputStream.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] attributes = l.split(";");
                
                Mendiak mendia = new Mendiak(attributes[0],Integer.parseInt(attributes[1]),attributes[2]);
                mendiak.add(mendia);
                
            }
            
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }

        }
        int altuena = 0;
                
        for (int i = 0; i < mendiak.size(); i++) {
            if(mendiak.get(i).getAltuera() > altuena){
                 altuena = mendiak.get(i).getAltuera();
            }
        }
        
        for (int i = 0; i < mendiak.size(); i++) {
            if(mendiak.get(i).getAltuera() == altuena){
                 System.out.println("Mendirrik altuena, " + mendiak.get(i).getIzena() + " da, " + mendiak.get(i).getAltuera() + "m-kin.");
            }
        }

}}
