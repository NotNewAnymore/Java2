/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java2;

/**
 *
 * @author Not_New_Anymore
 */
public class Dog extends Animal
{
    
    public enum EarType{
        Floppy,
        Pointy
    }

    public Dog(boolean _isLoyal, EarType _eartype, int _legs, String name, String _color, boolean tail) {
        super(_legs, name, _color, tail);
        this._isLoyal = _isLoyal;
        this._eartype = _eartype;
    }
    boolean _isLoyal;
    EarType _eartype;
    
    public Dog(int _legs, String name, String _color, boolean tail) {
        super(_legs, name, _color, tail);
    }
    
    public void Bark(){
        System.out.println("The dog barks");
    }
    
}
