# SparMysqlSample
-----
### build
```
sbt package
```

### run
```
{spark_home}/bin/spark-submit \
--jars {mysql-jar-path}/mysql-connector-java-5.1.31.jar \
--class MysqlSample \
--master local[*] \
{buildpath}sample_2.11-0.1.jar
```

### result
```
```
