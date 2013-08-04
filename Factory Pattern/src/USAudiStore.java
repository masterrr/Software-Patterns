public class USAudiStore extends AudiStore {

	@Override
	Audi assembleAudi(String type) {
		if (type.equals("r4")) {
			return new AudiA4US();
		} else {
			return null;
		}
	}

}
