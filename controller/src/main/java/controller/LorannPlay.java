package controller;

import contract.ILorannMap;



public class LorannPlay{
	private final ILorannMap	map;
	private ILorannMap			LorannMeeting;
	//private INettleFrame				nettleFrame;
	
	public LorannPlay(final ILorannMap map) {
		this.map = map;
		this.map.addMobile(new Hero(), 18, 15);
	}

	private ILorannMap getLorannMap() {
		return this.map;
	}

	private ILorannMap getLorannMeeting() {
		return this.LorannMeeting;
	}

//	private INettleFrame getNettleFrame() {
//		return this.nettleFrame;
//	}
//	public void setNettleFrame(final INettleFrame nettleFrame) {
//		this.nettleFrame = nettleFrame;
//	}

	
	
}
