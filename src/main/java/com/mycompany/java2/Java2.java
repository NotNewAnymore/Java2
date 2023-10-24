/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java2;

import static com.mycompany.java2.Dog.EarType.Floppy;

/**
 *
 * @author Not_New_Anymore
 */
public class Java2 {

    public static void main(String[] args) {
        Animal guy = new Animal(7,"Spider","Black",true);
    guy.Run();
    
    Dog dog1 = new Dog(true, Floppy, 4, "Dogwin", "Dark Cyan", true);
    dog1.Run();
    }
}

