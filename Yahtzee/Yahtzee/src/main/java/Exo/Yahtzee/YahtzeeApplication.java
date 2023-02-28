package Exo.Yahtzee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YahtzeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YahtzeeApplication.class, args);

		lanceDes l = new lanceDes("12345");
		l.calculScore("12345");
	}



}
