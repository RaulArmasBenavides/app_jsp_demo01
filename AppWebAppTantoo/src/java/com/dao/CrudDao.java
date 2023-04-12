package com.dao;

import com.common.ICrudService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.DBUtility;
import com.model.Producto;
import com.model.Student;

public class CrudDao implements ICrudService<Producto>

{

//Connection dbConnection;
DBUtility db;
ResultSet rs = null;
PreparedStatement ps =null;
Connection cn = null;
String sql = "";

public CrudDao() {
        //db = new DBUtility();
	//dbConnection = DBUtility.getConnection();
}

/*public void addStudent(Student student) {
	String insertQuery = "INSERT INTO ALUMNO(IDALUMNO, NOMBRE, " +
			"DEPARTAMENTO, EMAIL) VALUES (?,?,?,?)";
	try {
		pStmt = dbConnection.prepareStatement(insertQuery);
		pStmt.setInt(1, student.getStudentId());
		pStmt.setString(2, student.getName());
		pStmt.setString(3, student.getDepartment());
		pStmt.setString(4, student.getEmailId());
		pStmt.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
}

public void deleteStudent(int userId) {
	String deleteQuery = "DELETE FROM ALUMNO WHERE IDALUMNO = ?";
	try {
		pStmt = dbConnection.prepareStatement(deleteQuery);
		pStmt.setInt(1, userId);
		pStmt.executeUpdate();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
}

public void updateStudent(Student student)  {
	String updateQuery = "UPDATE ALUMNO SET NOMBRE = ?, " +
			"DEPARTAMENTO = ?, EMAIL = ? WHERE IDALUMNO = ?";
	try {
		pStmt = dbConnection.prepareStatement(updateQuery);		
		pStmt.setString(1, student.getName());
		pStmt.setString(2, student.getDepartment());
		pStmt.setString(3, student.getEmailId());
		pStmt.setInt(4, student.getStudentId());
		pStmt.executeUpdate();

	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
}

   public List<Student> getAllStudents() {
	List<Student> students = new ArrayList<>();

	String query = "SELECT * FROM ALUMNO ORDER BY IDALUMNO";
	try {
		Statement stmt = dbConnection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			Student student = new Student();

			student.setStudentId(rs.getInt("IDALUMNO"));
			student.setName(rs.getString("NOMBRE"));
			student.setDepartment(rs.getString("DEPARTAMENTO"));
			student.setEmailId(rs.getString("EMAIL"));
			students.add(student);
		}
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
	return students;
    }
*/ 

    @Override
    public void create(Producto x) throws Exception {
        
         try {
            cn = DBUtility.getConnection();
            sql = "insert into Productos(Idproducto,Descripcion,IdLinea,Preciocompra,precioventa,Stock) values(?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            //preparar valores paro los parametros
            ps.setInt(1, x.getIdProducto());
            ps.setString(2, x.getDescripcion());
            ps.setInt(3, x.getIdlinea());
            ps.setDouble(4, x.getPreciocompra());
            ps.setDouble(5, x.getPrecioventa());
            ps.setInt(6, x.getStock());

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void update(Producto x) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int productoid) throws Exception {
      String deleteQuery = "DELETE FROM Producto WHERE IdProducto = ?";
	try {
            
            cn = DBUtility.getConnection();
            sql = deleteQuery;//"insert into Productos(Idproducto,Descripcion,IdLinea,Preciocompra,precioventa,Stock) values(?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
           ps.setInt(1, productoid);
          //pStmt = dbConnection.prepareStatement(deleteQuery);
		//pStmt.setInt(1, userId);
		//pStmt.executeUpdate();
                 ps.executeUpdate();
            ps.close();
	} catch (SQLException e) {
		System.err.println(e.getMessage());
	}
        finally {
            cn.close();
        }
    }

    @Override
    public Producto findForId(Producto x) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> readAll() throws Exception {
       
     List<Producto> productos = new ArrayList<>();
        try {
            cn = DBUtility.getConnection();
            sql = "select idProducto,NombreProducto,idProveedor,IdCategoría from Productos";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Producto pro = null;
            while (rs.next()) {
                 pro = new Producto();
               //pro = new Producto(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6));
                pro.setIdProducto(rs.getInt(1));
                pro.setNombreProducto(rs.getString(2));
                pro.setIdProveedor(rs.getInt(3));
                pro.setIdCategoria(rs.getInt(4));
                productos.add(pro);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            throw e;
        } finally {
            cn.close();
        }
        return productos;

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}