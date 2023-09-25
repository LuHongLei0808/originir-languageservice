grammar TodoLangGrammar;

translationunit : NEWLINE* declaration*  gate_func_statement* statement+ EOF;

declaration: 
    qinit_declaration 
    | cinit_declaration
    ;

qinit_declaration : QINIT_KEY Integer_Literal NEWLINE;

cinit_declaration : CREG_KEY Integer_Literal NEWLINE;

quantum_gate_declaration: 
    single_gate_without_parameter_declaration 
    | single_gate_with_one_parameter_declaration 
    | single_gate_with_two_parameter_declaration
    | single_gate_with_three_parameter_declaration
    | single_gate_with_four_parameter_declaration
    | double_gate_without_parameter_declaration
    | double_gate_with_one_parameter_declaration
    | double_gate_with_four_parameter_declaration 
    | triple_gate_without_parameter_declaration
    | define_gate_declaration
    ;

index : LBRACK Integer_Literal RBRACK;

c_KEY_declaration : C_KEY index;

q_KEY_declaration : Q_KEY index;

single_gate_without_parameter_declaration : 
    single_gate_without_parameter_type q_KEY_declaration
    | single_gate_without_parameter_type Q_KEY 
    ;

single_gate_with_one_parameter_declaration : 
    single_gate_with_one_parameter_type q_KEY_declaration COMMA LPAREN constant_expression RPAREN
    | single_gate_with_one_parameter_type Q_KEY COMMA LPAREN expression RPAREN 
    ;

single_gate_with_two_parameter_declaration : 
    single_gate_with_two_parameter_type q_KEY_declaration COMMA LPAREN constant_expression COMMA constant_expression RPAREN
    | single_gate_with_two_parameter_type Q_KEY COMMA LPAREN constant_expression COMMA constant_expression RPAREN 
    ;

single_gate_with_three_parameter_declaration : 
    single_gate_with_three_parameter_type q_KEY_declaration COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression RPAREN
    | single_gate_with_three_parameter_type Q_KEY COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression RPAREN 
    ;

single_gate_with_four_parameter_declaration : 
    single_gate_with_four_parameter_type q_KEY_declaration COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression COMMA constant_expression RPAREN
    | single_gate_with_four_parameter_type Q_KEY COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression COMMA constant_expression RPAREN 
    ;

double_gate_without_parameter_declaration :  double_gate_without_parameter_type q_KEY_declaration COMMA  q_KEY_declaration;

double_gate_with_one_parameter_declaration :  double_gate_with_one_parameter_type  q_KEY_declaration COMMA q_KEY_declaration COMMA LPAREN constant_expression RPAREN;

double_gate_with_four_parameter_declaration : double_gate_with_four_parameter_type q_KEY_declaration COMMA q_KEY_declaration  COMMA LPAREN constant_expression COMMA  constant_expression COMMA constant_expression COMMA  constant_expression  RPAREN;


triple_gate_without_parameter_declaration : triple_gate_without_parameter_type q_KEY_declaration COMMA q_KEY_declaration COMMA q_KEY_declaration;

define_gate_declaration: 
    id  argument_list += q_KEY_declaration (COMMA argument_list += q_KEY_declaration)*
    | id argument_list += q_KEY_declaration (COMMA argument_list += q_KEY_declaration)*  COMMA  LPAREN angle_list+=constant_expression(COMMA angle_list+=constant_expression)* RPAREN
    ;

single_gate_without_parameter_type: 
    H_GATE  
    |T_GATE
    |S_GATE
    |X_GATE
    |Y_GATE 
    |Z_GATE
    |X1_GATE
    |Y1_GATE
    |Z1_GATE
    |I_GATE
    |ECHO_GATE
    ;

single_gate_with_one_parameter_type:
    RX_GATE
    |RY_GATE
    |RZ_GATE
    |U1_GATE
    ;

single_gate_with_two_parameter_type : 
    U2_GATE
    | RPHI_GATE
    ;

single_gate_with_three_parameter_type : U3_GATE;

single_gate_with_four_parameter_type: U4_GATE;

double_gate_without_parameter_type: 
    CNOT_GATE
    | CZ_GATE
    | ISWAP_GATE
    | SQISWAP_GATE
    | SWAPZ1_GATE
    ;

double_gate_with_one_parameter_type: 
    ISWAPTHETA_GATE
    | CR_GATE
    ;

double_gate_with_four_parameter_type: CU_GATE;

triple_gate_without_parameter_type: TOFFOLI_GATE;


primary_expression: 
    c_KEY_declaration      #pri_ckey
    | constant               #pri_cst
    | LPAREN expression LPAREN       #pri_expr
    ;

