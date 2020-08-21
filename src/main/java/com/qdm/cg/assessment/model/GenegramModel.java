package com.qdm.cg.assessment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="genegram_tree")
public class GenegramModel extends AuditModel implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "genegram_id")
	private int id;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "file_type")
	private String fileType;
	
	@Column(name = "file_size")
	private long fileSize;

	@Lob
	@Column(name = "data")
	private byte[] data;

}
