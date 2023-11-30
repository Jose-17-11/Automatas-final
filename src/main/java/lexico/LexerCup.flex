package lexer;
import java_cup.runtime.Symbol.*;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    private Symbol symbol(int type, Object value){
    	return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type, Object value){
    	return new Symbol(type, yyline, yycolumn, value);
    }
%}
%%
{espacio} {/*Ignore*/}
int {return new Symbol(sym.Int, yychar, yyline, yytext());}
"Hola" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"adios" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"cuidate" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"hasta luego" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"¿como estas?" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"123-456-7890" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"12345" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"usuario@example.com" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"https://www.ejemplo.com" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"192.168.0.1" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"a+b" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"a-b" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"a*b" {return new Symbol(sym.Int, yychar, yyline, yytext());}
"a/b" {return new Symbol(sym.Int, yychar, yyline, yytext());}
{L}({L}|{D})* {return new Symbol(sym.Int, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Int, yychar, yyline, yytext());}
. {return new Symbol(sym.Int, yychar, yyline, yytext());}

