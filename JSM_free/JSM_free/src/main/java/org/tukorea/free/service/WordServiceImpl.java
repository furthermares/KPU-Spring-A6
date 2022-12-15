package org.tukorea.free.service;

import java.util.List;

import org.tukorea.free.domain.WordVO;
import org.tukorea.free.persistence.WordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordDAO wordDAO;

	public WordServiceImpl(WordDAO wordDAO) {
		this.wordDAO = wordDAO;
	}

	public WordVO readWord(String id) throws Exception {
		return wordDAO.read(id);
	}

	public List<WordVO> readWordList() throws Exception {
		return wordDAO.readList();
	}

	public void addWord(WordVO word) throws Exception {
		wordDAO.add(word);
	}

	public void deleteWord(String id) throws Exception {
		wordDAO.delete(id);
	}

	public void updateWord(WordVO word) throws Exception {
		wordDAO.update(word);
	}

	public void quiz(WordVO word1, WordVO word2) throws Exception {
		try {
			if (word1.getW_desc().equals("사과")) {
				System.out.println("문제1 정답");
				word1.setW_extra(word1.getW_extra() + "\n 암기 완료");
				wordDAO.update(word1);
			} else {
				throw new Exception("문제1 오답");
			}
			if (word2.getW_desc().equals("배")) {
				System.out.println("문제2 정답");
				word2.setW_extra(word2.getW_extra() + "\n 암기 완료");
				wordDAO.update(word2);
			} else {
				throw new Exception("문제2 오답");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
