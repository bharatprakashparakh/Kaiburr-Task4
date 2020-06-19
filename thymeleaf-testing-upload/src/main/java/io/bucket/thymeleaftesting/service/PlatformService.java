package io.bucket.thymeleaftesting.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import io.bucket.thymeleaftesting.model.Platform;
import io.bucket.thymeleaftesting.repository.PlatformRepository;

@Service
public class PlatformService {
 
	@Autowired
	private PlatformRepository platformRepository;
	

	//Fetch and return all platforms from database.
	public List<Platform> getAllPlatforms()
      {
    	return platformRepository.findAll();
      }
	
	
	//Find platform with given id in url.If platform is not found in database then errror code is sent back to client 
	public Platform getPlatform(int id) 
	  {
		
	    
		     Platform p=null;
	    	 
	             Optional<Platform> optinalEntity =  platformRepository.findById(id);
	        	   p = optinalEntity.get();
	 
	    	  
	    	 
	    	 
	    	 return p;
	    	 
	    	

		}
	  
	 /*Find platform with given name in url.If platform is not found in database then error code is sent back to client. 
	   findByName() method is used as customised query to access mongo database.
	  */
	  public List<Platform> getPlatformByName(String name)
		{
		
		   List<Platform> p=null;      
		   p=platformRepository.findByName(name);
		   //if(p.size()==0)
			 //  throw new ServiceException("platform with given name not found"); 
	       return p;
	    	
	    	
		} 
	  
	  //Add a platform in a database with data received from url.
	  public void addPlatform(Platform platform)
	    {
	    	platformRepository.save(platform);
	    	//return "Created Platform id: "+ platform.getId();
	    }
	  
	  //Delete a platform from a database with id mentioned in url.
	  public void deletePlatform(int id)
	  	{
	  	
	       platformRepository.deleteById(id);
	      // return "Platform deleted having id: "+ id;
	  	}
	  
	  //Update a platform in a database having id equal to id provided in url.
	  public void updatePlatform(Platform platform)
		{
		  
		   
			platformRepository.save(platform);
		  //  return "Platform updated having id: "+ id;
          //return platform;
			
		}
	  
	  
	  public Platform getOne(int id)
	  {

		     Platform p=null;
	    	 
	             Optional<Platform> optinalEntity =  platformRepository.findById(id);
	        	   p = optinalEntity.get();
	 
	    	  
	    	 
	    	 
	    	 return p;
	  }
	
}
