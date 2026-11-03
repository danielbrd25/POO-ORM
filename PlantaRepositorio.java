import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;
import java.util.List;

public class PlantaRepositorio
{
    private Dao<Planta, Integer> dao;

    public PlantaRepositorio(Database database) throws Exception {
        dao = DaoManager.createDao(database.getConnection(), Planta.class);
        TableUtils.createTableIfNotExists(database.getConnection(), Planta.class);
    }

    public void criar(Planta planta) throws Exception {
        dao.create(planta);
    }

    public Planta buscarPorId(int id) throws Exception {
        return dao.queryForId(id);
    }

    public List<Planta> listarTodas() throws Exception {
        return dao.queryForAll();
    }

    public void atualizar(Planta planta) throws Exception {
        dao.update(planta);
    }

    public void excluir(Planta planta) throws Exception {
        dao.delete(planta);
    }
}