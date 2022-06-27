package persistent;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Boss;
import util.HibernateUtil;

public class BossManager {

    // insert data into Boss table
    public void insertBoss() {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            String hql = "INSERT INTO Boss (name, phone_number, amount_day_work, rate_company) "
                    + "SELECT name, phone_number, amount_day_work, rate_company FROM Boss";
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

    // update data into Boss table
    public void updateEmployee(Boss boss) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            String hql = "UPDATE Boss set name = :name " + "WHERE id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("name",boss.getName());
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

    // delete data in Boss table
    public void delete(int id) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // delete data boss
            Boss boss = session.get(Boss.class,id);
            if (boss != null) {
                String hql = "DELETE FROM Boss " + "WHERE id = :bossId";
                Query query = session.createQuery(hql);
                query.setParameter("bossId",id);
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
