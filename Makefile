
SAMPLE_FILE = Slt_16bit.jls
TEST_FILE = SampleSlt16BitTest
PROJECT_DIR = ./project2/
# Compile DLUnit test
# javac -cp DLUnit.jar ComparatorTwoBitTestWeak.java

# Run DLUnit
# java -jar DLUnit.jar comparatorTwoBit.jls ComparatorTwoBitTestWeak.class

# Don't change the name of the executable.  The automated tests depend on it.
window:
	java -jar JLS.jar

compile:
	javac -cp DLUnit.jar $(PROJECT_DIR)$(TEST_FILE).java
run:
	java -jar DLUnit.jar $(PROJECT_DIR)$(SAMPLE_FILE) $(PROJECT_DIR)$(TEST_FILE).class

# The if below is so no errors occur if the files don't exist
clean:
	if [ -f $(PROJECT_DIR)*.class ]; then rm $(PROJECT_DIR)*.class; fi
