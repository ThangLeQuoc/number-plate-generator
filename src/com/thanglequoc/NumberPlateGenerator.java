package com.thanglequoc;

import java.util.Random;

public class NumberPlateGenerator {

    public String generateRandomNumberPlate() {
	Random random = new Random();
	// pattern 99x9-999.99
	int firstAndSecondDigits = (int) (Math.random() * 90) + 10;
	char character = (char) (random.nextInt(26) + 'A');
	int forthDigits = (int) (Math.random() * 9);
	int tripleSetDigits = (int) (Math.random() * 900) + 100;
	int twoLastDigits = (int) (Math.random() * 90) + 10;
	
	String numberPlate = String.valueOf(firstAndSecondDigits)+String.valueOf(character)+String.valueOf(forthDigits)+"-"+String.valueOf(tripleSetDigits)+"."+String.valueOf(twoLastDigits);	
	return numberPlate;
    }
    

}
