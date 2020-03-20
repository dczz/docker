package com.example.docker;

import com.example.docker.domain.Foo;
import com.example.docker.domain.FooRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

//@DataJpaTest
@SpringBootTest
class DockerApplicationTests {

    @Autowired
    FooRepository fooRepository;

    @Test
    void saveTest() {
        Foo test = fooRepository.save(new Foo("test"));
        Assertions.assertEquals(test.getName(), "test");
        Assertions.assertNotNull(test.getId());
        System.err.println(test.getId());
    }
}