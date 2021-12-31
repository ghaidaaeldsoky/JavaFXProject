
package javacontroller;

import Services_implementation.QuizServiceImpl;
import Services_implementation.UserServiceImpl;
import java.sql.ResultSet;
import models.Questions;
import models.UserModel;

public class userController {
    
    private UserServiceImpl userServiceImpl;
    private QuizServiceImpl quizServiceImpl;
    int btnVal ;
    
    public userController(int btnVal){
        this.btnVal = btnVal;
        quizServiceImpl = new QuizServiceImpl();
    }
    

    public userController() {
        
        userServiceImpl = new UserServiceImpl();
        
    }
    
    
    public int login(UserModel user){
        return userServiceImpl.login(user);
    }
    
     public int register(UserModel user){
        return userServiceImpl.signUp(user);
    }
     
     public ResultSet Quiz(Questions q, int qid) {
         return quizServiceImpl.Quiz(q,qid) ;
     }
     
}
