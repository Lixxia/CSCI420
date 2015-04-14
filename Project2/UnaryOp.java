public class UnaryOp  {
    private String op;
    
    public UnaryOp(String op) {this.op = op;}
    
    public String toXML() {
        String result = "</UnaryOp>\n";
        result += op;
        result += "\n</UnaryOp>\n";
        return result;
    }

}