unary_expression: 
    primary_expression        
    | PLUS primary_expression  
    | MINUS primary_expression 
    | NOT primary_expression  
    ;

multiplicative_expression: 
    unary_expression
    | multiplicative_expression MUL unary_expression
    | multiplicative_expression DIV denominator=unary_expression
    ;

addtive_expression: 
    multiplicative_expression
    | addtive_expression PLUS multiplicative_expression
    | addtive_expression MINUS multiplicative_expression
    ;

relational_expression: 
    addtive_expression
    | relational_expression LT addtive_expression
    | relational_expression GT addtive_expression
    | relational_expression LEQ addtive_expression
    | relational_expression GEQ addtive_expression
    ;

equality_expression:
     relational_expression
    | equality_expression EQ relational_expression
    | equality_expression NE relational_expression
    ;

logical_and_expression: 
    equality_expression
    | logical_and_expression AND equality_expression
    ;

logical_or_expression: 
    logical_and_expression
    | logical_or_expression OR logical_and_expression
    ;

assignment_expression: 
    logical_or_expression
    | c_KEY_declaration ASSIGN logical_or_expression
    ;

expression: assignment_expression;

controlbit_list:  
    q_KEY_declaration (COMMA q_KEY_declaration)*
    |  Identifier (COMMA Identifier)*
    ;   


statement:  
    quantum_gate_declaration NEWLINE 
    | control_statement 
    | qif_statement 
    | qwhile_statement 
    | dagger_statement
    | measure_statement NEWLINE
    | reset_statement 
    | expression_statement 
    | barrier_statement NEWLINE
    | gate_func_statement 
    ;

dagger_statement: DAGGER_KEY NEWLINE  statement* ENDDAGGER_KEY NEWLINE ;

control_statement: CONTROL_KEY controlbit_list NEWLINE statement* ENDCONTROL_KEY NEWLINE ;

qelse_statement_fragment : ELSE_KEY NEWLINE statement*;

qif_statement:
    QIF_KEY expression NEWLINE statement* qelse_statement_fragment ENDIF_KEY NEWLINE #qif_if
    | QIF_KEY expression NEWLINE statement* ENDIF_KEY NEWLINE #qif_ifelse
    ;

qwhile_statement: QWHILE_KEY expression NEWLINE statement* ENDQWHILE_KEY NEWLINE;

measure_statement:
    MEASURE_KEY q_KEY_declaration COMMA c_KEY_declaration
    | MEASURE_KEY Q_KEY COMMA C_KEY NEWLINE
    ;

reset_statement:
    RESET_KEY q_KEY_declaration NEWLINE
    | RESET_KEY Q_KEY NEWLINE
    ;

barrier_statement : 
    BARRIER_KEY controlbit_list
    | BARRIER_KEY Q_KEY NEWLINE
    ;

expression_statement: expression NEWLINE; 
 


define_gate_statement:  
    gate_name  id_list  NEWLINE
    |   gate_name  id_list   RPAREN NEWLINE
//  |   (gate_name id_list COMMA LPAREN  explist  RPAREN NEWLINE)+
//  |   (DAGGER_KEY NEWLINE | CONTROL_KEY id_list NEWLINE) define_gate_declaration* (ENDDAGGER_KEY NEWLINE |ENDCONTROL_KEY NEWLINE)+
//  |   define_control_statement
//  |   define_dagger_statement
//  |    (DAGGER_KEY NEWLINE | CONTROL_KEY id_list NEWLINE)+ (gate_name id_list NEWLINE|gate_name id_list COMMA LPAREN  explist  RPAREN NEWLINE) (ENDDAGGER_KEY NEWLINE |ENDCONTROL_KEY NEWLINE)+
//  |   CONTROL_KEY id_list NEWLINE (gate_name id_list NEWLINE|gate_name id_list COMMA LPAREN  explist  RPAREN NEWLINE) ENDCONTROL_KEY NEWLINE             
    ;


define_dagger_statement:DAGGER_KEY NEWLINE user_defined_gate+ ENDDAGGER_KEY NEWLINE ;

define_control_statement:CONTROL_KEY controlbit_list NEWLINE user_defined_gate+ ENDCONTROL_KEY NEWLINE ;

user_defined_gate:
    define_gate_statement
    | define_dagger_statement
    | define_control_statement
//  | (define_control_statement|define_dagger_statement) *  define_gate_statement*  (define_control_statement|define_dagger_statement) * 
//  | define_control_statement *
//  | define_gate_statement*
    ;


explist:angles+=exp (COMMA angles+=exp)*;

exp :
    id
    | Integer_Literal
    | Double_Literal      
    | PI 
    | LPAREN exp RPAREN 
    | MINUS exp
    | exp MUL exp
    | exp DIV denominator=exp
    | exp PLUS exp 
    | exp MINUS exp 
    ;

 
