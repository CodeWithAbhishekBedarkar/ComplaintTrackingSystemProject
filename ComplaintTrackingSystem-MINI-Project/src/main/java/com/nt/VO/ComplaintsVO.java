package com.nt.VO;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ComplaintsVO implements Serializable {

	   //Data Properties
		private Integer cId;
		
		@Nonnull
		private String userName;
		
		@Nonnull
		private String complaintType;
		@Nonnull
		private String description;
}
