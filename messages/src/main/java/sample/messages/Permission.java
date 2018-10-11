package sample.messages;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Rob Winch
 */
@Entity
public class Permission {
	@Id
	@GeneratedValue
	private Long id;

	private Long messageId;

	private String email;

	public Permission() {
	}

	public Permission(Long messageId, String email) {
		this.messageId = messageId;
		this.email = email;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
