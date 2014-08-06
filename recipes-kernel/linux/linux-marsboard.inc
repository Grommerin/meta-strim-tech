# Adapted from linux-imx.inc, copyright (C) 2012 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linux kernel for MarS Board by Embest-Tech"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

require recipes-kernel/linux/linux-imx.inc

INC_PR = "r1"

# Put a local version until we have a true SRCREV to point to
LOCALVERSION ?= "+marsboard"
SCMVERSION ?= "y"

# SRC_URI for wandboard kernel
SRC_URI = "git://github.com/Grommerin/kernel_imx.git \
           file://defconfig;name=dconf \
"
SRC_URI[dconf.md5sum] = "dfd031f581605025a50c62642cc4102d"

do_install_append() {
   # I keep getting do_package_qa errors when leaving these files in this directory
   (cd ${D}/usr/src/kernel/drivers/input/touchscreen/generic_ts_rel/lib && rm *.x)
}
