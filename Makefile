
SAMPLE_FILE = Signed16BitAdder.jls
TEST_FILE = SampleSigned16BitAdderTest

# Compile DLUnit test
# javac -cp DLUnit.jar ComparatorTwoBitTestWeak.java

# Run DLUnit
# java -jar DLUnit.jar comparatorTwoBit.jls ComparatorTwoBitTestWeak.class

# Don't change the name of the executable.  The automated tests depend on it.
window:
	java -jar JLS.jar

compile:
	javac -cp DLUnit.jar $(TEST_FILE).java
run:
	java -jar DLUnit.jar $(SAMPLE_FILE) $(TEST_FILE).class

# The if below is so no errors occur if the files don't exist
clean:
	if [ -f *.class ]; then rm SampleSigned16BitAdderTest.class; fi
