/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.web.swapnilpatelprojects.springbootpetchecker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author swapn
 */

@RestController
public class PetController {

    //main method that select different instance of Pet reference based on config parameter value and reponds accordingly
    @GetMapping("/pet")
    public String selector(@RequestParam(value = "config", defaultValue = "World") String config) {
        Pet pet;
        
        switch(config){
            case "CAT" -> pet = new Cat();
            case "DOG" -> pet = new Dog();
            case "GOAT" -> pet = new Goat();
            default -> {
                return "Please input CAT DOG or GOAT as config parameter.";
            }
        }
        
        return pet.respond();
    }
}
