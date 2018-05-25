package lt.kvk.i11.radiukiene.atliekosAPI.service;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.kvk.i11.radiukiene.atliekosAPI.dao.StreetDao;
import lt.kvk.i11.radiukiene.atliekosAPI.dao.WasteCollectionDao;
import lt.kvk.i11.radiukiene.atliekosAPI.model.AllWasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Waste;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Street;
import lt.kvk.i11.radiukiene.atliekosAPI.model.WasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.UpdateWaste;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired  
	StreetDao street;
	
	@Autowired  
	WasteCollectionDao time;
	
	public Future<List<Street>> streetList() {
		return street.streetList();
	}

	public Future<List<Waste>> wasteList() {
		return street.wasteList();
	}

	public Future<Integer> addStreet(Street model) {
		return street.addStreet(model);
	}

	public Future<Integer> addWasteCollection(UpdateWaste model) {
		return time.addWasteCollection(model);
	}

	public Future<List<WasteCollection>> wasteCollectionListStreet(String streetId) {
		return time.wasteCollectionListStreet(streetId);
	}

	public Future<Integer> wasteCollectionStreets(AllWasteCollection model) {
		return time.wasteCollectionStreets(model);
	}
}
