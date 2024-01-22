package git_action_project_1.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GitActionProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(GitActionProject1Application.class, args);
	}
	
	@GetMapping("/user/details")
	public String user() {
		return "hii inba code is working";
	}
	
	@GetMapping("/user/details/user")
	public String user1() {
		return "hii inba code is working";
	
	}
	
	@GetMapping("/user/details/user/1")
	public String user2() {
		return "hii inba code is working";
	
	}
}
