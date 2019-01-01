package io.github.argscode.trial;

import java.util.LinkedList;

public class EvenRemovalCalculator extends Base {

	public EvenRemovalCalculator(long current, long limit, LinkedList<Long> primes, CalculatorID calculator) {
		super(current, limit, primes, calculator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deduce() {
		if (getCurrent() % 2 == 0)
			setCurrent(getCurrent() + 1);
		while (getCurrent() < getLimit())
		{
			setCurrent(getCurrent() + 2);
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
