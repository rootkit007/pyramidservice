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
	
	/**
	 * @return Request ID
	 */
	public String getRequestId() {
		return requestId;
	}
	
	/**
	 * @return Whether the word in original request is pyramid word or not
	 */
	public Boolean getIsPyramidWord() {
		return isPyramidWord;
	}
}
