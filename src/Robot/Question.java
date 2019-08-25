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
    
    // Responsible for initializing the list
    public Question()
    {
        Questions = new ArrayList<>();
    }
    
    // Look for a question for another function
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
      
    // Add a question to the list
    public void addQuestion(String q)
    {
        String Finded = findQuestion(q);
        
        if (Finded == null)
            Questions.add(q);
    }
    
    // Remove a question from the list
    public void removeQuestion(String q)
    {
        String Finded = findQuestion(q);
        
        if (Finded != null)
            Questions.remove(q);
    }
    
    // Take a question from the list
    public String getQuestion(int ID)
    {
        return Questions.get(ID);
    }
    
    // Get list size
    public int getLength()
    {
        return Questions.size();
    }
}
