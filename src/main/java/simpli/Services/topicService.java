package simpli.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import simpli.beans.topics;
import org.springframework.stereotype.Service;

import simpli.beans.topics;

@Service
public class topicService {
	
	private List<topics> top=new ArrayList<>(Arrays.asList(
			new topics("1","spring","mohit"),
			new topics("2","boot","tiwari"),
			new topics("3","json","qwer")
			));
	public List<topics> getAlltopics(){
		return top;
	}
	
	public topics gettopics(String id){
		return top.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addtopic(topics topic){
		top.add(topic);
	}
	
	public void updatetopic(topics topic,String id){
		for(int i=0;i<top.size();i++)
		{
			topics t=top.get(i);
			if(t.getId().equals(id)){
				top.set(i,topic);
				return;
			}
		}
	}
	
	public void deletetopic(String id){
		top.removeIf(t -> t.getId().equals(id));
	}

}
