package persistent;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employee;
import util.HibernateUtil;

import java.io.Serializable;

public class EmployeeManager {

    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // operate 1
            Object object = session.save(employee);

            // operate 2
            session.get(Employee.class, (Serializable) object);

            // commit a transaction
            transaction.commit();
        } catch(Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // insert data into Employee table
    public void insertEmployee() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            String hql = "INSERT INTO Employee (name, phone_number, amount_day_work, id_manager_room) "
                         + "SELECT name, phone_number, amount_day_work, id_manager_room FROM Employee";
            Query query = session.createQuery(hql);
            int result = query.executeUpdate();
            System.out.println("Row affected" + result);
            // commit transaction
            transaction.commit();
        } catch(Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // update data into Employee table
    public void updateEmployee(Employee employee) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            String hql = "UPDATE Employee set name = :name " + "WHERE id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("name",employee.getName());
            query.setParameter("id",1);
            int result = query.executeUpdate();
            System.out.println("Row affected" + result);
            // commit transaction
            transaction.commit();
        } catch(Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    // delete data in Employee table
    public void delete(int id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // delete a Employee
            Employee employee = session.get(Employee.class,id);
            if (employee != null) {
                String hql = "DELETE FROM Employee " + "WHERE id = :employeeId";
                Query query = session.createQuery(hql);
                query.setParameter("employeeId",id);
                int result = query.executeUpdate();
                System.out.println("Row affected" + result);
            }
            // commit a transaction
            transaction.commit();
        } catch(Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
