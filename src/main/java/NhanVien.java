import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhan_vien")
public class NhanVien {

    @Id
    @Column(name="id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="ho_ten")
    private String hoTen;

    public String hoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Column(name="so_dien_thoai")
    private String soDienThoai;

    public String getSoDienThoai() {
        return hoTen;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Column(name="so_ngay_lam_viec")
    private Integer soNgayLamViec;

    public Integer getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(Integer soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

}
