class SingletonConditional {
	private volatile static SingletonConditional uniqueInstance;
	
	private SingletonConditional() {}
	
	public static SingletonConditional getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonConditional.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonConditional();
				}
			}
		}	
		return uniqueInstance;
	}
	
	public void Test() {
		System.out.println("SingletonConditional Method Test");
	}
}