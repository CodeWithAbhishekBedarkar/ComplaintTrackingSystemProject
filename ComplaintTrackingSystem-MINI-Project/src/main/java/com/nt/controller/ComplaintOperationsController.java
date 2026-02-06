package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.VO.ComplaintsVO;
import com.nt.service.IComplaintsService;

@RestController
@RequestMapping("/complaint-api")
public class ComplaintOperationsController {

	@Autowired
	private IComplaintsService service;
	
	//Home Page
	public ResponseEntity<String> home(){
		System.out.println("ComplaintOperationsController.home()");
	   return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//Register Complaints
	@PostMapping("/register")
	public ResponseEntity<ComplaintsVO> registerComplaints(@RequestBody ComplaintsVO vo){
		System.out.println("ComplaintOperationsController.registerComplaints()");
		ComplaintsVO register=service.registerComplaint(vo);
		return new ResponseEntity<>(register,HttpStatus.CREATED);
	}
	
	
	//Fetch All Complaints
	@GetMapping("/all")
	public ResponseEntity<List<ComplaintsVO>> getComplaints(){
		System.out.println("ComplaintOperationsController.getComplaints()");
		List<ComplaintsVO> getdetails=service.fetchAllComplaints();
		return new ResponseEntity<List<ComplaintsVO>>(getdetails,HttpStatus.OK);
	}
	
	//ShowByID
	@GetMapping("/showbyid/{id}")
	public ResponseEntity<ComplaintsVO> getComplaintById(@PathVariable Integer id){
		System.out.println("ComplaintOperationsController.getComplaintById()");
		ComplaintsVO msg=service.showComplaintsByID(id);
		return new ResponseEntity<ComplaintsVO>(msg,HttpStatus.OK);
	}
	
	
	//Register All Complaints
	@PostMapping("/registerAll")
	public ResponseEntity<String> registerAllComplaints(@RequestBody List<ComplaintsVO> listvo){
         
     		System.out.println("ComplaintOperationsController.registerAllComplaints()");

     		//Use Service
     		String msg=service.registerBatchComplaints(listvo);
     		//return ResponseEntity Objects
     		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	
	
	//Delete Complaints
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deleteComplaint(@PathVariable Integer id){
		System.out.println("ComplaintOperationsController.deleteComplaint()");
		String msg=service.deleteComplaintsById(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
