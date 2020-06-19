package io.bucket.thymeleaftesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.bucket.thymeleaftesting.model.Platform;
import io.bucket.thymeleaftesting.service.PlatformService;

@Controller
public class PlatformController {
    
	@Autowired
	private PlatformService platformservice;
	
	
	
   
    //Find All Platforms present in database
	 @GetMapping("/platforms")
    public String getAllPlatforms(Model model)
    {
    	List<Platform> platforms=platformservice.getAllPlatforms();
    	model.addAttribute("platforms", platforms);
    	return "platformpage";
    }
    
	 @GetMapping("/platforms/pid")
	 
	 public String getPlatform(@RequestParam int id,Model model)	
	 {
		
	    Platform platform= platformservice.getPlatform(id);
	    model.addAttribute("platform",platform);
	    
	    return "display";

		}
	    
	 @GetMapping("/platforms/pname")

	    public String getPlatformByName(@RequestParam String name,Model model) 
		{
		
	        List<Platform> platforms=platformservice.getPlatformByName(name);
	        model.addAttribute("platforms", platforms);
	        
	       
	    	return "displayname";
		} 
	 
	 @PostMapping("/platforms")
	    public String addPlatform(Platform platform,Model model)
	    {
	    	 platformservice.addPlatform(platform);
	    	 model.addAttribute("platform", platform);
	    	 return "addnew";
	    	 
	    }
	    
	 //@PostMapping("/update")
	 @RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	 public String updatePlatform(Platform platform,Model model)
	    {
		   
		    
		    
		
		  platformservice.updatePlatform(platform);
		    model.addAttribute("platform", platform);
		    return "updated";
		}
	 
	 
    @RequestMapping("/platforms/pidone")
	@ResponseBody 
	 public Platform getOne(@RequestParam int id)	
	 {
		
	    Platform platform= platformservice.getOne(id);
	  //  model.addAttribute("platform",platform);
	    return platform;

		}
    
    
    
  //  @DeleteMapping("/platforms/{id}")
    @RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
    public String deletePlatform(int id)
  	{
  	
       platformservice.deletePlatform(id);
       return "redirect:/platforms";
  	}
	    
    

}
