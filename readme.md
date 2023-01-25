# Compile Program
java -jar JLS.jar
# Compile DLUnit test
javac -cp DLUnit.jar ComparatorTwoBitTestWeak.java
# Run DLUnit
java -jar DLUnit.jar comparatorTwoBit.jls ComparatorTwoBitTestWeak.class
