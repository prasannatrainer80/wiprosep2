var questions = 
[
    "1. What is HTML",
    "2. WWW stands for",
    "3. Java is Object Oriented",
    "4. Boxing and Unboxing",
    "5. Junit is for Testing Framework"
]

var questionNo = 0;
var totalQuestions = questions.length;

function load() {
    document.getElementById("question").innerHTML = questions[questionNo];
}

function prevQuestion() {
    questionNo--;
    if (questionNo < 0) {
        questionNo = 0;
    }
    load();
}

function nextQuestion() {
    questionNo++;
    if (questionNo==totalQuestions) {
        questionNo = totalQuestions - 1;
    }
    load();
}