package hello.servlet.web.servlet;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "memberListServlet", urlPatterns = "/servlet/members")
public class MemberListServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        PrintWriter w = resp.getWriter();
        w.write("""
                <html>\s
                <head>\s
                   <meta charset="UTF-8">\s
                   <title>Title</title>\s
                </head>\s
                <body>\s
                <a href="/index.html">메인</a>\s
                <table>\s
                   <thead>\s
                   <th>id</th>\s
                   <th>username</th>\s
                   <th>age</th>\s
                   </thead>\s
                   <tbody>\s
                """);

        for (Member member : members) {
            w.write("       <tr> \n" +
                    "           <td>" + member.getId() + "</td> \n" +
                    "           <td>" + member.getUsername() + "</td> \n" +
                    "           <td>" + member.getAge() + "</td> \n" +
                    "       </tr> \n");
        }

        w.write("""
                   </tbody>\s
                </table>\s
                </body>\s
                </html>""");

    }
}
