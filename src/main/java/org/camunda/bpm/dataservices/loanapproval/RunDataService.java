package org.camunda.bpm.dataservices.loanapproval;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import java.util.logging.Logger;
import org.example.HelloWorld;


public class RunDataService implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");
	
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		DatabaseClient client = DatabaseClientFactory.newClient("localhost", 8099,
				new DatabaseClientFactory.DigestAuthContext("data-services-example-user", "password"));
		String j = HelloWorld.on(client).whatsUp("Hey!", 2L);	
		//String j = "Hello";
		//execution.getVariable("customerId")
		LOGGER.info("Processing request by '" + j + "'...");
		client.release();
	}

}
