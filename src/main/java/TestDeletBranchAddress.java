import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeletBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Branch branch = entityManager.find(Branch.class, 1);
		
		if (branch != null) {
			entityTransaction.begin();
			
			if(branch.getAddress() != null) {
			    entityManager.remove(branch.getAddress());
			}
			entityManager.remove(branch);
			
			entityTransaction.commit();
				
		}else {
			System.out.println("there is no branch found");
		}
	}
}
