#my_tests_partial.sh
clear
echo Test 1: no command-line input
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo Test 2: encoding P with key f
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e P f
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 3: decoding U with key f
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar d U f
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 4: testing for bad first input error
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar x U f
read -p "(Pause from testing script) Press Enter to continue ... "

#Here you must add more tests ... however many you like,
#but at least three more encoding/decoding test pairs,
#as well as more tests for possible command-line input errors.

echo
echo Test 5: encoding H with key l
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e H l
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 6: decoding H with key l
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar d H l
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 7: encoding F with key v
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e F v
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 8: decoding F with key v
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar d F v
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 9: encoding S with key o
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e S o
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 10: decoding S with key o
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar d S o
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 11: encoding I with key x
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e I x
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 12: decoding I with key x
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar d I x
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 13: testing for bad second input error
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e u f
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo Test 14: testing for bad third input error
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec1.jar e H J
read -p "(Pause from testing script) Press Enter to continue ... "


clear
echo "Test file VigEncDec1.java for TABs and long lines ... "
read -p "(Pause from testing script) Press Enter to continue ... "
/home/course_ps/u00/public/utilities/find_tabs VigEncDec1.java
/home/course_ps/u00/public/utilities/find_long_lines VigEncDec1.java
read -p "(Pause from testing script) Press Enter to continue ... "

