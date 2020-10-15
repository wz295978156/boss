package com.boss.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 求职意向
 */
@Data
@Entity
@Table(name = "tb_intention")
public class Intention implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intention_id")
	private Integer intentionId;
	@Column(name = "intention_status")
	private String intentionStatus;
	@Column(name = "intention_position")
	private String intentionPosition;
	@Column(name = "intention_business")
	private String intentionBusiness;
	@Column(name = "intention_city")
	private String intentionCity;
	@Column(name = "intention_personally")
	private String intentionPersonally;

}
