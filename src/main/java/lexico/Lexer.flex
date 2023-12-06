package lexico;
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
"//".* {/*Ignore*/}
"Hola" {return Saludo;}
"adios" {return Despedida;}
"cuidate" {return Cuidado;}
"hasta luego" {DespedidaLuego;}
"¿como estas?" {return Pregunta;}
"123-456-7890" {return Telefono;}
"12345" {return CP;}
"usuario@example.com" {return Email;}
"https://www.ejemplo.com" {return URL;}
"192.168.0.1" {return IP;}
"a+b" {return Suma;}
"a-b" {return Resta;}
"a*b" {return Multiplicacion;}
"a/b" {return Division;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
. {return ERROR;}

