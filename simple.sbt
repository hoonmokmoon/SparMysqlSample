name := "sample"

version := "0.1"

scalaVersion := "2.11.7"

// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.4.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "1.4.1",
  "org.apache.spark" %% "spark-hive" % "1.4.1",
  "org.apache.spark" %% "spark-streaming" % "1.4.1",
  "org.apache.spark" %% "spark-streaming-kafka" % "1.4.1",
  "org.apache.spark" %% "spark-streaming-flume" % "1.4.1",
  "org.apache.spark" %% "spark-mllib" % "1.4.1",
  "org.apache.commons" % "commons-lang3" % "3.0",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.3.3",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.3.3",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "cubrid" % "cubrid-jdbc" % "8.4.3.7001",
  "com.typesafe" % "config" % "1.3.0",
  "com.databricks" % "spark-csv_2.11" % "1.2.0",
  "org.apache.hadoop" % "hadoop-client" % "2.7.1"
)

resolvers ++= Seq(
  "JBoss Repository" at "http://repository.jboss.org/nexus/content/repositories/releases/",
  "Spray Repository" at "http://repo.spray.cc/",
  "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Twitter4J Repository" at "http://twitter4j.org/maven2/",
  "Apache HBase" at "https://repository.apache.org/content/repositories/releases",
  "Twitter Maven Repo" at "http://maven.twttr.com/",
  "scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Second Typesafe repo" at "http://repo.typesafe.com/typesafe/maven-releases/",
  "Mesosphere Public Repository" at "http://downloads.mesosphere.io/maven",
  "Cubrid repo" at "http://maven.cubrid.org",
  "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/",
  Resolver.sonatypeRepo("public")
)

