package com.sbxxxia.web.domains;
/**
 * @FileName : Article.java
 * @Project : 호스피스 웹서비스
 * @Date : 2020. 7. 1. 
 * @작성자 : sbxxxia@gmail.com
 * @설 명 : 게시글DTO
 * articleNumber :
 * fileNumber :
 * userid :
 * comments :
 * message :
 * rating :
 * boardType :
 * title :
 * content :
 */
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Lazy
@Data
@Component
public class Article {
	private int articleNumber, fileNumber;
	private String userid, comment, message, rating, boardType, title, content; 
}
