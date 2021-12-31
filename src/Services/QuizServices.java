/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.ResultSet;
import models.Questions;

/**
 *
 * @author hp
 */
public interface QuizServices {
    public ResultSet Quiz(Questions quiz , int btnVal );
}
