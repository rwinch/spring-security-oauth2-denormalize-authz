package sample.messages;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @author Rob Winch
 */
@Component
public class DataInitiazer implements SmartInitializingSingleton {
	private final MessageRespository messages;

	public DataInitiazer(MessageRespository messages) {
		this.messages = messages;
	}

	@Override
	public void afterSingletonsInstantiated() {
		this.messages.save(new Message("Hi DST"));
		this.messages.save(new Message("Hi KC"));

		for (int i=0;i<100;i++) {
			this.messages.save(new Message("Hi " + i));
		}
	}
}
