public class Command {
    private String lhs;
    private Expr rhs;
    private Expr el;
    private Expr er;
    private Commands cs;
    private Decls ds;
    private Command c;
    private Command sc;
    private VarExpr v;
    
    public Command(String l, Expr r)
    {
        lhs = l;
        rhs = r;
    }
    public Command(Expr el, Command c) {
        this.el = el;
        this.c = c;
    }
    public Command(Decls ds, Command c) {
        this.ds = ds;
        this.c = c;
    }
    public Command(Commands cs) { 
        this.cs = cs;
    }
    public Command(Command sc) {
        this.sc = sc;
    }

    public Command(VarExpr v, Expr er) {
        this.v = v;
        this.er = er;
    }
    
    public Command (String l) { 
        lhs = l; 
    }
    
    public String toXML()
    {
        String result = "<Command>\n";
        if (cs != null){ 
            result += cs.toXML();
        }
        else if (ds != null){
            result += ds.toXML();
        }
        else if (el != null) {
            result += el.toXML();
            result += "\n" + c.toXML();
        }
        else if (sc != null) {
            result += sc.toXML();
        }
        else if (v != null) {
            result += v.toXML();
            result += er.toXML();
        }
        else {
            result += "<lhs>\n" + lhs + "\n</lhs>\n";
            result += "<rhs>\n" + rhs.toXML() + "\n</rhs>\n";
        }
        result += "</Command>\n";
        return result;      
    }
}

