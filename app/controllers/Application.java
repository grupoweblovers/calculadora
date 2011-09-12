package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void somar(double num1, double num2) {
    	renderText("A soma é: " + (num1 + num2));
    }
    
    public static void diminuir(double num1, double num2) {
    	renderText("A diferença é: " + (num1 - num2));
    }
    
    public static void multiplicar(double num1, double num2) {
    	renderText("A multiplicação é: " + (num1 * num2));
    }
    
    public static void dividir(double num1, double num2) {
    	renderText("A divisão é: " + (num1 / num2));
    }

}