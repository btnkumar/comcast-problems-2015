package com.comcast.csv.interview.problems;


import com.comcast.csv.meme.Meme;

import java.util.Collection;


public interface CollectionsProblem {

    /**
     * Sorts a Collection of Memes by year
     * @param memes The Collection to sort
     * @param ascending true if the collection should be sorting in ascending order, otherwise false.
     */
    public void sort(Collection<Meme> memes, boolean ascending);

    /**
     * Adds a tag to all meme's that contain another tag
     * @param memes The collection of memes to mutate
     * @param tag The tag that is to be added
     */
    public void addTag(Collection<Meme> memes, String tag);

}
