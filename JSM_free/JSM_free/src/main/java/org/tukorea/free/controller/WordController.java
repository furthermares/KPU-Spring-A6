package org.tukorea.free.controller;

import java.util.List;

import org.tukorea.free.domain.WordVO;
import org.tukorea.free.service.WordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/word")
public class WordController {
	
	@Autowired
    private WordService wordService;

	private static final Logger logger = LoggerFactory.getLogger(WordController.class);
	
	@RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public String listWord(Model model) throws Exception {
    	List<WordVO> words = wordService.readWordList();
    	
		logger.info(" /word/list URL called. then listWord method executed.");
        model.addAttribute("words", words);
        return "word/word_list";
    }
    
    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String readWord(@RequestParam("id") String id, Model model) throws Exception {
    	WordVO word = wordService.readWord(id);
    	
		logger.info(" /read?id=? URL called. then readWord method executed.");
        model.addAttribute("word", word);
        return "word/word_read";
    }
    
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String createWordGet() throws Exception {
		logger.info(" /register URL GET method called. then forward word_register.jsp.");
		return "word/word_register";
	}
    
    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
	public String createWordPost( @ModelAttribute("word") WordVO vo) throws Exception {
		wordService.addWord(vo);
		logger.info(vo.toString());
		logger.info(" /register URL POST method called. then createWord method executed.");
		return "redirect:/word/list";
	}
            
    @RequestMapping(value = "/modify", method = RequestMethod.GET)
    public String modifyWordGet(@RequestParam("id") String id, Model model) throws Exception {
    	WordVO word = wordService.readWord(id);
    	
		logger.info(" /modify?id=? URL GET method called. then forward word_modify.jsp.");
        model.addAttribute("word", word);
        return "word/word_modify";
    }

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyWordPost(@ModelAttribute("word") WordVO vo) throws Exception {
		wordService.updateWord(vo);
		logger.info(vo.toString());
		logger.info(" /modify?id=? URL POST method called. then modifyWordPost method executed.");
		return "redirect:/word/list";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteWord(@RequestParam("id") String id, Model model) throws Exception {
		wordService.deleteWord(id);

		logger.info(" /delete?id=? URL called. then deleteWord method executed.");
		return "redirect:/word/list";
	}
	@RequestMapping(value = "/quiz", method = RequestMethod.GET)
	public String quiz() throws Exception {
		logger.info(" /quiz URL called.");
		WordVO vo1 = new WordVO(); vo1.setW_id("w11"); vo1.setL_id("main"); vo1.setW_title("apple"); vo1.setW_extra("ˈæp əl");
		String strID1 = "사과"; vo1.setW_desc(strID1);
		WordVO vo2 = new WordVO(); vo2.setW_id("w12");
		String strID2 = "오답"; vo2.setW_desc(strID2); vo2.setL_id("main"); vo2.setW_title("pear"); vo2.setW_extra("pɛər");
		wordService.quiz(vo1, vo2);
		return "redirect:/word/list";
	}
   
}