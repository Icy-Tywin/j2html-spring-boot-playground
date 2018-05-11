package com.github.mkopylec.j2htmlplayground;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        run(Application.class, args);
//        ContainerTag html = html(
//                head(
//                        title("Title"),
//                        link().withRel("stylesheet").withHref("/css/main.css")
//                ),
//                body(
//                        div(attrs("#main.content"),
//                                h1("Heading!")
//                        )
//                )
//        );
//        System.out.println(html.renderFormatted());
    }
}
