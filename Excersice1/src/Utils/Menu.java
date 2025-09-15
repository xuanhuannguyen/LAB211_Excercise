/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public abstract class Menu {
     private String title;
    private ArrayList<String> function;
    public Menu(String title, String[] function) {
        this.title = title;
        this.function = new ArrayList<String>();
        for(String index : function)
        {
            this.function.add(index);
        }
    }
    public void display() {
        System.out.println(title);
        System.out.println("-------------------------------");
        for(int i=0 ; i<function.size();i++)
        {
            System.out.println((i+1)+". "+function.get(i));
        }
        System.out.println("-------------------------------");
    }
    public int getSelected() {
        display();
        System.out.println("Enter your choices: ");
        return Validator.validSelected(function.size());        
    }
    
    public abstract void execute(int n);
    
    public void run() {
        while(true){
            int n = getSelected();
            if (n == function.size())
            {
                System.out.println("Exited");
                break;
            }
            execute(n);
        }       
    }
}
