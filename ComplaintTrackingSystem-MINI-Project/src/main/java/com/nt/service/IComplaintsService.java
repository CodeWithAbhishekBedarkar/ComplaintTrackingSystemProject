package com.nt.service;

import java.util.List;

import com.nt.VO.ComplaintsVO;

public interface IComplaintsService {

	public ComplaintsVO registerComplaint(ComplaintsVO vo);
	public String registerBatchComplaints(List<ComplaintsVO> listvo);
	public List<ComplaintsVO> fetchAllComplaints();
	public ComplaintsVO showComplaintsByID(Integer id);
	public String deleteComplaintsById(Integer id);
}
