grammar QuizGenerator;

program: 'Begin' 'create' ID main* 'endcreate' EOF;

main: instructions ';'					#instMain
	| forBlock							#forMain
	| ifBlock							#ifMain
	;

forBlock: 'for' ID 'in' ID ':' main+ 'endfor'
		;

ifBlock: 'if' '(' ID '==' ID'.correctAnswer()' ')' ':' main+ other? 'endif' //abre brevemente 
	   ; 

other: 'else' ':' main+
	 ;

instructions: assignment				#assignInst
			| command					#commandInst
			| createQuestion			#questInst
			;

createQuestion: 'Question' ID '.text' '=' WORD #createQuestionphrase
			  | ID '.theme' '=' WORD			#createQuestionTheme
			  | ID '.difficulty' '=' difficulty	#createQuestionDifficulty
			  | ID '.answer' '(' WORD ',' NUM ')' #createQuestionAnswer
			  ;

assignment: declaration 		 		#declarAssign
		  | attribution 				#attribAssign
		  | questionDeclaration			#questDeclarAssign
		  | questionAttribution			#questAttribAssign
		  | bdAttribution				#bdAttribAssign
		  ;

declaration: type ID					#declarVar
		   | type '[]' ID 				#declarArray
		   ;

attribution: type? ID '=' expr 								#attribVar
		   | type? '[]' ID '=' '[' (expr ',')* expr ']'		#attribArray
		   ;	



expr:  WORD								#wordExpr
	| mathExpr							#math
	;

type: 'String' 		 #typeString											
	| 'int'			#typeInt						
	|	'double'  #typeDouble
	;
bdAttribution: 'DB' ID '=' 'load' '(' WORD ')' 	#bdAttrib
			;

questionDeclaration: 'Question' ID 			#questDeclarVar
				   | 'Question' '[]' ID		#questDeclarArray
				   ;

questionAttribution: 'Question' ID '=' ID '.get' '(' NUM ',' difficulty ',' (ID|WORD) ')'			#questAttribVar
				   | 'Question' '[]' ID '=' ID '.get' '(' NUM ',' difficulty ',' (ID|WORD) ')'		#questAttribArray
				   ;

command: 'answersMode' '=' testType 			#answerModeCommand
	   | ID '.add' '(' ID ')'					#addCommand
	   | 'rand' randMethod						#randCommand
	   | ID '.numAnswers' '(' NUM ')'			#numAnswersCommand
	   | 'print' (ID | WORD) 					#printCommand
	   | ID '=' mathExpr						#mathExprCommand
	   ;

mathExpr: mathExpr op=('*' | '/') mathExpr		#multDivExpr
		| mathExpr op=('+' | '-') mathExpr		#addSubExpr
		| NUM 									#numMathExpr
		| '(' mathExpr ')'						#parenthExpr
		| ID									#idExpr
		;

randMethod: ID 									#idRandMethod
		  | ID '.answers()'						#answersRandMethod
	      ;

testType: 'multipleChoice'						#multipleChoiceType
		| 'trueOrFalse'							#trueOrFalseType
		;

difficulty: 'easy'								#easyDifficulty
		  | 'medium'							#mediumDifficulty
		  | 'hard'								#hardDifficulty
		  ;

NUM: [0-9]+ ('.'[0-9]*)?;
ID: [a-zA-Z] [a-zA-Z0-9_]*;
WORD: ('"' (~'"')* '"');
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n'-> skip;