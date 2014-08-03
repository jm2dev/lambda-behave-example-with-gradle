package com.jm2dev.example;

import com.insightfullogic.lambdabehave.JunitSuiteRunner;
import org.junit.runner.RunWith;

import static com.insightfullogic.lambdabehave.Suite.describe;

@RunWith(JunitSuiteRunner.class)
public class BookSpec {{
    Book book = new Book("Sample title");

    describe("a book", it -> {
        it.should("have a title", expect -> {
            expect.that(book.getTitle().matches("\\w.*")).is(true);
        });
    });

}}
