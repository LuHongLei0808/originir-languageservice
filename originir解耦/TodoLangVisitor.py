from TodoLangGrammarParser import TodoLangGrammarParser
from TodoLangGrammarVisitor import TodoLangGrammarVisitor

class TodoLangVisitor(TodoLangGrammarVisitor):

    def __init__(self):
        self.gateList = {"q": {}}
        self.qubitNum = 0
        self.cbitNum = 0
        self.currentGateName = ""
        self.key1 = "params"
        self.key2 = "arguments"
        self.inDagger = False
        self.inControl = False
        self.measureList = {"a": 1}
        self.controlBit = {}


    def _notify_error(self, start, end, message):
        errorMsg = {
            'start': start,
            'end': end,
            'message': message
        }
        # Notifying error listeners, you might have a custom implementation for this
        # Here, I am simply printing the error message
        print(errorMsg)


# This function is responsible for visiting the Qinit_declaration in the grammar.
# It tries to extract the number of qubits from the context and assigns it to the qubitNum attribute.
# If there's an error during this process, it notifies the error.
    def visitQinit_declaration(self, ctx:TodoLangGrammarParser.Qinit_declarationContext):
        try:
            self.qubitNum = int(ctx.Integer_Literal().getText())
        except Exception as err:
            self._notify_error(ctx.start.charPositionInLine , 
                               ctx.start.charPositionInLine+len(ctx.text) , 
                               "grammar error")


# This function visits the Cinit_declaration in the grammar.
# It extracts the number of classical bits and assigns it to the cbitNum attribute.
    def visitCinit_declaration(self, ctx:TodoLangGrammarParser.Cinit_declarationContext):
        self.cbitNum = int(ctx.Integer_Literal().getText())


# This function visits the C_KEY_declaration in the grammar.
# It checks if the index of the classical bit is within the valid range.
# If not, it notifies an error.
    def visitC_KEY_declaration(self, ctx:TodoLangGrammarParser.C_KEY_declarationContext):
        try:
            if ctx.index().Integer_Literal() is not None:
                idx_num = int(ctx.index().Integer_Literal().getText())
                if idx_num > self.cbitNum - 1:
                    self._notify_error(ctx.index().start.charPositionInLine,
                                       ctx.index().start.charPositionInLine+len(ctx.index().text), 
                                       "index max " + str(self.cbitNum))
        except Exception as e:
            self._notify_error(ctx.start.charPositionInLine , 
                               ctx.start.charPositionInLine + len(ctx.text) , 
                               "grammar error")
    

# This function visits the Q_KEY_declaration in the grammar.
# Similar to the C_KEY_declaration, it checks if the index of the qubit is within the valid range.
# If not, it notifies an error.
    def visitQ_KEY_declaration(self, ctx):
        try:
            if ctx.index().Integer_Literal() is not None:
                idx_num = int(ctx.index().Integer_Literal().getText())
                if idx_num > self.qubitNum - 1:
                    self._notify_error(ctx.index().start.charPositionInLine, 
                                       ctx.index().start.charPositionInLine + len(ctx.index().getText()), 
                                       f"index max {self.qubitNum}")
        except Exception as err:
            self._notify_error(ctx.start.charPositionInLine , 
                               ctx.start.charPositionInLine + len(ctx.getText()), 
                               "grammar error")


# This helper function checks if a given register key is duplicated.
# If it is, it notifies an error.
    def _check_duplicate_register(self, ctx, key):
        if key in self.controlBit:
            self._notify_error(ctx.start.charPositionInLine , 
                               ctx.start.charPositionInLine + len(ctx.getText()) , 
                               "Duplicated register")


# The following functions visit different gate declarations in the grammar.
# They check if the qubit register used in the gate declaration is duplicated.
# If it is, they notify an error.
    def visitSingle_gate_without_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_one_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_two_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_three_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_four_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")


# This function visits the double gate declaration without any parameters in the grammar.
# It checks if the two qubit registers used in the declaration are duplicated or already exist in the controlBit.
# If any of these conditions are met, it notifies an error.
    def visitDouble_gate_without_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")


# This function visits the double gate declaration with one parameter in the grammar.
# Similar to the previous function, it checks for duplicated or existing qubit registers.
    def visitDouble_gate_with_one_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")


# This function visits the double gate declaration with four parameters in the grammar.
# Again, it checks for duplicated or existing qubit registers.
    def visitDouble_gate_with_four_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")


