package net.zeltins.pyramid.rest;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class PyramidServiceResponse {

	private final String requestId;
	private final Boolean isPyramidWord;
	
	public PyramidServiceResponse(String requestId, Boolean isPyramidWord) {
		this.requestId = requestId;
		this.isPyramidWord = isPyramidWord;
	}
	
	public String getRequestId() {
		return requestId;
	}
	
	public Boolean getIsPyramidWord() {
		return isPyramidWord;
	}
}
