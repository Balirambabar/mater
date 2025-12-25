package com.jaybabji;


import com.jaybabji.dto.Book;
import com.jaybabji.repository.BooKRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {

       Logger logger= LoggerFactory.getLogger(JpaApplication.class);
        ConfigurableApplicationContext ctxt = SpringApplication.run(JpaApplication.class, args);
       BooKRepository bRepo= ctxt.getBean(BooKRepository.class);
        logger.info("==="+bRepo.getClass());
      // System.out.println("==="+bRepo.getClass());

        Book b=new Book();
        b.setAuthor("Jay Babi");
        b.setId(101);
        b.setPrice(200.00);
        b.setTitle("jboss");
        bRepo.save(b);
System.out.println("id found ="+bRepo.findById(b.getId()).get());


    }

}
