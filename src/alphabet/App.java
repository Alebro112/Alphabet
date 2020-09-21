/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---ABC---");

        String a = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
        
        char abc[] =  a.toCharArray();
        char notAbc[] = new char[33]; 
        
        boolean isAllLetters = true;
        
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        for (int i = 0; i < abc.length; i++){
            int index = str.indexOf(abc[i]);
            if (index == -1) { notAbc[i] = abc[i]; isAllLetters = false; }            
        }
        if (!isAllLetters){
            System.out.println("В строке не все буквы, нехватает: " + new String(notAbc));
        } else {
            System.out.println("В строке все буквы");
        }
    }
}
