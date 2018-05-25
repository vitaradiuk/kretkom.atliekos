package lt.kvk.i11.radiukiene.atliekosAPI.dao;

import java.util.List;
import java.util.concurrent.Future;

import lt.kvk.i11.radiukiene.atliekosAPI.model.Waste;
import lt.kvk.i11.radiukiene.atliekosAPI.model.Street;

public interface StreetDao {

	Future<List<Street>> streetList();

	Future<List<Waste>> wasteList();

	Future<Integer> addStreet(Street model);
}
