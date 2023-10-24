/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java2;

/**
 *
 * @author Not_New_Anymore
 */
public class Animal {
    int _legs;
    String name;
    String _color;
    boolean tail;

    public Animal(int _legs, String name, String _color, boolean tail) {
        this._legs = _legs;
        this.name = name;
        this._color = _color;
        this.tail = tail;
    }

    public int getLegs() {
        return _legs;
    }

    public void setLegs(int _legs) {
        this._legs = _legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String _color) {
        this._color = _color;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }


    public void Run(){
        System.out.println(this.name + " Is running on " + this._legs);
    }
    
}
