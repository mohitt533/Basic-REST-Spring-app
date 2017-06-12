package simpli.Controllers;

import java.util.Arrays;
import java.util.List;
import simpli.Services.topicService;
import simpli.beans.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import simpli.beans.topics;
@RestController
public class topicController {
	@Autowired
	private topicService topicservice;
	@RequestMapping("/topics")
	public List<topics> getalltopics() {
		return topicservice.getAlltopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public topics gettopic(@PathVariable String id){
		return topicservice.gettopics(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addtopic(@RequestBody topics topic)
	{
		topicservice.addtopic(topic);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void addtopic(@RequestBody topics topic,@PathVariable String id)
	{
		topicservice.updatetopic(topic,id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deletetopic(@PathVariable String id){
		topicservice.deletetopic(id);
	}

}
