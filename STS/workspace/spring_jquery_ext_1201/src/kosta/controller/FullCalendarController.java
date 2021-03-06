package kosta.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FullCalendarController {
	@RequestMapping(value="fullcalendar")
	public String calendarView(Model model){
		List<Map<String, String>> daylist = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		map.put("start", "2016-06-01");
		map.put("end", "2016-06-05");
		daylist.add(map);
		Map<String, String> map1 = new HashMap<>();
		map1.put("start", "2016-06-11");
		map1.put("end", "2016-06-15");
		daylist.add(map1);
		model.addAttribute("daylist", daylist);
		//------------
		String tag = "[{title:'test',start:'2016-06-10',end:'2016-06-13'},]";
		model.addAttribute("tag", tag);
		return "fullcalendar";
	}
	@RequestMapping(value="testjson")
	public String testjson(){
		return "/caljson";
	}
}
