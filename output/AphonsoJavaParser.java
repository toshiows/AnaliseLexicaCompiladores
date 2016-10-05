// $ANTLR 3.5 C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g 2016-10-05 20:05:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AphonsoJavaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ADD_ASSIGN", "ADICAO", 
		"AND_ASSIGN", "ASPAS", "ASSERT", "BITOR", "BOOLEAN", "BREAK", "BYTE", 
		"CASE", "CATCH", "CHAPEU", "CHAR", "CHAVEDIR", "CHAVEESQ", "CLASS", "COLCHETEDIR", 
		"COLCHETEESQ", "COMMENT", "CONST", "CONTINUE", "DECREMENTO", "DEFAULT", 
		"DIFERENTE", "DIVISAO", "DIV_ASSIGN", "DO", "DOISIGUAIS", "DOISPONTOS", 
		"DOUB", "DOUBLE", "E", "ECOMERCIAL", "ELSE", "ENUM", "EXCLAMACAO", "EXTENDS", 
		"FINAL", "FINALLY", "FLOAT", "FLUT", "FOR", "GOTO", "ID", "IF", "IGUAL", 
		"IMPLEMENTS", "IMPORT", "INCREMENTO", "INSTANCEOF", "INT", "INTEIRO", 
		"INTERFACE", "INTERROGACAO", "LONG", "LONGG", "MAIOR", "MAIORIGUAL", "MENOR", 
		"MENORIGUAL", "MOD", "MULTIPLICACAO", "MUL_ASSIGN", "NATIVE", "NEW", "OR_ASSIGN", 
		"OU", "PACKAGE", "PARENTESEDIR", "PARENTESEESQ", "PONTO", "PONTOVIRGULA", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STR", 
		"STRICTFP", "STRING", "SUBTRACAO", "SUB_ASSIGN", "SUPER", "SWITCH", "SYNCHRONIZED", 
		"THIS", "THROW", "THROWS", "TIL", "TRANSIENT", "TRY", "VIRGULA", "VOID", 
		"VOLATILE", "WHILE", "WS", "'%2.f'", "'%d'", "'%s'", "'**'", "'String'", 
		"'System'", "'args'", "'awt'", "'event'", "'false'", "'io'", "'java'", 
		"'javax'", "'main'", "'out'", "'print'", "'printf'", "'println'", "'regex'", 
		"'swing'", "'text'", "'true'", "'util'"
	};
	public static final int EOF=-1;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int ABSTRACT=4;
	public static final int ADD_ASSIGN=5;
	public static final int ADICAO=6;
	public static final int AND_ASSIGN=7;
	public static final int ASPAS=8;
	public static final int ASSERT=9;
	public static final int BITOR=10;
	public static final int BOOLEAN=11;
	public static final int BREAK=12;
	public static final int BYTE=13;
	public static final int CASE=14;
	public static final int CATCH=15;
	public static final int CHAPEU=16;
	public static final int CHAR=17;
	public static final int CHAVEDIR=18;
	public static final int CHAVEESQ=19;
	public static final int CLASS=20;
	public static final int COLCHETEDIR=21;
	public static final int COLCHETEESQ=22;
	public static final int COMMENT=23;
	public static final int CONST=24;
	public static final int CONTINUE=25;
	public static final int DECREMENTO=26;
	public static final int DEFAULT=27;
	public static final int DIFERENTE=28;
	public static final int DIVISAO=29;
	public static final int DIV_ASSIGN=30;
	public static final int DO=31;
	public static final int DOISIGUAIS=32;
	public static final int DOISPONTOS=33;
	public static final int DOUB=34;
	public static final int DOUBLE=35;
	public static final int E=36;
	public static final int ECOMERCIAL=37;
	public static final int ELSE=38;
	public static final int ENUM=39;
	public static final int EXCLAMACAO=40;
	public static final int EXTENDS=41;
	public static final int FINAL=42;
	public static final int FINALLY=43;
	public static final int FLOAT=44;
	public static final int FLUT=45;
	public static final int FOR=46;
	public static final int GOTO=47;
	public static final int ID=48;
	public static final int IF=49;
	public static final int IGUAL=50;
	public static final int IMPLEMENTS=51;
	public static final int IMPORT=52;
	public static final int INCREMENTO=53;
	public static final int INSTANCEOF=54;
	public static final int INT=55;
	public static final int INTEIRO=56;
	public static final int INTERFACE=57;
	public static final int INTERROGACAO=58;
	public static final int LONG=59;
	public static final int LONGG=60;
	public static final int MAIOR=61;
	public static final int MAIORIGUAL=62;
	public static final int MENOR=63;
	public static final int MENORIGUAL=64;
	public static final int MOD=65;
	public static final int MULTIPLICACAO=66;
	public static final int MUL_ASSIGN=67;
	public static final int NATIVE=68;
	public static final int NEW=69;
	public static final int OR_ASSIGN=70;
	public static final int OU=71;
	public static final int PACKAGE=72;
	public static final int PARENTESEDIR=73;
	public static final int PARENTESEESQ=74;
	public static final int PONTO=75;
	public static final int PONTOVIRGULA=76;
	public static final int PRIVATE=77;
	public static final int PROTECTED=78;
	public static final int PUBLIC=79;
	public static final int RETURN=80;
	public static final int SHORT=81;
	public static final int STATIC=82;
	public static final int STR=83;
	public static final int STRICTFP=84;
	public static final int STRING=85;
	public static final int SUBTRACAO=86;
	public static final int SUB_ASSIGN=87;
	public static final int SUPER=88;
	public static final int SWITCH=89;
	public static final int SYNCHRONIZED=90;
	public static final int THIS=91;
	public static final int THROW=92;
	public static final int THROWS=93;
	public static final int TIL=94;
	public static final int TRANSIENT=95;
	public static final int TRY=96;
	public static final int VIRGULA=97;
	public static final int VOID=98;
	public static final int VOLATILE=99;
	public static final int WHILE=100;
	public static final int WS=101;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AphonsoJavaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AphonsoJavaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AphonsoJavaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g"; }



	// $ANTLR start "declaraVar"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:120:1: declaraVar : ( BOOLEAN ID '=' ( 'true' | 'false' )? ';' | CHAR ID ( '=' ID )? ';' | INT ID ( '=' ID )? ';' | STRING ID ( '=' STR )? ';' | DOUBLE ID ( '=' DOUB )? ';' | INT ID '[' ']' '=' 'new' 'int' '[' ID ']' ';' | LONG ID ( '=' LONGG )? ';' | FLOAT ID ( '=' FLUT )? ';' );
	public final void declaraVar() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:121:5: ( BOOLEAN ID '=' ( 'true' | 'false' )? ';' | CHAR ID ( '=' ID )? ';' | INT ID ( '=' ID )? ';' | STRING ID ( '=' STR )? ';' | DOUBLE ID ( '=' DOUB )? ';' | INT ID '[' ']' '=' 'new' 'int' '[' ID ']' ';' | LONG ID ( '=' LONGG )? ';' | FLOAT ID ( '=' FLUT )? ';' )
			int alt8=8;
			switch ( input.LA(1) ) {
			case BOOLEAN:
				{
				alt8=1;
				}
				break;
			case CHAR:
				{
				alt8=2;
				}
				break;
			case INT:
				{
				int LA8_3 = input.LA(2);
				if ( (LA8_3==ID) ) {
					int LA8_8 = input.LA(3);
					if ( (LA8_8==COLCHETEESQ) ) {
						alt8=6;
					}
					else if ( (LA8_8==IGUAL||LA8_8==PONTOVIRGULA) ) {
						alt8=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING:
				{
				alt8=4;
				}
				break;
			case DOUBLE:
				{
				alt8=5;
				}
				break;
			case LONG:
				{
				alt8=7;
				}
				break;
			case FLOAT:
				{
				alt8=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:121:9: BOOLEAN ID '=' ( 'true' | 'false' )? ';'
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_declaraVar1630); 
					match(input,ID,FOLLOW_ID_in_declaraVar1632); 
					match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1634); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:121:24: ( 'true' | 'false' )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==111||LA1_0==123) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:
							{
							if ( input.LA(1)==111||input.LA(1)==123 ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1645); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:122:9: CHAR ID ( '=' ID )? ';'
					{
					match(input,CHAR,FOLLOW_CHAR_in_declaraVar1655); 
					match(input,ID,FOLLOW_ID_in_declaraVar1657); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:122:17: ( '=' ID )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==IGUAL) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:122:18: '=' ID
							{
							match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1660); 
							match(input,ID,FOLLOW_ID_in_declaraVar1662); 
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1666); 
					}
					break;
				case 3 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:123:9: INT ID ( '=' ID )? ';'
					{
					match(input,INT,FOLLOW_INT_in_declaraVar1676); 
					match(input,ID,FOLLOW_ID_in_declaraVar1678); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:123:16: ( '=' ID )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==IGUAL) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:123:17: '=' ID
							{
							match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1681); 
							match(input,ID,FOLLOW_ID_in_declaraVar1683); 
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1687); 
					}
					break;
				case 4 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:124:9: STRING ID ( '=' STR )? ';'
					{
					match(input,STRING,FOLLOW_STRING_in_declaraVar1697); 
					match(input,ID,FOLLOW_ID_in_declaraVar1699); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:124:19: ( '=' STR )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IGUAL) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:124:20: '=' STR
							{
							match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1702); 
							match(input,STR,FOLLOW_STR_in_declaraVar1704); 
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1708); 
					}
					break;
				case 5 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:125:9: DOUBLE ID ( '=' DOUB )? ';'
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_declaraVar1718); 
					match(input,ID,FOLLOW_ID_in_declaraVar1720); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:125:19: ( '=' DOUB )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IGUAL) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:125:20: '=' DOUB
							{
							match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1723); 
							match(input,DOUB,FOLLOW_DOUB_in_declaraVar1725); 
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1729); 
					}
					break;
				case 6 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:126:7: INT ID '[' ']' '=' 'new' 'int' '[' ID ']' ';'
					{
					match(input,INT,FOLLOW_INT_in_declaraVar1737); 
					match(input,ID,FOLLOW_ID_in_declaraVar1739); 
					match(input,COLCHETEESQ,FOLLOW_COLCHETEESQ_in_declaraVar1740); 
					match(input,COLCHETEDIR,FOLLOW_COLCHETEDIR_in_declaraVar1741); 
					match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1743); 
					match(input,NEW,FOLLOW_NEW_in_declaraVar1745); 
					match(input,INT,FOLLOW_INT_in_declaraVar1747); 
					match(input,COLCHETEESQ,FOLLOW_COLCHETEESQ_in_declaraVar1749); 
					match(input,ID,FOLLOW_ID_in_declaraVar1750); 
					match(input,COLCHETEDIR,FOLLOW_COLCHETEDIR_in_declaraVar1751); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1753); 
					}
					break;
				case 7 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:127:7: LONG ID ( '=' LONGG )? ';'
					{
					match(input,LONG,FOLLOW_LONG_in_declaraVar1762); 
					match(input,ID,FOLLOW_ID_in_declaraVar1764); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:127:15: ( '=' LONGG )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==IGUAL) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:127:16: '=' LONGG
							{
							match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1767); 
							match(input,LONGG,FOLLOW_LONGG_in_declaraVar1769); 
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1773); 
					}
					break;
				case 8 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:128:7: FLOAT ID ( '=' FLUT )? ';'
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_declaraVar1781); 
					match(input,ID,FOLLOW_ID_in_declaraVar1783); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:128:16: ( '=' FLUT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==IGUAL) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:128:17: '=' FLUT
							{
							match(input,IGUAL,FOLLOW_IGUAL_in_declaraVar1786); 
							match(input,FLUT,FOLLOW_FLUT_in_declaraVar1788); 
							}
							break;

					}

					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_declaraVar1792); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaraVar"



	// $ANTLR start "printf"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:132:1: printf : ( '%s' | '%d' | '%2.f' )+ ;
	public final void printf() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:132:8: ( ( '%s' | '%d' | '%2.f' )+ )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:132:10: ( '%s' | '%d' | '%2.f' )+
			{
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:132:10: ( '%s' | '%d' | '%2.f' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= 102 && LA9_0 <= 104)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:
					{
					if ( (input.LA(1) >= 102 && input.LA(1) <= 104) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf"



	// $ANTLR start "operador"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:134:1: operador : ( '%' | '+' | '-' | '*' | '/' | '>' | '<' | '<=' | '>=' | '||' | '&&' | '!=' | '==' | '++' | '--' | '**' | '=' );
	public final void operador() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:134:10: ( '%' | '+' | '-' | '*' | '/' | '>' | '<' | '<=' | '>=' | '||' | '&&' | '!=' | '==' | '++' | '--' | '**' | '=' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:
			{
			if ( input.LA(1)==ADICAO||input.LA(1)==DECREMENTO||(input.LA(1) >= DIFERENTE && input.LA(1) <= DIVISAO)||input.LA(1)==DOISIGUAIS||input.LA(1)==E||input.LA(1)==IGUAL||input.LA(1)==INCREMENTO||(input.LA(1) >= MAIOR && input.LA(1) <= MULTIPLICACAO)||input.LA(1)==OU||input.LA(1)==SUBTRACAO||input.LA(1)==105 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operador"



	// $ANTLR start "expr"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:138:1: expr : ( INT | ID | CHAR | STRING | DOUBLE | BOOLEAN | LONG | FLOAT );
	public final void expr() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:138:6: ( INT | ID | CHAR | STRING | DOUBLE | BOOLEAN | LONG | FLOAT )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:
			{
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==ID||input.LA(1)==INT||input.LA(1)==LONG||input.LA(1)==STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "expressao"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:140:1: expressao : ( ID MAIOR ID | ID DOISIGUAIS ID | ID MENORIGUAL ID | ID MAIORIGUAL ID | ID DIFERENTE ID | ID E ID | ID OU ID );
	public final void expressao() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:141:2: ( ID MAIOR ID | ID DOISIGUAIS ID | ID MENORIGUAL ID | ID MAIORIGUAL ID | ID DIFERENTE ID | ID E ID | ID OU ID )
			int alt10=7;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				switch ( input.LA(2) ) {
				case MAIOR:
					{
					alt10=1;
					}
					break;
				case DOISIGUAIS:
					{
					alt10=2;
					}
					break;
				case MENORIGUAL:
					{
					alt10=3;
					}
					break;
				case MAIORIGUAL:
					{
					alt10=4;
					}
					break;
				case DIFERENTE:
					{
					alt10=5;
					}
					break;
				case E:
					{
					alt10=6;
					}
					break;
				case OU:
					{
					alt10=7;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:141:4: ID MAIOR ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1940); 
					match(input,MAIOR,FOLLOW_MAIOR_in_expressao1942); 
					match(input,ID,FOLLOW_ID_in_expressao1944); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:142:4: ID DOISIGUAIS ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1949); 
					match(input,DOISIGUAIS,FOLLOW_DOISIGUAIS_in_expressao1951); 
					match(input,ID,FOLLOW_ID_in_expressao1953); 
					}
					break;
				case 3 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:143:4: ID MENORIGUAL ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1958); 
					match(input,MENORIGUAL,FOLLOW_MENORIGUAL_in_expressao1960); 
					match(input,ID,FOLLOW_ID_in_expressao1962); 
					}
					break;
				case 4 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:144:4: ID MAIORIGUAL ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1967); 
					match(input,MAIORIGUAL,FOLLOW_MAIORIGUAL_in_expressao1969); 
					match(input,ID,FOLLOW_ID_in_expressao1971); 
					}
					break;
				case 5 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:145:4: ID DIFERENTE ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1976); 
					match(input,DIFERENTE,FOLLOW_DIFERENTE_in_expressao1978); 
					match(input,ID,FOLLOW_ID_in_expressao1980); 
					}
					break;
				case 6 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:146:4: ID E ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1985); 
					match(input,E,FOLLOW_E_in_expressao1987); 
					match(input,ID,FOLLOW_ID_in_expressao1989); 
					}
					break;
				case 7 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:147:4: ID OU ID
					{
					match(input,ID,FOLLOW_ID_in_expressao1994); 
					match(input,OU,FOLLOW_OU_in_expressao1996); 
					match(input,ID,FOLLOW_ID_in_expressao1998); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expressao"



	// $ANTLR start "atribuicao"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:150:1: atribuicao : ( ID IGUAL ID PONTOVIRGULA | ID IGUAL ID operador ID PONTOVIRGULA | ID INCREMENTO PONTOVIRGULA | ID DECREMENTO PONTOVIRGULA );
	public final void atribuicao() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:151:2: ( ID IGUAL ID PONTOVIRGULA | ID IGUAL ID operador ID PONTOVIRGULA | ID INCREMENTO PONTOVIRGULA | ID DECREMENTO PONTOVIRGULA )
			int alt11=4;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				switch ( input.LA(2) ) {
				case IGUAL:
					{
					int LA11_2 = input.LA(3);
					if ( (LA11_2==ID) ) {
						int LA11_5 = input.LA(4);
						if ( (LA11_5==PONTOVIRGULA) ) {
							alt11=1;
						}
						else if ( (LA11_5==ADICAO||LA11_5==DECREMENTO||(LA11_5 >= DIFERENTE && LA11_5 <= DIVISAO)||LA11_5==DOISIGUAIS||LA11_5==E||LA11_5==IGUAL||LA11_5==INCREMENTO||(LA11_5 >= MAIOR && LA11_5 <= MULTIPLICACAO)||LA11_5==OU||LA11_5==SUBTRACAO||LA11_5==105) ) {
							alt11=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case INCREMENTO:
					{
					alt11=3;
					}
					break;
				case DECREMENTO:
					{
					alt11=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:151:4: ID IGUAL ID PONTOVIRGULA
					{
					match(input,ID,FOLLOW_ID_in_atribuicao2010); 
					match(input,IGUAL,FOLLOW_IGUAL_in_atribuicao2012); 
					match(input,ID,FOLLOW_ID_in_atribuicao2014); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_atribuicao2016); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:152:4: ID IGUAL ID operador ID PONTOVIRGULA
					{
					match(input,ID,FOLLOW_ID_in_atribuicao2021); 
					match(input,IGUAL,FOLLOW_IGUAL_in_atribuicao2023); 
					match(input,ID,FOLLOW_ID_in_atribuicao2025); 
					pushFollow(FOLLOW_operador_in_atribuicao2027);
					operador();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_atribuicao2029); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_atribuicao2031); 
					}
					break;
				case 3 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:153:4: ID INCREMENTO PONTOVIRGULA
					{
					match(input,ID,FOLLOW_ID_in_atribuicao2036); 
					match(input,INCREMENTO,FOLLOW_INCREMENTO_in_atribuicao2038); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_atribuicao2040); 
					}
					break;
				case 4 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:154:4: ID DECREMENTO PONTOVIRGULA
					{
					match(input,ID,FOLLOW_ID_in_atribuicao2045); 
					match(input,DECREMENTO,FOLLOW_DECREMENTO_in_atribuicao2047); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_atribuicao2049); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atribuicao"



	// $ANTLR start "estruturaControle"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:158:1: estruturaControle : ( 'if' '(' expressao ')' '{' ( estruturaControle )+ '}' 'else' '{' ( estruturaControle )+ '}' | 'System' '.' 'out' '.' 'println' '(' STR ')' ';' | 'System' '.' 'out' '.' 'print' '(' STR ')' ';' | 'System' '.' 'out' '.' 'printf' '(' '\"' printf '\"' ( ',' ID )+ ')' ';' | expressao | 'while' '(' expressao ')' '{' ( estruturaControle )+ '}' | 'for' '(' 'int' ID '=' INT ';' ID operador ID ';' ID operador ')' '{' estruturaControle '}' | 'switch' '(' ID ')' '{' ( 'case' ID ':' estruturaControle 'break' ';' )+ '}' | declaraVar | atribuicao );
	public final void estruturaControle() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:159:2: ( 'if' '(' expressao ')' '{' ( estruturaControle )+ '}' 'else' '{' ( estruturaControle )+ '}' | 'System' '.' 'out' '.' 'println' '(' STR ')' ';' | 'System' '.' 'out' '.' 'print' '(' STR ')' ';' | 'System' '.' 'out' '.' 'printf' '(' '\"' printf '\"' ( ',' ID )+ ')' ';' | expressao | 'while' '(' expressao ')' '{' ( estruturaControle )+ '}' | 'for' '(' 'int' ID '=' INT ';' ID operador ID ';' ID operador ')' '{' estruturaControle '}' | 'switch' '(' ID ')' '{' ( 'case' ID ':' estruturaControle 'break' ';' )+ '}' | declaraVar | atribuicao )
			int alt17=10;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt17=1;
				}
				break;
			case 107:
				{
				int LA17_2 = input.LA(2);
				if ( (LA17_2==PONTO) ) {
					int LA17_8 = input.LA(3);
					if ( (LA17_8==116) ) {
						int LA17_11 = input.LA(4);
						if ( (LA17_11==PONTO) ) {
							switch ( input.LA(5) ) {
							case 119:
								{
								alt17=2;
								}
								break;
							case 117:
								{
								alt17=3;
								}
								break;
							case 118:
								{
								alt17=4;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 17, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ID:
				{
				int LA17_3 = input.LA(2);
				if ( (LA17_3==DIFERENTE||LA17_3==DOISIGUAIS||LA17_3==E||(LA17_3 >= MAIOR && LA17_3 <= MAIORIGUAL)||LA17_3==MENORIGUAL||LA17_3==OU) ) {
					alt17=5;
				}
				else if ( (LA17_3==DECREMENTO||LA17_3==IGUAL||LA17_3==INCREMENTO) ) {
					alt17=10;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt17=6;
				}
				break;
			case FOR:
				{
				alt17=7;
				}
				break;
			case SWITCH:
				{
				alt17=8;
				}
				break;
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case STRING:
				{
				alt17=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:159:5: 'if' '(' expressao ')' '{' ( estruturaControle )+ '}' 'else' '{' ( estruturaControle )+ '}'
					{
					match(input,IF,FOLLOW_IF_in_estruturaControle2064); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2066); 
					pushFollow(FOLLOW_expressao_in_estruturaControle2068);
					expressao();
					state._fsp--;

					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2070); 
					match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_estruturaControle2072); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:159:32: ( estruturaControle )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==BOOLEAN||LA12_0==CHAR||LA12_0==DOUBLE||LA12_0==FLOAT||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= IF)||LA12_0==INT||LA12_0==LONG||LA12_0==STRING||LA12_0==SWITCH||LA12_0==WHILE||LA12_0==107) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:159:32: estruturaControle
							{
							pushFollow(FOLLOW_estruturaControle_in_estruturaControle2074);
							estruturaControle();
							state._fsp--;

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_estruturaControle2077); 
					match(input,ELSE,FOLLOW_ELSE_in_estruturaControle2079); 
					match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_estruturaControle2081); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:159:66: ( estruturaControle )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==BOOLEAN||LA13_0==CHAR||LA13_0==DOUBLE||LA13_0==FLOAT||LA13_0==FOR||(LA13_0 >= ID && LA13_0 <= IF)||LA13_0==INT||LA13_0==LONG||LA13_0==STRING||LA13_0==SWITCH||LA13_0==WHILE||LA13_0==107) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:159:66: estruturaControle
							{
							pushFollow(FOLLOW_estruturaControle_in_estruturaControle2083);
							estruturaControle();
							state._fsp--;

							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_estruturaControle2086); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:161:4: 'System' '.' 'out' '.' 'println' '(' STR ')' ';'
					{
					match(input,107,FOLLOW_107_in_estruturaControle2096); 
					match(input,PONTO,FOLLOW_PONTO_in_estruturaControle2097); 
					match(input,116,FOLLOW_116_in_estruturaControle2098); 
					match(input,PONTO,FOLLOW_PONTO_in_estruturaControle2099); 
					match(input,119,FOLLOW_119_in_estruturaControle2100); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2102); 
					match(input,STR,FOLLOW_STR_in_estruturaControle2104); 
					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2106); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_estruturaControle2108); 
					}
					break;
				case 3 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:163:4: 'System' '.' 'out' '.' 'print' '(' STR ')' ';'
					{
					match(input,107,FOLLOW_107_in_estruturaControle2124); 
					match(input,PONTO,FOLLOW_PONTO_in_estruturaControle2125); 
					match(input,116,FOLLOW_116_in_estruturaControle2126); 
					match(input,PONTO,FOLLOW_PONTO_in_estruturaControle2127); 
					match(input,117,FOLLOW_117_in_estruturaControle2128); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2130); 
					match(input,STR,FOLLOW_STR_in_estruturaControle2132); 
					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2134); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_estruturaControle2136); 
					}
					break;
				case 4 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:165:4: 'System' '.' 'out' '.' 'printf' '(' '\"' printf '\"' ( ',' ID )+ ')' ';'
					{
					match(input,107,FOLLOW_107_in_estruturaControle2147); 
					match(input,PONTO,FOLLOW_PONTO_in_estruturaControle2148); 
					match(input,116,FOLLOW_116_in_estruturaControle2149); 
					match(input,PONTO,FOLLOW_PONTO_in_estruturaControle2150); 
					match(input,118,FOLLOW_118_in_estruturaControle2151); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2153); 
					match(input,ASPAS,FOLLOW_ASPAS_in_estruturaControle2155); 
					pushFollow(FOLLOW_printf_in_estruturaControle2156);
					printf();
					state._fsp--;

					match(input,ASPAS,FOLLOW_ASPAS_in_estruturaControle2157); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:165:49: ( ',' ID )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==VIRGULA) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:165:50: ',' ID
							{
							match(input,VIRGULA,FOLLOW_VIRGULA_in_estruturaControle2160); 
							match(input,ID,FOLLOW_ID_in_estruturaControle2162); 
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2166); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_estruturaControle2168); 
					}
					break;
				case 5 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:167:5: expressao
					{
					pushFollow(FOLLOW_expressao_in_estruturaControle2181);
					expressao();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:169:4: 'while' '(' expressao ')' '{' ( estruturaControle )+ '}'
					{
					match(input,WHILE,FOLLOW_WHILE_in_estruturaControle2194); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2196); 
					pushFollow(FOLLOW_expressao_in_estruturaControle2198);
					expressao();
					state._fsp--;

					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2200); 
					match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_estruturaControle2202); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:169:34: ( estruturaControle )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==BOOLEAN||LA15_0==CHAR||LA15_0==DOUBLE||LA15_0==FLOAT||LA15_0==FOR||(LA15_0 >= ID && LA15_0 <= IF)||LA15_0==INT||LA15_0==LONG||LA15_0==STRING||LA15_0==SWITCH||LA15_0==WHILE||LA15_0==107) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:169:34: estruturaControle
							{
							pushFollow(FOLLOW_estruturaControle_in_estruturaControle2204);
							estruturaControle();
							state._fsp--;

							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_estruturaControle2207); 
					}
					break;
				case 7 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:171:4: 'for' '(' 'int' ID '=' INT ';' ID operador ID ';' ID operador ')' '{' estruturaControle '}'
					{
					match(input,FOR,FOLLOW_FOR_in_estruturaControle2217); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2219); 
					match(input,INT,FOLLOW_INT_in_estruturaControle2221); 
					match(input,ID,FOLLOW_ID_in_estruturaControle2223); 
					match(input,IGUAL,FOLLOW_IGUAL_in_estruturaControle2225); 
					match(input,INT,FOLLOW_INT_in_estruturaControle2227); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_estruturaControle2229); 
					match(input,ID,FOLLOW_ID_in_estruturaControle2231); 
					pushFollow(FOLLOW_operador_in_estruturaControle2233);
					operador();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_estruturaControle2235); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_estruturaControle2237); 
					match(input,ID,FOLLOW_ID_in_estruturaControle2239); 
					pushFollow(FOLLOW_operador_in_estruturaControle2241);
					operador();
					state._fsp--;

					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2243); 
					match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_estruturaControle2245); 
					pushFollow(FOLLOW_estruturaControle_in_estruturaControle2247);
					estruturaControle();
					state._fsp--;

					match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_estruturaControle2249); 
					}
					break;
				case 8 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:173:4: 'switch' '(' ID ')' '{' ( 'case' ID ':' estruturaControle 'break' ';' )+ '}'
					{
					match(input,SWITCH,FOLLOW_SWITCH_in_estruturaControle2260); 
					match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_estruturaControle2262); 
					match(input,ID,FOLLOW_ID_in_estruturaControle2264); 
					match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_estruturaControle2266); 
					match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_estruturaControle2268); 
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:173:28: ( 'case' ID ':' estruturaControle 'break' ';' )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==CASE) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:173:29: 'case' ID ':' estruturaControle 'break' ';'
							{
							match(input,CASE,FOLLOW_CASE_in_estruturaControle2271); 
							match(input,ID,FOLLOW_ID_in_estruturaControle2273); 
							match(input,DOISPONTOS,FOLLOW_DOISPONTOS_in_estruturaControle2275); 
							pushFollow(FOLLOW_estruturaControle_in_estruturaControle2277);
							estruturaControle();
							state._fsp--;

							match(input,BREAK,FOLLOW_BREAK_in_estruturaControle2279); 
							match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_estruturaControle2281); 
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_estruturaControle2286); 
					}
					break;
				case 9 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:175:4: declaraVar
					{
					pushFollow(FOLLOW_declaraVar_in_estruturaControle2301);
					declaraVar();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:177:4: atribuicao
					{
					pushFollow(FOLLOW_atribuicao_in_estruturaControle2312);
					atribuicao();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "estruturaControle"



	// $ANTLR start "tipo"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:182:1: tipo : ( 'int' '[' ']' | 'boolean' | 'string' | 'int' | 'double' | 'char' | 'float' | 'long' | 'void' );
	public final void tipo() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:182:5: ( 'int' '[' ']' | 'boolean' | 'string' | 'int' | 'double' | 'char' | 'float' | 'long' | 'void' )
			int alt18=9;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA18_1 = input.LA(2);
				if ( (LA18_1==COLCHETEESQ) ) {
					alt18=1;
				}
				else if ( (LA18_1==ID) ) {
					alt18=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case BOOLEAN:
				{
				alt18=2;
				}
				break;
			case STRING:
				{
				alt18=3;
				}
				break;
			case DOUBLE:
				{
				alt18=5;
				}
				break;
			case CHAR:
				{
				alt18=6;
				}
				break;
			case FLOAT:
				{
				alt18=7;
				}
				break;
			case LONG:
				{
				alt18=8;
				}
				break;
			case VOID:
				{
				alt18=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:182:7: 'int' '[' ']'
					{
					match(input,INT,FOLLOW_INT_in_tipo2325); 
					match(input,COLCHETEESQ,FOLLOW_COLCHETEESQ_in_tipo2327); 
					match(input,COLCHETEDIR,FOLLOW_COLCHETEDIR_in_tipo2329); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:183:3: 'boolean'
					{
					match(input,BOOLEAN,FOLLOW_BOOLEAN_in_tipo2333); 
					}
					break;
				case 3 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:184:3: 'string'
					{
					match(input,STRING,FOLLOW_STRING_in_tipo2337); 
					}
					break;
				case 4 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:185:3: 'int'
					{
					match(input,INT,FOLLOW_INT_in_tipo2342); 
					}
					break;
				case 5 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:186:3: 'double'
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_tipo2346); 
					}
					break;
				case 6 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:187:3: 'char'
					{
					match(input,CHAR,FOLLOW_CHAR_in_tipo2350); 
					}
					break;
				case 7 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:188:3: 'float'
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_tipo2354); 
					}
					break;
				case 8 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:189:3: 'long'
					{
					match(input,LONG,FOLLOW_LONG_in_tipo2358); 
					}
					break;
				case 9 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:190:3: 'void'
					{
					match(input,VOID,FOLLOW_VOID_in_tipo2362); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tipo"



	// $ANTLR start "importacaotipo"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:193:1: importacaotipo : ( 'awt' | 'swing' | 'util' | 'io' | 'text' | 'regex' | 'event' );
	public final void importacaotipo() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:193:16: ( 'awt' | 'swing' | 'util' | 'io' | 'text' | 'regex' | 'event' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:
			{
			if ( (input.LA(1) >= 109 && input.LA(1) <= 110)||input.LA(1)==112||(input.LA(1) >= 120 && input.LA(1) <= 122)||input.LA(1)==124 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "importacaotipo"



	// $ANTLR start "importacao"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:195:1: importacao : IMPORT ( 'java' | 'javax' ) '.' importacaotipo '.' ( 'event' '.' | 'regex' '.' )? '*' ';' ;
	public final void importacao() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:195:12: ( IMPORT ( 'java' | 'javax' ) '.' importacaotipo '.' ( 'event' '.' | 'regex' '.' )? '*' ';' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:195:14: IMPORT ( 'java' | 'javax' ) '.' importacaotipo '.' ( 'event' '.' | 'regex' '.' )? '*' ';'
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_importacao2408); 
			if ( (input.LA(1) >= 113 && input.LA(1) <= 114) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,PONTO,FOLLOW_PONTO_in_importacao2418); 
			pushFollow(FOLLOW_importacaotipo_in_importacao2420);
			importacaotipo();
			state._fsp--;

			match(input,PONTO,FOLLOW_PONTO_in_importacao2422); 
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:195:62: ( 'event' '.' | 'regex' '.' )?
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==110) ) {
				alt19=1;
			}
			else if ( (LA19_0==120) ) {
				alt19=2;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:195:63: 'event' '.'
					{
					match(input,110,FOLLOW_110_in_importacao2424); 
					match(input,PONTO,FOLLOW_PONTO_in_importacao2426); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:195:77: 'regex' '.'
					{
					match(input,120,FOLLOW_120_in_importacao2430); 
					match(input,PONTO,FOLLOW_PONTO_in_importacao2432); 
					}
					break;

			}

			match(input,MULTIPLICACAO,FOLLOW_MULTIPLICACAO_in_importacao2436); 
			match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_importacao2438); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "importacao"



	// $ANTLR start "pacote"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:197:1: pacote : 'package' ID ';' ;
	public final void pacote() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:197:8: ( 'package' ID ';' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:197:10: 'package' ID ';'
			{
			match(input,PACKAGE,FOLLOW_PACKAGE_in_pacote2446); 
			match(input,ID,FOLLOW_ID_in_pacote2448); 
			match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_pacote2450); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pacote"



	// $ANTLR start "parametro"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:199:1: parametro : tipo ID ;
	public final void parametro() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:199:11: ( tipo ID )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:199:13: tipo ID
			{
			pushFollow(FOLLOW_tipo_in_parametro2458);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_parametro2460); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parametro"



	// $ANTLR start "classeMain"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:201:1: classeMain : 'public' 'static' 'void' 'main' '(' 'String' '[' ']' 'args' ')' '{' ( estruturaControle | criarObj )* '}' ;
	public final void classeMain() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:201:12: ( 'public' 'static' 'void' 'main' '(' 'String' '[' ']' 'args' ')' '{' ( estruturaControle | criarObj )* '}' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:201:14: 'public' 'static' 'void' 'main' '(' 'String' '[' ']' 'args' ')' '{' ( estruturaControle | criarObj )* '}'
			{
			match(input,PUBLIC,FOLLOW_PUBLIC_in_classeMain2468); 
			match(input,STATIC,FOLLOW_STATIC_in_classeMain2470); 
			match(input,VOID,FOLLOW_VOID_in_classeMain2472); 
			match(input,115,FOLLOW_115_in_classeMain2474); 
			match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_classeMain2476); 
			match(input,106,FOLLOW_106_in_classeMain2477); 
			match(input,COLCHETEESQ,FOLLOW_COLCHETEESQ_in_classeMain2479); 
			match(input,COLCHETEDIR,FOLLOW_COLCHETEDIR_in_classeMain2480); 
			match(input,108,FOLLOW_108_in_classeMain2482); 
			match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_classeMain2483); 
			match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_classeMain2485); 
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:201:79: ( estruturaControle | criarObj )*
			loop20:
			while (true) {
				int alt20=3;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BOOLEAN||LA20_0==CHAR||LA20_0==DOUBLE||LA20_0==FLOAT||LA20_0==FOR||LA20_0==IF||LA20_0==INT||LA20_0==LONG||LA20_0==STRING||LA20_0==SWITCH||LA20_0==WHILE||LA20_0==107) ) {
					alt20=1;
				}
				else if ( (LA20_0==ID) ) {
					int LA20_3 = input.LA(2);
					if ( (LA20_3==DECREMENTO||LA20_3==DIFERENTE||LA20_3==DOISIGUAIS||LA20_3==E||LA20_3==IGUAL||LA20_3==INCREMENTO||(LA20_3 >= MAIOR && LA20_3 <= MAIORIGUAL)||LA20_3==MENORIGUAL||LA20_3==OU) ) {
						alt20=1;
					}
					else if ( (LA20_3==ID) ) {
						alt20=2;
					}

				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:201:80: estruturaControle
					{
					pushFollow(FOLLOW_estruturaControle_in_classeMain2488);
					estruturaControle();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:201:100: criarObj
					{
					pushFollow(FOLLOW_criarObj_in_classeMain2492);
					criarObj();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_classeMain2497); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classeMain"



	// $ANTLR start "criarObj"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:203:1: criarObj : ID ID '=' 'new' ID '(' ')' ';' ;
	public final void criarObj() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:203:10: ( ID ID '=' 'new' ID '(' ')' ';' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:203:12: ID ID '=' 'new' ID '(' ')' ';'
			{
			match(input,ID,FOLLOW_ID_in_criarObj2505); 
			match(input,ID,FOLLOW_ID_in_criarObj2507); 
			match(input,IGUAL,FOLLOW_IGUAL_in_criarObj2509); 
			match(input,NEW,FOLLOW_NEW_in_criarObj2511); 
			match(input,ID,FOLLOW_ID_in_criarObj2513); 
			match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_criarObj2515); 
			match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_criarObj2516); 
			match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_criarObj2518); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "criarObj"



	// $ANTLR start "corpoMetodo"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:1: corpoMetodo : ( declaraVar )* ( estruturaControle )* ( RETURN ID ';' )? ;
	public final void corpoMetodo() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:13: ( ( declaraVar )* ( estruturaControle )* ( RETURN ID ';' )? )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:15: ( declaraVar )* ( estruturaControle )* ( RETURN ID ';' )?
			{
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:15: ( declaraVar )*
			loop21:
			while (true) {
				int alt21=2;
				switch ( input.LA(1) ) {
				case BOOLEAN:
					{
					int LA21_2 = input.LA(2);
					if ( (LA21_2==ID) ) {
						int LA21_9 = input.LA(3);
						if ( (LA21_9==IGUAL) ) {
							int LA21_16 = input.LA(4);
							if ( (LA21_16==111||LA21_16==123) ) {
								int LA21_30 = input.LA(5);
								if ( (LA21_30==PONTOVIRGULA) ) {
									alt21=1;
								}

							}
							else if ( (LA21_16==PONTOVIRGULA) ) {
								alt21=1;
							}

						}

					}

					}
					break;
				case CHAR:
					{
					int LA21_3 = input.LA(2);
					if ( (LA21_3==ID) ) {
						int LA21_10 = input.LA(3);
						if ( (LA21_10==IGUAL) ) {
							int LA21_17 = input.LA(4);
							if ( (LA21_17==ID) ) {
								int LA21_32 = input.LA(5);
								if ( (LA21_32==PONTOVIRGULA) ) {
									alt21=1;
								}

							}

						}
						else if ( (LA21_10==PONTOVIRGULA) ) {
							alt21=1;
						}

					}

					}
					break;
				case INT:
					{
					int LA21_4 = input.LA(2);
					if ( (LA21_4==ID) ) {
						switch ( input.LA(3) ) {
						case COLCHETEESQ:
							{
							int LA21_19 = input.LA(4);
							if ( (LA21_19==COLCHETEDIR) ) {
								int LA21_33 = input.LA(5);
								if ( (LA21_33==IGUAL) ) {
									int LA21_39 = input.LA(6);
									if ( (LA21_39==NEW) ) {
										int LA21_40 = input.LA(7);
										if ( (LA21_40==INT) ) {
											int LA21_41 = input.LA(8);
											if ( (LA21_41==COLCHETEESQ) ) {
												int LA21_42 = input.LA(9);
												if ( (LA21_42==ID) ) {
													int LA21_43 = input.LA(10);
													if ( (LA21_43==COLCHETEDIR) ) {
														int LA21_44 = input.LA(11);
														if ( (LA21_44==PONTOVIRGULA) ) {
															alt21=1;
														}

													}

												}

											}

										}

									}

								}

							}

							}
							break;
						case IGUAL:
							{
							int LA21_20 = input.LA(4);
							if ( (LA21_20==ID) ) {
								int LA21_34 = input.LA(5);
								if ( (LA21_34==PONTOVIRGULA) ) {
									alt21=1;
								}

							}

							}
							break;
						case PONTOVIRGULA:
							{
							alt21=1;
							}
							break;
						}
					}

					}
					break;
				case STRING:
					{
					int LA21_5 = input.LA(2);
					if ( (LA21_5==ID) ) {
						int LA21_12 = input.LA(3);
						if ( (LA21_12==IGUAL) ) {
							int LA21_22 = input.LA(4);
							if ( (LA21_22==STR) ) {
								int LA21_35 = input.LA(5);
								if ( (LA21_35==PONTOVIRGULA) ) {
									alt21=1;
								}

							}

						}
						else if ( (LA21_12==PONTOVIRGULA) ) {
							alt21=1;
						}

					}

					}
					break;
				case DOUBLE:
					{
					int LA21_6 = input.LA(2);
					if ( (LA21_6==ID) ) {
						int LA21_13 = input.LA(3);
						if ( (LA21_13==IGUAL) ) {
							int LA21_24 = input.LA(4);
							if ( (LA21_24==DOUB) ) {
								int LA21_36 = input.LA(5);
								if ( (LA21_36==PONTOVIRGULA) ) {
									alt21=1;
								}

							}

						}
						else if ( (LA21_13==PONTOVIRGULA) ) {
							alt21=1;
						}

					}

					}
					break;
				case LONG:
					{
					int LA21_7 = input.LA(2);
					if ( (LA21_7==ID) ) {
						int LA21_14 = input.LA(3);
						if ( (LA21_14==IGUAL) ) {
							int LA21_26 = input.LA(4);
							if ( (LA21_26==LONGG) ) {
								int LA21_37 = input.LA(5);
								if ( (LA21_37==PONTOVIRGULA) ) {
									alt21=1;
								}

							}

						}
						else if ( (LA21_14==PONTOVIRGULA) ) {
							alt21=1;
						}

					}

					}
					break;
				case FLOAT:
					{
					int LA21_8 = input.LA(2);
					if ( (LA21_8==ID) ) {
						int LA21_15 = input.LA(3);
						if ( (LA21_15==IGUAL) ) {
							int LA21_28 = input.LA(4);
							if ( (LA21_28==FLUT) ) {
								int LA21_38 = input.LA(5);
								if ( (LA21_38==PONTOVIRGULA) ) {
									alt21=1;
								}

							}

						}
						else if ( (LA21_15==PONTOVIRGULA) ) {
							alt21=1;
						}

					}

					}
					break;
				}
				switch (alt21) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:15: declaraVar
					{
					pushFollow(FOLLOW_declaraVar_in_corpoMetodo2528);
					declaraVar();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:27: ( estruturaControle )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==BOOLEAN||LA22_0==CHAR||LA22_0==DOUBLE||LA22_0==FLOAT||LA22_0==FOR||(LA22_0 >= ID && LA22_0 <= IF)||LA22_0==INT||LA22_0==LONG||LA22_0==STRING||LA22_0==SWITCH||LA22_0==WHILE||LA22_0==107) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:27: estruturaControle
					{
					pushFollow(FOLLOW_estruturaControle_in_corpoMetodo2531);
					estruturaControle();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:46: ( RETURN ID ';' )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==RETURN) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:205:47: RETURN ID ';'
					{
					match(input,RETURN,FOLLOW_RETURN_in_corpoMetodo2535); 
					match(input,ID,FOLLOW_ID_in_corpoMetodo2537); 
					match(input,PONTOVIRGULA,FOLLOW_PONTOVIRGULA_in_corpoMetodo2539); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "corpoMetodo"



	// $ANTLR start "metodos"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:207:1: metodos : 'public' tipo ID '(' ( parametro )? ')' '{' corpoMetodo '}' ;
	public final void metodos() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:207:9: ( 'public' tipo ID '(' ( parametro )? ')' '{' corpoMetodo '}' )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:207:11: 'public' tipo ID '(' ( parametro )? ')' '{' corpoMetodo '}'
			{
			match(input,PUBLIC,FOLLOW_PUBLIC_in_metodos2551); 
			pushFollow(FOLLOW_tipo_in_metodos2553);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_metodos2555); 
			match(input,PARENTESEESQ,FOLLOW_PARENTESEESQ_in_metodos2557); 
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:207:32: ( parametro )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BOOLEAN||LA24_0==CHAR||LA24_0==DOUBLE||LA24_0==FLOAT||LA24_0==INT||LA24_0==LONG||LA24_0==STRING||LA24_0==VOID) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:207:32: parametro
					{
					pushFollow(FOLLOW_parametro_in_metodos2559);
					parametro();
					state._fsp--;

					}
					break;

			}

			match(input,PARENTESEDIR,FOLLOW_PARENTESEDIR_in_metodos2562); 
			match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_metodos2564); 
			pushFollow(FOLLOW_corpoMetodo_in_metodos2566);
			corpoMetodo();
			state._fsp--;

			match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_metodos2568); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "metodos"



	// $ANTLR start "classe"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:209:1: classe : 'class' ID ( 'extends' ID | 'implements' ID )? ;
	public final void classe() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:209:8: ( 'class' ID ( 'extends' ID | 'implements' ID )? )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:209:10: 'class' ID ( 'extends' ID | 'implements' ID )?
			{
			match(input,CLASS,FOLLOW_CLASS_in_classe2576); 
			match(input,ID,FOLLOW_ID_in_classe2578); 
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:209:21: ( 'extends' ID | 'implements' ID )?
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==EXTENDS) ) {
				alt25=1;
			}
			else if ( (LA25_0==IMPLEMENTS) ) {
				alt25=2;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:209:22: 'extends' ID
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_classe2581); 
					match(input,ID,FOLLOW_ID_in_classe2583); 
					}
					break;
				case 2 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:209:37: 'implements' ID
					{
					match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_classe2587); 
					match(input,ID,FOLLOW_ID_in_classe2589); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "classe"



	// $ANTLR start "prog"
	// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:1: prog : ( pacote )? ( importacao )? 'public' classe '{' classeMain ( metodos )* '}' EOF ;
	public final void prog() throws  {
		try {
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:6: ( ( pacote )? ( importacao )? 'public' classe '{' classeMain ( metodos )* '}' EOF )
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:8: ( pacote )? ( importacao )? 'public' classe '{' classeMain ( metodos )* '}' EOF
			{
			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:8: ( pacote )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==PACKAGE) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:8: pacote
					{
					pushFollow(FOLLOW_pacote_in_prog2600);
					pacote();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:16: ( importacao )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==IMPORT) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:16: importacao
					{
					pushFollow(FOLLOW_importacao_in_prog2603);
					importacao();
					state._fsp--;

					}
					break;

			}

			match(input,PUBLIC,FOLLOW_PUBLIC_in_prog2607); 
			pushFollow(FOLLOW_classe_in_prog2609);
			classe();
			state._fsp--;

			match(input,CHAVEESQ,FOLLOW_CHAVEESQ_in_prog2611); 
			pushFollow(FOLLOW_classeMain_in_prog2613);
			classeMain();
			state._fsp--;

			// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:61: ( metodos )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==PUBLIC) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Toshio\\Desktop\\6º Semestre\\Construção de Compiladores\\AphonsoJava.g:211:61: metodos
					{
					pushFollow(FOLLOW_metodos_in_prog2616);
					metodos();
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			match(input,CHAVEDIR,FOLLOW_CHAVEDIR_in_prog2619); 
			match(input,EOF,FOLLOW_EOF_in_prog2621); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"

	// Delegated rules



	public static final BitSet FOLLOW_BOOLEAN_in_declaraVar1630 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1632 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1634 = new BitSet(new long[]{0x0000000000000000L,0x0800800000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_declaraVar1655 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1657 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1660 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_declaraVar1676 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1678 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1681 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_declaraVar1697 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1699 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_STR_in_declaraVar1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_declaraVar1718 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1720 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1723 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_DOUB_in_declaraVar1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_declaraVar1737 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1739 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_COLCHETEESQ_in_declaraVar1740 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COLCHETEDIR_in_declaraVar1741 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NEW_in_declaraVar1745 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_INT_in_declaraVar1747 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_COLCHETEESQ_in_declaraVar1749 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1750 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COLCHETEDIR_in_declaraVar1751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_declaraVar1762 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1764 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1767 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_LONGG_in_declaraVar1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_declaraVar1781 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_declaraVar1783 = new BitSet(new long[]{0x0004000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IGUAL_in_declaraVar1786 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_FLUT_in_declaraVar1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_declaraVar1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1940 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_MAIOR_in_expressao1942 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1949 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_DOISIGUAIS_in_expressao1951 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_MENORIGUAL_in_expressao1960 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1967 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_MAIORIGUAL_in_expressao1969 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1976 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_DIFERENTE_in_expressao1978 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1985 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_E_in_expressao1987 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expressao1994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_OU_in_expressao1996 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_expressao1998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atribuicao2010 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IGUAL_in_atribuicao2012 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_atribuicao2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_atribuicao2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atribuicao2021 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IGUAL_in_atribuicao2023 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_atribuicao2025 = new BitSet(new long[]{0xE024001134000040L,0x0000020000400087L});
	public static final BitSet FOLLOW_operador_in_atribuicao2027 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_atribuicao2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_atribuicao2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atribuicao2036 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_INCREMENTO_in_atribuicao2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_atribuicao2040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atribuicao2045 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_DECREMENTO_in_atribuicao2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_atribuicao2049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_estruturaControle2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2066 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_expressao_in_estruturaControle2068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2070 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_estruturaControle2072 = new BitSet(new long[]{0x0883500800020800L,0x0000081002200000L});
	public static final BitSet FOLLOW_estruturaControle_in_estruturaControle2074 = new BitSet(new long[]{0x0883500800060800L,0x0000081002200000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_estruturaControle2077 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_ELSE_in_estruturaControle2079 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_estruturaControle2081 = new BitSet(new long[]{0x0883500800020800L,0x0000081002200000L});
	public static final BitSet FOLLOW_estruturaControle_in_estruturaControle2083 = new BitSet(new long[]{0x0883500800060800L,0x0000081002200000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_estruturaControle2086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_estruturaControle2096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_estruturaControle2097 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_estruturaControle2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_estruturaControle2099 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_119_in_estruturaControle2100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_STR_in_estruturaControle2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_estruturaControle2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_estruturaControle2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_estruturaControle2125 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_estruturaControle2126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_estruturaControle2127 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_estruturaControle2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_STR_in_estruturaControle2132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_estruturaControle2136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_estruturaControle2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_estruturaControle2148 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_116_in_estruturaControle2149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_estruturaControle2150 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_estruturaControle2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2153 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ASPAS_in_estruturaControle2155 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
	public static final BitSet FOLLOW_printf_in_estruturaControle2156 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ASPAS_in_estruturaControle2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_VIRGULA_in_estruturaControle2160 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_estruturaControle2168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressao_in_estruturaControle2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_estruturaControle2194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2196 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_expressao_in_estruturaControle2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2200 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_estruturaControle2202 = new BitSet(new long[]{0x0883500800020800L,0x0000081002200000L});
	public static final BitSet FOLLOW_estruturaControle_in_estruturaControle2204 = new BitSet(new long[]{0x0883500800060800L,0x0000081002200000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_estruturaControle2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_estruturaControle2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2219 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_INT_in_estruturaControle2221 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2223 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IGUAL_in_estruturaControle2225 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_INT_in_estruturaControle2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_estruturaControle2229 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2231 = new BitSet(new long[]{0xE024001134000040L,0x0000020000400087L});
	public static final BitSet FOLLOW_operador_in_estruturaControle2233 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_estruturaControle2237 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2239 = new BitSet(new long[]{0xE024001134000040L,0x0000020000400087L});
	public static final BitSet FOLLOW_operador_in_estruturaControle2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2243 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_estruturaControle2245 = new BitSet(new long[]{0x0883500800020800L,0x0000081002200000L});
	public static final BitSet FOLLOW_estruturaControle_in_estruturaControle2247 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_estruturaControle2249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_estruturaControle2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_estruturaControle2262 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_estruturaControle2266 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_estruturaControle2268 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_CASE_in_estruturaControle2271 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_estruturaControle2273 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DOISPONTOS_in_estruturaControle2275 = new BitSet(new long[]{0x0883500800020800L,0x0000081002200000L});
	public static final BitSet FOLLOW_estruturaControle_in_estruturaControle2277 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BREAK_in_estruturaControle2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_estruturaControle2281 = new BitSet(new long[]{0x0000000000044000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_estruturaControle2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaraVar_in_estruturaControle2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atribuicao_in_estruturaControle2312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_tipo2325 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_COLCHETEESQ_in_tipo2327 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COLCHETEDIR_in_tipo2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_tipo2333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_tipo2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_tipo2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_tipo2346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_tipo2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_tipo2354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_in_tipo2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_tipo2362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_importacao2408 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
	public static final BitSet FOLLOW_set_in_importacao2410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_importacao2418 = new BitSet(new long[]{0x0000000000000000L,0x1701600000000000L});
	public static final BitSet FOLLOW_importacaotipo_in_importacao2420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_importacao2422 = new BitSet(new long[]{0x0000000000000000L,0x0100400000000004L});
	public static final BitSet FOLLOW_110_in_importacao2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_importacao2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_120_in_importacao2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_PONTO_in_importacao2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_MULTIPLICACAO_in_importacao2436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_importacao2438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKAGE_in_pacote2446 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_pacote2448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_pacote2450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_parametro2458 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_parametro2460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_classeMain2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_STATIC_in_classeMain2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_VOID_in_classeMain2472 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_classeMain2474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_classeMain2476 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_classeMain2477 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_COLCHETEESQ_in_classeMain2479 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_COLCHETEDIR_in_classeMain2480 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_classeMain2482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_classeMain2483 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_classeMain2485 = new BitSet(new long[]{0x0883500800060800L,0x0000081002200000L});
	public static final BitSet FOLLOW_estruturaControle_in_classeMain2488 = new BitSet(new long[]{0x0883500800060800L,0x0000081002200000L});
	public static final BitSet FOLLOW_criarObj_in_classeMain2492 = new BitSet(new long[]{0x0883500800060800L,0x0000081002200000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_classeMain2497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_criarObj2505 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_criarObj2507 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_IGUAL_in_criarObj2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_NEW_in_criarObj2511 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_criarObj2513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_criarObj2515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_criarObj2516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_criarObj2518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaraVar_in_corpoMetodo2528 = new BitSet(new long[]{0x0883500800020802L,0x0000081002210000L});
	public static final BitSet FOLLOW_estruturaControle_in_corpoMetodo2531 = new BitSet(new long[]{0x0883500800020802L,0x0000081002210000L});
	public static final BitSet FOLLOW_RETURN_in_corpoMetodo2535 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_corpoMetodo2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_PONTOVIRGULA_in_corpoMetodo2539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PUBLIC_in_metodos2551 = new BitSet(new long[]{0x0880100800020800L,0x0000000400200000L});
	public static final BitSet FOLLOW_tipo_in_metodos2553 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_metodos2555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_PARENTESEESQ_in_metodos2557 = new BitSet(new long[]{0x0880100800020800L,0x0000000400200200L});
	public static final BitSet FOLLOW_parametro_in_metodos2559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_PARENTESEDIR_in_metodos2562 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_metodos2564 = new BitSet(new long[]{0x0883500800060800L,0x0000081002210000L});
	public static final BitSet FOLLOW_corpoMetodo_in_metodos2566 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_metodos2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_in_classe2576 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_classe2578 = new BitSet(new long[]{0x0008020000000002L});
	public static final BitSet FOLLOW_EXTENDS_in_classe2581 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_classe2583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_in_classe2587 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ID_in_classe2589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pacote_in_prog2600 = new BitSet(new long[]{0x0010000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_importacao_in_prog2603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_PUBLIC_in_prog2607 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_classe_in_prog2609 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_CHAVEESQ_in_prog2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_classeMain_in_prog2613 = new BitSet(new long[]{0x0000000000040000L,0x0000000000008000L});
	public static final BitSet FOLLOW_metodos_in_prog2616 = new BitSet(new long[]{0x0000000000040000L,0x0000000000008000L});
	public static final BitSet FOLLOW_CHAVEDIR_in_prog2619 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog2621 = new BitSet(new long[]{0x0000000000000002L});
}
