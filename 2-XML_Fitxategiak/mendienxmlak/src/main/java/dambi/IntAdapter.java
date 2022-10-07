package dambi;

import java.time.LocalDate;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;


public class IntAdapter extends XmlAdapter<String, Integer>
{


    @Override
    public Integer unmarshal( String altuera ) throws Exception
    {
        return Integer.parseInt( altuera );
    }


    @Override
    public String marshal(Integer v) throws Exception {
       
        return v.toString();
    }

}
