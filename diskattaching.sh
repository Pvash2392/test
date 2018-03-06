#!/bin/sh
hdd="/dev/sdc"
for i in $hdd;do
echo "n
p
1
w
"|fdisk $i;mkfs.ext4 $i;done
mkdir /data
mount /dev/sdc /data/ 
echo '/dev/sdc /data ext4 defaults 0 1' | tee -a /etc/fstab
