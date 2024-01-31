package com.cgtmse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cgtmse.entity.Person;

@RestController
public class TestController {
	
	
	
	@GetMapping("/test/get/reqParam")
	public ResponseEntity<Integer> getReqParam( @RequestParam int id1, @RequestParam int id2 ){
		System.out.println("ok reached getReqParam");
		int res = id1 + id2;
		System.out.println("res in getReqParam" +res);
		return new ResponseEntity<Integer>(res, HttpStatus.OK);
	}
	@GetMapping("/test/get/pathVariable/{fname}/{lname}")
	public ResponseEntity<String> getPathVariable( @PathVariable String fname, @PathVariable String lname ){
		System.out.println("ok reached getPathVariable");
		String res = fname + lname;
		System.out.println("res in getReqParam" +res);
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	@GetMapping("/test/get/requestBody")
	public ResponseEntity<?> getRequestBody( @RequestBody Person person ){
		System.out.println("ok reached getRequestBody");
		System.out.println("person in getRequestBody" +person);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	@GetMapping("/test/get/bothParamAndBodyGET")
	public ResponseEntity<?> bothParamAndBodyGET( @RequestParam int id1, @RequestParam int id2 , @RequestBody Person person ){
		System.out.println("ok reached bothParamAndBodyGET");
		int res = id1 + id2;
		System.out.println("person in bothParamAndBodyGET" +person);
		System.out.println("res in bothParamAndBodyGET" +res);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	@GetMapping("/test/get/bothPathAndBodyGET/{fname}/{lname}")
	public ResponseEntity<?> bothPathAndBodyGET( @PathVariable String fname, @PathVariable String lname , @RequestBody Person person ){
		System.out.println("ok reached bothPathAndBodyGET");
		String res = fname + lname;
		System.out.println("person in bothPathAndBodyGET" +person);
		System.out.println("res in bothPathAndBodyGET" +res);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	@PostMapping("/test/post/reqParam")
    public ResponseEntity<Integer> postReqParam( @RequestParam int id1, @RequestParam int id2 ){
		System.out.println("ok reached  postReqParam");
		int res = id1 + id2;
		System.out.println("res in postReqParam" +res);
		return new ResponseEntity<Integer>(res, HttpStatus.OK);
	}
	@PostMapping("/test/post/pathVariable/{fname}/{lname}")
	public ResponseEntity<String> postPathVariable( @PathVariable String fname, @PathVariable String lname ){
		System.out.println("ok reached postPathVariable");
		String res = fname + lname;
		System.out.println("res in postPathVariable" +res);
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	@PostMapping("/test/post/requestBody")
	public ResponseEntity<?> postRequestBody( @RequestBody Person person ){
		System.out.println("ok reached postRequestBody");
		System.out.println("person in postRequestBody" +person);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	@PostMapping("/test/post/bothParamAndBody")
	public ResponseEntity<?> bothParamAndBody(  @RequestParam int id1, @RequestParam int id2, @RequestBody Person person ){
		System.out.println("ok reached bothParamAndBody");
		System.out.println("person in bothParamAndBody" +person);
		int res = id1 + id2;
		System.out.println("res in bothParamAndBody" +res);
		return new ResponseEntity<>(person,  HttpStatus.OK);
	}
	@PostMapping("/test/post/bothPathAndBody/{fname}/{lname}")
	public ResponseEntity<?> bothPathAndBody(  @PathVariable String fname, @PathVariable String lname, @RequestBody Person person ){
		System.out.println("ok reached bothPathAndBody");
		System.out.println("person in bothPathAndBody" +person);
		String res = fname + lname;
		System.out.println("res in bothPathAndBody" +res);
		return new ResponseEntity<>(person,  HttpStatus.OK);
	}
}
