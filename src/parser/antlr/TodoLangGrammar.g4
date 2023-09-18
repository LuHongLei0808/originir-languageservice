grammar TodoLangGrammar;

@parser::members{
    public gateList: { [key: string]: object; } = {"q": {}}; 
    public qubitNum = 0;  
    public cbitNum = 0;   
    public currentGateName: string = "";
    public key1 = "params";
    public key2 = "arguments";
    public inDagger = false;   
    public inControl = false;   
    public measureList: {[key: string]: number; } = {"a": 1};
    public isValidKey(key: string , object: object): key is keyof typeof object {
			return key in object;
	}         
    public controlBit: {[key: string]: number; } = {};
}


translationunit : NEWLINE* declaration*  gate_func_statement* statement+ EOF
;

declaration: qinit_declaration 
           | cinit_declaration

;

qinit_declaration : QINIT_KEY Integer_Literal { 
    try {
        this.qubitNum = parseInt($ctx.Integer_Literal().text, 10);
    } catch(err){
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "grammar error"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
 } NEWLINE;


cinit_declaration : CREG_KEY Integer_Literal { this.cbitNum = parseInt($ctx.Integer_Literal().text, 10); } NEWLINE;

quantum_gate_declaration: single_gate_without_parameter_declaration 
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


index : LBRACK Integer_Literal RBRACK
;


c_KEY_declaration : C_KEY index	{ 
    try {
        if ($ctx.index().Integer_Literal() != null){
            let idx_num = parseInt($ctx.index().Integer_Literal().text, 10);
            if(idx_num > this.cbitNum - 1) {
                let errorMsg = {start: $ctx.index().start.charPositionInLine, end: $ctx.index().start.charPositionInLine+$ctx.index().text.length,message: "index max " + this.cbitNum};
                this.notifyErrorListeners(JSON.stringify(errorMsg));
            } 
        }
    } catch(err) {
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "grammar error"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;


q_KEY_declaration : Q_KEY index { 
    try {
        if ($ctx.index().Integer_Literal() != null){
            let idx_num = parseInt($ctx.index().Integer_Literal().text, 10);
            if(idx_num > this.qubitNum - 1) {
                let errorMsg = {start: $ctx.index().start.charPositionInLine, end: $ctx.index().start.charPositionInLine+$ctx.index().text.length, message: "index max " + this.qubitNum};
                this.notifyErrorListeners(JSON.stringify(errorMsg));
            } 
        }
    } catch(err){
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "grammar error"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;


single_gate_without_parameter_declaration : single_gate_without_parameter_type  q_KEY_declaration {
    if(this.controlBit.hasOwnProperty($ctx.q_KEY_declaration()!.text)){
        let errorMsg = {start: $ctx.q_KEY_declaration()!.start.charPositionInLine, end: $ctx.q_KEY_declaration()!.start.charPositionInLine+$ctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
								| single_gate_without_parameter_type  Q_KEY {
                                    if(this.controlBit.hasOwnProperty("q")){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "Duplicated register"};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                }
;

single_gate_with_one_parameter_declaration : single_gate_with_one_parameter_type q_KEY_declaration COMMA LPAREN constant_expression RPAREN {
    if(this.controlBit.hasOwnProperty($ctx.q_KEY_declaration()!.text)){
        let errorMsg = {start: $ctx.q_KEY_declaration()!.start.charPositionInLine, end: $ctx.q_KEY_declaration()!.start.charPositionInLine+$ctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
								| single_gate_with_one_parameter_type Q_KEY COMMA LPAREN expression RPAREN {
                                    if(this.controlBit.hasOwnProperty("q")){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "Duplicated register"};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                }
;

single_gate_with_two_parameter_declaration : single_gate_with_two_parameter_type q_KEY_declaration COMMA LPAREN constant_expression COMMA constant_expression RPAREN {
    if(this.controlBit.hasOwnProperty($ctx.q_KEY_declaration()!.text)){
        let errorMsg = {start: $ctx.q_KEY_declaration()!.start.charPositionInLine, end: $ctx.q_KEY_declaration()!.start.charPositionInLine+$ctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
								| single_gate_with_two_parameter_type Q_KEY COMMA LPAREN constant_expression COMMA constant_expression RPAREN {
                                    if(this.controlBit.hasOwnProperty("q")){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "Duplicated register"};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                }
;

single_gate_with_three_parameter_declaration : single_gate_with_three_parameter_type q_KEY_declaration COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression RPAREN {
    if(this.controlBit.hasOwnProperty($ctx.q_KEY_declaration()!.text)){
        let errorMsg = {start: $ctx.q_KEY_declaration()!.start.charPositionInLine, end: $ctx.q_KEY_declaration()!.start.charPositionInLine+$ctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
								| single_gate_with_three_parameter_type Q_KEY COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression RPAREN {
                                    if(this.controlBit.hasOwnProperty("q")){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "Duplicated register"};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                }
;

single_gate_with_four_parameter_declaration : single_gate_with_four_parameter_type q_KEY_declaration COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression COMMA constant_expression RPAREN {
    if(this.controlBit.hasOwnProperty($ctx.q_KEY_declaration()!.text)){
        let errorMsg = {start: $ctx.q_KEY_declaration()!.start.charPositionInLine, end: $ctx.q_KEY_declaration()!.start.charPositionInLine+$ctx.q_KEY_declaration()!.text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
								| single_gate_with_four_parameter_type Q_KEY COMMA LPAREN constant_expression COMMA constant_expression COMMA constant_expression COMMA constant_expression RPAREN {
                                    if(this.controlBit.hasOwnProperty("q")){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length,message: "Duplicated register"};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                }
;

double_gate_without_parameter_declaration :  double_gate_without_parameter_type q_KEY_declaration COMMA  q_KEY_declaration {
    if ($ctx.q_KEY_declaration(0).text == $ctx.q_KEY_declaration(1).text){
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(0).text)){
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(0).start.charPositionInLine+$ctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(1).text)){
        let errorMsg = {start: $ctx.q_KEY_declaration(1).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;
double_gate_with_one_parameter_declaration :  double_gate_with_one_parameter_type  q_KEY_declaration COMMA q_KEY_declaration COMMA LPAREN constant_expression RPAREN {
    if ($ctx.q_KEY_declaration(0).text == $ctx.q_KEY_declaration(1).text) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(0).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(0).start.charPositionInLine+$ctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(1).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(1).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;

double_gate_with_four_parameter_declaration : double_gate_with_four_parameter_type q_KEY_declaration COMMA q_KEY_declaration  COMMA LPAREN constant_expression COMMA  constant_expression COMMA constant_expression COMMA  constant_expression  RPAREN {
    if ($ctx.q_KEY_declaration(0).text == $ctx.q_KEY_declaration(1).text) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(0).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(0).start.charPositionInLine+$ctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(1).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(1).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;

triple_gate_without_parameter_declaration : triple_gate_without_parameter_type q_KEY_declaration COMMA q_KEY_declaration COMMA q_KEY_declaration {
    if ($ctx.q_KEY_declaration(0).text == $ctx.q_KEY_declaration(1).text) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if ($ctx.q_KEY_declaration(0).text == $ctx.q_KEY_declaration(2).text) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(2).start.charPositionInLine+$ctx.q_KEY_declaration(2).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if ($ctx.q_KEY_declaration(1).text == $ctx.q_KEY_declaration(2).text) {
        let errorMsg = {start: $ctx.q_KEY_declaration(1).start.charPositionInLine, end: $ctx.q_KEY_declaration(2).start.charPositionInLine+$ctx.q_KEY_declaration(2).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(0).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(0).start.charPositionInLine, end: $ctx.q_KEY_declaration(0).start.charPositionInLine+$ctx.q_KEY_declaration(0).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(1).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(1).start.charPositionInLine, end: $ctx.q_KEY_declaration(1).start.charPositionInLine+$ctx.q_KEY_declaration(1).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    if (this.controlBit.hasOwnProperty($ctx.q_KEY_declaration(2).text)) {
        let errorMsg = {start: $ctx.q_KEY_declaration(2).start.charPositionInLine, end: $ctx.q_KEY_declaration(2).start.charPositionInLine+$ctx.q_KEY_declaration(2).text.length,message: "Duplicated register"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;

define_gate_declaration: id  argument_list += q_KEY_declaration (COMMA argument_list += q_KEY_declaration)* {
    let gate_text = $ctx.id().text;
    if(!this.gateList.hasOwnProperty(gate_text)){
        let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length,message: "Gate " + gate_text + " is not defined"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    } else {
        let param_len = $ctx._argument_list.length;
        let now_gate = this.gateList[gate_text];
        if(this.isValidKey(this.key1, now_gate)){
            let params: object = now_gate[this.key1];
            let arg_len = Object.keys(params).length;
            if(param_len != arg_len){
                let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "Gate call to " + gate_text + " expect " + arg_len + " qubit but found " + param_len};
                this.notifyErrorListeners(JSON.stringify(errorMsg));
            }
        }
        let parameters = $ctx._argument_list;
        let paramMap: {[key: string]: number; } = {};
        for(let i = 0; i < parameters.length; i++){
            let txt = parameters[i].text;
            if(paramMap.hasOwnProperty(txt)){
                let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "Duplicated register"};
                this.notifyErrorListeners(JSON.stringify(errorMsg));
            }
            paramMap[txt] = 1;
        }
    }

}
					   | id argument_list += q_KEY_declaration (COMMA argument_list += q_KEY_declaration)*  COMMA  LPAREN angle_list+=constant_expression(COMMA angle_list+=constant_expression)* RPAREN {
                            let gate_text = $ctx.id().text;
                            if(!this.gateList.hasOwnProperty(gate_text)){
                                let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length, message: "Gate " + gate_text + " is not defined"};
                                this.notifyErrorListeners(JSON.stringify(errorMsg));
                            } else {
                                let param_len = $ctx._argument_list.length;
                                let angle_len = $ctx._angle_list.length;
                                let now_gate = this.gateList[gate_text];
                                if(this.isValidKey(this.key1, now_gate)){
                                    let params: object = now_gate[this.key1];
                                    let arg_len = Object.keys(params).length;
                                    if(param_len != arg_len){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine + $ctx.text.length, message: "Gate call to " + gate_text + " expect " + arg_len + " qubit but found " + param_len};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                }
                                if(now_gate[this.key2] != null){
                                    let params: object = now_gate[this.key1];
                                    let arg_len = Object.keys(params).length;
                                    if(angle_len != arg_len){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end:$ctx.start.charPositionInLine+$ctx.text.length,  message: "Gate call to " + gate_text + " expect " + arg_len + " parameter but found " + angle_len};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                } else {
                                    let errorMsg = {start: $ctx.start.charPositionInLine, end:$ctx.start.charPositionInLine+$ctx.text.length, message: "Gate call to " + gate_text + " don't expect angle parameter"};
                                    this.notifyErrorListeners(JSON.stringify(errorMsg));
                                }
                                let parameters = $ctx._argument_list;
                                let paramMap: {[key: string]: number; } = {};
                                for(let i = 0; i < parameters.length; i++){
                                    let txt = parameters[i].text;
                                    if(paramMap.hasOwnProperty(txt)){
                                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "Duplicated register"};
                                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                                    }
                                    paramMap[txt] = 1;
                                }
                            }
                       }
;



single_gate_without_parameter_type: H_GATE
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

single_gate_with_one_parameter_type:RX_GATE
                                    |RY_GATE
                                    |RZ_GATE
                                    |U1_GATE
;

single_gate_with_two_parameter_type : U2_GATE
									| RPHI_GATE
;

single_gate_with_three_parameter_type : U3_GATE
;

single_gate_with_four_parameter_type: U4_GATE
;

double_gate_without_parameter_type: CNOT_GATE
                                  | CZ_GATE
                                  | ISWAP_GATE
                                  | SQISWAP_GATE
                                  | SWAPZ1_GATE
;

double_gate_with_one_parameter_type: ISWAPTHETA_GATE
                                   | CR_GATE
;

double_gate_with_four_parameter_type: CU_GATE
;

triple_gate_without_parameter_type: TOFFOLI_GATE
;


primary_expression: c_KEY_declaration      #pri_ckey
                  | constant               #pri_cst
                  | LPAREN expression LPAREN       #pri_expr
;

unary_expression: primary_expression        
                | PLUS primary_expression  
                | MINUS primary_expression 
                | NOT primary_expression  
;

multiplicative_expression: unary_expression
                         | multiplicative_expression MUL unary_expression
                         | multiplicative_expression DIV denominator=unary_expression {
                             if ($ctx._denominator.text === '0') {
                                let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "The denominator cannot be zero"};
                                this.notifyErrorListeners(JSON.stringify(errorMsg));
                             }
                         }
;

addtive_expression: multiplicative_expression
                  | addtive_expression PLUS multiplicative_expression
                  | addtive_expression MINUS multiplicative_expression
;

relational_expression: addtive_expression
                     | relational_expression LT addtive_expression
                     | relational_expression GT addtive_expression
                     | relational_expression LEQ addtive_expression
                     | relational_expression GEQ addtive_expression
;

equality_expression: relational_expression
                   | equality_expression EQ relational_expression
                   | equality_expression NE relational_expression
;

logical_and_expression: equality_expression
                   | logical_and_expression AND equality_expression 
;

logical_or_expression: logical_and_expression
                    |  logical_or_expression OR logical_and_expression
;

assignment_expression: logical_or_expression
                    | c_KEY_declaration ASSIGN logical_or_expression
;

expression: assignment_expression
;

controlbit_list:  q_KEY_declaration (COMMA q_KEY_declaration)*
            |  Identifier (COMMA Identifier)*
;


statement: quantum_gate_declaration NEWLINE 
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

dagger_statement: DAGGER_KEY NEWLINE { this.inDagger = true; } statement* ENDDAGGER_KEY NEWLINE {this.inDagger = false;}
;

control_statement: CONTROL_KEY controlbit_list {
    if($ctx.controlbit_list().Identifier().length != 0){
            let errorMsg = {start: $ctx.controlbit_list().start.charPositionInLine, end:$ctx.controlbit_list().start.charPositionInLine+$ctx.controlbit_list().text.length, message: "Can not define Id here"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    let bit = $ctx.controlbit_list().q_KEY_declaration();
    for(let i = 0; i < bit.length; i++){
        let txt = bit[i].text;
        if(this.controlBit.hasOwnProperty(txt)){
            let errorMsg = {start: $ctx.controlbit_list().start.charPositionInLine, end:$ctx.controlbit_list().start.charPositionInLine+$ctx.controlbit_list().text.length, message: "Duplicated register"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        } else {
            this.controlBit[txt] = 1;
        }
    }
    this.inControl = true;
} NEWLINE statement* ENDCONTROL_KEY NEWLINE {
    this.controlBit = {};
    this.inControl = false;
}
;

qelse_statement_fragment : ELSE_KEY NEWLINE statement*;

qif_statement: QIF_KEY expression NEWLINE statement* qelse_statement_fragment ENDIF_KEY NEWLINE #qif_if
             | QIF_KEY expression NEWLINE statement* ENDIF_KEY NEWLINE #qif_ifelse
;

qwhile_statement: QWHILE_KEY expression NEWLINE statement* ENDQWHILE_KEY NEWLINE
;

measure_statement:MEASURE_KEY q_KEY_declaration COMMA c_KEY_declaration
{
    if (this.measureList.hasOwnProperty($ctx.q_KEY_declaration()!.text)) {
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.q_KEY_declaration()!.stop!.charPositionInLine+$ctx.q_KEY_declaration()!.text.length, message: "Duplicated measure"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    } else {
        this.measureList[$ctx.q_KEY_declaration()!.text] = 1;
    }
    if (this.inControl || this.inDagger) {
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "can not define measure or barrier here"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
				| MEASURE_KEY Q_KEY COMMA C_KEY NEWLINE
{
    if(this.measureList.hasOwnProperty("q")) {
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "Duplicated measure"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    } else {
        this.measureList["q"] = 1;
    }
    if (this.inControl || this.inDagger) {
        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "can not define measure or barrier here"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
}
;

reset_statement:RESET_KEY q_KEY_declaration NEWLINE
			  | RESET_KEY Q_KEY NEWLINE
;

barrier_statement : BARRIER_KEY controlbit_list  {
    if (this.inDagger || this.inControl){
        let errorMsg = {start: $ctx.start.charPositionInLine, end:$ctx.start.charPositionInLine+$ctx.text.length, message: "can not define measure or barrier here"};
        this.notifyErrorListeners(JSON.stringify(errorMsg));
    }
    let bit = $ctx.controlbit_list()!.q_KEY_declaration();
    let barrieBits: {[key: string]: number; } = {};
    for(let i = 0; i < bit.length; i++) {
        let txt = bit[i].text;
        if(barrieBits.hasOwnProperty(txt)){
            let errorMsg = {start: $ctx.controlbit_list()!.start.charPositionInLine, end:$ctx.controlbit_list()!.start.charPositionInLine+$ctx.controlbit_list()!.text.length, message: "Duplicated register"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        } else {
            barrieBits[txt] = 1;
        }
    }
}
				|	BARRIER_KEY Q_KEY NEWLINE
;

expression_statement: expression NEWLINE 
; 
 


define_gate_statement:   gate_name {
    if($ctx.gate_name().id() != null) {
        let customName = $ctx.gate_name().id()!.text;
        if(!this.gateList.hasOwnProperty(customName)) {
            let errorMsg = {start: $ctx.gate_name().start.charPositionInLine, end: $ctx.gate_name().start.charPositionInLine+$ctx.gate_name().text.length, message: "can not find define " + customName};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
    }
}  id_list {
    let args = $ctx.id_list()._params;
    if(this.gateList.hasOwnProperty(this.currentGateName)) {
        let nowGate = this.gateList[this.currentGateName];
        if(this.isValidKey(this.key1, nowGate)){
            let params: object = nowGate[this.key1];
            for(let i = 0; i < args.length; i++){
                let arg_name = args[i].text;
                if(!params.hasOwnProperty(arg_name)){
                    let errorMsg = {start: $ctx.start.charPositionInLine, end:$ctx.start.charPositionInLine+$ctx.text.length, message: "can not find define " + arg_name};
                    this.notifyErrorListeners(JSON.stringify(errorMsg));
                }
            }
        }
    }
    for(let i = 0; i < args.length; i++){
        let arg_name = args[i].text;
        if(this.controlBit.hasOwnProperty(arg_name)){
            let errorMsg = {start: $ctx.start.charPositionInLine, end:$ctx.start.charPositionInLine+$ctx.text.length, message: "duplicated register"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
    }
} NEWLINE
                     |   gate_name  id_list {
    let customName = $ctx.gate_name().text;
    if($ctx.gate_name().id() != null) {
        if(!this.gateList.hasOwnProperty(customName)) {
            let errorMsg = {start: $ctx.gate_name().start.charPositionInLine, end: $ctx.gate_name().start.charPositionInLine+$ctx.gate_name().text.length, message: "can not find define " + customName};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
    }
    let args = $ctx.id_list()._params;
    if(this.gateList.hasOwnProperty(this.currentGateName)) {
        let nowGate = this.gateList[this.currentGateName];
        if(this.isValidKey(this.key1, nowGate)){
            let params:object = nowGate[this.key1];
            for(let i = 0; i < args.length; i++){
                let arg_name = args[i].text;
                if(!params.hasOwnProperty(arg_name)){
                    let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.text.length, message: "can not find define " + arg_name};
                    this.notifyErrorListeners(JSON.stringify(errorMsg));
                }
            }
        }
    }
    for(let i = 0; i < args.length; i++){
        let arg_name = args[i].text;
        if(this.controlBit.hasOwnProperty(arg_name)){
            let errorMsg = {start: $ctx.start.charPositionInLine, end:$ctx.start.charPositionInLine+$ctx.text.length, message: "duplicated register"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
    }
                     } COMMA LPAREN  explist {
    if(this.gateList.hasOwnProperty(this.currentGateName)) {
        let nowGate = this.gateList[this.currentGateName];
        if(this.isValidKey(this.key2, nowGate)){
            let argument_list: object = nowGate[this.key2];
            let angles = $ctx.explist()!._angles;
            for(let i = 0; i < angles.length; i++){
                if(angles[i].id() != null){
                    if(argument_list == null){
                        let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "can not find define angle parameter " + angles[i].id()!.text};
                        this.notifyErrorListeners(JSON.stringify(errorMsg));
                    } else {
                        let angle_name = angles[i].id()!.text;
                        if(!argument_list.hasOwnProperty(angle_name)){
                            let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "can not find define angle parameter " + angle_name};
                            this.notifyErrorListeners(JSON.stringify(errorMsg));
                        }
                    }
                }
            }            
        }
        
    }
                     }  RPAREN NEWLINE
					//  |   (gate_name id_list COMMA LPAREN  explist  RPAREN NEWLINE)+
                    // |   (DAGGER_KEY NEWLINE | CONTROL_KEY id_list NEWLINE) define_gate_declaration* (ENDDAGGER_KEY NEWLINE |ENDCONTROL_KEY NEWLINE)+
                    // |   define_control_statement
                    // |   define_dagger_statement
                    //  |    (DAGGER_KEY NEWLINE | CONTROL_KEY id_list NEWLINE)+ (gate_name id_list NEWLINE|gate_name id_list COMMA LPAREN  explist  RPAREN NEWLINE) (ENDDAGGER_KEY NEWLINE |ENDCONTROL_KEY NEWLINE)+
                   // |   CONTROL_KEY id_list NEWLINE (gate_name id_list NEWLINE|gate_name id_list COMMA LPAREN  explist  RPAREN NEWLINE) ENDCONTROL_KEY NEWLINE
                     
;


define_dagger_statement:DAGGER_KEY NEWLINE user_defined_gate+ ENDDAGGER_KEY NEWLINE 
;

define_control_statement:CONTROL_KEY controlbit_list
{
    let bit;
    if ($ctx.controlbit_list().q_KEY_declaration().length > 0){
        bit = $ctx.controlbit_list().q_KEY_declaration();
    } else {
        bit = $ctx.controlbit_list().Identifier();
    }
    for(let i = 0; i < bit.length; i++){
        let txt = bit[i].text;
        if(this.controlBit.hasOwnProperty(txt)){
            let errorMsg = {start: $ctx.controlbit_list().start.charPositionInLine, end:$ctx.controlbit_list().start.charPositionInLine+$ctx.controlbit_list().text.length, message: "Duplicated register"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        } else {
            this.controlBit[txt] = 1;
        }
    }
}
 NEWLINE user_defined_gate+ ENDCONTROL_KEY NEWLINE {
    this.controlBit = {};
}
;

user_defined_gate: define_gate_statement
                 | define_dagger_statement
                 | define_control_statement
// |  (define_control_statement|define_dagger_statement) *  define_gate_statement*  (define_control_statement|define_dagger_statement) * 
                //    |  define_control_statement *
                //    |  define_gate_statement*
;


explist     :     angles+=exp (COMMA angles+=exp)*
;

exp         :     id
                | Integer_Literal
				| Double_Literal      
				| PI 
                | LPAREN exp RPAREN 
                | MINUS exp
				| exp MUL exp
                | exp DIV denominator=exp { if($ctx._denominator.text === '0') {
                    let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "The denominator cannot be zero"};
                    this.notifyErrorListeners(JSON.stringify(errorMsg));
                } }
                | exp PLUS exp 
				| exp MINUS exp 
;

 
gate_func_statement:  QGATE_KEY name=id params=id_list {
        let gateName = $ctx._name.text;
        if(this.gateList.hasOwnProperty(gateName)){
            let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length, message: "A gate named " +gateName+ " is already declared"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
        if (gateName.length > 6) {
            let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length, message: "gate name too long"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
        if (gateName.length < 2) {
            let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length, message: "gate name too short"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
        this.currentGateName = gateName;
        let parameters = $ctx._params!._params;
        let json1 = {};
        parameters.forEach(element => {
            let param_text = element.text;
            if (json1.hasOwnProperty(param_text)) {
                let errorMsg = {start: $ctx._params.start.charPositionInLine, end: $ctx._params.start.charPositionInLine+$ctx._params.text.length, message: "parameter "+ param_text +" is already declared"};
                this.notifyErrorListeners(JSON.stringify(errorMsg));
            }
            json1[param_text] = 1;
        });
        let newGate = {"params": json1, arguments: null}
        this.gateList[gateName] = newGate;
}  NEWLINE  user_defined_gate*  ENDQGATE_KEY NEWLINE 
// (define_gate_declaration NEWLINE)* 
					| QGATE_KEY name = id params=id_list COMMA LPAREN arguments=id_list RPAREN {
                            let gateName = $ctx._name.text;
                            if(this.gateList.hasOwnProperty(gateName)){
                                let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx._params.text.length, message: "A gate named " +gateName+ " is already declared"};
                                this.notifyErrorListeners(JSON.stringify(errorMsg));
                            }
                            this.currentGateName = gateName;
                            if (gateName.length > 6) {
                                let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length, message: "gate name too long"};
                                this.notifyErrorListeners(JSON.stringify(errorMsg));
                            }
                            if (gateName.length < 2) {
                                let errorMsg = {start: $ctx.id().start.charPositionInLine, end: $ctx.id().start.charPositionInLine+$ctx.id().text.length, message: "gate name too short"};
                                this.notifyErrorListeners(JSON.stringify(errorMsg));
                            }
                            let parameters = $ctx._params!._params;
                            let angles = $ctx._arguments!._params;
                            let json1 = {};
                            let json2 = {};
                            parameters.forEach(element => {
                                let param_text = element.text;
                                if (json1.hasOwnProperty(param_text)) {
                                    let errorMsg = {start: $ctx._params.start.charPositionInLine, end: $ctx._params.start.charPositionInLine+$ctx._params.text.length, message: "parameter "+ param_text +" is already declared"};
                                    this.notifyErrorListeners(JSON.stringify(errorMsg));
                                }
                                json1[param_text] = 1;
                            });
                            angles.forEach(element => {
                                let param_text = element.text;
                                if (json2.hasOwnProperty(param_text)) {
                                    let errorMsg = {start: $ctx._arguments.start.charPositionInLine, end: $ctx._arguments.start.charPositionInLine+$ctx._arguments.text.length, message: "parameter "+ param_text +" is already declared"};
                                    this.notifyErrorListeners(JSON.stringify(errorMsg));
                                }
                                json2[param_text] = 1;
                            });
                            let newGate = {"params": json1, arguments: json2}
                            this.gateList[gateName] = newGate;
                    } NEWLINE user_defined_gate*  ENDQGATE_KEY NEWLINE 
                    // (define_gate_declaration NEWLINE)* 
;

id : Identifier
;

id_list :   params+=id (COMMA params+=id)*
;

gate_name :	  single_gate_without_parameter_type
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

constant_expression
    : constant
    | constant arithmetic_op denominator=constant { if($ctx.arithmetic_op()!.DIV() != null) {
        if($ctx._denominator.text === '0') {
            let errorMsg = {start: $ctx.start.charPositionInLine, end: $ctx.start.charPositionInLine+$ctx.text.length, message: "The denominator cannot be zero"};
            this.notifyErrorListeners(JSON.stringify(errorMsg));
        }
    } }
    | arithmetic_op constant
    ;

arithmetic_op
    : MUL
    | MINUS
    | PLUS
    | DIV
    ;

unary_op
    : MINUS
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
ASSIGN:             '=';
GT:                 '>';
LT:                 '<';
NOT:                 '!';
EQ:                  '==';
LEQ:                 '<=';
GEQ:                 '>=';
NE:                 '!=';
AND:                 '&&';
OR:                 '||';
PLUS:                '+';
MINUS:                '-';
MUL:                '*';
DIV:                '/';

//Seperators
COMMA:              ',';
LPAREN :            '(';
RPAREN :            ')';
LBRACK :            '[';
RBRACK :            ']';

NEWLINE : ('\n'|'\r')* '\r'? '\n'
;

Identifier: IdentifierNotDigit  (IdentifierNotDigit|Digit)*
;


fragment
    IdentifierNotDigit : [a-zA-Z_]
;


fragment
    Digit : [0-9]
; 

constant : Integer_Literal
         | Double_Literal
		 | PI
;

Integer_Literal : Decimal_Literal 
;

fragment
    Decimal_Literal : DigitNotZero Digit*
                    | Digit
;

fragment
    DigitNotZero : [1-9]
;

Double_Literal : Decimal_Double_Literal
;

fragment
    Decimal_Double_Literal : Digit_Sequence ?'.' Digit_Sequence
						  | Digit_Sequence '.' REALEXP
						  | REALEXP
;


Digit_Sequence : Digit+ 
;


REALEXP : [0-9]+[eE][+-]? [0-9]+
;

//WhiteSpace and Comments
WhiteSpace : (' ' | '\t') -> skip
;

SingleLineComment : '#' ~('\n'|'\r')* '\r'? '\n' -> skip
;


WS: [ \t] -> skip;



