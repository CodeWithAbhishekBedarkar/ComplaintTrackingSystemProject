package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.VO.ComplaintsVO;
import com.nt.entity.ComplaintsEntity;
import com.nt.exception.ComplaintNotFoundException;
import com.nt.repository.ComplaintsRepository;

@Service
public class IComplaintsImplem implements IComplaintsService{

	@Autowired
	private ComplaintsRepository repo;
	
	
	@Override
	public ComplaintsVO registerComplaint(ComplaintsVO vo) {
		System.out.println("IComplaintsImplem.registerComplaint()");
		
		ComplaintsEntity entity=new ComplaintsEntity();
		
		BeanUtils.copyProperties(vo, entity,"status");
		entity.setCreatedBy(System.getProperty("user.name"));
		entity.setStatus("OPEN");
		
		ComplaintsEntity saved=repo.save(entity);
		BeanUtils.copyProperties(saved, vo);
		return vo;
	}


	@Override
	public List<ComplaintsVO> fetchAllComplaints() {
		
		return repo.findAll().stream().map(entity->{
			ComplaintsVO vo=new ComplaintsVO();
			BeanUtils.copyProperties(entity,vo);
			entity.setCreatedBy(System.getProperty("user.name"));
			return vo;
		}).collect(Collectors.toList());
	}


	@Override
	public ComplaintsVO showComplaintsByID(Integer id) {
		System.out.println("IComplaintsImplem.showComplaintsByID()");
		
		ComplaintsEntity entity=repo.findById(id).orElseThrow(()->new ComplaintNotFoundException("Complaint Not Found"));
		
		ComplaintsVO vo=new ComplaintsVO();
		BeanUtils.copyProperties(entity, vo);
		entity.setCreatedBy(System.getProperty("user.name"));
		return vo;
	}


	@Override
	public String registerBatchComplaints(List<ComplaintsVO> listvo) {
		System.out.println("IComplaintsImplem.registerBatchComplaints()");
		List<ComplaintsEntity> listEntity=new ArrayList();
		listvo.forEach(VO->{
			ComplaintsEntity entity=new ComplaintsEntity();
			BeanUtils.copyProperties(VO, entity);
			entity.setCreatedBy(System.getProperty("user.name"));
			listEntity.add(entity);
		});
		
		//Use Repo
		List<ComplaintsEntity> savedEntities=repo.saveAll(listEntity);
		//get id values
		List<Integer> ids=savedEntities.stream().map(ComplaintsEntity::getCId).toList();
		return savedEntities.size()+" Number Of Complaints Are Saved With ID Values::"+ids;
	}


	@Override
	public String deleteComplaintsById(Integer id) {
		System.out.println("IComplaintsImplem.deleteComplaintsById()");
		
		ComplaintsEntity entity=repo.findById(id).orElseThrow(()->new RuntimeException("Complaint Not Found with id"+id));
		
		repo.delete(entity);
		return "Complaint DELETED Successfully With ID:"+id;
	}

}
