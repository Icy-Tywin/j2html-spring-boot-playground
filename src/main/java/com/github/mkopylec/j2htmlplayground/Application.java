package com.github.mkopylec.j2htmlplayground;

import j2html.tags.ContainerTag;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static j2html.TagCreator.attrs;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.link;
import static j2html.TagCreator.title;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        run(Application.class, args);
        ContainerTag html = html(
                head(
                        title("Title"),
                        link().withRel("stylesheet").withHref("/css/main.css")
                ),
                body(
                        div(attrs("#main.content"),
                                h1("Heading!")
                        )
                )
        );
        System.out.println(html.renderFormatted());
    }
}
