package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class IfCommand extends Command {

  public IfCommand (Identifier iAST, Expression e1AST, Expression e2AST, Command cAST
                    SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E1 = eAST;
    E2 = eAST;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  public Identifier I;
  public Expression E1, E2;
  public Command C;
}
