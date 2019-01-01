package io.github.argscode.trial;

import java.util.LinkedList;

public class OriginalCalculator extends Base {

	public OriginalCalculator(long current, long limit, LinkedList<Long> primes, CalculatorID calculator) {
		super(current, limit, primes, calculator);
	}

	@Override
	public void deduce() {
		while (getCurrent() < getLimit())
		{
			setCurrent(getCurrent() + 1);
			if (!isDivisible(getPrimes(), getCurrent()))
			{
				getPrimes().add(getCurrent());
				System.out.println(getCurrent());
			}
		}
	}

	@Override
	public boolean isDivisible(LinkedList<Long> pdata, long test) {
		long tempTrial = 0;
		for (int i = 0; i < pdata.size(); i++)
		{
			tick();
			tempTrial = pdata.get(i);
			if (test % tempTrial == 0)
				return true;
		}
		return false;
	}

}