# This function visits the triple gate declaration without any parameters in the grammar.
# It checks if any of the three qubit registers used in the declaration are duplicated or already exist in the controlBit.
    def visitTriple_gate_without_parameter_declaration(self, ctx):
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(2).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(2).start.charPositionInLine + len(ctx.q_KEY_declaration(2).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() == ctx.q_KEY_declaration(2).getText():
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine, 
                               ctx.q_KEY_declaration(2).start.charPositionInLine + len(ctx.q_KEY_declaration(2).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine, 
                               ctx.q_KEY_declaration(0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()),  
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine, 
                               ctx.q_KEY_declaration(1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()), 
                               "Duplicated register")
        if ctx.q_KEY_declaration(2).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(2).start.charPositionInLine, 
                               ctx.q_KEY_declaration(2).start.charPositionInLine + len(ctx.q_KEY_declaration(2).getText()), 
                               "Duplicated register")


# This function visits the gate declaration in the grammar.
# It checks if the gate being used has been defined and if the number of qubits and parameters match the gate's definition.
# If not, it notifies an error.
    def visitDefine_gate_declaration(self, ctx):
        gate_text = ctx.id().getText()
        if gate_text not in self.gateList:
            self._notify_error(ctx.id().start.charPositionInLine, 
                               ctx.id().start.charPositionInLine + len(ctx.id().getText()), 
                               f"Gate {gate_text} is not defined")
        else:
            param_len = len(ctx._argument_list)
            now_gate = self.gateList[gate_text]
            if self.key1 in now_gate:
                params = now_gate[self.key1]
                arg_len = len(params)
                if param_len != arg_len:
                    start = ctx.start.charPositionInLine
                    end = start + len(ctx.text)
                    self._notify_error(ctx.start.charPositionInLine, 
                                       ctx.start.charPositionInLine + len(ctx.getText()), 
                                       f"Gate call to {gate_text} expect {arg_len} qubit but found {param_len}")
            if ctx._angle_list:
                angle_len = len(ctx._angle_list)
                if self.key2 in now_gate:
                    params = now_gate[self.key1]
                    arg_len = len(params)
                    if angle_len != arg_len:
                        self._notify_error(ctx.start.charPositionInLine, 
                                           ctx.start.charPositionInLine +  len(ctx.text), 
                                           f"Gate call to {gate_text} expect {arg_len} parameter but found {angle_len}")
                else:
                    self._notify_error(ctx.start.charPositionInLine, 
                                       ctx.start.charPositionInLine + len(ctx.text), 
                                       f"Gate call to {gate_text} don't expect angle parameter")
            paramMap = {}
            for param in ctx._argument_list:
                txt = param.getText()        
                if txt in paramMap:
                    self._notify_error(ctx.start.charPositionInLine, 
                                       ctx.start.charPositionInLine + len(ctx.text), 
                                       "Duplicated register")       
                paramMap[txt] = 1



# This function visits the multiplicative expression in the grammar.
# It checks if the expression involves division by zero and if so, notifies an error.
    def visitMultiplicative_expression(self, ctx):
        if ctx.DIV():
            if ctx.unary_expression().getText() == "0":
                self._notify_error(ctx.start.charPositionInLine, 
                                   ctx.start.charPositionInLine + len(ctx.text), 
                                   "The denominator cannot be zero")
                

# This function visits the dagger statement in the grammar.
# It sets the inDagger attribute to True, visits the children of the context, and then sets inDagger back to False.
    def visitDagger_statement(self, ctx):
        self.inDagger = True
        self.visitChildren(ctx)
        self.inDagger = False
    

# This function visits the control statement in the grammar.
# It checks for invalid identifiers in the controlbit_list and for duplicated registers.
# It also sets the inControl flag to True while visiting the child nodes and then resets it.
    def visitControl_statement(self, ctx):
        # Check if there are any identifiers in the controlbit_list
        if ctx.controlbit_list().Identifier():
            self._notify_error(ctx.controlbit_list().start.charPositionInLine, 
                            ctx.controlbit_list().start.charPositionInLine + len(ctx.controlbit_list().text), 
                            "Can not define Id here")    
        # Check for duplicated registers in the controlbit_list
        for bit in ctx.controlbit_list().q_KEY_declaration():
            txt = bit.getText()
            if txt in self.controlBit:
                self._notify_error(ctx.controlbit_list().start.charPositionInLine, 
                                ctx.controlbit_list().start.charPositionInLine + len(ctx.controlbit_list().text), 
                                "Duplicated register")
            else:
                self.controlBit[txt] = 1
        # Set the inControl flag to True and visit the child nodes
        self.inControl = True
        self.visitChildren(ctx)   
        # Reset the controlBit dictionary and the inControl flag
        self.controlBit = {}
        self.inControl = False


