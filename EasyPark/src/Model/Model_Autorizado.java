package Model;

import Controller.Ctrl_Autorizado;
import Controller.Ctrl_Pessoa;
import Controller.Ctrl_Util;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Autorizado{
  private static ResultSet rs = null;
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Autorizado Autoriazado) throws SQLException 
    {
            
        Ctrl_Autorizado Pessoa = new Ctrl_Autorizado();
        Pessoa.setCpf(Autoriazado.getCpf());
        Pessoa.setCelular(Autoriazado.getCelular());
        Pessoa.setFixo(Autoriazado.getFixo());
        Pessoa.setNome(Autoriazado.getNome());
        Pessoa.setEmail(Autoriazado.getEmail());
        Pessoa.setCep(Autoriazado.getCep());
        Pessoa.setNumero(Autoriazado.getNumero());
        Pessoa.setTipo(Autoriazado.getTipo());
        
        Autoriazado.setIdPessoa(Model_Pessoa.Salvar(Pessoa,"PESSOA"));
      
        
        String  sqlString = "insert into AUTORIZADO (CNH, ID_PESSOA) values ('" 
                +Autoriazado.getCnh()+ "','"
                +Autoriazado.getIdPessoa()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        
        String CodAtual = null;
        if (r==true) 
        {
            r = false;
            //INSERT INTO CLIENTE_AUTO(ID, ID_AUTORIZADO, ID_CLIENTE) VALUES  (,)
            sqlString = "INSERT INTO CLIENTE_AUTO(ID_AUTORIZADO, ID_CLIENTE) VALUES("
                    +Autoriazado.getId()+ ","
                    +Ctrl_Util.IdCliente +")";
            r = Model_Banco.Salvar(sqlString);
            if (r==true) {
                
                CodAtual = Model_Banco.BuscaCodigoNovo("AUTORIZADO");
            }
            
        }
        
        return CodAtual;
        
    }
    
    public static Boolean Deletar(String Cod)
    {
       
       String sqlString = "delete from CLIENTE * where (ID= "+ Cod +")";
               
        
        return true;
    }    
    
    public static Ctrl_Autorizado  BuscaCliente(String Id_Pessoa, String Cnh )
    {
        Ctrl_Autorizado Autorizado = new Ctrl_Autorizado();
        try 
        {
           String sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Autorizado.setId(rs.getString(1));
                Autorizado.setCpf(rs.getString(2));
                Autorizado.setNome(rs.getString(3));
                Autorizado.setFixo(rs.getString(4));
                Autorizado.setCelular(rs.getString(5));
                Autorizado.setEmail(rs.getString(6));
                Autorizado.setNumero(rs.getString(7));
                Autorizado.setCep(rs.getString(8));
                Autorizado.setCnh(Cnh);
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Autorizado;
    }
    
     public static String  BuscaCnh(String Id_Pessoa)
    {

        String CNH = null;
        try 
        {
           String sqlString ="SELECT CNH FROM CLIENTE WHERE (ID_PESSOA="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                CNH = rs.getString(1);
    
           }
           
           
        } 
        catch (Exception e)
        {
             return "false";
        }
        
        
        return CNH;
    }
       
}
