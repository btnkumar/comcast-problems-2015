package com.comcast.csv.interview.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comcast.csv.meme.Meme;

/**
 * Implement the specified interface.
 */
public class CollectionsProblemImpl implements CollectionsProblem {
	public static final Logger log = LoggerFactory.getLogger(CollectionsProblemImpl.class);

	public void sort(Collection<Meme> memes, boolean ascending) {
		List<Meme> memesLst = new ArrayList<Meme>(memes);
		Collections.sort(memesLst, new Comparator<Meme>() {
			public int compare(Meme o1, Meme o2) {
				return o1.getYear() - o2.getYear();
			}
		});

		if (!ascending) {
			Collections.reverse(memesLst);
		} else {
		}
		String ascDescStr = ascending ? "sorting asc : " : "sorting desc : ";
		log.info(ascDescStr + memesLst.toString());
	}

	public void addTag(Collection<Meme> memes, String tag) {
		for (Meme meme : memes) {
			String[] tags = meme.getTags();
			if (tags.length > 0) { // contains at least one tag
				// array to list
				List<String> updatableList = new ArrayList<String>();
				updatableList.addAll(Arrays.asList(tags));
				updatableList.add(tag);
				// list to string array
				log.info("tags size befoe : " + tags.length);
				meme.setTags(updatableList.toArray(new String[updatableList.size()]));
				log.info("tags size befoe : " + meme.getTags().length);
				log.info(meme.toString());
			}
		}
	}
}
