package com.vodafone.model;

import java.util.List;

public class SetMobilePlanResponse extends SuccessResponse{
	
	private List<PlanDetails> listPlanDetails;

	public List<PlanDetails> getListPlanDetails() {
		return listPlanDetails;
	}

	public void setListPlanDetails(List<PlanDetails> listPlanDetails) {
		this.listPlanDetails = listPlanDetails;
	}
	
	

}