# This function visits the measure statement in the grammar.
# It checks for duplicated measures and ensures that measures are not defined inside control or dagger blocks.
    def visitMeasure_statement(self, ctx):
        # Check for the specific q_KEY_declaration and c_KEY_declaration
        if ctx.q_KEY_declaration():
            q_key_text = ctx.q_KEY_declaration().getText()
            if q_key_text in self.measureList:
                self._notify_error(ctx.start.charPositionInLine, 
                                ctx.q_KEY_declaration().stop.charPositionInLine + len(q_key_text), 
                                "Duplicated measure")
            else:
                self.measureList[q_key_text] = 1
        # Check for the general Q_KEY and C_KEY
        elif ctx.Q_KEY():
            if "q" in self.measureList:
                self._notify_error(ctx.start.charPositionInLine, 
                                ctx.start.charPositionInLine + len(ctx.text), 
                                "Duplicated measure")
            else:
                self.measureList["q"] = 1
        # Check if measure is defined inside a control or dagger block
        if self.inControl or self.inDagger:
            self._notify_error(ctx.start.charPositionInLine, 
                            ctx.start.charPositionInLine + len(ctx.text), 
                            "can not define measure or barrier here")
            

# This function visits the barrier statement in the grammar.
# It checks if barriers are defined inside dagger or control blocks and for duplicated registers in the controlbit_list.
    def visitBarrier_statement(self, ctx):
        def visitBarrier_statement(self, ctx):
            # Check if barrier is defined inside a dagger or control block
            if self.inDagger or self.inControl:
                self._notify_error(ctx.start.charPositionInLine, 
                                ctx.start.charPositionInLine + len(ctx.text), 
                                "can not define measure or barrier here")        
            # Check for the specific controlbit_list
            if ctx.controlbit_list():
                barrieBits = {}
                for bit in ctx.controlbit_list().q_KEY_declaration():
                    txt = bit.getText()
                    if txt in barrieBits:
                        self._notify_error(ctx.controlbit_list().start.charPositionInLine, 
                                        ctx.controlbit_list().start.charPositionInLine + len(ctx.controlbit_list().text), 
                                        "Duplicated register")
                    else:
                        barrieBits[txt] = 1


# This function checks the gate definition.
# It ensures that the gate name, arguments, and angles are correctly defined.
    def _check_gate_definition(self, ctx, gate_name, args, angles=None):
        # Check if gate_name is in gateList
        if gate_name not in self.gateList:
            self._notify_error(ctx.gate_name().start.charPositionInLine, 
                            ctx.gate_name().start.charPositionInLine + len(ctx.gate_name().text), 
                            f"can not find define {gate_name}") 
        # Check if currentGateName is in gateList
        if self.currentGateName in self.gateList:
            nowGate = self.gateList[self.currentGateName]     
            # Check for parameters in gate definition
            if 'key1' in nowGate:
                params = nowGate['key1']
                for arg in args:
                    if arg not in params:
                        self._notify_error(ctx.start.charPositionInLine, 
                                        ctx.start.charPositionInLine + len(ctx.text), 
                                        f"can not find define {arg}")     
            # Check for angles in gate definition
            if angles and 'key2' in nowGate:
                argument_list = nowGate['key2']
                for angle in angles:
                    if angle not in argument_list:
                        self._notify_error(ctx.start.charPositionInLine, 
                                        ctx.start.charPositionInLine + len(ctx.text), 
                                        f"can not find define angle parameter {angle}")
        # Check for duplicated registers
        for arg in args:
            if arg in self.controlBit:
                self._notify_error(ctx.start.charPositionInLine, 
                                ctx.start.charPositionInLine + len(ctx.text), 
                                "duplicated register")


# This function visits the define gate statement in the grammar.
# It extracts the gate name, arguments, and angles (if provided) and checks the gate definition.
    def visitDefine_gate_statement(self, ctx):
        gate_name = ctx.gate_name().text
        args = [param.text for param in ctx.id_list()._params]
        
        # If angles are provided, extract them
        angles = None
        if ctx.explist():
            angles = [angle.text for angle in ctx.explist()._angles]
        
        # Check the gate definition
        self._check_gate_definition(ctx, gate_name, args, angles)


