package io.github.argscode.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import io.github.argscode.trial.CalculatorID;
import io.github.argscode.trial.EvenRemovalCalculator;
import io.github.argscode.trial.HalfCalculator;
import io.github.argscode.trial.OriginalCalculator;
import io.github.argscode.trial.SmartCalculator;

public class Main {

	public static void main(String[] args) throws IOException {
	
		LinkedList<Long> primes = new LinkedList();
		//Program can only start at 2 or 3 right now
		long current = 2;
		long limit = 1000;
		primes.add(current);
				
		int fileNumber = (int)(Math.random() * 1000000);
		
		BufferedWriter writerA = new BufferedWriter(new FileWriter("A_limit_" + String.valueOf(limit) + "_id" + String.valueOf(fileNumber) + ".txt"));
		
		OriginalCalculator calculator_1 = new OriginalCalculator(current, limit, primes, CalculatorID.OriginalRough);
		calculator_1.deduce();
		calculator_1.publish(writerA);
		
		BufferedWriter writerB = new BufferedWriter(new FileWriter("B_limit_" + String.valueOf(limit) + "_id" + String.valueOf(fileNumber) + ".txt"));
		
		HalfCalculator calculator_2 = new HalfCalculator(current, limit, primes, CalculatorID.HalfRough);
		calculator_2.deduce();
		calculator_2.publish(writerB);
		
		BufferedWriter writerC = new BufferedWriter(new FileWriter("C_limit_" + String.valueOf(limit) + "_id" + String.valueOf(fileNumber) + ".txt"));

		EvenRemovalCalculator calculator_3 = new EvenRemovalCalculator(current, limit, primes, CalculatorID.Skipper);
		calculator_3.deduce();
		calculator_3.publish(writerC);
		
		BufferedWriter writerD = new BufferedWriter(new FileWriter("D_limit_" + String.valueOf(limit) + "_id" + String.valueOf(fileNumber) + ".txt"));

		SmartCalculator calculator_4 = new SmartCalculator(current, limit, primes, CalculatorID.Skipper);
		calculator_4.deduce();
		calculator_4.publish(writerD);
		
		
	}

}
