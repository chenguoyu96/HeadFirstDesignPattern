package org.chenguoyu.templatemethod.example;

import org.chenguoyu.templatemethod.example.hook.CoffeeWithHook;
import org.chenguoyu.templatemethod.example.hook.TeaWithHook;
import org.chenguoyu.templatemethod.example.nohook.Coffee;
import org.chenguoyu.templatemethod.example.nohook.Tea;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