# This function visits the define control statement in the grammar.
# It extracts the bits from the controlbit_list, checks for duplicated registers, and visits user-defined gates.
    def visitDefine_control_statement(self, ctx):
        # Extract bits from controlbit_list
        if ctx.controlbit_list().q_KEY_declaration():
            bits = ctx.controlbit_list().q_KEY_declaration()
        else:
            bits = ctx.controlbit_list().Identifier() 
        # Check for duplicated registers
        for bit in bits:
            txt = bit.text
            self._check_duplicate_register(ctx, txt)
            self.controlBit[txt] = 1     
        # Visit user_defined_gate
        for user_gate in ctx.user_defined_gate():
            self.visit(user_gate)
        # Reset controlBit at the end
        self.controlBit = {}


# This function visits the expression in the grammar.
# It checks for division by zero in the expression.
    def visitExp(self,ctx):
        if ctx.DIV() and ctx.exp(1).getText() == "0":
            self._notify_error(ctx.start.charPositionInLine, 
                                ctx.start.charPositionInLine + len(ctx.text), 
                                "The denominator cannot be zero")


# This function visits the gate function statement in the grammar.
# It checks if the gate name is valid, extracts parameters and arguments, and checks for duplicates.
# It also stores the gate in the gateList and visits user-defined gates.
    def visitGate_func_statement(self, ctx):
        gateName = ctx._name.text
        # Check if gate name already exists
        if gateName in self.gateList:
            self._notify_error(ctx._name.start.charPositionInLine, 
                               ctx._name.start.charPositionInLine + len(ctx._name.text), 
                               f"A gate named {gateName} is already declared")
        # Check gate name length
        if len(gateName) > 6:
            self._notify_error(ctx._name.start.charPositionInLine, 
                               ctx._name.start.charPositionInLine + len(ctx._name.text),
                               "gate name too long")
        elif len(gateName) < 2:
            self._notify_error(ctx._name.start.charPositionInLine, 
                               ctx._name.start.charPositionInLine + len(ctx._name.text), 
                               "gate name too short")
        self.currentGateName = gateName
        # Extract parameters and arguments
        parameters = [param.text for param in ctx._params._params]
        if ctx._arguments:
            angles = [arg.text for arg in ctx._arguments._params]
        else:
            angles = []
        # Check for duplicate parameters
        if len(parameters) != len(set(parameters)):
            self._notify_error(ctx._params.start.charPositionInLine, 
                               ctx._params.start.charPositionInLine + len(ctx._params.text), 
                               "Duplicated parameter in gate declaration")
        # Check for duplicate angles
        if len(angles) != len(set(angles)):
            self._notify_error(ctx._arguments.start.charPositionInLine, 
                               ctx._arguments.start.charPositionInLine + len(ctx._arguments.text), 
                               "Duplicated angle in gate declaration")
        # Store the gate in gateList
        self.gateList[gateName] = {
            "params": {param: 1 for param in parameters},
            "arguments": {angle: 1 for angle in angles}
        }
        # Visit user defined gates
        for gate in ctx.user_defined_gate():
            self.visit(gate)


# This function visits the constant expression in the grammar.
# It evaluates the expression based on its type (simple constant, arithmetic operation between constants, or arithmetic operation followed by a constant).
# It also checks for division by zero in the expression.
    def visitConstant_expression(self, ctx):
        # If it's a simple constant
        if ctx.constant():
            return self.visit(ctx.constant())
        # If it's an arithmetic operation between two constants
        elif ctx.arithmetic_op():
            left_value = self.visit(ctx.constant(0))
            right_value = self.visit(ctx.constant(1))
            op = ctx.arithmetic_op().getText()
            # Check for division by zero
            if op == '/' and right_value == 0:
                self._notify_error(ctx.start.charPositionInLine, 
                                ctx.start.charPositionInLine + len(ctx.text), 
                                "The denominator cannot be zero")
                return None
            # Perform the arithmetic operation
            if op == '+':
                return left_value + right_value
            elif op == '-':
                return left_value - right_value
            elif op == '*':
                return left_value * right_value
            elif op == '/':
                return left_value / right_value
        # If it's an arithmetic operation followed by a constant
        else:
            value = self.visit(ctx.constant())
            op = ctx.arithmetic_op().getText()
            # Perform the arithmetic operation
            if op == '-':
                return -value
