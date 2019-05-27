package lab.iprakom.webwithci.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AppController {

    @RequestMapping("/")
    fun getHome(): String = "awal"

}