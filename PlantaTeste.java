import java.util.List;

public class PlantaTeste
{

    public static void testarCriar(double pesoAmostra, String dataRegistro) throws Exception {
        Database db = new Database("plantas.db");
        PlantaRepositorio repo = new PlantaRepositorio(db);

        Planta p = new Planta(pesoAmostra, dataRegistro);
        repo.criar(p);

        System.out.println("Planta cadastrada: " + p);
        db.close();
    }

    public static void testarConsultar(int id) throws Exception {
        Database db = new Database("plantas.db");
        PlantaRepositorio repo = new PlantaRepositorio(db);

        Planta p = repo.buscarPorId(id);
        if (p == null) {
            System.out.println("Nenhuma planta com o id " + id);
        } else {
            System.out.println("Planta encontrada: " + p);
        }
        db.close();
    }

    public static void testarListar() throws Exception {
        Database db = new Database("plantas.db");
        PlantaRepositorio repo = new PlantaRepositorio(db);

        List<Planta> todas = repo.listarTodas();
        if (todas.isEmpty()) {
            System.out.println("Nenhuma planta cadastrada.");
        }
        for (Planta p : todas) {
            System.out.println(p);
        }
        db.close();
    }

    public static void testarAtualizar(int id, double novoPeso, String novaData) throws Exception {
        Database db = new Database("plantas.db");
        PlantaRepositorio repo = new PlantaRepositorio(db);

        Planta p = repo.buscarPorId(id);
        if (p == null) {
            System.out.println("Nenhuma planta com o id " + id);
        } else {
            System.out.println("Antes:  " + p);
            p.setPesoAmostra(novoPeso);
            p.setDataRegistro(novaData);
            repo.atualizar(p);
            System.out.println("Depois: " + repo.buscarPorId(id));
        }
        db.close();
    }

    public static void testarExcluir(int id) throws Exception {
        Database db = new Database("plantas.db");
        PlantaRepositorio repo = new PlantaRepositorio(db);

        Planta p = repo.buscarPorId(id);
        if (p == null) {
            System.out.println("Nenhuma planta com o id " + id);
        } else {
            repo.excluir(p);
            System.out.println("Planta excluída: " + p);
        }
        db.close();
    }
}