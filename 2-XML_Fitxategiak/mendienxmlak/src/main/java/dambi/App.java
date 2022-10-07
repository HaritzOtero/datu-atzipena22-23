package dambi;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args ) throws IOException, JAXBException
    {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Urko sortu xmlan");
            System.out.println("2.- 3 Mendi xmlan");
            System.out.println("3.- Mendiak esportatu");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    mendiBat();
                    break;
                case 2:
                    hiruMendi();
                    break;
                case 3:

                
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
    }

    public static void mendiBat() throws JAXBException{
        Mendia urko = new Mendia();

        urko.setIzena("Urko");
        urko.setAltuera(750);
        urko.setProbintzia("Gipuzkoa");

        JAXBContext jaxbContext = JAXBContext.newInstance(Mendiak.class );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
        jaxbMarshaller.marshal( urko, new File( "mendibat.xml" ) );
        jaxbMarshaller.marshal( urko, System.out );
    }

    public static void hiruMendi() throws JAXBException{
        Mendiak mendiak = new Mendiak();

        Mendia urko = new Mendia();
        Mendia karakate = new Mendia();
        Mendia oiz = new Mendia();
        
        karakate.setIzena("Karakate");
        karakate.setAltuera(749);
        karakate.setProbintzia("Gipuzkoa");

        urko.setIzena("Urko");
        urko.setAltuera(750);
        urko.setProbintzia("Gipuzkoa");

        oiz.setIzena("Oiz");
        oiz.setAltuera(1029);
        oiz.setProbintzia("Bizkaia");

        mendiak.add(oiz);
        mendiak.add(urko);
        mendiak.add(karakate);

        JAXBContext jaxbContext = JAXBContext.newInstance(Mendiak.class );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
        jaxbMarshaller.marshal( mendiak, new File( "hirumendi.xml" ) );
        jaxbMarshaller.marshal( mendiak, System.out );



    }

}
