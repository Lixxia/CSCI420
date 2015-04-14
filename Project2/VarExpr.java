public class VarExpr {
    private String ident;

    /* Identifier */
    public VarExpr(String ident)
    {
        this.ident = ident;
    }
    
    public String toXML()
    {
        String result = "<VarExpr>\n";
        result += ident;
        result += "\n</VarExpr>\n";
        return result;      
    }
}

