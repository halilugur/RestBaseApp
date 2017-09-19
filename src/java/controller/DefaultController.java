package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Halil
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mov = new ModelAndView("index");
        return mov;
    }
}
