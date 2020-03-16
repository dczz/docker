package com.example.docker.controller;

import com.example.docker.domain.Foo;
import com.example.docker.domain.FooRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    private final FooRepository fooRepository;

    public FooController(FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @RequestMapping("foo")
    public Foo find() {
        return fooRepository.findAll().stream().findFirst().orElseThrow(RuntimeException::new);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void on() {
        Foo foo = new Foo();
        foo.setName("123");
        fooRepository.save(foo);
    }
}
