public class ProductManager {  // Is Katmani Classi

    public void add (Product product, int databaseType ){

        if (databaseType == 1){
            // MySql
            MySqlProductDao mySqlProductDao = new MySqlProductDao("Oracle String");
            mySqlProductDao.add(product);
        }
        else if (databaseType == 2){
            // Oracle
            OracleProductDao oracleProductDao = new OracleProductDao("Oracle String");
            oracleProductDao.add(product);
        }
        // Is Katmani
        System.out.println("Urun Is Katmani Islemleri");
        System.out.println("Urun ismi : " +product.getName());

    }
}
