package com.investmentadvice.equityList.analystRisk;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Embeddable
public class AnalystIdentity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public AnalystIdentity() {
		super();
	}

		
	public AnalystIdentity(String analystId, int risk) {
		super();
		this.analystId = analystId;
		this.risk = risk;
	}


	@NotNull
	@Size(max=10)
	@Column(name="analystId")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	public String analystId;
	
	@NotNull
	@Size(max=3)
	@Column(name="risk")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int risk;
	
	public String getAnalystId() {
		return analystId;
	}

	public void setAnalystId(String analystId) {
		this.analystId = analystId;
	}

	public int getRisk() {
		return risk;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((analystId == null) ? 0 : analystId.hashCode());
		result = prime * result + risk;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnalystIdentity other = (AnalystIdentity) obj;
		if (analystId == null) {
			if (other.analystId != null)
				return false;
		} else if (!analystId.equals(other.analystId))
			return false;
		if (risk != other.risk)
			return false;
		return true;
	}


}
