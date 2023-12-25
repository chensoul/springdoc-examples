package com.chensoul.springdoc;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index Controller
 *
 * @author <a href="mailto:chensoul.eth@gmail.com">chensoul</a>
 * @since 0.0.1
 */
@RestController
//@Tag(name = "UserController", description = "用户接口")
public class UserController {
	public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 查询用户
	 *
	 * @return 查询用户
	 */
	@GetMapping("/user")
//	@Operation(summary = "查询用户", description = "查询用户")
	public User index() {
		User user = new User();
		user.setId(1L);
		user.setName("zhangsan");
		user.setBirth(LocalDateTime.now());
		return user;
	}


	/**
	 * 用户对象
	 */
	@Data
	public class User {
		/**
		 * ID
		 */
		@JsonProperty
//		@Schema(description = "用户ID")
		private Long id;

		/**
		 * 名称
		 */
		@JsonProperty
//		@Schema(description = "名称")
		private String name;

		/**
		 * 生日
		 */
		@JsonFormat(pattern = DEFAULT_DATE_TIME_FORMAT)
		@JsonProperty
//		@Schema(description = "生日")
		private LocalDateTime birth;
	}
}
