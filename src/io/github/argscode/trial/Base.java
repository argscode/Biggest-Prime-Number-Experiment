package io.github.argscode.trial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.LinkedList;

public abstract class Base {
	
	private LinkedList<Long> primes;
	private CalculatorID calculator;
	private long limit;
	private long processes;
	private long current;
	
	public Base (long current, long limit, LinkedList<Long> primes, CalculatorID calculator) {
		this.current = current;
		this.limit = limit;
		this.primes = primes;
		this.calculator = calculator;
		processes = 0;
	}
	
	public abstract void deduce ();

	public abstract boolean isDivisible (LinkedList<Long> pdata, long test);
	
	public void publish (BufferedWriter writer) throws IOException {
		for (long l: primes)
			writer.write(String.valueOf(l) + "\n");
		writer.write("\n" + String.valueOf(getProcesses()) + " calculations");
		writer.close();
	}
	public void tick () {
		processes++;
	}
	public LinkedList<Long> getPrimes() {
		return primes;
	}

	public CalculatorID getCalculator() {
		return calculator;
	}

	public long getLimit() {
		return limit;
	}

	public long getProcesses() {
		return processes;
	}

	public long getCurrent() {
		return current;
	}
	
	public void setCurrent (long current) {
		this.current = current;
	}

	
}
