
public class Patient extends User {
	private long patientid;
	private boolean insured;
	//Has a relationship i.e patient has a HealthInsurancePlan
	private HealthInsurancePlan insurancePlan;
	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	public long getPatientid() {
		return patientid;
	}
	public void setPatientid(long patientid) {
		this.patientid = patientid;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	
}
