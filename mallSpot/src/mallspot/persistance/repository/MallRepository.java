package mallspot.persistance.repository;

import java.util.List;

import mallspot.model.entity.Mall;
import mallspot.model.entity.User;

public interface MallRepository {
	
	boolean remove(Mall mall);
	
	boolean updateMall(Mall mall);

	List<Mall> getAllMalls();

	boolean addMall(Mall mall, User user);
}
