
# download and extract jars to lib folder from 
#http://www.java2s.com/Code/JarDownload/activemq-all/activemq-all-5.4.1.jar.zip
#http://www.java2s.com/Code/JarDownload/javax.jms/javax.jms-api-2.0.jar.zip
#http://central.maven.org/maven2/com/ibm/mq/com.ibm.mq.allclient/9.0.4.0/com.ibm.mq.allclient-9.0.4.0.jar

echo "Running MQ Connectivity Test ..."
java -cp lib/activemq-all-5.4.1.jar:lib/com.ibm.mq.allclient-9.0.4.0.jar:lib/javax.jms-api-2.0.jar:.  App
