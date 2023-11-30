package lexer;
import static lexico.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
{espacio} {/*Ignore*/}
"Hola" {lexeme=yytext(); return Saludo;}
"adios" {lexeme=yytext(); return Despedida;}
"cuidate" {lexeme=yytext(); return Cuidado;}
"hasta luego" {lexeme=yytext(); return DespedidaLuego;}
"¿como estas?" {lexeme=yytext(); return Pregunta;}
"123-456-7890" {lexeme=yytext(); return Telefono;}
"12345" {lexeme=yytext(); return Numero;}
"usuario@example.com" {lexeme=yytext(); return Email;}
"https://www.ejemplo.com" {lexeme=yytext(); return URL;}
"192.168.0.1" {lexeme=yytext(); return IP;}
"a+b" {lexeme=yytext(); return Suma;}
"a-b" {lexeme=yytext(); return Resta;}
"a*b" {lexeme=yytext(); return Multiplicacion;}
"a/b" {lexeme=yytext(); return Division;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
. {return ERROR;}

