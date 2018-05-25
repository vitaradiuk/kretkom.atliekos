package lt.kvk.i11.radiukiene.atliekosAPI.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.json.simple.JSONObject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import lt.kvk.i11.radiukiene.atliekosAPI.model.AllWasteCollection;
//import lt.kvk.i11.radiukiene.atliekosAPI.model.Street;
import lt.kvk.i11.radiukiene.atliekosAPI.model.WasteCollection;
import lt.kvk.i11.radiukiene.atliekosAPI.model.UpdateWaste;

@Service
public class WasteCollectionDaoImpl implements WasteCollectionDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	public Future<Integer> addWasteCollection(UpdateWaste model) {
		try {
			Session session = this.sessionFactory.openSession();
			session.update(model);
			session.flush();
			return new AsyncResult<Integer>(200);
		} catch (Exception e) {
			System.out.println(e);

			return new AsyncResult<Integer>(409);
		}
	}

	
	public Future<List<WasteCollection>> wasteCollectionListStreet(String street_id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			String sql = "select (select wst.waste_name from waste as wst where wst.id = wstcol.waste_id) as waste_name, wstcol.street_id, wstcol.waste_id, wstcol.wasteCollect_date, wstcol.id  from wasteCollection as wstcol where street_id='"+street_id+"'";
			SQLQuery query = session.createSQLQuery(sql);
			List<WasteCollection> list = query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP).list();
			return new AsyncResult<List<WasteCollection>>(list);
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			tx.commit();
			return new AsyncResult<List<WasteCollection>>(new ArrayList<WasteCollection>());
		} finally {
			session.close();
		}
	}

	public Future<Integer> wasteCollectionStreets(AllWasteCollection model) {
		try {
			Session session = this.sessionFactory.openSession();
			session.save(model);
			session.flush();
			return new AsyncResult<Integer>(200);
		} catch (Exception e) {
			System.out.println(e);

			return new AsyncResult<Integer>(409);
		}
	}
}
