/**
 * 
 */
package com.sbxxxia.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @FileName : FileHandler.java
  * @Project : 호스피스 웹서비스
  * @Date : 2020. 7. 1. 
  * @작성자 : sbxxxia@gmail.com
  */

@Lazy
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FileHandler {
	private int fileNumber;
	private String fileName;
}
