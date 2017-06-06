#!/bin/sh
echo "Install prerequisites"
if which pacman > /dev/null 2>&1; then
  echo "as Arch Linux with $USER user"
  sudo pacman -S ansible cower
fi
