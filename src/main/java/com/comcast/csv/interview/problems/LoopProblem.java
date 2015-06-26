package com.comcast.csv.interview.problems;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comcast.csv.meme.Meme;

/**
 * Using all forms of loops and recursions to iterate over a {@link List} of
 * {@link Meme}s and log it's name and year. Format of the log message isn't
 * important.
 */
public class LoopProblem {
	public static final Logger log = LoggerFactory.getLogger(LoopProblem.class);

	public void displayMemes(List<Meme> memes) {
		// iterate over collection
		log.info("using iterator");
		for (Iterator<Meme> iterator = memes.iterator(); iterator.hasNext();) {
			Meme meme = (Meme) iterator.next();
			logDetails(meme);
		}

		// iterate over array/iterable
		log.info("using enhanced for");
		for (Meme meme : memes) {
			logDetails(meme);
		}

		log.info("using while iterator");
		Iterator<Meme> it = memes.iterator();
		while (it.hasNext()) {
			Meme meme = (Meme) it.next();
			logDetails(meme);
		}

		log.info("using for");
		for (int i = 0; i < memes.size(); i++) {
			Meme meme = (Meme) memes.get(i);
			logDetails(meme);
		}
	}

	private void logDetails(Meme meme) {
		log.info("Meme> name : " + meme.getName() + " , year : " + meme.getYear());
	}

}
