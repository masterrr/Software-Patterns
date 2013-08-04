public class EUAudiStore extends AudiStore {

	@Override
	Audi assembleAudi(String type) {
		if (type.equals("r4")) {
			return new AudiA4EU();
		} else {
			return null;
		}
	}

}
