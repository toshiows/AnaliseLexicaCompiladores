grammar AphonsoJava;

/*----------------------------------------------PALAVRAS RESERVADAS -------------------------------------*/
ABSTRACT      : 'abstract';
ASSERT        : 'assert';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';
STRING	:	'string';

/* --------------------------------OPERADORES--------------------------------------------*/
PARENTESEESQ          : '(';
PARENTESEDIR          : ')';
CHAVEESQ              : '{';
CHAVEDIR              : '}';
COLCHETEESQ           : '[';
COLCHETEDIR           : ']';
PONTOVIRGULA          : ';';
VIRGULA               : ',';
PONTO                 : '.';

IGUAL           : '=';
MAIOR           : '>';
MENOR           : '<';
EXCLAMACAO      : '!';
TIL             : '~';
INTERROGACAO    : '?';
DOISPONTOS      : ':';
DOISIGUAIS      : '==';
MENORIGUAL      : '<=';
MAIORIGUAL      : '>=';
DIFERENTE       : '!=';
E               : '&&';
OU              : '||';
INCREMENTO      : '++';
DECREMENTO      : '--';
ADICAO          : '+';
SUBTRACAO       : '-';
MULTIPLICACAO   : '*';
DIVISAO         : '/';
ECOMERCIAL      : '&';
BITOR           : '|';
CHAPEU          : '^';
MOD             : '%';
ASPAS		: '"';	

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
/*-----------------------------------------IGNORAR QUEBRA DE LINHA, ESPACOS E COMENTARIOS-----------------------------------------------------*/

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ; // pula espacos, tab, linhas
    
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

/*-----------------------------------------------------TIPOS DE DADOS E DECLARACOES--------------------------------------------------------------*/
ID  :	 ('a'..'z'|'A'..'Z'|'0'..'9'|'_')+;
INTEIRO :  ('0'..'9'+ | '-' '0'..'9'+);
STR : '"'ID'"';
DOUB : ('0'..'9')+ '.'('0'..'9') + | '-'('0'..'9')+ '.'('0'..'9') +;
LONGG : ('0'..'9')+ 'L' | '-'('0'..'9')+ 'L';
FLUT : ('0'..'9')+ '.'('0'..'9') + 'f' | '-'('0'..'9')+ '.'('0'..'9') + 'f';

declaraVar
    :   BOOLEAN ID '=' ('true' | 'false')? ';'
    |   CHAR ID ('=' ID)? ';'
    |   INT ID ('=' ID)? ';'
    |   STRING ID ('=' STR)? ';'
    |   DOUBLE ID ('=' DOUB)? ';'
    |	INT ID'['']' '=' 'new' 'int' '['ID']' ';' //ARRAY
    |	LONG ID ('=' LONGG)? ';'
    |	FLOAT ID ('=' FLUT)? ';'
    ;	

/*--------------------------------------------OPERADORES E EXPRESSOES--------------------------------------------------------------------*/
printf	: ( '%s' | '%d' | '%2.f')+ ;

operador : '%' | '+' | '-' | '*' | '/' | '>' | '<' | '<=' | '>=' | '||' | '&&' | '!=' | '==' | '++' | '--' | '**' | '=';

//atribuicaoInt :	ID '=' INTEIRO ';' | ID '+' INTEIRO ';' | ID '-' INTEIRO ';' | ID;	//Atribuicoes a variaveis

expr	:	INT | ID | CHAR | STRING | DOUBLE | BOOLEAN | LONG | FLOAT;

expressao
	:	ID MAIOR ID
	|	ID DOISIGUAIS ID
	|	ID MENORIGUAL ID
	|	ID MAIORIGUAL ID
	|	ID DIFERENTE ID
	|	ID E ID
	|	ID OU ID
	;

atribuicao 
	:	ID IGUAL ID PONTOVIRGULA
	|	ID IGUAL ID operador ID PONTOVIRGULA
	|	ID INCREMENTO PONTOVIRGULA
	|	ID DECREMENTO PONTOVIRGULA
	;	

/*---------------------------------------ESTRUTURAS DE CONTROLE-----------------------------------------------*/
estruturaControle
	:	 'if' '(' expressao ')' '{' estruturaControle+ '}' 'else' '{' estruturaControle+ '}'/*IF...ELSE*/ |
	
		 'System''.''out''.''println' '(' STR ')' ';'   /*PRINT*/  |
		 
		 'System''.''out''.''print' '(' STR ')' ';' |
		 
		 'System''.''out''.''printf' '(' '"'printf'"' (',' ID)+ ')' ';' | 
		 
		  expressao | 
		  
		 'while' '(' expressao ')' '{' estruturaControle+ '}'|
		 
		 'for' '(' 'int' ID '=' INT ';' ID operador ID ';' ID operador ')' '{' estruturaControle '}' |
		 
		 'switch' '(' ID ')' '{' ('case' ID ':' estruturaControle 'break' ';')+  '}'	    |
		 
		 declaraVar |
		 
		 atribuicao 
	;


/*------------------------------------------------CLASSE MAIN, METODOS E DECLARAR CLASSES--------------------------------------------------------------*/
tipo:	'int' '[' ']'
|	'boolean'
|	'string'	
|	'int'
|	'double'
|	'char'
|	'float'
|	'long'
|	'void'				
;

importacaotipo : 'awt' | 'swing' | 'util' | 'io' | 'text' | 'regex' | 'event';	

importacao	: IMPORT ('java' | 'javax') '.' importacaotipo '.'('event' '.' | 'regex' '.')? '*' ';';

pacote	:	'package' ID ';';

parametro :	tipo ID;

classeMain :	'public' 'static' 'void' 'main' '(''String' '['']' 'args'')' '{' (estruturaControle | criarObj)*  '}';

criarObj :	ID ID '=' 'new' ID '('')' ';' ; //CRIAR OBJETO

corpoMetodo :	declaraVar* estruturaControle* (RETURN ID ';')? ; 

metodos :	'public' tipo ID '(' parametro? ')' '{' corpoMetodo '}';

classe	:	'class' ID ('extends' ID | 'implements' ID)? ;

prog	:	pacote? importacao?  'public' classe '{' classeMain  metodos* '}' EOF ; 