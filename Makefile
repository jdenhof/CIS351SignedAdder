
SAMPLE_FILE = /
TEST_FILE = /SampleSigned16BitAdderTest.java

# Compile DLUnit test
# javac -cp DLUnit.jar ComparatorTwoBitTestWeak.java

# Run DLUnit
# java -jar DLUnit.jar comparatorTwoBit.jls ComparatorTwoBitTestWeak.class

# Don't change the name of the executable.  The automated tests depend on it.
window:
	java -jar JLS.jar

compile test:
	javac -cp DLUnit.jar SampleSigned16BitAdderTest.java
run:
	make compile test
	java -jar DLUnit.jar Signed16BitAdder.jls SampleSigned16BitAdderTest.class

# The if below is so no errors occur if the files don't exist
clean:
	rm SampleSigned16BitAdderTest.class
