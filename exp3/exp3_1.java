public class exp3_1{
	public static void main(String args[]){
		Counter c = new Counter();
		c.CounterValue = 1;
		c.increment();
		c.decrement();
		c.reset();
	}
}

public class Counter{
	public int CounterValue;
	public void increment(){
		this.CounterValue += 1;
	}
	public void decrement(){
		this.CounterValue -= 1;
	}
	public void reset(){
		this.CounterValue = 0;
	}
}