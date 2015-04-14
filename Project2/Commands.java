/*commands   ::= command SEMI commands
            |  command; */
public class Commands {
    private Command left;
    private Commands right;
    
    public Commands(Command l, Commands r)
    {
        left = l;
        right = r;
    }
    
    public Commands(Command l) { left = l; }
    
    public String toXML()
    {
        String result = "<Commands>\n";
        result += "<left>\n" + left.toXML() + "</left>\n";
        if (right != null)
            result += right.toXML();
        result += "</Commands>\n";
        return result;      
    }   
    
}

