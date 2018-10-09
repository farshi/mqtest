
# Simple java clinet to test  IBM MQ and Apache ActiveMQ connectivity 

## Background
Some time installing IBM MQ client tools is not an easy job to test that from particular host , the MQ endpoint is accessible or not .
If host has route to MQ endpoint and was whitelisted you will see the successful connection in the logs.


## how to Edit code 
Update `App.java` file and add your servers in nameListArray
```
   private static final String[] nameListArray = {
        "host1.mycomp.local(1415),host2.mycomp.local(1415) )",

        };
```

Control the endpoint type in `App.java` file :

```
   private static final  boolean testAMQ=false;
   private static final boolean testIBMQ=true;
```

*Note:* Later on I will update to pass the arguments using -D to the java app through System properties .

## How to compile anb deploy

run `sh compile.sh` in your terminal

for deploy you need to update the followings:
```
Host Ip address 
your_ssh_username 
ssh-key file path
```
in the deploy.sh

run `sh deploy.sh` in your terminal


## How to Run

Deploy will deploy the code and scripts to tmp folder in the host you specified.

for running the code simply to to tmp folder 
`cd /tmp`
`sh run-mqtest.sh`

```
Example output:

[ec2-user@svcm2274ac96ne mqtest]$ sh run-mqtest.sh
Creating the queue.
Aug 28, 2018 12:04:33 AM org.apache.activemq.transport.failover.FailoverTransport doReconnect
INFO: Successfully connected to tcp://localhost:61616
Queuing a message.
Waiting 3 seconds...
Consuming the message.
Closing connection.


```
