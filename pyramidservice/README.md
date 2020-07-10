Spring boot application

Implements endpoint for RESTful webservice to determine if provided word is "pyramid" word

Run Maven goal spring-boot:run to launch local webserver

URL is http://localhost:8080/ispyramidword. Required "requestId" and "word" GET parameters, such as:

http://localhost:8080/ispyramidword?requestId=1&word=bandana

Returns JSON-encoded response body containing string requestId (same as passed in requestId), and boolean isPyramidWord 
denoting whether the provided word is pyramid word or not

