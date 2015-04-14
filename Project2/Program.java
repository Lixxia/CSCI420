import java.util.*;         

//program    ::= command;
public class Program {
    private Vector commands;
    
    public Program(Command c) { 
        commands = new Vector();
        commands.add(c); 
    }
    
    public String toXML() {
        String result = "<Program>\n";
        for (int i=0; i<commands.size(); i++){
            Command value = (Command)commands.get(i);
            result += value.toXML();
        }
        result += "</Program>\n";
        return result;          
    }
}

