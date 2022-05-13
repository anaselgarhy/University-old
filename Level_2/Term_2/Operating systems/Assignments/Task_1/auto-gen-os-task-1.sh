echo "Do you love anas elgarhy? (y/n)"
read love

if [[ $love == "y" ]]
then
  # get the distro name
  distro=$(lsb_release -si)

  req_pkgs="zip scrot cowsay"
  # Install the required packages
  if [[ $distro == "Ubuntu" || $distro == "Debian" ]]
  then
    apt-get install -y $req_pkgs
  elif [[ $distro == "Arch" || $distro == "Manjaro" ]]
  then
    pacman -S $req_pkgs
  elif [[ $distro == "Fedora" ]]
  then
   dnf install -y $req_pkgs
  elif [[ $distro == "CentOS" || $distro == "RedHat" ]]
  then
     yum install -y $req_pkgs
  fi
  clear
  # Get PS1
  echo "Enter your name: "
  read name
  PS1="$name@"
  clear

  # Create the directory
  echo "$PS1 cd ~/Desktop/"
  echo "$PS1 mkdir -p EELU"
  mkdir -p ~/Desktop/EELU
  echo "$PS1 ls -l"
  ls -l ~/Desktop --color=auto
  echo "$PS1 cd EELU"
  echo "$PS1 touch EELU.sh"
  touch ~/Desktop/EELU/EELU.sh
  echo "$PS1 ls"
  ls --color=auto

  # Screenshot
  sleep 1
  mkdir -p ~/Desktop/EELU/screenshots
  scrot ~/Desktop/EELU/screenshots/1.png

  # Create the script
  # Get the bash path
  bash_path=$(which bash)
  # echo
  echo "#!$bash_path" > ~/Desktop/EELU/EELU.sh
  echo "echo \"Enter the num 1: \" " >> ~/Desktop/EELU/EELU.sh
  echo "read num1" >> ~/Desktop/EELU/EELU.sh
  echo "echo \"Enter the num 2: \" " >> ~/Desktop/EELU/EELU.sh
  echo "read num2" >> ~/Desktop/EELU/EELU.sh
  echo "if [[ \$((num1 % 2)) == 1 ]]" >> ~/Desktop/EELU/EELU.sh
  echo "then" >> ~/Desktop/EELU/EELU.sh
  echo "  echo \"\$num1 is odd\"" >> ~/Desktop/EELU/EELU.sh
  echo "else" >> ~/Desktop/EELU/EELU.sh
  echo "  echo \"\$num1 is even\"" >> ~/Desktop/EELU/EELU.sh
  echo "fi" >> ~/Desktop/EELU/EELU.sh
  echo "if [[ \$((num2 % 2)) == 1 ]]" >> ~/Desktop/EELU/EELU.sh
  echo "then" >> ~/Desktop/EELU/EELU.sh
  echo "  echo \"\$num2 is odd\"" >> ~/Desktop/EELU/EELU.sh
  echo "else" >> ~/Desktop/EELU/EELU.sh
  echo "  echo \"\$num2 is even\"" >> ~/Desktop/EELU/EELU.sh
  echo "fi" >> ~/Desktop/EELU/EELU.sh

  # Screenshot 2
  clear
  echo "$PS1"
  echo "$PS1 gedit EELU.sh"
  echo "$PS1"
  echo "$PS1 cat EELU.sh"
  cat ~/Desktop/EELU/EELU.sh
  echo "$PS1"
  sleep 1
  scrot ~/Desktop/EELU/screenshots/2.png

  # Make the script executable
  echo "$PS1"
  chmod +x ~/Desktop/EELU/EELU.sh
  echo "$PS1 chmod +x EELU.sh"
  echo "$PS1 ls"
  ls ~/Desktop/EELU/ --color=auto
  echo "$PS1"
  sleep 2
  scrot ~/Desktop/EELU/screenshots/3.png

  clear 

  echo "Script created"
  echo "And screenshots taken n_n"
  echo "Now run the script"
  echo "Please enter the numbers and press enter to see the result"
  echo "Press enter to continue"
  read
  clear
  echo "$PS1 ./EELU.sh"
  ~/Desktop/EELU/EELU.sh
  sleep 2
  scrot ~/Desktop/EELU/screenshots/4.png
  echo "Now we take a screenshot to the script"
  echo "screenshots in the folder ~/Desktop/EELU/screenshots"
  echo "Please make the word file and put into ~/Desktop/EELU folder, then press enter to continue"
  read

  echo "Now we will zip file"
  sleep 1
  echo "But after one question :D"
  sleep 1
  echo "Do you still love me (y/n)?"
  read love
  if [[ $love == "y" ]]
  then
    echo "I love you too 3>"
  else
    echo "I love you too :("
    echo "shutdown now" >> ~/Desktop/EELU/EELU.sh # n_~
  fi

  echo "Creating zip file..."
  # Create the zip file
  cd ~/Desktop
  zip -r ~/Desktop/EELU.zip EELU/

  clear
  echo "Done :)"
  echo "Now you can find the zip file in ~/Desktop/EELU.zip"
  sleep 3
  clear
  echo "I love you, but I need to have a little fun"
  sleep 2
  cowsay "My name is $name"
  cowsay -f tux "I not love you"
  sleep 1
  cowsay -f blowfish "bbbbbbbbbbb im a fish"
  sleep 1
  cowsay -f ren "I will restart your computer now"
  sleep 1

  shutdown -r now
else 
  echo "I would have thrown myself into the nearest conduit if you loved me at all"
  sleep 3
  echo "Are you sure you don't love me?"
  read love
  if [[ $love == "y" ]]
  then
    echo "Good luck :D"
  else
    echo "OK, bye"
    sleep 2
    shutdown now
  fi
fi 
