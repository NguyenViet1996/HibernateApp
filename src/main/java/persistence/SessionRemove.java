package persistence;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class SessionRemove {
		public void removeEmployee(int id) {
				Transaction transaction = null;
				try (Session session = HibernateUtil.getSessionFactory().openSession()) {
						// start a transaction
						transaction = session.beginTransaction();

						// Delete a persistent object
						Employee employee = session.get(Employee.class, id);
						if (employee != null) {
								session.remove(employee);
								System.out.println("employee is deleted");
						}

						// Delete a transient object
						Employee employee2 = new Employee();
						employee2.setId(2);
						session.remove(employee2);
						System.out.println("Employee 2 is deleted");

						// commit transaction
						transaction.commit();
				} catch (Exception e) {
						if (transaction != null) {
								transaction.rollback();
						}
						e.printStackTrace();
				}
		}
}
