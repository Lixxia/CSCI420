public class BinOp  {
    private String op;
    
    public BinOp(String op) {this.op = op;}
    
    public String toXML() {
        String result = "</BinOp>\n";
        result += op;
        result += "\n</BinOp>\n";
        return result;
    }

}