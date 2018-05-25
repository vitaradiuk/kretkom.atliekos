package lt.kvk.i11.radiukiene.atliekosAPI.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Async
public class StatusBean { // bean status code class
	
	StatusBean status;
	private String Status;
	
	private int code;

	@Autowired
	public StatusBean(String Status, int code) {

		this.Status = Status;
		this.code = code;
	}

	@Autowired
	public StatusBean(int code) {
		this.code = code;

		if (code == 200) {
			this.Status = "Success";
		}
		else if (code == 201) {
			this.Status = "AlreadyExist";
		}
		else if (code == 400) {
			this.Status = "BadRequest";
		}
		else if (code == 401) {
			this.Status = "InvalidCredentials";
		}
		else if (code == 404) {
			this.Status = "notfound";
		}
		else if (code == 405) {
			this.Status = "MethodNotAllowed";
		}
		else if (code == 503) {
			this.Status = "ServerNotFound";
		}
		else if (code == 500) {
			this.Status = "InternalServerError";
		}
		else if (code == 202) {
			this.Status = "InvalidDateFormat";
		}
		else if (code == 209) {
			this.Status = "productOutOfStock";
		}
		else if (code == 101) {
			this.Status = "Can't Add More Users";
		}
		else {
			this.code = 409;
			this.Status = "try again";
		}
	}
	
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
