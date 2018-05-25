package lt.kvk.i11.radiukiene.atliekosAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "wastecollection")
public class AllWasteCollection {
	
	@Id
	@Column(name = "street_id")
	String streetId; 
	
	@Column(name = "waste_id")
	int wasteId;
	
	@Column(name = "wasteCollect_date")
	String wasteCollectDate;

	/*@Column(name = "reminder_status")
	String reminderStatus;*/

	public AllWasteCollection(String streetId, int wasteId, String wasteCollectDate/*,String reminderStatus*/) {
		super();
		
		this.streetId = streetId;
		this.wasteId = wasteId;
		this.wasteCollectDate = wasteCollectDate;
		//this.reminderStatus=reminderStatus;
	}

	public AllWasteCollection() {
		super();
	}

	public String getStreetId() {
		return streetId;
	}

	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}

	public int getWasteId() {
		return wasteId;
	}

	public void setWasteId(int wasteId) {
		this.wasteId = wasteId;
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
