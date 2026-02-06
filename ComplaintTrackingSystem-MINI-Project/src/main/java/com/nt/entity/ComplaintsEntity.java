//Complaints.java
package com.nt.entity;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="COMPLAINTS_DB")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ComplaintsEntity implements Serializable{

	//Data Properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cId;
	
	@Column(length = 25)
	@Nonnull
	private String userName;
	
	@Column(length = 25)
	@Nonnull
	private String complaintType;
	
	@Column(length = 25)
	private String status;
	
	@Column(length = 255)
	@Nonnull
	private String description;

	
	//MetaData Properties
	//MetaData Properties
		@Version
		private Integer updateCount;
		@CreationTimestamp
		@Column(updatable = false)
		private LocalDateTime registerON;
		
		@UpdateTimestamp
		@Column(insertable = false)
		private LocalDateTime updatedON;
		
		@Column(length=30)
		private String createdBy;
		
		@Column(length=30)
		private String updatedBy;
		
		@Column(length=30)
		private String active_SW="active";
}
