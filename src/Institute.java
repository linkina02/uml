public class Institute {

	public String name;
	public String address;
	private ResearchAssociate[] researches;

	/**
	 * 
	 * @param name
	 * @param address
	 * @param researches
	 */
	public Institute(String name, String address, ResearchAssociate[] researches) {
		// TODO - implement Institute.Institute
		throw new UnsupportedOperationException();
	}

	public ResearchAssociate[] getResearches() {
		return this.researches;
	}

	/**
	 * 
	 * @param researches
	 */
	public void setResearches(ResearchAssociate[] researches) {
		this.researches = researches;
	}

	/**
	 * 
	 * @param researchAssociate
	 */
	public void dismissResearcher(ResearchAssociate researchAssociate) {
		// TODO - implement Institute.dismissResearcher
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param researcher
	 */
	public void addResearcher(ResearchAssociate researcher) {
		// TODO - implement Institute.addResearcher
		throw new UnsupportedOperationException();
	}

	public void destroy() {
		// TODO - implement Institute.destroy
		throw new UnsupportedOperationException();
	}

}