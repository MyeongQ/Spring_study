package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/mapping/users")
public class MappingClassController {

    private Logger log = LoggerFactory.getLogger(getClass());
    /**
     * 회원 관리 API
     *  * 회원 목록 조회 : GET /users
     *  * 회원 등록 : POST /users
     *  * 회원 조회 : GET /users/{userId}
     *  * 회원 수정 : PATCH /users/{userId}
     *  * 회원 삭제 : DELETE /users/{userId}
     */

    @GetMapping
    public String user() {
        log.info("get users");
        return "get users";
    }

    @PostMapping
    public String addUser() {
        log.info("post users");
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        log.info("get users userId={}", userId);
        return "get userId="+userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        log.info("patch users userId={}", userId);
        return "patch userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        log.info("delete users userId={}", userId);
        return "delete user=" + userId;
    }

}
