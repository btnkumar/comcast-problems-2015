package com.comcast.csv.meme;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comcast.csv.interview.problems.CollectionsProblem;
import com.comcast.csv.interview.problems.CollectionsProblemImpl;
import com.comcast.csv.interview.problems.FileJsonResourceProblem;
import com.comcast.csv.interview.problems.LoopProblem;
import com.comcast.csv.interview.problems.StringParsingProblem;

public class AppTest {
	public static final Logger log = LoggerFactory.getLogger(AppTest.class);

	public static void main(String[] args) {
		// Use case 1 : collections problem
		// Create a list
		List<Meme> memeLst = new ArrayList<Meme>(10);
		int year = 2000;
		for (int i = 0; i < 10; i++) {
			Meme meme = new Meme();
			meme.setName("test name" + (year + 1));
			meme.setYear(year + 1);
			meme.setTags(new String[] { "tag " + (year + 1) });
			memeLst.add(meme);
			year++;
		}

		CollectionsProblem collectionsProblem = new CollectionsProblemImpl();
		collectionsProblem.sort(memeLst, true);
		collectionsProblem.sort(memeLst, false);
		collectionsProblem.addTag(memeLst, "tag 10");

		// Use case 2: StringParsingProblem
		StringParsingProblem stringParsingProblem = new StringParsingProblem();
		String[] strArr = new String[] { "25w873 Apple St.", "3n17 Special Ave.", "0e34800 Main St.",
				"0e34800 Main Street" };
		for (int i = 0; i < strArr.length; i++) {
			stringParsingProblem.getDistanceFromCityCenter(strArr[i]);
			stringParsingProblem.isAddressValid(strArr[i]);
		}

		// Use case 3: FileJsonResourceProblem
		FileJsonResourceProblem fileJsonResourceProblem = new FileJsonResourceProblem();
		try {
			List<Meme> classPathMemeLst = fileJsonResourceProblem.readFromClasspath("/content/list.json");
			log.info("classPathMemeLst size :" + classPathMemeLst.size());
		} catch (YoureDoingItWrongException e) {
			log.error(e.getMessage());
		}
		try {
			List<Meme> fileMemeLst = fileJsonResourceProblem
					.readFromFile(new File("src/main/resources/content/list.json"));
			log.info("fileMemeLst size :" + fileMemeLst.size());
		} catch (YoureDoingItWrongException e) {
			log.error(e.getMessage());
		}

		// Use case 4: LoopProblem
		LoopProblem loopProblem = new LoopProblem();
		loopProblem.displayMemes(memeLst);
	}

}
