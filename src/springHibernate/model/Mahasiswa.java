/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_amhasiswa")
public class Mahasiswa implements Serializable{
    @Id
    @Column(name = "npm", lenght = 8)
    private String npm;
    
   
    @Column(name = "nama", lenght = 50)
    private String nama;
   
    @Column(name = "kelas", lenght = 10)
    private String kelas;
  
    @Column(name = "alamat", lenght = 150)
    private String alamat;
    
    public String getNpm() (return npm;)
    public void setNpm(String npm) (this.npm = npm;)
    
    public String getNama() (return nama;)
    public void setNama(String nama) (this.nama = nama;)
    
    public String getKelas() (return kelas;)
    public void setKelas(String kelas) (this.kelas = kelas;)
    
    public String getAlamat() (return alamat;)
    public void setAlamat(String alamat) (this.alamat = alamat;)
}
