package lt.kvk.i11.radiukiene.atliekosAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "wastecollection")
public class UpdateWaste {
	
	@Id
	@Column(name = "wasteCollect_id")
	String wasteCollectId; 
	
	@Column(name = "wasteCollect_date")
	String wasteCollectDate;
	
	/*@Column(name = "reminder_status")
	String reminderStatus;*/

	public UpdateWaste (String wasteCollectId, String wasteCollectDate/*, String reminderStatus*/) {
		super();
		this.wasteCollectId = wasteCollectId;
		this.wasteCollectDate = wasteCollectDate;
		//this.reminderStatus = reminderStatus;
	}

	public UpdateWaste() {
		super();
	}

	public String getWasteCollectId() {
		return wasteCollectId;
	}

	public void setWasteCollectId(String wasteCollectId) {
		this.wasteCollectId = wasteCollectId;
	}

	public String getWasteCollectDate() {
		return wasteCollectDate;
	}

	public void setWasteCollectDate(String wasteCollectDate) {
		this.wasteCollectDate = wasteCollectDate;
	}
	
	/*public String getReminderStatus() {
		return reminderStatus;
	}

	public void setReminderStatus(String reminderStatus) {
		this.reminderStatus = reminderStatus;
	}*/
}
