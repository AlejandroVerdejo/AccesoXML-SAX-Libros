package accesoxml.sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AccesoSAX {
    
    SAXParser parser;
    
    public int parsearXMLconLibrosSAXhandler(File f)
    {
        try
        {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        parser = factory.newSAXParser();
        LibrosSAXhandler sh = new LibrosSAXhandler();
        parser.parse(f, sh);
        return 0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    }
    public int parsearXMLconEtiquetasSAXhandler(File f,int obj)
    {
        try
        {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        parser = factory.newSAXParser();
        EtiquetasSAXhandler sh = new EtiquetasSAXhandler(obj);
        parser.parse(f, sh);
        return 0;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }
    }
}
