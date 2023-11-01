from TodoLangGrammarParser import TodoLangGrammarParser
from TodoLangGrammarVisitor import TodoLangGrammarVisitor


class TodoLangVisitor(TodoLangGrammarVisitor):
    """
    This class defines a visitor for the TodoLang grammar.
    """

    def __init__(self):
        """
        Initialize the TodoLangVisitor instance.

        Attributes:
            gateList (dict): A dictionary to store gate information.
            qubitNum (int): The number of qubits.
            cbitNum (int): The number of classical bits.
            currentGateName (str): The name of the current gate being processed.
            key1 (str): A key for storing parameters.
            key2 (str): A key for storing arguments.
            inDagger (bool): A flag indicating if the code is inside a dagger block.
            inControl (bool): A flag indicating if the code is inside a control block.
            measureList (dict): A dictionary to store measurement information.
            controlBit (dict): A dictionary to store control bit information.
        """
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
        """
        Notify an error with the given message.

        Args:
            start (int): The start position of the error.
            end (int): The end position of the error.
            message (str): The error message.
        """
        errorMsg = {
            'start': start,
            'end': end,
            'message': message
        }

        print(errorMsg)

    def visitQinit_declaration(self, ctx: TodoLangGrammarParser.Qinit_declarationContext):
        """
        Visit a QINIT declaration and extract the number of qubits.

        Args:
            ctx (TodoLangGrammarParser.Qinit_declarationContext): The QINIT declaration context.
        """
        try:
            self.qubitNum = int(ctx.Integer_Literal().getText())
        except Exception as err:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine+len(ctx.text),
                               "grammar error")

    def visitCinit_declaration(self, ctx: TodoLangGrammarParser.Cinit_declarationContext):
        """
        Visit a CINIT declaration and extract the number of classical bits.

        Args:
            ctx (TodoLangGrammarParser.Cinit_declarationContext): The CINIT declaration context.
        """
        self.cbitNum = int(ctx.Integer_Literal().getText())

    def visitC_KEY_declaration(self, ctx: TodoLangGrammarParser.C_KEY_declarationContext):
        """
        Visit a C_KEY declaration and perform validation.

        Args:
            ctx (TodoLangGrammarParser.C_KEY_declarationContext): The C_KEY declaration context.
        """
        try:
            if ctx.index().Integer_Literal() is not None:
                idx_num = int(ctx.index().Integer_Literal().getText())
                if idx_num > self.cbitNum - 1:
                    self._notify_error(ctx.index().start.charPositionInLine,
                                       ctx.index().start.charPositionInLine+len(ctx.index().text),
                                       "index max " + str(self.cbitNum))
        except Exception as e:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine + len(ctx.text),
                               "grammar error")

    def visitQ_KEY_declaration(self, ctx):
        """
        Visit a Q_KEY declaration and perform validation.

        Args:
            ctx: The Q_KEY declaration context.
        """
        try:
            if ctx.index().Integer_Literal() is not None:
                idx_num = int(ctx.index().Integer_Literal().getText())
                if idx_num > self.qubitNum - 1:
                    self._notify_error(ctx.index().start.charPositionInLine,
                                       ctx.index().start.charPositionInLine + len(ctx.index().getText()),
                                       f"index max {self.qubitNum}")
        except Exception as err:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine +
                               len(ctx.getText()),
                               "grammar error")

    def _check_duplicate_register(self, ctx, key):
        """
        Check for duplicate register declarations.

        Args:
            ctx: The context of the declaration.
            key (str): The key for the register.

        Raises:
            Duplicated register error if a duplicate is found.
        """
        if key in self.controlBit:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine +
                               len(ctx.getText()),
                               "Duplicated register")

    def visitSingle_gate_without_parameter_declaration(self, ctx):
        """
        Visit a single gate declaration without parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(
                ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_one_parameter_declaration(self, ctx):
        """
        Visit a single gate declaration with one parameter and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(
                ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_two_parameter_declaration(self, ctx):
        """
        Visit a single gate declaration with two parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(
                ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitSingle_gate_with_three_parameter_declaration(self, ctx):
        """
        Visit a single gate declaration with three parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(
                ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")


    def visitSingle_gate_with_four_parameter_declaration(self, ctx):
        """
        Visit a single gate declaration with four parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration():
            self._check_duplicate_register(
                ctx, ctx.q_KEY_declaration().getText())
        else:
            self._check_duplicate_register(ctx, "q")

    def visitDouble_gate_without_parameter_declaration(self, ctx):
        """
        Visit a double gate declaration without parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")

    def visitDouble_gate_with_one_parameter_declaration(self, ctx):
        """
        Visit a double gate declaration with one parameter and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")

    def visitDouble_gate_with_four_parameter_declaration(self, ctx):
        """
        Visit a double gate declaration with four parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")

    def visitTriple_gate_without_parameter_declaration(self, ctx):
        """
        Visit a triple gate declaration without parameters and perform validation.

        Args:
            ctx: The context of the declaration.
        """
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(1).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() == ctx.q_KEY_declaration(2).getText():
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   2).start.charPositionInLine + len(ctx.q_KEY_declaration(2).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() == ctx.q_KEY_declaration(2).getText():
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   2).start.charPositionInLine + len(ctx.q_KEY_declaration(2).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(0).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(0).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   0).start.charPositionInLine + len(ctx.q_KEY_declaration(0).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(1).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(1).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   1).start.charPositionInLine + len(ctx.q_KEY_declaration(1).getText()),
                               "Duplicated register")
        if ctx.q_KEY_declaration(2).getText() in self.controlBit:
            self._notify_error(ctx.q_KEY_declaration(2).start.charPositionInLine,
                               ctx.q_KEY_declaration(
                                   2).start.charPositionInLine + len(ctx.q_KEY_declaration(2).getText()),
                               "Duplicated register")

    def visitDefine_gate_declaration(self, ctx):
        """
        Visit and validate the declaration of custom gates.

        Args:
            ctx: Syntax tree context object containing information about the custom gate.

        """
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
                                    ctx.start.charPositionInLine +
                                    len(ctx.getText()),
                                    f"Gate call to {gate_text} expects {arg_len} qubits but found {param_len}")
            if ctx._angle_list:
                angle_len = len(ctx._angle_list)
                if self.key2 in now_gate:
                    params = now_gate[self.key1]
                    arg_len = len(params)
                    if angle_len != arg_len:
                        self._notify_error(ctx.start.charPositionInLine,
                                        ctx.start.charPositionInLine +
                                        len(ctx.text),
                                        f"Gate call to {gate_text} expects {arg_len} parameters but found {angle_len}")
                else:
                    self._notify_error(ctx.start.charPositionInLine,
                                    ctx.start.charPositionInLine +
                                    len(ctx.text),
                                    f"Gate call to {gate_text} does not expect angle parameters")
            paramMap = {}
            for param in ctx._argument_list:
                txt = param.getText()
                if txt in paramMap:
                    self._notify_error(ctx.start.charPositionInLine,
                                    ctx.start.charPositionInLine +
                                    len(ctx.text),
                                    "Duplicated register")
                paramMap[txt] = 1

