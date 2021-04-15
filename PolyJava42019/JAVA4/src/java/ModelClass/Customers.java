package ModelClass;
// Generated Oct 26, 2019 3:45:08 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customers generated by hbm2java
 */
@Entity
@Table(name="Customers"
    ,schema="dbo"
    ,catalog="DemoDB"
)
public class Customers  implements java.io.Serializable {


     private int customerId;
     private Serializable name;
     private Serializable email;
     private Serializable tel;
     private boolean gender;

    public Customers() {
    }

	
    public Customers(int customerId, Serializable name, boolean gender) {
        this.customerId = customerId;
        this.name = name;
        this.gender = gender;
    }
    public Customers(int customerId, Serializable name, Serializable email, Serializable tel, boolean gender) {
       this.customerId = customerId;
       this.name = name;
       this.email = email;
       this.tel = tel;
       this.gender = gender;
    }
   
     @Id 

    
    @Column(name="CustomerId", unique=true, nullable=false)
    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    
    @Column(name="Name", nullable=false)
    public Serializable getName() {
        return this.name;
    }
    
    public void setName(Serializable name) {
        this.name = name;
    }

    
    @Column(name="Email")
    public Serializable getEmail() {
        return this.email;
    }
    
    public void setEmail(Serializable email) {
        this.email = email;
    }

    
    @Column(name="Tel")
    public Serializable getTel() {
        return this.tel;
    }
    
    public void setTel(Serializable tel) {
        this.tel = tel;
    }

    
    @Column(name="Gender", nullable=false)
    public boolean isGender() {
        return this.gender;
    }
    
    public void setGender(boolean gender) {
        this.gender = gender;
    }




}

