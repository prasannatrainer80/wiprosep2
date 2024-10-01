var Questions = new Array(
    "The father of C,C++ & Unix is",
    "The Open source among following is",
    "Pancake Sorting Algorithm and BASIC Interpreter was written by",
    "Larry page and Sergei Brinn are Co-Founders of ",
    "The first computer to defeat Chess Grandmaster was"
);

var QuestionNo = 0;
var totalQuestions = Questions.length;
var Answers = new Array(totalQuestions);
CorrectAnswers = new Array(totalQuestions);
var Marks = 0;
var Answer = 5;

Choosed = false;
for (var i = 0 ; i < totalQuestions ; i++)
{
    Answers[i] = new Array(4);
}

Answers[0][0] = "Forouzan";
Answers[0][1] = "Dennis Ritchie";
Answers[0][2] = "Andrew Tenenbaum";
Answers[0][3] = "Dijkstra";
CorrectAnswers[0]=2;

Answers[1][0] = "Windows XP";
Answers[1][1] = "Mac OS X";
Answers[1][2] = "Linux Ubuntu";
Answers[1][3] = "Sun Solaris";
CorrectAnswers[1]=4;

Answers[2][0] = "Steve Jobs";
Answers[2][1] = "Steve William";
Answers[2][2] = "Bill Gates";
Answers[2][3] = "Jerry yang";
CorrectAnswers[2] = 3;

Answers[3][0] = "Yahoo";
Answers[3][1] = "Rediff";
Answers[3][2] = "Google";
Answers[3][3] = "Apple";
CorrectAnswers[3]=3;

Answers[4][0] = "Chess Zeus";
Answers[4][1] = "Armageddon";
Answers[4][2] = "White Knight";
Answers[4][3] = "Deep Blue";
CorrectAnswers[4]=4;

function AnswerChoosed(ans) {
    Answer = ans;
    choosed = true;
    // alert(choosed);
}

function NextQuestion() {
        if(Answer == CorrectAnswers[QuestionNo])
        {
            Marks++;
        }
        if(choosed)
            {
               if(QuestionNo < totalQuestions - 1)
               {	
                   QuestionNo++;
                   LoadQuestion();
               }
               else
               {
                   alert("End of Examination \n"+"Marks Are : "+Marks+"");
               }
               Choosed = false;
            }
            else
            {
               alert("No option choosed yet.... ");
            }
}

function LoadQuestion() {
    document.getElementById("Question").innerHTML = "(" + (QuestionNo + 1)+") : " + Questions[QuestionNo];
    document.getElementById("Option0").innerHTML = Answers[QuestionNo][0];
    document.getElementById("Option1").innerHTML = Answers[QuestionNo][1];
    document.getElementById("Option2").innerHTML = Answers[QuestionNo][2];
    document.getElementById("Option3").innerHTML = Answers[QuestionNo][3];
    document.getElementById("Opt1").checked = false;	
	document.getElementById("Opt2").checked = false;	
	document.getElementById("Opt3").checked = false;	
	document.getElementById("Opt4").checked = false;
	Answer = 5;
    
}