package sample.inbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

/**
 * @author Rob Winch
 */
@Controller
public class IndexController {
	private final WebClient webClient;

	public IndexController(WebClient webClient) {
		this.webClient = webClient;
	}

	@GetMapping("/")
	String index(Map<String, Object> model) {
		String body = this.webClient.get()
			.uri("http://localhost:8082/messages/")
			.retrieve()
			.bodyToMono(String.class)
			.block();
		model.put("messages", body);
		return "index";
	}
}
