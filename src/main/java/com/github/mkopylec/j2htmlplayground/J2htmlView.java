package com.github.mkopylec.j2htmlplayground;

import j2html.tags.ContainerTag;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static j2html.TagCreator.attrs;
import static j2html.TagCreator.body;
import static j2html.TagCreator.div;
import static j2html.TagCreator.h1;
import static j2html.TagCreator.head;
import static j2html.TagCreator.html;
import static j2html.TagCreator.link;
import static j2html.TagCreator.title;

public class J2htmlView extends AbstractView {

    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
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
        html.render(response.getWriter());
    }
}
