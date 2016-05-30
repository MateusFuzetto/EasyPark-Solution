
package Model;

import Controller.Ctrl_Funcionario;
import Controller.Ctrl_Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Funcionario {   

    private static ResultSet rs = null;
    public static void Atualizar()
    {
        
    }
    
    public static String Salvar(Ctrl_Funcionario Funcionario) throws SQLException 
    {
            
        Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
        Pessoa.setCpf(Funcionario.getCpf());
        Pessoa.setCelular(Funcionario.getCelular());
        Pessoa.setFixo(Funcionario.getFixo());
        Pessoa.setNome(Funcionario.getNome());
        Pessoa.setEmail(Funcionario.getEmail());
        Pessoa.setCep(Funcionario.getCep());
        Pessoa.setNumero(Funcionario.getNumero());
        
        Funcionario.setIdPessoa(Model_Pessoa.Salvar(Pessoa,"PESSOA"));
      
        
        String  sqlString = "insert into FUNCIONARIO (Login, ID_PESSOA) values ('" 
                +Funcionario.getLogin()+ "','"
                +Funcionario.getIdPessoa()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String CodAtualFuncionario = null;
        if (r==true) 
        {
            CodAtualFuncionario = Model_Banco.BuscaCodigoNovo("FUNCIONARIO");
        }
        
        return CodAtualFuncionario;
        
    }
    
    public static Boolean Deletar(String Id)
    {
       
       String sqlString = "delete from FUNCIONARIO * where (ID= "+ Id +")";
               
        
        return true;
    }    
    
    public static Ctrl_Funcionario  BuscaFuncionario(String Id_Pessoa, String Cnh )
    {
        Ctrl_Funcionario Funcionario = new Ctrl_Funcionario();
        try 
        {
           String sqlString ="SELECT * FROM PESSOA WHERE (ID="+Id_Pessoa+")";
           rs = Model_Banco.BuscaRegistro(sqlString);
           if (rs.next()) {   
                Funcionario.setId(rs.getString(1));
                Funcionario.setCpf(rs.getString(2));
                Funcionario.setNome(rs.getString(3));
                Funcionario.setFixo(rs.getString(4));
                Funcionario.setCelular(rs.getString(5));
                Funcionario.setEmail(rs.getString(6));
                Funcionario.setNumero(rs.getString(7));
                Funcionario.setCep(rs.getString(8));
               
           }
           
           
        } 
        catch (Exception e)
        {
            
        }
        
        
        return Funcionario;
    }
}
