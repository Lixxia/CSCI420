public class Decls {
    private Decl left;
    private Decls right;
    
    /* Declaration , Declarations*/
    public Decls(Decl l, Decls r)
    {
        left = l;
        right = r;
    }
    
    /* Declaration */
    public Decls(Decl l) { 
        left = l; 
    }
    
    public String toXML()
    {
        String result = "<Declarations>\n";
        result += "<left>\n" + left.toXML() + "</left>\n";
        if (right != null) {
            result += "<right>\n";
            result += right.toXML();
            result += "</right>\n";
        }
            
        result += "</Declarations>\n";
        return result;      
    }   
    
}

