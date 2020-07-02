package com.sbxxxia.web.tests;

/**
  * @FileName : ConsolePrinter.java
  * @Project : 호스피스 웹서비스
  * @Date : 2020. 7. 2. 
  * @작성자 : sbxxxia@gmail.com
  */
import org.springframework.stereotype.Component;

@Component("conPrinter")
public class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}
 
