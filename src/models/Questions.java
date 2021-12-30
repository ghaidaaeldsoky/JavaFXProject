
package models;

public class Questions {
    private int id;
    private String question;
    private String ans1;
    private String ans2;
    private String ans3;
    private String correct;

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAns1() {
        return ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public String getCorrect() {
        return correct;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
    
    
    
    
}