def visitMultiplicative_expression(self, ctx):
    """
    Visit and validate multiplicative expressions, ensuring that division by zero is not allowed.

    Args:
        ctx: Syntax tree context object containing information about the multiplicative expression.

    """
    if ctx.DIV():
        if ctx.unary_expression().getText() == "0":
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine +
                               len(ctx.text),
                               "The denominator cannot be zero")

def visitDagger_statement(self, ctx):
    """
    Mark that we are currently processing a dagger statement for controlling statement execution.

    Args:
        ctx: Syntax tree context object for identifying dagger statements.

    """
    self.inDagger = True
    self.visitChildren(ctx)
    self.inDagger = False

def visitControl_statement(self, ctx):
    """
    Visit and validate control statements, ensuring the uniqueness of control bits.

    Args:
        ctx: Syntax tree context object containing information about the control statement.

    """
    if ctx.controlbit_list().Identifier():
        self._notify_error(ctx.controlbit_list().start.charPositionInLine,
                           ctx.controlbit_list().start.charPositionInLine +
                           len(ctx.controlbit_list().text),
                           "Cannot define 'Id' here")

    for bit in ctx.controlbit_list().q_KEY_declaration():
        txt = bit.getText()
        if txt in self.controlBit:
            self._notify_error(ctx.controlbit_list().start.charPositionInLine,
                               ctx.controlbit_list().start.charPositionInLine +
                               len(ctx.controlbit_list().text),
                               "Duplicated register")
        else:
            self.controlBit[txt] = 1

    self.inControl = True
    self.visitChildren(ctx)

    self.controlBit = {}
    self.inControl = False

