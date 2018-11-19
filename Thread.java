
import java.lang.Thread;
public class test extends Thread {
public void run()
{ System.out.print("Thread name is" + Thread.currentThread().getName());
System.out.print("THe Thread priority is" + Thread.currentThread().getPriority());	
}
public static void main()
{
	test ob1 = new test();
	test ob2 = new test();
ob1.setPriority(Thread.MIN_PRIORITY);
ob2.setPriority(Thread.MAX_PRIORITY);

ob1.run();
ob2.run();
}
}

