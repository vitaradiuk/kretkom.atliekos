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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lt.kvk.i11.radiukiene.atliekosAPI.component.StatusBean;
import lt.kvk.i11.radiukiene.atliekosAPI.model.AllWasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.WasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.UpdateWaste;
import lt.kvk.i11.radiukiene.atliekosAPI.service.ServiceInterface;

@RestController
public class WasteCollectionController {
	@Autowired
	ServiceInterface service;

	//one street wasteCollection data
	@RequestMapping(value = "wastecollections", method = RequestMethod.GET)
	public JSONObject wastesz(@RequestParam String street_id) throws InterruptedException, ExecutionException {
		JSONObject jsonObject = new JSONObject();
		System.out.println("sss");

		Future<List<WasteCollection>>code = service.wasteCollectionListStreet(street_id);
		jsonObject.put("result", code.get());
		return jsonObject;
	}
	
	//one street wasteCollection data
		@RequestMapping(value = "", method = RequestMethod.GET)
		public JSONObject wastesz1(@RequestParam String street_id) throws InterruptedException, ExecutionException {
			JSONObject jsonObject = new JSONObject();
			System.out.println("sss");

			Future<List<WasteCollection>>code = service.wasteCollectionListStreet(street_id);
			jsonObject.put("result", code.get());
			return jsonObject;
		}
}
