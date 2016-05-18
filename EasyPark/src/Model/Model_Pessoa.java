
package Model;

import Controller.Ctrl_Pessoa;
import java.sql.SQLException;
import java.sql.Statement;

public class Model_Pessoa {   

    public static String sqlString=""; 
    public static Boolean Atualizar()
    {
        try 
        {
            
        } 
        catch (Exception e) 
        {
            return false;
        }
        return true;
    }
    
    public static String Salvar(Ctrl_Pessoa Pessoa, String Tabela) throws SQLException 
    {
        
        sqlString ="INSERT INTO PESSOA"+
                "(CPF, NOME, TELEFONE, CELULAR, EMAIL, NUMERO, CEP) VALUES('"
                +Pessoa.getCpf()+"','"
                +Pessoa.getNome()+"','"
                +Pessoa.getFixo()+"','"
                +Pessoa.getCelular()+"','"
                +Pessoa.getEmail()+"',"
                +Pessoa.getNumero()+",'"
                +Pessoa.getCep()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String  CodAtualPessoa=null;
        if(r==true)
        {
          CodAtualPessoa =  Model_Banco.BuscaCodigo("PESSOA");    
        }
        
        return CodAtualPessoa;
    }
    
    public static Boolean Deletar(String Cod) throws SQLException
    {
        sqlString = "delete from PESSOA where (ID="+Cod+")";
        return Model_Banco.Deletar(sqlString);
    }    
    
    public static Ctrl_Pessoa  Verificar()
    {
        Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
        return Pessoa;
    }
}
