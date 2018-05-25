package lt.kvk.i11.radiukiene.atliekosAPI.dao;

import java.util.List;
import java.util.concurrent.Future;

import lt.kvk.i11.radiukiene.atliekosAPI.model.AllWasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.WasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.UpdateWaste;

public interface WasteCollectionDao {

	Future<Integer> addWasteCollection(UpdateWaste model);

	Future<List<WasteCollection>> wasteCollectionListStreet(String streetId);

	Future<Integer> wasteCollectionStreets(AllWasteCollection model);
}
