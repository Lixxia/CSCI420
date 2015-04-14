public class PrimExpr {
    private PrimExpr expression;
    private VarExpr var;
    private Expr e;
    private int val;
    private UnaryOp op;
    
    /* UnaryOperator PrimaryExpression*/
    public PrimExpr(UnaryOp op, PrimExpr p) {
        expression = p;
        this.op = op;
    }

    /* VarExpression */
    public PrimExpr(VarExpr v) {
        this.var = var;
    }
    /* ( Expression ) */
    public PrimExpr(Expr e) {
        this.e = e;
    }

    /* Integer Literal*/
    public PrimExpr(Integer value) { 
        val = value.intValue();
    } 
    
    public String toXML() {
        String result = "<PrimExpr>\n";
        if (expression != null) {
            result += op.toXML();
            result += "<expression>\n";
            result += expression.toXML();
            result += "</expression>\n";
        }
        else if (var != null) {
            result += "<varExpression>\n";
            result += var.toXML();
            result += "</varExpression>\n";
        }
        else if (e != null) {
            result += "<expression>\n";
            result += e.toXML();
            result += "</expression>\n";
        }
        else {
            result += "<value>\n";
            result += val;
            result += "\n</value>\n";
        }
        result += "</PrimExpr>\n";
        return result;
    }
}
