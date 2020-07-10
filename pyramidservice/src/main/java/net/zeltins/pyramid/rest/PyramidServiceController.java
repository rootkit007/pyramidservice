package net.zeltins.pyramid.rest;

import org.springframework.web.bind.annotation.*;

import net.zeltins.pyramid.PyramidLogic;

@RestController
public class PyramidServiceController {

	/**
	 * @param requestId String identifying the request 
	 * @param word Word to be analyzed
	 * @return Response containing passed-in requed ID, and boolean denoting whether word is pyramid word
	 */
	@RequestMapping(method = RequestMethod.GET,path = "/ispyramidword")
	public PyramidServiceResponse IsPyramidWordService(@RequestParam String requestId,@RequestParam String word) {
		
		return new PyramidServiceResponse(requestId,PyramidLogic.IsPyramidWord(word));
		
	}
	
}
