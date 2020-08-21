package com.qdm.cg.assessment.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseInfo  implements Serializable{


	private static final long serialVersionUID = 1L;
	private String status;
	private String message;
	private Object resposeBody;

}
