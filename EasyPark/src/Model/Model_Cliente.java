
package Model;

import Controller.Ctrl_Cliente;
import Controller.Ctrl_Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Cliente {   

    private static ResultSet rs = null;
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Cliente Cliente) throws SQLException 
    {
            
        Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
        Pessoa.setCpf(Cliente.getCpf());
        Pessoa.setCelular(Cliente.getCelular());
        Pessoa.setFixo(Cliente.getFixo());
        Pessoa.setNome(Cliente.getNome());
        Pessoa.setEmail(Cliente.getEmail());
        Pessoa.setCep(Cliente.getCep());
        Pessoa.setNumero(Cliente.getNumero());
        
        Cliente.setIdPessoa(Model_Pessoa.Salvar(Pessoa,"PESSOA"));
      
        
        String  sqlString = "insert into CLIENTE (CNH, ID_PESSOA) values ('" 
                +Cliente.getCnh()+ "','"
                +Cliente.getIdPessoa()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String CodAtualCliente = null;
        if (r==true) 
        {
            CodAtualCliente = Model_Banco.BuscaCodigoNovo("CLIENTE");
        }
        
        return CodAtualCliente;
        
    }
    
    public static Boolean Deletar(String Cod)
    {
       
       String sqlString = "delete from CLIENTE * where (ID= "+ Cod +")";
               
        
        return true;
    }    
    
    public static Ctrl_Cliente  BuscaCliente(String Id_Pessoa, String Cnh )
    {
        Ctrl_Cliente Cliente = new Ctrl_Cliente();
        try 
        {
           String sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Cliente.setId(rs.getString(1));
                Cliente.setCpf(rs.getString(2));
                Cliente.setNome(rs.getString(3));
                Cliente.setFixo(rs.getString(4));
                Cliente.setCelular(rs.getString(5));
                Cliente.setEmail(rs.getString(6));
                Cliente.setNumero(rs.getString(7));
                Cliente.setCep(rs.getString(8));
                Cliente.setCnh(Cnh);
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Cliente;
    }
}
