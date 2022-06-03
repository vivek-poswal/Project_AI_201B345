int operand1 = random.nextInt(10);
int operand2 = random.nextInt(10);
int correctButton= random.nextInt(4);
int correctAnswer =-100;
String operator = operators[random.nextInt(4)];
if (operator.equals("+"))
    correctAnswer= operand1+operand2;
else if (operator.equals("-"))
    correctAnswer=operand1-operand2;
else if (operator.equals("/"))
    correctAnswer=operand1/operand2;
else
    correctAnswer=operand1*operand2;
//check is operand2 is not zero; otherwise in case of division-divide by zero error will come
if (correctButton==0){
    button1.setText(correctAnswer+"");
    button2.setText(correctAnswer+1+"");
    button3.setText(correctAnswer-1+"");
    button4.setText(correctAnswer+2+"");
}
if (correctButton==1) {
    button1.setText(correctAnswer+"");
    button2.setText(correctAnswer+1+"");
    button3.setText(correctAnswer-1+"");
    button4.setText(correctAnswer+2+"");
}
if (correctButton==2) {
    button1.setText(correctAnswer+"");
    button2.setText(correctAnswer+1+"");
    button3.setText(correctAnswer-1+"");
    button4.setText(correctAnswer+2+"");
}
if (correctButton==3) {
    button1.setText(correctAnswer+"");
    button2.setText(correctAnswer+1+"");
    button3.setText(correctAnswer-1+"");
    button4.setText(correctAnswer+2+"");
}

new match

// To calculate total score.
public int sumOfScore(){
    //Computing the sum of score array, which has the 1 or in each index,depending on correct or incorrect answers
    int sum=0;
    for (int i=0;i<score.length;i++){
        sum=sum+score[i];
    }
   // your code here
    return sum;
}

//Function to interpret the performance.
public String getInterpretation(int [][]dataFrame,double slope){
   //provide interpretation based on your slope analysis
    // Your code here
    if(slope>0 && slope<0.5) return "you are better in studying";
          else if (slope>0.5) return "You are better than last time";
    else if (slope<0.5) return "You are not sincere with your studies";
    else return "Better luck next time>>__201b345";
    //return "Your Interpretation";
}
