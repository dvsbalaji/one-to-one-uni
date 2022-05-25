import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavebranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Address address = new Address() ;
		address.setStreet("palk street");
		address.setCity("kolkata");
		address.setPincode(721301);
		
		Branch branch = new Branch() ;
		branch.setName("kolkata rools");
		branch.setPhone(9000000009l);
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(address);
		entityManager.persist(branch);
		entityTransaction.commit();
	}
}
