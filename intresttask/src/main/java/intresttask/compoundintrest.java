package intresttask;
import java.lang.Math;  
public class compoundintrest {
Double intrestcalculation(Double amount,Double rate,Double duration,Double increment)
{
	Double ci=amount*Math.pow(1+rate/increment,increment*duration);
	return ci-amount;
}
}
