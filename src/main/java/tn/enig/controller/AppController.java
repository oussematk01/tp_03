package tn.enig.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import antlr.collections.List;
import tn.enig.dao.IAdherant;
import tn.enig.dao.IEmprunt;
import tn.enig.dao.ILivre;
import tn.enig.model.Emprunt;
import tn.enig.model.Livre;


@Controller
public class AppController {
	
	
	@Autowired
	private IAdherant adherantrepos;

	@Autowired
	private IEmprunt empruntrepos;

	@Autowired
	private ILivre livrerepos;
	
	    @GetMapping("/listlivre")
	    public String listlivre(Model model) {
	        model.addAttribute("listelivre", livrerepos.findAll());
	        return "Figure";  
	    }
	    
	    @GetMapping("/listeadherant")
	    public  String listeadherant(Model m) {
	    	m.addAttribute("listeadherant",adherantrepos.findAll());
	    	return "listeadherant";
	    }
	    
	    @GetMapping("/livre/{id}")
	    public String getListeEmpruntsuser(Model m,@PathVariable("id") Long id) {
	 
	     m.addAttribute("listeempruntbyuser", empruntrepos.findAllEmpruntById(id));
         return "listeempruntbylivre";
	    
	    }
	    
	    @GetMapping("/adherantemprunt/{id}")
	    public String getListeEmpruntadherant(Model m,@PathVariable("id") Long id) {
	 
	     m.addAttribute("listeempruntbyuser", empruntrepos.findAllEmpruntByIdahdreants(id));
         return "Empruntbyuser";
	    
	    }
	    
	    @GetMapping("enregisterempreint")
	    public String enregister(Model m) {
	    	
	      
	    	return "formulaire";
	    }

	    
	    
}
