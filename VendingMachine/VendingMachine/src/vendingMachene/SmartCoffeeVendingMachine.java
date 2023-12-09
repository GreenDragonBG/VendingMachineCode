package vendingMachene;

import java.io.Console;
import java.util.Collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SmartCoffeeVendingMachine extends CoffeeVendingMachine{

	public SmartCoffeeVendingMachine(Collection<String> ingredients) {
		super(ingredients);
	}
	
	public void notifySupport(String ingredient) {
		System.out.println("Ingredient "+ ingredient +" is almost over. Current amount: " + getIngerdientSupply(ingredient));
	}

	@Override
	public void brewRecipe(Recipe recipe) {
		super.brewRecipe(recipe);
		for (String ingredient : super.containers.keySet()) {
			if(super.containers.get(ingredient)< super.capacity*0.2) {
				notifySupport(ingredient);
			}
		}
	}
}
