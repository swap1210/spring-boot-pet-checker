/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.web.swapnilpatelprojects.springbootpetchecker.controllers;

/**
 *
 * @author swapn
 */
public class Dog implements Pet{

    @Override
    public String respond() {
        return "You selected Dog, it says woof!";
    }

}
