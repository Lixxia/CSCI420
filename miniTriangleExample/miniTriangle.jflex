/*
Defines a lexical analyzer for a subset of the language Triangle.  Triangle is a language described in the text
Programming Language Processors in Java by David Watt and Deryck Brown.

Make whitespace blocks one whitespace.

Part I: 
Add to the file miniTriangle.jflex and get it working on your machine.  
Make simple changes like adding the language for an identifier, +, - and whitespace (where multiple whitespaces are treated as one block.)  

Part II:
Create a JFlex input file that will recognize tokens in the Traingle language and will print to the console the tokens seen.  
An error should be displayed if it can not recognize a token.

Submit triangle.jflex
*/

import java_cup.runtime.*;
import java_cup.*;

%%

%class TriangleLexer
%cup
%unicode
%line
%column

operator = [+*-/<\\>=]
DIGIT = [0-9]
whitespace = [\n \t\r]+
identifier = [a-z]+[0-9]*[a-z]*
integerLiteral = {DIGIT}+
comment = \!.*[\n\r]

%%
begin { System.out.println("begin");}
const { System.out.println("const");}
do { System.out.println("do");}
else { System.out.println("else");}
end { System.out.println("end");}
if { System.out.println("if");}
in { System.out.println("in");}
let { System.out.println("let");}
then { System.out.println("then");}
var { System.out.println("var");}
while { System.out.println("while");}
; { System.out.println(";");}
: { System.out.println(":");}
\~ { System.out.println("~");}
\( { System.out.println("(");}
\) { System.out.println(")");}
:= { System.out.println(":=");}
{DIGIT} {System.out.println("Digit"); }
{operator} {System.out.println("Operator");}
{whitespace} {System.out.println("Whitespace");}
{identifier} {System.out.println("Identifier");}
{integerLiteral} {System.out.println("Integer Literal");}
{comment} {System.out.println("Comment");}
. { System.out.println("Unknown character");}