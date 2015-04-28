package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class RepeatUntil extends Command {

  public RepeatUntil (Expression eAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitRepeatUntil(this, o);
  }

  public Expression E;
  public Command C;
}