gate_func_statement:  
    QGATE_KEY name=id params=id_list   NEWLINE  user_defined_gate*  ENDQGATE_KEY NEWLINE 
    // (define_gate_declaration NEWLINE)* 
    | QGATE_KEY name = id params=id_list COMMA LPAREN arguments=id_list RPAREN NEWLINE user_defined_gate*  ENDQGATE_KEY NEWLINE 
    // (define_gate_declaration NEWLINE)* 
    ;

id:Identifier;

id_list:params+=id (COMMA params+=id)*;

gate_name:
    single_gate_without_parameter_type
    | single_gate_with_one_parameter_type
    | single_gate_with_two_parameter_type 
    | single_gate_with_three_parameter_type 
    | single_gate_with_four_parameter_type
    | double_gate_without_parameter_type
    | double_gate_with_one_parameter_type                            
    | double_gate_with_four_parameter_type
    | triple_gate_without_parameter_type
    | id
    ;

constant_expression:
    constant
    | constant arithmetic_op denominator=constant 
    | arithmetic_op constant
    ;

arithmetic_op:
    MUL
    | MINUS
    | PLUS
    | DIV
    ;

unary_op: 
    MINUS
    | PLUS
    ;

/*
* Lexer Rule
*/


//KeyWord
PI: 'PI';

//Quantum keywords
QINIT_KEY : 'QINIT';
CREG_KEY : 'CREG';
Q_KEY: 'q';
C_KEY: 'c';

BARRIER_KEY:'BARRIER';

QGATE_KEY:'QGATE';
ENDQGATE_KEY:'ENDQGATE';

ECHO_GATE: 'ECHO';
H_GATE : 'H';
X_GATE : 'X';
NOT_GATE : 'NOT';
T_GATE : 'T';
S_GATE : 'S';
Y_GATE : 'Y';
Z_GATE : 'Z';
X1_GATE : 'X1';
Y1_GATE : 'Y1';
Z1_GATE : 'Z1';
I_GATE  : 'I' ;

U2_GATE : 'U2';
RPHI_GATE : 'RPhi';

U3_GATE : 'U3';
U4_GATE : 'U4';

RX_GATE : 'RX';
RY_GATE : 'RY';
RZ_GATE : 'RZ';
U1_GATE : 'U1';

CNOT_GATE : 'CNOT';
CZ_GATE : 'CZ';

CU_GATE : 'CU';
ISWAP_GATE: 'ISWAP';
SQISWAP_GATE: 'SQISWAP';
SWAPZ1_GATE: 'SWAP';

ISWAPTHETA_GATE:'ISWAPTHETA';
CR_GATE : 'CR';

TOFFOLI_GATE : 'TOFFOLI';
CP_GATE : 'CP';

DAGGER_KEY : 'DAGGER';
ENDDAGGER_KEY : 'ENDDAGGER';
CONTROL_KEY : 'CONTROL';
ENDCONTROL_KEY : 'ENDCONTROL';
QIF_KEY : 'QIF'; 
ELSE_KEY : 'ELSE';
ENDIF_KEY : 'ENDQIF';
QWHILE_KEY : 'QWHILE';
ENDQWHILE_KEY : 'ENDQWHILE';
MEASURE_KEY : 'MEASURE';
RESET_KEY : 'RESET'; 

//Operators
ASSIGN : '=';
GT : '>';
LT : '<';
NOT : '!';
EQ : '==';
LEQ : '<=';
GEQ : '>=';
NE : '!=';
AND : '&&';
OR : '||';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';

//Seperators
COMMA : ',';
LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';

NEWLINE : ('\n'|'\r')* '\r'? '\n';

Identifier: IdentifierNotDigit  (IdentifierNotDigit|Digit)*;


fragment
    IdentifierNotDigit : [a-zA-Z_]
;


fragment
    Digit : [0-9]
; 

constant : 
    Integer_Literal
    | Double_Literal
    | PI
    ;

Integer_Literal : Decimal_Literal ;

fragment
    Decimal_Literal : DigitNotZero Digit*
                    | Digit
;

fragment
    DigitNotZero : [1-9]
;

Double_Literal : Decimal_Double_Literal;

fragment
    Decimal_Double_Literal : 
        Digit_Sequence ?'.' Digit_Sequence
        | Digit_Sequence '.' REALEXP
        | REALEXP
;

Digit_Sequence : Digit+ ;

REALEXP : [0-9]+[eE][+-]? [0-9]+;

//WhiteSpace and Comments
WhiteSpace : (' ' | '\t') -> skip;

SingleLineComment : '#' ~('\n'|'\r')* '\r'? '\n' -> skip;

WS: [ \t] -> skip;