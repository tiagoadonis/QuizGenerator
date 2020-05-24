grammar ReadQuestions;

program: question+ EOF
	   ; 

question: ID '.' ID '.' Dificulty '(' String ')' '{' answer+ '}' 
		;

answer: String ':' Number ';' 
      ;

Dificulty:  'easy'
         | 'medium'
         | 'hard'
		 ;

Number: [0-9]+;
ID: [a-zA-Z0-9]+;
String : '"' .*? '"' ;
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' .* ? '\n' -> skip;