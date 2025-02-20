# Copyright (C) 2020 Oliver Stäbler <oliver.staebler@bytesatwork.ch>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "bytes at work AG minimal root file system"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

IMAGE_INSTALL += "\
	packagegroup-core-boot \
	\
	apt \
	coreutils \
	dhcpcd \
	ethtool \
	kernel-modules \
	openssh-scp \
	openssh-sftp-server \
	openssh-ssh \
	openssh-sshd \
	vim \
	libgpiod-tools \
"



IMAGE_LINGUAS = " "
IMAGE_FEATURES += "splash package-management x11-base"

# Make the rootfs big enough (5.5 GB), so we're able to install additional packages
IMAGE_ROOTFS_SIZE = "5767168"

inherit core-image
require password.inc


#DISTRO_FEATURES:append = " x11"
#IMAGE_INSTALL:append = " python3-tkinter tcl-dev"
#PACKAGECONFIG:append:pn-python3 = " tk"
