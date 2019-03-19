package com.hr.springbootfive.Controller;

import com.hr.springbootfive.entity.Person;
import com.hr.springbootfive.service.PersonService;
import com.hr.springbootfive.service.ServiceImpl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/five")
public class PersonController {

        @Autowired
        private PersonService ser;

        @RequestMapping("/findAll")
        public ModelAndView findAll(){

            ModelAndView mv=new ModelAndView("/person/list");
            mv.addObject("perlist",ser.findAll());
            return mv;
        }

    @RequestMapping("/save")
    public ModelAndView save(Person person) {
            ModelAndView mv=new ModelAndView("redirect:/five/findAll");
            ser.save(person);
            return mv;
    }

    @RequestMapping("/saveone")
    public ModelAndView saveone(Person person) {
        ModelAndView mv=new ModelAndView("/person/save");
        return mv;
    }

    @RequestMapping("/delete")
    public ModelAndView delete(Integer id) {
        ModelAndView mv=new ModelAndView("redirect:/five/findAll");
        ser.delete(id);
        return mv;
    }

    @RequestMapping("/selectone")
    public ModelAndView selectone(Integer id) {
        ModelAndView mv=new ModelAndView("/person/selectone");
        Person selectone = ser.selectone(id);
        mv.addObject("selectone",selectone);
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView update(Person person) {
        ModelAndView mv=new ModelAndView("redirect:/five/findAll");
        ser.update(person);
        return mv;
    }
}
