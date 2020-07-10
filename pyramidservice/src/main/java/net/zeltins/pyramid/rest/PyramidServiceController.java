package net.zeltins.pyramid.rest;

import org.springframework.web.bind.annotation.*;

import net.zeltins.pyramid.PyramidLogic;

@RestController
public class PyramidServiceController {

	@RequestMapping(method = RequestMethod.GET,path = "/ispyramidword")
	public PyramidServiceResponse IsPyramidWordService(@RequestParam String requestId,@RequestParam String word) {
		
		return new PyramidServiceResponse(requestId,PyramidLogic.IsPyramidWord(word));
		
	}
	
}
