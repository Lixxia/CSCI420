public class Decl {
    private Expr e;
    private TypeDen type;
    private String ident;
    
    public Decl(String ident, TypeDen type, Expr e)
    {
        this.ident = ident;
        this.type = type;
        this.e = e;
    }

    public Decl(String ident, TypeDen type)
    {
        this.ident = ident;
        this.type = type;
    }
    
    
    public String toXML() {
        String result = "<Declaration>\n";
        if (e != null) {
            result += "<var>\n";
            result += ident;
            result += type.toXML();
            result += "</var>\n";
            result += "<expression>\n";
            result += e.toXML();
            result += "</expression>\n";
        }
        else {
            result += "<var>\n";
            result += ident;
            result += "</var>\n";
        }
        result += "</Declaration>\n";
        return result;
    }
}
