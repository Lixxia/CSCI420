import java_cup.runtime.*;
import java_cup.*;

%%

%class MiniTriangleLexer
%cup
%unicode
%line
%column

%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}


/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}

LETTER = [a-zA-Z]
DIGIT = [0-9]
identifier = {LETTER}({LETTER}|{DIGIT})*
whitespace = ([\n \t\r])+
integer = ({DIGIT})+
operator = "^" | "*" | "/" | "+" | "-" | "<" | "<=" | "==" | "!=" | ">=" | ">" | "&&" | "||" | "!"
comment = !.*[\n\r]

%%
begin           { System.out.println(yytext());return newSym(mySym.BEGIN, yytext()); }
end             { System.out.println(yytext());return newSym(mySym.END, yytext());}
var             { System.out.println(yytext());return newSym(mySym.VAR, yytext());}
if              { System.out.println(yytext());return newSym(mySym.IF, yytext());}
then            { System.out.println(yytext());return newSym(mySym.THEN, yytext());}
else            { System.out.println(yytext());return newSym(mySym.ELSE, yytext());}
while           { System.out.println(yytext());return newSym(mySym.WHILE, yytext());}
do              { System.out.println(yytext());return newSym(mySym.DO, yytext());}
let             { System.out.println(yytext());return newSym(mySym.LET, yytext());}
in              { System.out.println(yytext());return newSym(mySym.IN, yytext());}
"("             { System.out.println(yytext());return newSym(mySym.LPAREN, yytext());}
")"             { System.out.println(yytext());return newSym(mySym.RPAREN, yytext());}
"+"             { System.out.println(yytext());return newSym(mySym.PLUS, yytext());}
"-"             { System.out.println(yytext());return newSym(mySym.MINUS, yytext());}
";"             { System.out.println(yytext());return newSym(mySym.SEMI, yytext());}
","             { System.out.println(yytext());return newSym(mySym.COMMA, yytext());}
"*"             { System.out.println(yytext());return newSym(mySym.TIMES, yytext());}
"^"             { System.out.println(yytext());return newSym(mySym.EXPONENT, yytext());}
"/"             { System.out.println(yytext());return newSym(mySym.DIVIDE, yytext());}
"<"             { System.out.println(yytext());return newSym(mySym.LTHEN, yytext());}
"<="             { System.out.println(yytext());return newSym(mySym.LEQUAL, yytext());}
"=="             { System.out.println(yytext());return newSym(mySym.EEQUAL, yytext());}
"!="             { System.out.println(yytext());return newSym(mySym.NEQUAL, yytext());}
">="             { System.out.println(yytext());return newSym(mySym.GEQUAL, yytext());}
">"             { System.out.println(yytext());return newSym(mySym.GTHEN, yytext());}
"&&"             { System.out.println(yytext());return newSym(mySym.AND, yytext());}
"||"             { System.out.println(yytext());return newSym(mySym.OR, yytext());}
"!"             { System.out.println(yytext());return newSym(mySym.NOT, yytext());}
":="            { System.out.println(yytext());return newSym(mySym.ASSIGN, yytext());}
"="             { System.out.println(yytext());return newSym(mySym.EQUALS, yytext());}
":"             { System.out.println(yytext());return newSym(mySym.COLON, yytext());}
{integer}       { System.out.println(yytext());return newSym(mySym.INTEGER, new Integer(yytext())); } 
{identifier}    { System.out.println(yytext());return newSym(mySym.IDENTIFIER, yytext());}
{whitespace}    { System.out.print("");}  //skip over whitespace
.               { System.out.println("Token not found.");}