public class Expr {
    private Expr left;
    private Expr right;
    private int val;
    private BinOp op;
    
    public Expr(Expr e1, Expr e2, BinOp op)
    {
        left = e1;
        right = e2;
        this.op = op;
    }
    
    public Expr(Integer value) { val = value.intValue();}
    
    public String toXML() {
        String result = "<Expression>\n";
        if (left != null) {
            result += op.toXML();
            result += "<left>\n";
            result += left.toXML();
            result += "</left>\n";
            result += "<right>\n";
            result += right.toXML();
            result += "</right>\n";
        }
        else {
            result += "<value>\n";
            result += val;
            result += "\n</value>\n";
        }
        result += "</Expression>\n";
        return result;
    }
}
