/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.fms.api;

import com.fms.model.Question;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-27T17:20:00.118+05:30[Asia/Calcutta]")
@Api(value = "question", description = "the question API")
public interface QuestionApi {

    Logger log = LoggerFactory.getLogger(QuestionApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "To add a question", nickname = "addQuestionUsingPOST", notes = "Put the Question details in the body", response = Question.class, tags={ "question-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Question.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/question",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Question> addQuestionUsingPOST(@ApiParam(value = "Give the question details to be added" ,required=true )  @Valid @RequestBody Question body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"event_id\" : 6,\r\n  \"question\" : \"question\",\r\n  \"question_id\" : 0,\r\n  \"feedback_type\" : \"feedback_type\"\r\n}", Question.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default QuestionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "To update the question", nickname = "editQuestionUsingPUT", notes = "Put the updated question details in the body", response = Question.class, tags={ "question-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Question.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/question",
        produces = { "*/*" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Question> editQuestionUsingPUT(@ApiParam(value = "Give the question details to be updated" ,required=true )  @Valid @RequestBody Question body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"event_id\" : 6,\r\n  \"question\" : \"question\",\r\n  \"question_id\" : 0,\r\n  \"feedback_type\" : \"feedback_type\"\r\n}", Question.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default QuestionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Find the questions for event", nickname = "getQuestionListUsingGET", notes = "Provide an id to look up for questions related to the event", response = Question.class, responseContainer = "List", tags={ "question-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Question.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/question/{eventId}",
        produces = { "*/*" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Question>> getQuestionListUsingGET(@ApiParam(value = "Id value for the questions you are searching for",required=true) @PathVariable("eventId") Integer eventId
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\r\n  \"event_id\" : 6,\r\n  \"question\" : \"question\",\r\n  \"question_id\" : 0,\r\n  \"feedback_type\" : \"feedback_type\"\r\n}, {\r\n  \"event_id\" : 6,\r\n  \"question\" : \"question\",\r\n  \"question_id\" : 0,\r\n  \"feedback_type\" : \"feedback_type\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default QuestionApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}