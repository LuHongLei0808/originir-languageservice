import { Suggester, SuggestionSymbol } from "./type";
import { CommonTokenStream } from 'antlr4ts';
export class OriginirSuggester implements Suggester {

    dictionary: SymbolDictionary = new SymbolDictionary();

    availableSymbols(): SuggestionSymbol[] {
        return this.dictionary.allSymbols();
    }

}


class SymbolDictionary {

    symbols = [
        {
            label: 'QINIT',
            detail: 'QINIT num',
            type: 'init',
            documentation: 'init qubit',
            parent: 'ORIGINIT',
            data: {
                languageId: 'originiir'
            }
        },
        {
            label: 'QIF',
            detail: '',
            documentation: 'Quantum if',
            type: 'QIF',
            parent: 'ORIGINIR',
            data: {
                languageId: 'originir'
            }
        },
        {
            label: 'QELSE',
            detail: '',
            documentation: 'Quantum selector',
            type: 'QELSE',
            parent: 'ORIGINIR',
            data: {
                languageId: 'originir'
            }
        },
        {
            label: 'QWHILE',
            detail: '',
            documentation: 'Quantum condition',
            type: 'QWHILE',
            parent: 'ORIGINIR',
            data: {
                languageId: 'originir'
            }
        },
        {
            label: 'H',
            detail: 'H qubit',
            documentation: 'The hardamard gate H acts on the object qubit q.It is represented by the Hadamard matrix. \n\r q: The object qubit.',
            type: 'H_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        }, 
        {
            label: 'X',
            detail: 'X qubit',
            documentation: 'The X gate is the Pauli X gate which can flip the qubit from |0> to |1>, or |1> to |0>, and it is a Pi-rottation around the X-axis. \n\r q: The object qubit.',
            type: 'X_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        }, 
        {
            label: 'NOT',
            detail: 'NOT qubit',
            documentation: 'Create a NOT(qubit) gate.',
            type: 'NOT_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        }, 
        {
            label: 'T',
            detail: 'T qubit',
            documentation: 'The T gate is a Pi/4 rotation around the Z axis, and it is required for universal control. \n\r q: The object qubit.',
            type: 'T_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        }, 
        {
            label: 'S',
            detail: 'S qubit',
            documentation: 'The S gate is a Pi/8 rotation around the Z axis, and it is required for universal control. \n\r q: The object qubit.',
            type: 'S_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },
        {
            label: 'Y',
            detail: 'Y qubit',
            documentation: 'The Pauli-Y gate acts on a single qubit q. It equates to a rotation around the Y-axis of the Bloch sphere by Pi radians. \n\r q: The object qubit.',
            type: 'Y_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'Z',
            detail: 'Z qubit',
            documentation: 'The Pauli-Z gate acts on a single qubit qubit q. It equates to a rotation around the Z-axis of the Bloch sphere by Pi radians. \n\r q: The object qubit.',
            type: 'Z_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },           
        {
            label: 'X1',
            detail: 'X1 qubit',
            documentation: 'The X1 gate acts on a single qubit q. It equates to a rotation around the X-axis of the Bloch sphere by Pi/2 radians. \n\r q: The object qubit.',
            type: 'X1_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'Y1',
            detail: 'Y1 qubit',
            documentation: 'The Y1 gate acts on a single qubit q. It equates to a rotation around the Y-axis of the Bloch sphere by Pi/2 radians. \n\r q: The object qubit.',
            type: 'Y1_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'Z1',
            detail: 'Z1 qubit',
            documentation: 'The Z1 gate acts on a single qubit q. It equates to a rotation around the Z-axis of the Bloch sphere by Pi/2 radians. \n\r q: The object qubit.',
            type: 'Z1_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'I',
            detail: 'I qubit',
            documentation: 'The I gate acts on a single qubit q.',
            type: 'I_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },  
        {
            label: 'RX',
            detail: 'RX qubit, (angle)',
            documentation: 'RX is a rotation gate acts on single qubit q. It equates to a rotation around the X-axis of the Bloch sphere by a(the angle parameter) radians. \n\r q: The object qubit. \n\r a: is a angle parameter.',
            type: 'RX_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'RY',
            detail: 'RY qubit, (angle)',
            documentation: 'RY is a rotation gate acts on single qubit q. It equates to a rotation around the Y-axis of the Bloch sphere by a(the angle parameter) radians. \n\r q: The object qubit. \n\r a: is a angle parameter.',
            type: 'RY_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'RZ',
            detail: 'RZ qubit, (angle)',
            documentation: 'RZ is a rotation gate acts on single qubit q. It equates to a rotation around the Z-axis of the Bloch sphere by a(the angle parameter) radians. \n\r q: The object qubit. \n\r a: is a angle parameter.',
            type: 'RZ_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'U1',
            detail: 'U1 qubit, (alpha)',
            documentation: 'The U1 gate acts on a single qubit q with 1 angle parameter. It is represented by a unitary matrix with 1 parameters. \n\r q: The object qubit. \n\r alpha: is a angle parameter.',
            type: 'U1_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },  
        {
            label: 'U2',
            detail: 'U2 qubit, (alpha)',
            documentation: 'The U2 gate acts on a single qubit q with 2 angle parameter. It is represented by a unitary matrix with 1 parameters. \n\r q: The object qubit. \n\r alpha: is a angle parameter.  \n\r beta: is a angle parameter.',
            type: 'U2_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },  
        {
            label: 'U3',
            detail: 'U3 qubit, (alpha, beta, gamma)',
            documentation: 'The U3 gate acts on a single qubit q with 3 angle parameter. It is represented by a unitary matrix with 3 parameters. \n\r q: The object qubit. \n\r alpha: is a angle parameter. \n\r beta: is a angle parameter. \n\r gamma: is a angle parameter.',
            type: 'U3_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },  

        {
            label: 'U4',
            detail: 'U4 qubit, (alpha, beta, gamma, delta)',
            documentation: 'The U4 gate acts on a single qubit q with 4 angle parameter. It is represented by a unitary matrix with 4 parameters. \n\r q: The object qubit. \n\r alpha: is a angle parameter. \n\r beta: is a angle parameter. \n\r gamma: is a angle parameter. \n\r delta: is a angle parameter.',
            type: 'U4_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },  
        {
            label: 'CNOT',
            detail: 'CNOT control_qubit, target_qubit',
            documentation: 'The controlled NOT gate CNOT acts on 2 qubits, and performs the NOT operation on q1 only when q2 is |1> , and otherwise leaves it unchanged. \n\r q1: the control qubit. \n\r q2: The target object qubit. ',
            type: 'CNOT_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'CU',
            detail: 'C-U4 control_qubit, target_qubit, (alpha, beta, gamma, delta)',
            documentation: 'The controlled gate CU acts on 2 qubits, and performs the U4 on q1 only when q2 is |1> , and otherwise leaves it unchanged. \n\r q1: the control qubit. \n\r q2: The target object qubit. \n\r alpha: is a angle parameter. \n\r beta: is a angle parameter. \n\r gamma: is a angle parameter. \n\r delta: is a angle parameter.',
            type: 'CU_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },
        {
            label: 'CR',
            detail: 'CR control_qubit, target_qubit, (angle)',
            documentation: 'The controlled gate CR acts on 2 qubits, and performs the rotation operation with parameter a on q1 only when q2 is |1> , and otherwise leaves it unchanged. q1: the control qubit. \n\r q2: The target object qubit. \n\r a: is a angle parameter.',
            type: 'CR_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },   
        {
            label: 'CZ',
            detail: 'CZ control_qubit, target_qubit',
            documentation: 'The controlled gate Z acts on 2 qubits, and performs the Z operation on q1 only when q2 is |1> , and otherwise leaves it unchanged. \n\r q1: the control qubit. \n\r q2: The target object qubit. ',
            type: 'CZ_GATE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },
        {
            label: 'ISWAP',
            detail: 'ISWAP qubit1, qubit2, (theta)',
            documentation: 'The iSwap gate acts on 2 qubits. Similar like Swap gate, just exchange the information of two qubits. \n\r q1: The object qubit. \n\r q2: The object qubit. \n\r a: is a angle parameter.',
            type: 'ISWAP',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        }, 
        {
            label: 'TOFFOLI',
            detail: 'TOFFOLI qubit1, qubit2, qubit3',
            documentation: 'The Toffoli gate.',
            type: 'Toffoli',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        }, 
        {
            label: 'MEASURE',
            detail: 'MEASURE qubit, cbit',
            documentation: 'measure the qubit q, then the measurement information is taken,and stored in c. \n\r q: The object qubit. \n\r c: is the result of measurement.',
            type: 'MEASURE',
            parent: 'ORIGINIR',
            data: { 
                languageId: 'originir'
            }
        },
        {
            label: 'DAGGER',
            detail: '',
            documentation: 'The transpose conjugate of operator',
            type: 'dagger',
            parent: 'ORIGINIR',
            data: {
                languageId: 'originir'
            }
        },
        {
            label: 'QGATE',
            detail: '',
            documentation: 'define a custome gate',
            type: 'qgate',
            parent: 'ORIGINIR',
            data: {
                languageId: 'originir'
            }
        }
    ];

    allSymbols(): SuggestionSymbol[] {
        return this.symbols;
    }

}