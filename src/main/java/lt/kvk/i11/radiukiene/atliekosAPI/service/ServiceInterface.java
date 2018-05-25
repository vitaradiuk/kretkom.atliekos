package lt.kvk.i11.radiukiene.atliekosAPI.service;

import java.util.List;
import java.util.concurrent.Future;

import lt.kvk.i11.radiukiene.atliekosAPI.model.AllWasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Waste;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Street;
import lt.kvk.i11.radiukiene.atliekosAPI.model.WasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.UpdateWaste;


public interface ServiceInterface {

	Future<List<Street>> streetList();

	Future<List<Waste>> wasteList();

	Future<Integer> addWasteCollection(UpdateWaste model);

	Future<Integer> addStreet(Street model);

	Future<List<WasteCollection>> wasteCollectionListStreet(String streetId);

	Future<Integer> wasteCollectionStreets(AllWasteCollection model);
}
