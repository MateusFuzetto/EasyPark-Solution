
package Model;

import Controller.Ctrl_Vaga;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model_Vaga {
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
    
    public static String Salvar(Ctrl_Vaga Vaga, String Tabela) throws SQLException 
    {
        
        
        
        Vaga.setIdTipo(Vaga.getIdTipo().equals("CARRO")? "1" : "2");
        Vaga.setStatus("0");
        sqlString ="INSERT INTO VAGA(ID_TIPO, PRECO, LOCALIZACAO, STATUS, DESCRICAO) VALUES("
                +Vaga.getIdTipo()+","
                +Vaga.getPreco()+",'"
                +Vaga.getLocalizacao()+"',"
                +Vaga.getStatus()+",'"
                +Vaga.getDescricao()+"')";
        
        boolean r = Model_Banco.Salvar(sqlString);
        String  CodAtualVaga=null;
        if(r==true)
        {
          CodAtualVaga =  Model_Banco.BuscaCodigoNovo(Tabela);    
        }
        
        return CodAtualVaga;
    }
    
    public static Boolean Deletar(String Cod) throws SQLException
    {
        sqlString = "delete from PESSOA where (ID="+Cod+")";
        return Model_Banco.Deletar(sqlString);
    }    
    
    public static Ctrl_Vaga  Verificar(String Cpf)
    {
       Ctrl_Vaga Vaga = new Ctrl_Vaga();
        ResultSet rs = null;
        String sqlString ="select * from PESSOA where (CPF='" + Cpf + "')";
        try 
        {
            rs = Model_Banco.BuscaRegistro(sqlString);
            if (rs.next()) 
            {
                //  ID, ID_TIPO, PRECO, LOCALIZACAO, STATUS, DESCRICAO
                Vaga.setId(rs.getString(1));
                Vaga.setIdTipo(rs.getString(2));
                Vaga.setPreco(rs.getString(3));
                Vaga.setLocalizacao(rs.getString(4));
                Vaga.setStatus(rs.getString(5));
                Vaga.setDescricao(rs.getString(6));
            }
        } 
        catch (Exception e) 
        {
            return null;
        }
        return Vaga;
    }
}
