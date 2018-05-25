package lt.kvk.i11.radiukiene.atliekosAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wastecollection")
public class WasteCollection {
	
	@Id	
	@Column(name = "street_id")
	String streetId; 
	
	@Column(name = "waste_id")
	String wasteId;
	
	@Column(name = "wasteCollect_date")
	String wasteCollectDate;

	/*@Column(name = "reminder_status")
	String reminderStatus;*/
	
	@Column(name = "wasteCollect_id")
	String wasteCollectId;
	
	String wasteName;

	public WasteCollection( String streetId, String wasteId, String wasteCollectDate, String title/*, String reminderStatus*/) {
		super();
		
		this.streetId = streetId;
		this.wasteId = wasteId;
		this.wasteCollectDate = wasteCollectDate;
		//this.reminderStatus = reminderStatus;
		this.wasteName = title;
	}
	
	public WasteCollection() {
		super();
	}
	
	public String getWasteCollectId() {
		return wasteCollectId;
	}

	public void setWasteCollectId(String wasteCollectId) {
		this.wasteCollectId = wasteCollectId;
	}
	
	public String getStreetId() {
		return streetId;
	}

	public void setStreetId(String streetId) {
		this.streetId = streetId;
	}
	
	public String getWasteId() {
		return wasteId;
	}

	public void setWasteId(String wasteId) {
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

	public String getWasteName() {
		return wasteName;
	}

	public void setWasteName(String wasteName) {
		this.wasteName = wasteName;
	}
}
