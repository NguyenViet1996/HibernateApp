package application;

import entity.Employee;
import entity.ManagerRoom;
import entity.Boss;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.SessionRemove;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // create object of employee
//        Employee employee1 = new Employee("Viet", "0986091614", 10, 15);
//        Employee employee2 = new Employee("Hai", "0904423479", 5, 8);
//        Employee employee3 = new Employee("Hai", "0904423479", 5, 8);
//
//
//        // create object of ManagerRoom
//        ManagerRoom managerRoom1 = new ManagerRoom("nam", "1111111", 12, 20);
//        ManagerRoom managerRoom2 = new ManagerRoom("nam", "1111111", 12, 20);
//
//        // create objects of Boss
//        Boss boss1 = new Boss("Nam", "7888888888", 8, 12.5);
//        Boss boss2 = new Boss("Nam", "7888888888", 8, 12.5);
//        Boss boss3 = new Boss("Nam", "7888888888", 8, 12.5);
//        Boss boss4 = new Boss("Nam", "7888888888", 8, 12.5);
//
//        Transaction transaction = null;
////        String stringDeleteEmployee = "DELETE FROM employee";
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            // start a transaction
//            transaction = session.beginTransaction();
////            session.save(employee1);
////            session.save(employee2);
////            session.save(employee3);
//            sessionRemove.removeEmployee(54);
//            // commit transaction
//            transaction.commit();

            // start a transaction
//            transaction = session.beginTransaction();
//            session.save(managerRoom1);
//            session.save(managerRoom2);
            // commit transaction
//            transaction.commit();

            // start a transaction
//            transaction = session.beginTransaction();
//            session.save(boss1);
//            session.save(boss2);
//            session.save(boss3);
//            session.save(boss4);
            // commit transaction
//            transaction.commit();

//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            String hql = "delete from Employee e where e.id=54";
            transaction = session.beginTransaction();
            Query query = session.createQuery(hql);
//            query.setParameter("id",54);
            int rowCount = query.executeUpdate();
            transaction.commit();
            if (rowCount == 0) {
                System.out.println("No data fodun to delete");
            } else {
                System.out.println("Your record is deleted");
            }
        } catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }

        }
    }

