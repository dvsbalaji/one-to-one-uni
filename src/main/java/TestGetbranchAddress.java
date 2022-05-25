import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetbranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 1);
		if (branch != null) {
			System.out.println("branch id    : "+branch.getId());
			System.out.println("branche name : "+branch.getName());
			System.out.println("branch phone : "+branch.getPhone());
			if(branch.getAddress() != null) {
			    System.out.println("Street name  : "+branch.getAddress().getStreet());
				System.out.println("city name    : "+branch.getAddress().getCity());
				System.out.println("pincode name : "+branch.getAddress().getPincode());
			}
				
		}
	}
}
