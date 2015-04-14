public class Exprs {
    private Expr left;
    private Exprs right;
    
    /* Expression , Expressions*/
    public Exprs(Expr l, Exprs r)
    {
        left = l;
        right = r;
    }
    
    /* Expression */
    public Exprs(Expr l) { 
        left = l; 
    }
    
    public String toXML()
    {
        String result = "<Expressions>\n";
        result += "<left>\n" + left.toXML() + "</left>\n";
        if (right != null) {
            result += "<right>\n";
            result += right.toXML();
            result += "</right>\n";
        }
            
        result += "</Expressions>\n";
        return result;      
    }   
    
}

