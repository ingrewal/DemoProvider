package gov.mes.gw.si.prov;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderMgmtServiceApplication {

	
	private static final Logger logger =LoggerFactory.getLogger(ProviderMgmtServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ProviderMgmtServiceApplication.class, args);
		logger.debug("In Provider Management Service ");
	}

}
