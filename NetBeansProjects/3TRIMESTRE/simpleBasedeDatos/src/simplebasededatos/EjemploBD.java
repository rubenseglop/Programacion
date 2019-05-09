package simplebasededatos;


import java.sql.*;
import java.sql.Connection;
import static mibasededatos.Base.actualiza;
import static mibasededatos.Base.cerrarConexion;
import static mibasededatos.Base.conectar;
import static mibasededatos.Base.consulta;
import static mibasededatos.Base.crearTabla;
import static mibasededatos.Base.imprimirConsulta;
import static mibasededatos.Base.insertar;


/**
 * Clase de ejemplo de uso de diferentes métodos de conexión, consulta, creación
 * de tablas, inserción de datos y actualización de los mismos en una base de
 * datos.
 *
 * @author 1DAMDAW
 */
public class EjemploBD {

    /**
     * Método principal de la aplicación.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "ejemplo.db";

        Connection conexion = conectar(url);

        // SQL statement for creating a new table
        String creaTabla = "CREATE TABLE IF NOT EXISTS warehouses (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	capacity real\n"
                + ");";

        crearTabla(conexion, creaTabla);

        String insertaTabla = "INSERT INTO warehouses(name,capacity) VALUES(?,?)";

//        insertar(conexion, insertaTabla, "Bienes terminados", 100);
//        insertar(conexion, insertaTabla, "Bienes sin terminar", 200);
//        insertar(conexion, insertaTabla, "Materiales sin trabajar", 300);
        String borraEnTabla = "DELETE FROM warehouses WHERE id = ?";
        //borrar(conexion, borraEnTabla, 12);

        String actualizaTabla = "UPDATE warehouses SET name = ?, "
                + "capacity = ?"
                + "WHERE id = ?";
        actualiza(conexion, actualizaTabla, 1, "Materiales nuevos", 1000);

        String consultaTabla = "SELECT * FROM warehouses";
        imprimirConsulta(consulta(conexion, consultaTabla));

        cerrarConexion(conexion);
    }
}
