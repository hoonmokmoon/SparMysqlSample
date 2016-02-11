/* MysqlSample.scala */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SQLContext, SaveMode}
import org.apache.spark.sql.hive.HiveContext
import java.util.Properties

object MysqlSample {
  def main(args: Array[String]) {
    var props = new Properties()
	props.setProperty("fetchSize","1000")
	props.setProperty("user","root")
	props.setProperty("password","")
	props.setProperty("driver","com.mysql.jdbc.Driver")
    val url = "jdbc:mysql://localhost:3306/mysql"

    val conf = new SparkConf().setAppName("Mysql Sample Application")
    val sc = new SparkContext(conf)
    val sqlc = new HiveContext(sc)
    //Class.forName("com.mysql.jdbc.Driver").newInstance
    val jdbcDF = sqlc.read.jdbc(url,"user",props)
    println("count : " + jdbcDF.count())
  }
}

