# SparMysqlSample
-----
### build
```
sbt package
```

### run
```
{spark_home}/bin/spark-submit \
--jars [local:]{mysql-jar-path}/mysql-connector-java-5.1.31.jar \
--class MysqlSample \
--master local[*] \
{buildpath}sample_2.11-0.1.jar
```

### result
```
{spark_home}bin/spark-submit --jars local:/home/{userid}/.ivy2/cache/mysql/mysql-connector-java/jars/mysql-connector-java-5.1.31.jar --class MysqlSample --master local[*] sample/target/scala-2.11/sample_2.11-0.1.jar 
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
16/02/12 03:04:37 INFO SparkContext: Running Spark version 1.6.0
16/02/12 03:04:38 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
16/02/12 03:04:38 WARN Utils: Your hostname, localhost.localdomain resolves to a loopback address: 127.0.0.1; using 10.0.2.15 instead (on interface eth0)
16/02/12 03:04:38 WARN Utils: Set SPARK_LOCAL_IP if you need to bind to another address
16/02/12 03:04:38 INFO SecurityManager: Changing view acls to: userid
16/02/12 03:04:38 INFO SecurityManager: Changing modify acls to: userid
16/02/12 03:04:38 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users with view permissions: Set(userid); users with modify permissions: Set(userid)
16/02/12 03:04:39 INFO Utils: Successfully started service 'sparkDriver' on port 37969.
16/02/12 03:04:39 INFO Slf4jLogger: Slf4jLogger started
16/02/12 03:04:39 INFO Remoting: Starting remoting
16/02/12 03:04:39 INFO Remoting: Remoting started; listening on addresses :[akka.tcp://sparkDriverActorSystem@10.0.2.15:53483]
16/02/12 03:04:39 INFO Utils: Successfully started service 'sparkDriverActorSystem' on port 53483.
16/02/12 03:04:39 INFO SparkEnv: Registering MapOutputTracker
16/02/12 03:04:39 INFO SparkEnv: Registering BlockManagerMaster
16/02/12 03:04:39 INFO DiskBlockManager: Created local directory at /tmp/blockmgr-c2a39464-ecd0-4881-9f07-5db22e16f812
16/02/12 03:04:39 INFO MemoryStore: MemoryStore started with capacity 517.4 MB
16/02/12 03:04:39 INFO SparkEnv: Registering OutputCommitCoordinator
16/02/12 03:04:40 INFO Utils: Successfully started service 'SparkUI' on port 4040.
16/02/12 03:04:40 INFO SparkUI: Started SparkUI at http://10.0.2.15:4040
16/02/12 03:04:40 INFO HttpFileServer: HTTP File server directory is /tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a/httpd-e322c0c3-d73d-4496-a87e-054a91d4af65
16/02/12 03:04:40 INFO HttpServer: Starting HTTP Server
16/02/12 03:04:40 INFO Utils: Successfully started service 'HTTP file server' on port 40911.
16/02/12 03:04:40 INFO SparkContext: Added JAR file:/home/userid/.ivy2/cache/mysql/mysql-connector-java/jars/mysql-connector-java-5.1.31.jar at http://10.0.2.15:40911/jars/mysql-connector-java-5.1.31.jar with timestamp 1455213880289
16/02/12 03:04:40 INFO SparkContext: Added JAR file:/home/userid/apps/spark-1.6.0-bin-hadoop2.6/sample/target/scala-2.11/sample_2.11-0.1.jar at http://10.0.2.15:40911/jars/sample_2.11-0.1.jar with timestamp 1455213880290
16/02/12 03:04:40 INFO Executor: Starting executor ID driver on host localhost
16/02/12 03:04:40 INFO Utils: Successfully started service 'org.apache.spark.network.netty.NettyBlockTransferService' on port 49589.
16/02/12 03:04:40 INFO NettyBlockTransferService: Server created on 49589
16/02/12 03:04:40 INFO BlockManagerMaster: Trying to register BlockManager
16/02/12 03:04:40 INFO BlockManagerMasterEndpoint: Registering block manager localhost:49589 with 517.4 MB RAM, BlockManagerId(driver, localhost, 49589)
16/02/12 03:04:40 INFO BlockManagerMaster: Registered BlockManager
16/02/12 03:04:41 INFO HiveContext: Initializing execution hive, version 1.2.1
16/02/12 03:04:41 INFO ClientWrapper: Inspected Hadoop version: 2.6.0
16/02/12 03:04:41 INFO ClientWrapper: Loaded org.apache.hadoop.hive.shims.Hadoop23Shims for Hadoop version 2.6.0
16/02/12 03:04:42 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
16/02/12 03:04:42 INFO ObjectStore: ObjectStore, initialize called
16/02/12 03:04:42 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
16/02/12 03:04:42 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
16/02/12 03:04:42 WARN Connection: BoneCP specified but not present in CLASSPATH (or one of dependencies)
16/02/12 03:04:43 WARN Connection: BoneCP specified but not present in CLASSPATH (or one of dependencies)
16/02/12 03:04:45 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
16/02/12 03:04:46 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:46 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:48 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:48 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:48 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
16/02/12 03:04:48 INFO ObjectStore: Initialized ObjectStore
16/02/12 03:04:48 WARN ObjectStore: Version information not found in metastore. hive.metastore.schema.verification is not enabled so recording the schema version 1.2.0
16/02/12 03:04:48 WARN ObjectStore: Failed to get database default, returning NoSuchObjectException
16/02/12 03:04:49 INFO HiveMetaStore: Added admin role in metastore
16/02/12 03:04:49 INFO HiveMetaStore: Added public role in metastore
16/02/12 03:04:49 INFO HiveMetaStore: No user is added in admin role, since config is empty
16/02/12 03:04:49 INFO HiveMetaStore: 0: get_all_databases
16/02/12 03:04:49 INFO audit: ugi=userid	ip=unknown-ip-addr	cmd=get_all_databases	
16/02/12 03:04:49 INFO HiveMetaStore: 0: get_functions: db=default pat=*
16/02/12 03:04:49 INFO audit: ugi=userid	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
16/02/12 03:04:49 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:49 INFO SessionState: Created local directory: /tmp/febab405-a389-4458-9d08-17b2d620585a_resources
16/02/12 03:04:49 INFO SessionState: Created HDFS directory: /tmp/hive/userid/febab405-a389-4458-9d08-17b2d620585a
16/02/12 03:04:49 INFO SessionState: Created local directory: /tmp/userid/febab405-a389-4458-9d08-17b2d620585a
16/02/12 03:04:49 INFO SessionState: Created HDFS directory: /tmp/hive/userid/febab405-a389-4458-9d08-17b2d620585a/_tmp_space.db
16/02/12 03:04:49 INFO HiveContext: default warehouse location is /user/hive/warehouse
16/02/12 03:04:49 INFO HiveContext: Initializing HiveMetastoreConnection version 1.2.1 using Spark classes.
16/02/12 03:04:49 INFO ClientWrapper: Inspected Hadoop version: 2.6.0
16/02/12 03:04:50 INFO ClientWrapper: Loaded org.apache.hadoop.hive.shims.Hadoop23Shims for Hadoop version 2.6.0
16/02/12 03:04:50 INFO HiveMetaStore: 0: Opening raw store with implemenation class:org.apache.hadoop.hive.metastore.ObjectStore
16/02/12 03:04:50 INFO ObjectStore: ObjectStore, initialize called
16/02/12 03:04:50 INFO Persistence: Property hive.metastore.integral.jdo.pushdown unknown - will be ignored
16/02/12 03:04:50 INFO Persistence: Property datanucleus.cache.level2 unknown - will be ignored
16/02/12 03:04:50 WARN Connection: BoneCP specified but not present in CLASSPATH (or one of dependencies)
16/02/12 03:04:51 WARN Connection: BoneCP specified but not present in CLASSPATH (or one of dependencies)
16/02/12 03:04:51 INFO ObjectStore: Setting MetaStore object pin classes with hive.metastore.cache.pinobjtypes="Table,StorageDescriptor,SerDeInfo,Partition,Database,Type,FieldSchema,Order"
16/02/12 03:04:52 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:52 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:53 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MFieldSchema" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:53 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MOrder" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:53 INFO Query: Reading in results for query "org.datanucleus.store.rdbms.query.SQLQuery@0" since the connection used is closing
16/02/12 03:04:53 INFO MetaStoreDirectSql: Using direct SQL, underlying DB is DERBY
16/02/12 03:04:53 INFO ObjectStore: Initialized ObjectStore
16/02/12 03:04:53 INFO HiveMetaStore: Added admin role in metastore
16/02/12 03:04:53 INFO HiveMetaStore: Added public role in metastore
16/02/12 03:04:53 INFO HiveMetaStore: No user is added in admin role, since config is empty
16/02/12 03:04:54 INFO HiveMetaStore: 0: get_all_databases
16/02/12 03:04:54 INFO audit: ugi=userid	ip=unknown-ip-addr	cmd=get_all_databases	
16/02/12 03:04:54 INFO HiveMetaStore: 0: get_functions: db=default pat=*
16/02/12 03:04:54 INFO audit: ugi=userid	ip=unknown-ip-addr	cmd=get_functions: db=default pat=*	
16/02/12 03:04:54 INFO Datastore: The class "org.apache.hadoop.hive.metastore.model.MResourceUri" is tagged as "embedded-only" so does not have its own datastore table.
16/02/12 03:04:54 INFO SessionState: Created local directory: /tmp/744e3269-ede9-45fc-908b-860bf37cbe5f_resources
16/02/12 03:04:54 INFO SessionState: Created HDFS directory: /tmp/hive/userid/744e3269-ede9-45fc-908b-860bf37cbe5f
16/02/12 03:04:54 INFO SessionState: Created local directory: /tmp/userid/744e3269-ede9-45fc-908b-860bf37cbe5f
16/02/12 03:04:54 INFO SessionState: Created HDFS directory: /tmp/hive/userid/744e3269-ede9-45fc-908b-860bf37cbe5f/_tmp_space.db
16/02/12 03:04:55 INFO SparkContext: Starting job: count at MysqlSample.scala:26
16/02/12 03:04:55 INFO DAGScheduler: Registering RDD 2 (count at MysqlSample.scala:26)
16/02/12 03:04:55 INFO DAGScheduler: Got job 0 (count at MysqlSample.scala:26) with 1 output partitions
16/02/12 03:04:55 INFO DAGScheduler: Final stage: ResultStage 1 (count at MysqlSample.scala:26)
16/02/12 03:04:55 INFO DAGScheduler: Parents of final stage: List(ShuffleMapStage 0)
16/02/12 03:04:55 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 0)
16/02/12 03:04:55 INFO DAGScheduler: Submitting ShuffleMapStage 0 (MapPartitionsRDD[2] at count at MysqlSample.scala:26), which has no missing parents
16/02/12 03:04:55 INFO MemoryStore: Block broadcast_0 stored as values in memory (estimated size 10.7 KB, free 10.7 KB)
16/02/12 03:04:55 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes in memory (estimated size 5.1 KB, free 15.8 KB)
16/02/12 03:04:55 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory on localhost:49589 (size: 5.1 KB, free: 517.4 MB)
16/02/12 03:04:55 INFO SparkContext: Created broadcast 0 from broadcast at DAGScheduler.scala:1006
16/02/12 03:04:55 INFO DAGScheduler: Submitting 1 missing tasks from ShuffleMapStage 0 (MapPartitionsRDD[2] at count at MysqlSample.scala:26)
16/02/12 03:04:55 INFO TaskSchedulerImpl: Adding task set 0.0 with 1 tasks
16/02/12 03:04:55 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0, localhost, partition 0,PROCESS_LOCAL, 2037 bytes)
16/02/12 03:04:55 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
16/02/12 03:04:55 INFO Executor: Fetching http://10.0.2.15:40911/jars/mysql-connector-java-5.1.31.jar with timestamp 1455213880289
16/02/12 03:04:55 INFO Utils: Fetching http://10.0.2.15:40911/jars/mysql-connector-java-5.1.31.jar to /tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a/userFiles-b170a530-4e39-4ef6-bd0c-bea4c0f92f95/fetchFileTemp4138512148664994109.tmp
16/02/12 03:04:55 INFO Executor: Adding file:/tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a/userFiles-b170a530-4e39-4ef6-bd0c-bea4c0f92f95/mysql-connector-java-5.1.31.jar to class loader
16/02/12 03:04:55 INFO Executor: Fetching http://10.0.2.15:40911/jars/sample_2.11-0.1.jar with timestamp 1455213880290
16/02/12 03:04:55 INFO Utils: Fetching http://10.0.2.15:40911/jars/sample_2.11-0.1.jar to /tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a/userFiles-b170a530-4e39-4ef6-bd0c-bea4c0f92f95/fetchFileTemp5333577372202778556.tmp
16/02/12 03:04:55 INFO Executor: Adding file:/tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a/userFiles-b170a530-4e39-4ef6-bd0c-bea4c0f92f95/sample_2.11-0.1.jar to class loader
16/02/12 03:04:56 INFO GenerateMutableProjection: Code generated in 129.966286 ms
16/02/12 03:04:56 INFO GenerateUnsafeProjection: Code generated in 16.025986 ms
16/02/12 03:04:56 INFO GenerateMutableProjection: Code generated in 21.744966 ms
16/02/12 03:04:56 INFO GenerateUnsafeRowJoiner: Code generated in 10.76131 ms
16/02/12 03:04:56 INFO GenerateUnsafeProjection: Code generated in 15.821957 ms
16/02/12 03:04:56 INFO JDBCRDD: closed connection
16/02/12 03:04:56 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1405 bytes result sent to driver
16/02/12 03:04:56 INFO DAGScheduler: ShuffleMapStage 0 (count at MysqlSample.scala:26) finished in 0.584 s
16/02/12 03:04:56 INFO DAGScheduler: looking for newly runnable stages
16/02/12 03:04:56 INFO DAGScheduler: running: Set()
16/02/12 03:04:56 INFO DAGScheduler: waiting: Set(ResultStage 1)
16/02/12 03:04:56 INFO DAGScheduler: failed: Set()
16/02/12 03:04:56 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0) in 546 ms on localhost (1/1)
16/02/12 03:04:56 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks have all completed, from pool 
16/02/12 03:04:56 INFO DAGScheduler: Submitting ResultStage 1 (MapPartitionsRDD[5] at count at MysqlSample.scala:26), which has no missing parents
16/02/12 03:04:56 INFO MemoryStore: Block broadcast_1 stored as values in memory (estimated size 11.9 KB, free 27.8 KB)
16/02/12 03:04:56 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes in memory (estimated size 5.6 KB, free 33.3 KB)
16/02/12 03:04:56 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory on localhost:49589 (size: 5.6 KB, free: 517.4 MB)
16/02/12 03:04:56 INFO SparkContext: Created broadcast 1 from broadcast at DAGScheduler.scala:1006
16/02/12 03:04:56 INFO DAGScheduler: Submitting 1 missing tasks from ResultStage 1 (MapPartitionsRDD[5] at count at MysqlSample.scala:26)
16/02/12 03:04:56 INFO TaskSchedulerImpl: Adding task set 1.0 with 1 tasks
16/02/12 03:04:56 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 1, localhost, partition 0,NODE_LOCAL, 2125 bytes)
16/02/12 03:04:56 INFO Executor: Running task 0.0 in stage 1.0 (TID 1)
16/02/12 03:04:56 INFO ShuffleBlockFetcherIterator: Getting 1 non-empty blocks out of 1 blocks
16/02/12 03:04:56 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches in 8 ms
16/02/12 03:04:56 INFO GenerateMutableProjection: Code generated in 14.729739 ms
16/02/12 03:04:56 INFO GenerateMutableProjection: Code generated in 11.492672 ms
16/02/12 03:04:56 INFO Executor: Finished task 0.0 in stage 1.0 (TID 1). 1830 bytes result sent to driver
16/02/12 03:04:56 INFO DAGScheduler: ResultStage 1 (count at MysqlSample.scala:26) finished in 0.137 s
16/02/12 03:04:56 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 1) in 150 ms on localhost (1/1)
16/02/12 03:04:56 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks have all completed, from pool 
16/02/12 03:04:56 INFO DAGScheduler: Job 0 finished: count at MysqlSample.scala:26, took 0.976498 s
count : 5
16/02/12 03:04:56 INFO SparkContext: Invoking stop() from shutdown hook
16/02/12 03:04:56 INFO SparkUI: Stopped Spark web UI at http://10.0.2.15:4040
16/02/12 03:04:56 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
16/02/12 03:04:56 INFO MemoryStore: MemoryStore cleared
16/02/12 03:04:56 INFO BlockManager: BlockManager stopped
16/02/12 03:04:56 INFO BlockManagerMaster: BlockManagerMaster stopped
16/02/12 03:04:56 INFO OutputCommitCoordinator$OutputCommitCoordinatorEndpoint: OutputCommitCoordinator stopped!
16/02/12 03:04:56 INFO RemoteActorRefProvider$RemotingTerminator: Shutting down remote daemon.
16/02/12 03:04:56 INFO RemoteActorRefProvider$RemotingTerminator: Remote daemon shut down; proceeding with flushing remote transports.
16/02/12 03:04:56 INFO SparkContext: Successfully stopped SparkContext
16/02/12 03:04:56 INFO ShutdownHookManager: Shutdown hook called
16/02/12 03:04:56 INFO ShutdownHookManager: Deleting directory /tmp/spark-58daaf37-7832-454e-a9d9-bbdacf2d962a
16/02/12 03:04:56 INFO ShutdownHookManager: Deleting directory /tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a
16/02/12 03:04:56 INFO ShutdownHookManager: Deleting directory /tmp/spark-43a196f5-01c2-4ea7-b614-ade17f0dbc7a/httpd-e322c0c3-d73d-4496-a87e-054a91d4af65
```
