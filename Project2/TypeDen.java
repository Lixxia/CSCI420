public class TypeDen {
    private String ident;

    /* Identifier */
    public TypeDen(String ident)
    {
        this.ident = ident;
    }
    
    public String toXML()
    {
        String result = "<TypeDenoter>\n";
        result += ident;
        result += "</TypeDenoter>\n";
        return result;      
    }
}

