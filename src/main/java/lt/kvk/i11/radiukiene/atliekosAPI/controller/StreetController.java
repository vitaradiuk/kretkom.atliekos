package lt.kvk.i11.radiukiene.atliekosAPI.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.validation.Valid;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.kvk.i11.radiukiene.atliekosAPI.component.StatusBean;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Waste;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Street;
import lt.kvk.i11.radiukiene.atliekosAPI.service.ServiceInterface;


@RestController
public class StreetController {
	@Autowired
	ServiceInterface service;

	// api to get all streets
	@RequestMapping(value = "streets", method = RequestMethod.GET)
	public JSONObject streets() throws InterruptedException, ExecutionException {
		JSONObject jsonObject = new JSONObject();
		Future<List<Street>>code = service.streetList();
		jsonObject.put("result", code.get());
		return jsonObject;
	}

	// api to get all wastes
	@RequestMapping(value = "wastes", method = RequestMethod.GET)
	public JSONObject wastes() throws InterruptedException, ExecutionException {
		JSONObject jsonObject = new JSONObject();
		Future<List<Waste>>code = service.wasteList();
		jsonObject.put("result", code.get());
		return jsonObject;
	}	
}
