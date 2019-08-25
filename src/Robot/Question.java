/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Robot;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Murakami
 */
public class Question 
{
    private List<String> Questions;
    
    public Question()
    {
        Questions = new ArrayList<>();
    }
    
    private String findQuestion(String q)
    {
        String Finded = null;
        
        for (String item : Questions)
        {
            if (item.equals(q))
            {
                Finded = item;
                break;
            }
        }
        
        return Finded;
    }
    
    public void addQuestion(String q)
    {
        String Finded = findQuestion(q);
        
        if (Finded == null)
            Questions.add(q);
    }
    
    public void removeQuestion(String q)
    {
        String Finded = findQuestion(q);
        
        if (Finded != null)
            Questions.remove(q);
    }
    
    public String getQuestion(int ID)
    {
        return Questions.get(ID);
    }
    
    public int getLength()
    {
        return Questions.size();
    }
}
