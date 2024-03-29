package br.com.felipemoi.banco;

/**
 * Created by Felipe Moi on 08/07/2015.
 */
public class ScriptSQL {


    public static String getCreateContato()
    {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS CONTATO ( ");
        sqlBuilder.append(" _id     INTEGER             NOT NULL ");
        sqlBuilder.append("           PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("TELEFONE             VARCHAR (14), ");
        sqlBuilder.append("TIPOTELEFONE         VARCHAR (1), ");
        sqlBuilder.append("EMAIL                VARCHAR (255), ");
        sqlBuilder.append("TIPOEMAIL            VARCHAR (1), ");
        sqlBuilder.append("ENDERECO             VARCHAR (255), ");
        sqlBuilder.append("TIPOENDERECO         VARCHAR (1), ");
        sqlBuilder.append("DATASESPECIAIS       DATE, ");
        sqlBuilder.append("TIPODATASESPECIAIS   VARCHAR(1), ");
        sqlBuilder.append("GRUPOS               VARCHAR(255) ");
        sqlBuilder.append(");");

        return sqlBuilder.toString();

    }

}
