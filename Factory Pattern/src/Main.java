public class Main {
	public static void main(String[] args) {
		AudiStore usStore;
		AudiStore euStore;
		usStore = new USAudiStore();
		euStore = new EUAudiStore();
		
		Audi forUS = usStore.orderAudi("r4");
		Audi forEU = euStore.orderAudi("r4");
	}
}
