package dambi.pojoak;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "mendiak" )

public class Mendiak
{
    List<Mendia> mendiak;

    public List<Mendia> getMendiak()
    {
        return mendiak;
    }

    /**
     * element that is going to be marshaled in the xml
     */
    @XmlElement( name = "Mendia" )
    public void setmendiak( List<Mendia> mendiak )
    {
        this.mendiak = mendiak;
    }


    public void add( Mendia country )
    {
        if( this.mendiak == null )
        {
            this.mendiak = new ArrayList<Mendia>();
        }
        this.mendiak.add( country );

    }

    @Override
    public String toString()
    {
        StringBuffer str = new StringBuffer();
        for( Mendia museum : this.mendiak )
        {
            str.append( museum.toString() );
        }
        return str.toString();
    }

}