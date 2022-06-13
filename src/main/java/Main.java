import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        // table nhan_vien
        NhanVien nhanVien = new NhanVien();
        nhanVien.setId(1);
        nhanVien.setHoTen("Viet");
        nhanVien.setSoDienThoai("0986091614");
        nhanVien.setSoNgayLamViec(5);


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(nhanVien);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }

}
