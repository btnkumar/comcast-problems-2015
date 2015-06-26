package com.comcast.csv.interview.problems;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.comcast.csv.meme.Meme;
import com.comcast.csv.meme.YoureDoingItWrongException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Read a list of {@link Meme}s from a JSON source file that might be on the
 * classpath or file system.
 */
public class FileJsonResourceProblem {
	public static final Logger log = LoggerFactory.getLogger(FileJsonResourceProblem.class);

	/**
	 * Read a list of memes from a JSON file stored on the filesystem
	 * 
	 * @param file
	 *            the file to read
	 * @return the list of memes read
	 */
	public List<Meme> readFromFile(File file) throws YoureDoingItWrongException {
		ObjectMapper mapper = new ObjectMapper();
		List<Meme> myObjects;
		try {
			myObjects = mapper.readValue(file, new TypeReference<List<Meme>>() {
			});
		} catch (JsonParseException e) {
			throw new YoureDoingItWrongException("JsonParseException");
		} catch (JsonMappingException e) {
			throw new YoureDoingItWrongException("JsonMappingException");
		} catch (IOException e) {
			throw new YoureDoingItWrongException("IOException");
		}
		log.info("readFromFile :" + myObjects);

		return myObjects;

	}

	/**
	 * Read a list of memes from a JSON file stored on the classpath
	 * 
	 * @param path
	 *            the path to the resource
	 * @return the list of memes read
	 */
	public List<Meme> readFromClasspath(String path) throws YoureDoingItWrongException {

		ObjectMapper mapper = new ObjectMapper();
		InputStream is = FileJsonResourceProblem.class.getResourceAsStream(path);
		List<Meme> myObjects;
		try {
			myObjects = mapper.readValue(is,
					TypeFactory.defaultInstance().constructCollectionType(List.class, Meme.class));
		} catch (JsonParseException e) {
			throw new YoureDoingItWrongException("JsonParseException");
		} catch (JsonMappingException e) {
			throw new YoureDoingItWrongException("JsonMappingException");
		} catch (IOException e) {
			throw new YoureDoingItWrongException("IOException");
		}
		log.info("readFromClasspath : " + myObjects);
		return myObjects;

	}

}
