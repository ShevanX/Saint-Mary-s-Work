#!/bin/bash
# my_tests.sh for CompareAlgorithms

clear
echo "---------------------------------------------"
echo "Test 1: no command-line input (Opening screen)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 2: small input (n=5)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 5
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 3: medium input (n=100)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 100
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 4: large input (n=1000)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 1000
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 5: edge input (n=1)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 1
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 6: invalid input (negative number)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar -10
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 7: invalid input (non-integer)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar abc
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 8: large input (n=10000) to test performance"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 10000
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 9: large input (n=50000) to stress Algorithm B"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 50000
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 10: very large input (n=100000) to test Algorithm C speed"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar CompareAlgorithms.jar 100000
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "All tests completed."
