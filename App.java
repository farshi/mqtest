
import javax.jms.JMSException;


public class App {

    private static final  boolean testAMQ=false;
    private static final boolean testIBMQ=true;

    
    private static final String queueManager="ICF14PS15" ;

    //private static final String queueManager="ICF08PR15" ;
    private static final String channel="MOB.DEF.SVRCONN" ;
    
    private static final String[] nameListArray = {
        "host1.mycomp.local(1415),host2.mycomp.local(1415) )",

        };
    
    public static void main( String[] args ) {
        MQTest mq = null;
        for (int i = 0; i < nameListArray.length; i++){
            System.out.println("Checking  endpoint : " + nameListArray[i]);

            mq = new MQTest(nameListArray[i], queueManager , channel );
            if ( testAMQ == true ) {
                System.out.println("Creating the queue.");
                mq.setupQueue();
                System.out.println("Queuing a message.");
                mq.createMessage();
                System.out.println("Waiting 3 seconds...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }
                System.out.println("Consuming the message.");
                mq.grabMessage();
                System.out.println("Closing connection.");
                mq.closeQueue();
            }
            if ( testIBMQ  == true  ) {
                mq.startSession();
            }
        }
    }
}
