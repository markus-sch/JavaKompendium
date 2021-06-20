/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javakompendium;

/**
 *
 * @author markusschlussmeier
 */
public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> meinStack = new Stack<>();
        meinStack.push(3);
        meinStack.push(19);
        meinStack.push(12);
        meinStack.push(5);
        System.out.println("Der gesamte Stapel: " + meinStack);
        int element = meinStack.pop();
        System.out.println("Das erste Element: " + element);
        System.out.println("Der neue Stapel: " + meinStack);
    }
    
}
