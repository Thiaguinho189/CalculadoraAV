
package calculadora;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author 02977022201
 */
    @Entity
public class Calcles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double Num1;
    private double Num2;
    private String operador;
    private double result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getNum1() {
        return Num1;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public double getNum2() {
        return Num2;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String toString() {
        return this.operador;
    }
}
