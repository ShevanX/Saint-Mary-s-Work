#my_tests.sh
clear
echo "---------------------------------------------"
echo "Test 1: no command-line input"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 2: missing arguments error"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "HELLO"
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 3: invalid mode error"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar x "HELLO" key
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 4: invalid message character (lowercase in message)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "HeLLO" romeo
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 5: invalid key character (uppercase in key)"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "HELLO" RoMeO
read -p "(Pause from testing script) Press Enter to continue ... "

# ----------------------------------------------------------
# Valid encoding / decoding tests
# ----------------------------------------------------------

clear
echo "---------------------------------------------"
echo "Test 6: encoding MEET ME IN THE PARK with key romeo"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "MEET ME IN THE PARK" romeo
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo "Test 7: decoding DSQX DS MB HTI GODO with key romeo"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar d "DSQX DS MB HTI GODO" romeo
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 8: encoding COME ON THE TITANIC with key iceberg"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "COME ON THE TITANIC" iceberg
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo "Test 9: decoding KQQF FT VLF KOBCRJG with key iceberg"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar d "KQQF FT VLF KOBCRJG" iceberg
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 10: encoding THIS IS A SECRET with key lemon"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "THIS IS A SECRET" lemon
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo "Test 11: decoding ELUG TW O DIOFRE with key lemon"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar d "ELUG TW O DIOFRE" lemon
read -p "(Pause from testing script) Press Enter to continue ... "

clear
echo "---------------------------------------------"
echo "Test 12: encoding COMPUTER SCIENCE ROCKS with key java"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar e "COMPUTER SCIENCE ROCKS" java
read -p "(Pause from testing script) Press Enter to continue ... "

echo
echo "Test 13: decoding LOHPDTZR SXINNXE RJCTS with key java"
read -p "(Pause from testing script) Press Enter to continue ... "
java -jar VigEncDec2.jar d "LOHPDTZR SXINNXE RJCTS" java
read -p "(Pause from testing script) Press Enter to continue ... "

clear

