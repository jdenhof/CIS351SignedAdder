
SAMPLE_FILE = ALU_16bit_start.jls
TEST_FILE = ALUSampleTests
PROJECT_NUM = 3
PROJECT_DIR = ./project$(PROJECT_NUM)/
# Compile DLUnit test
# javac -cp DLUnit.jar ComparatorTwoBitTestWeak.java

# Run DLUnit
# java -jar DLUnit.jar comparatorTwoBit.jls ComparatorTwoBitTestWeak.class

# Don't change the name of the executable.  The automated tests depend on it.
window:
	java -jar JLS.jar
	
run:
	make clean
	javac -cp DLUnit.jar $(PROJECT_DIR)$(TEST_FILE).java	
	java -jar DLUnit.jar $(PROJECT_DIR)$(SAMPLE_FILE) $(PROJECT_DIR)$(TEST_FILE).class

# The if below is so no errors occur if the files don't exist
clean:
	if [ -f $(PROJECT_DIR)*.class ]; then rm $(PROJECT_DIR)*.class; fi
