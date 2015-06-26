Comcast Silicon Valley Take Home Question
=========

Below are the notes and instructions to help you do well on the take-home interview question.
Please do not hesitate to ask if you need more details. We look forward to seeing your
solution and good luck!

### Timing Constraints
This problem is made up of many small but sometimes related questions. You will have 3 hours
after taking delivery of the project to submit your solution. Note that not all people will
be capable of finishing all problems within the time limit and we don't expect that in order
to declare success.

### Use of the Internet
Feel free to use the Internet as you wish during this take-home problem to gather information.
That is the reality of how we all actually work, so why pretend otherwise? Just remember
that you are under time constraints and act accordingly. 

### This will be a Maven Project
The interview problem will be distributed to you as a full maven project which
you will add to and modify to achieve the goals. You should absolutely make sure
that you have a recent version of Java and maven installed on your computer prior
taking delivery of the problem. Maven is available from [here](http://maven.apache.org/download.html).
To make sure that maven is working as expected, execute the given command in your
shell and verify that the output appears valid.

```
somedude@laptop: ~$ mvn --version
Apache Maven 3.2.3 (33f8c3e1027c3ddde99d3cdebad2656a31e8fdf4; 2014-08-11T13:58:10-07:00)
Maven home: /usr/local/Cellar/maven/3.2.3/libexec
Java version: 1.8.0_20, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_20.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.9.5", arch: "x86_64", family: "mac"
```

You will also probably want to use some sort of IDE. If you do not yet have a favorite,
[Eclipse](https://www.eclipse.org/) with the m2e plugin works very well and is free.

### Other JVM Languages are Acceptable
You *may* submit your solution using other JVM based languages like Scala and Groovy but
if you do so, you MUST include the appropriate dependencies and build-time changes to
your maven `pom.xml`. If you plan on submitting in one of these languages, it is suggested
that you figure out how to make this work *before* taking delivery of the problem itself.

### Submitting your Solution
When you are done (or time is up), you will submit the sources by executing the following command
in the base directory of the project:

```
mvn clean package
``` 

This will produce a sources file at `target/solution-submission.zip`. Take this file and email it
to [Janet Lobendze](mailto:janet_lobendze@cable.comcast.com).
