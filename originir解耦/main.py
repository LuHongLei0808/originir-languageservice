import antlr4
from TodoLangGrammarLexer import TodoLangGrammarLexer
from TodoLangGrammarParser import TodoLangGrammarParser
from TodoLangVisitor import TodoLangVisitor

# 从文件或字符串中读取TodoLang代码
input_stream = antlr4.FileStream("your_input_file.txt")
# 创建词法分析器和语法分析器
lexer = TodoLangGrammarLexer(input_stream)
token_stream = antlr4.CommonTokenStream(lexer)
parser = TodoLangGrammarParser(token_stream)

# 解析输入代码并获取解析树
parse_tree = parser.translationunit()  # 替换成你的语法规则

# 创建自定义的访问器
visitor = TodoLangVisitor()

# 遍历解析树并执行操作
result = visitor.visit(parse_tree)

# 打印结果或执行其他操作
print(result)
