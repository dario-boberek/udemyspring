package hello.app;

import hello.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication(scanBasePackages = "hello")
@RestController
public class DemoApplication {

    private final MyService myService;

    public DemoApplication(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.message()+ ", " + this.version;
    }

    private String version;

    @PostConstruct
    private void setVersion() {
    	version = DateTimeFormatter
			    .ofPattern("dd/MM/yyyy - HH:mm")
			    .format(
					    ZonedDateTime
							    .of(
									    LocalDateTime.now(),
									    ZoneId.of("Europe/Warsaw")
							    )
			    );
    }


	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}