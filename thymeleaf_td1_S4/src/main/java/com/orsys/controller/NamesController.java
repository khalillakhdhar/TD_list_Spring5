package com.orsys.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NamesController {
static ArrayList<String> listeNom=new ArrayList<String>();

@GetMapping("")
public String affichage()
{
return "index";	
}

@PostMapping("sauvegarde")
public String lister(Model m, @RequestParam String nom)
{
	listeNom.add(nom);
	m.addAttribute("liste",listeNom);
	return "liste";
}
	
	
	
}
