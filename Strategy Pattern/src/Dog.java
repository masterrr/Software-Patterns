public class Dog {
	BarkBehavior barkBehavior;
	RunBehavior runBehavior;
	
	public Dog() {
		barkBehavior = new BarkLoudly();
		runBehavior = new RunFast(); // We have a real big dog
	}
	
	public void performBark() {
		barkBehavior.bark();
	}
	public void performRun() {
		runBehavior.run();
	}
	
	public void setBarkBehavior(BarkBehavior bb) {
		barkBehavior = bb;
	}
	public void setRunBehavior(RunBehavior rb) {
		runBehavior = rb;
	}
	
	// All dogs sleep
	public void sleep() {
		System.out.println("Sleeping...");
	}
}
 