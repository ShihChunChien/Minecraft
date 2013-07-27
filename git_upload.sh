#!/bin/bash
#git update-index --assume-unchanged <path>
`./git_add_files.sh`
git status
echo -n "upload above all configs to Github? <y or n> :"
read confirm
#
function yesOrExit() {
case $1 in
  y|Y|YES|yes|Yes) ;;
  n|N|no|NO|No) echo "exit"
  exit ;;
  *) echo "exit"
  exit ;;
esac
}
yesOrExit $confirm

echo -n "write commit memo: "
read memo
git commit -m "$memo"

git push -u origin master