def visitMeasure_statement(self, ctx):
    """
    Visit and validate measure statements, ensuring the uniqueness of measured qubits.

    Args:
        ctx: Syntax tree context object containing information about the measure statement.

    """
    if ctx.q_KEY_declaration():
        q_key_text = ctx.q_KEY_declaration().getText()
        if q_key_text in self.measureList:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.q_KEY_declaration().stop.charPositionInLine + len(q_key_text),
                               "Duplicated measure")
        else:
            self.measureList[q_key_text] = 1

    elif ctx.Q_KEY():
        if "q" in self.measureList:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine +
                               len(ctx.text),
                               "Duplicated measure")
        else:
            self.measureList["q"] = 1

    if self.inControl or self.inDagger:
        self._notify_error(ctx.start.charPositionInLine,
                           ctx.start.charPositionInLine + len(ctx.text),
                           "Cannot define measure or barrier here")


    def visitDefine_gate_statement(self, ctx):
        """
        Visit and validate the declaration of custom gates.

        Args:
            ctx: Syntax tree context object containing information about the custom gate.

        """
        gate_name = ctx.gate_name().text
        args = [param.text for param in ctx.id_list()._params]

        angles = None
        if ctx.explist():
            angles = [angle.text for angle in ctx.explist()._angles]

        self._check_gate_definition(ctx, gate_name, args, angles)

    def visitDefine_control_statement(self, ctx):
        """
        Visit and validate control statements, ensuring the uniqueness of control bits.

        Args:
            ctx: Syntax tree context object containing information about the control statement.

        """
        if ctx.controlbit_list().q_KEY_declaration():
            bits = ctx.controlbit_list().q_KEY_declaration()
        else:
            bits = ctx.controlbit_list().Identifier()

        for bit in bits:
            txt = bit.text
            self._check_duplicate_register(ctx, txt)
            self.controlBit[txt] = 1

        for user_gate in ctx.user_defined_gate():
            self.visit(user_gate)

        self.controlBit = {}

def visitExp(self, ctx):
    """
    Visit and validate exponential expressions, ensuring that division by zero is not allowed.

    Args:
        ctx: Syntax tree context object containing information about the exponential expression.

    """
    if ctx.DIV() and ctx.exp(1).getText() == "0":
        self._notify_error(ctx.start.charPositionInLine,
                           ctx.start.charPositionInLine + len(ctx.text),
                           "The denominator cannot be zero")

def visitGate_func_statement(self, ctx):
    """
    Visit and validate gate function statements, checking for duplicate gate declarations.

    Args:
        ctx: Syntax tree context object containing information about the gate function statement.

    """
    gateName = ctx._name.text

    if gateName in self.gateList:
        self._notify_error(ctx._name.start.charPositionInLine,
                           ctx._name.start.charPositionInLine +
                           len(ctx._name.text),
                           f"A gate named {gateName} is already declared")

    if len(gateName) > 6:
        self._notify_error(ctx._name.start.charPositionInLine,
                           ctx._name.start.charPositionInLine +
                           len(ctx._name.text),
                           "Gate name is too long")
    elif len(gateName) < 2:
        self._notify_error(ctx._name.start.charPositionInLine,
                           ctx._name.start.charPositionInLine +
                           len(ctx._name.text),
                           "Gate name is too short")
    self.currentGateName = gateName

    parameters = [param.text for param in ctx._params._params]
    if ctx._arguments:
        angles = [arg.text for arg in ctx._arguments._params]
    else:
        angles = []

    if len(parameters) != len(set(parameters)):
        self._notify_error(ctx._params.start.charPositionInLine,
                           ctx._params.start.charPositionInLine +
                           len(ctx._params.text),
                           "Duplicated parameter in gate declaration")

    if len(angles) != len(set(angles)):
        self._notify_error(ctx._arguments.start.charPositionInLine,
                           ctx._arguments.start.charPositionInLine +
                           len(ctx._arguments.text),
                           "Duplicated angle in gate declaration")

    self.gateList[gateName] = {
        "params": {param: 1 for param in parameters},
        "arguments": {angle: 1 for angle in angles}
    }

    for gate in ctx.user_defined_gate():
        self.visit(gate)

def visitConstant_expression(self, ctx):
    """
    Visit and validate constant expressions, handling arithmetic operations and division by zero.

    Args:
        ctx: Syntax tree context object containing information about the constant expression.

    Returns:
        float: Result of the constant expression evaluation.

    """
    if ctx.constant():
        return self.visit(ctx.constant())

    elif ctx.arithmetic_op():
        left_value = self.visit(ctx.constant(0))
        right_value = self.visit(ctx.constant(1))
        op = ctx.arithmetic_op().getText()

        if op == '/' and right_value == 0:
            self._notify_error(ctx.start.charPositionInLine,
                               ctx.start.charPositionInLine +
                               len(ctx.text),
                               "The denominator cannot be zero")
            return None

        if op == '+':
            return left_value + right_value
        elif op == '-':
            return left_value - right_value
        elif op == '*':
            return left_value * right_value
        elif op == '/':
            return left_value / right_value

    else:
        value = self.visit(ctx.constant())
        op = ctx.arithmetic_op().getText()

        if op == '-':
            return -value

