package bsuir.csan.iapt.g153501.itirod.web;

import bsuir.csan.iapt.g153501.itirod.domain.Contact;
import bsuir.csan.iapt.g153501.itirod.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by alex on 11/25/14.
 */

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public ModelAndView listContacts() {
        ModelAndView mv = new ModelAndView();
        List<Contact> contacts = this.contactService.listContact();
        mv.addObject("newContact", new Contact());

        mv.addObject("contactsList", contacts);
        mv.addObject("la", "lalala");
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Contact contact,
                             BindingResult result) {

        contactService.addContact(contact);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {

        contactService.removeContact(contactId);

        return "redirect:/index";
    }
}