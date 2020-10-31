package com.quizapplication;

public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Strongest Avenger?","Who was first PM of India?","What is the capital of India?"};
    String[] options1={"Ironman","Netaji SubhashChandra Bose","Delhi"};
    String[] options2={"Thor","Jawaharlal Nehru","Jaipur"};
    String[] options3={"Hulk","Sardar Patel","Mumbai"};
    String[] options4={"Dr Strange","Mahatma Gandhi","Noida"};
    int[] answers={2,2,1};


    public void initGame()
    {
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Sahi Jawab!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Galat Jawab!!");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}
