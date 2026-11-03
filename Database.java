import com.j256.ormlite.jdbc.JdbcConnectionSource;

public class Database
{
    private String nomeArquivo;
    private JdbcConnectionSource connection;

    public Database(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public JdbcConnectionSource getConnection() throws Exception {
        if (connection == null) {
            connection = new JdbcConnectionSource("jdbc:sqlite:" + nomeArquivo);
        }
        return connection;
    }

    public void close() throws Exception {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }
}