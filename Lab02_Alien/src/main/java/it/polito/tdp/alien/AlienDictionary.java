package it.polito.tdp.alien;

import java.util.LinkedHashSet;

public class AlienDictionary {

	LinkedHashSet<Word> setWords =  new LinkedHashSet<Word>();
	
	public void addWord(String alienWord, String translation) {
		Word wtemp = new Word(alienWord, translation);
		setWords.add(wtemp);
	}
	
	public String translateWord (String alienWord) {
		String translated=null;
		//Word wtemp;
		//wtemp.setAlienWord(alienWord);
		for(Word w : setWords) {
			if(w.getAlienWord().equals(alienWord)) {
				translated=w.getTranslation();
			}
		}
		return translated;
	}
}
