package com.example.springbootOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyExampleApplication.class, args);
	}

}
/*{
"author_id": 1,
"author_name": "John Doe",
"books": [
  {
    "book_id": 101,
    "book_name": "Example Book Title"
  },
  {
    "book_id": 102,
    "book_name": "Another Book Title"
  }
]
}*/