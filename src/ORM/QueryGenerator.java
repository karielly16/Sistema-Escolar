public class QueryGenerator extends MySQLORM{
    String table;
    QueryGenerator(String table){
        this.table = table;
    }
    public String select(String[] fields, String condition){
        String query = "SELECT " + this.implode(fields);
        
        query += " FROM " + table + " WHERE " + condition;
        return query;        
    }
    public String insert(String[] fields, String[] values){
        String query = "INSERT INTO " + table + " (" + this.implode(fields) + ") VALUES (" + this.implodeVals(values) + ")";
        return query;
    }
    public String update(String[] fields, String[] values, String condition){
        String query = "UPDATE " + table + " SET ";
        for(int i = 0; i < fields.length; i++){
            query += fields[i] + " = " + values[i];
            if(i < fields.length - 1){
                query += ", ";
            }
        }
        query += " WHERE " + condition;
        return query;
    }
    public String delete(String condition){
        String query = "DELETE FROM " + table + " WHERE " + condition;
        return query;
    }

}