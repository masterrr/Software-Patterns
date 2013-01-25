public class StrategyPattern {
	public static void main(String[] args) {
		System.out.print("Strategy pattern demonstration \n");
		Dog black = new Dog();
		// Barking on thief loud and running after him soo fast
		black.performBark(); // Barking
		black.performRun(); // Running
		black.setRunBehavior(new RunSlow()); // Whoops, didn't overdrive him
		black.performRun(); // Slow down
		black.setBarkBehavior(new BarkQuietly()); // Barking Quietly after the thief
		black.performBark();
		black.setBarkBehavior(new BarkMute()); // Shut up, dog
		black.performBark();		
	}
}
