/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services_implementation;

import Services.QuizServices;
import controller.SubjectsController;
import dao.q_dao;
import java.sql.ResultSet;
import models.Questions;

/**
 *
 * @author hp
 */
public class QuizServiceImpl implements QuizServices {
    
    q_dao q;
  
    public QuizServiceImpl() {
       q =new q_dao();
    }
    

    @Override
    public ResultSet Quiz(Questions quiz , int qid ) {
        SubjectsController btn = new SubjectsController();
        int btnVal = btn.btnVal();
        
        if (btnVal ==1) {
            return q.quiz1(quiz, qid);
        }
        else if (btnVal ==2){
            return q.quiz2(quiz, qid);
        }
        else if (btnVal ==3){
            return q.quiz3(quiz, qid);
        }
        else if (btnVal ==4){
            return q.quiz4(quiz, qid);
        }
        else if (btnVal ==5){
            return q.quiz5(quiz, qid);
        }

    
        return null;
     
    }
    
}
