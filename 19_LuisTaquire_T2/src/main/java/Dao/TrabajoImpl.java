package Dao;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Trabajo;


public class TrabajoImpl extends Conexion  {
  // IDTRA    RADTRA    BOXTRA  ONEATRA   ONEBTRA ONECTRA  SPIATRA  SPIBTRA  SLITRA  KNOTRA   ;
 
    public void registrar(Trabajo tra) throws Exception {
        String sql = "insert into TRABAJO "
                + "(RADTRA) values(?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);

            ps.setString(1, tra.getRADTRA());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar Reclamacion Dao" + e.getMessage());
        } finally {
            this.cerrarCnx();
        }
    }
    
    public void registrarOneMenu(Trabajo tra) throws Exception {
        String sql = "insert into TRABAJO "
                + "(ONEATRA,ONEBTRA,ONECTRA) values(?,?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);

            ps.setString(1, tra.getONEATRA());
            ps.setString(2, tra.getONEBTRA());
            ps.setString(3, tra.getONECTRA());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar Reclamacion Dao" + e.getMessage());
        } finally {
            this.cerrarCnx();
        }
    }

   
    public void registrarSpinner(Trabajo tra) throws Exception {
        String sql = "insert into TRABAJO "
                + "(SPIATRA,SPIBTRA) values(?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);

            ps.setInt(1, tra.getSPIATRA());
            ps.setInt(2, tra.getSPIBTRA());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar Reclamacion Dao" + e.getMessage());
        } finally {
            this.cerrarCnx();
        }
    }
    
    
     public void registrarSlider(Trabajo tra) throws Exception {
        String sql = "insert into TRABAJO "
                + "(SLITRA) values(?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);

            ps.setInt(1, tra.getSLITRA());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar Reclamacion Dao" + e.getMessage());
        } finally {
            this.cerrarCnx();
        }
    }
     
     
     public void registrarKnob(Trabajo tra) throws Exception {
        String sql = "insert into TRABAJO "
                + "(KNOTRA) values(?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);

            ps.setInt(1, tra.getKNOTRA());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en registrar Reclamacion Dao" + e.getMessage());
        } finally {
            this.cerrarCnx();
        }
    }
    
    public List<Trabajo> listar() throws Exception {

 // IDTRA    RADTRA    BOXTRA  ONEATRA   ONEBTRA ONECTRA  SPIATRA  SPIBTRA  SLITRA  KNOTRA   ;
        List<Trabajo> listado = new ArrayList<>();
        Trabajo rec;
        String sql = "select * from TRABAJO ORDER BY IDTRA DESC";
        try {
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                rec = new Trabajo();
                rec.setIDTRA(rs.getInt("IDTRA"));
                rec.setRADTRA(rs.getString("RADTRA"));
                rec.setBOXTRA(rs.getString("BOXTRA"));
                rec.setONEATRA(rs.getString("ONEATRA"));
                rec.setONEBTRA(rs.getString("ONEBTRA"));
                rec.setONECTRA(rs.getString("ONECTRA"));
                
                rec.setSPIATRA(rs.getInt("SPIATRA"));
                rec.setSPIBTRA(rs.getInt("SPIBTRA"));
                rec.setSLITRA(rs.getInt("SLITRA"));
                rec.setKNOTRA(rs.getInt("KNOTRA"));
                
                
                listado.add(rec);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println("Error en la listado Reclamacion Dao " + e.getMessage());
        } finally {
            this.cerrarCnx();
        }
        return listado;
    }

    

    

}
