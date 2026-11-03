import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "planta")
public class Planta
{
    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private double pesoAmostra; 

    @DatabaseField
    private String dataRegistro;      

    public Planta() {
    }

    public Planta(double pesoAmostra, String dataRegistro) {
        this.pesoAmostra = pesoAmostra;
        this.dataRegistro = dataRegistro;
    }

    public int getId() {
        return id;
    }

    public double getPesoAmostra() {
        return pesoAmostra;
    }

    public void setPesoAmostra(double pesoAmostra) {
        this.pesoAmostra = pesoAmostra;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String toString() {
        return "Planta [id=" + id + ", peso=" + pesoAmostra + " g, data=" + dataRegistro + "]";
    }
}