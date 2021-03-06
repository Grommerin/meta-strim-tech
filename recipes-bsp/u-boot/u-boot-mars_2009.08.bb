# Copyright (C) 2011 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Bootloader for MarS-Board from embest-tech"
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b"

DEPENDS_mxs += "elftosb-native"

PR = "r0"
SRCREV = "fd0898ed076415a2378b8ba85da8c11a0bc07126"

SRC_URI = "git://github.com/Grommerin/uboot-imx.git"

UBOOT_MACHINE_marsboard = "mx6q_marsboard_config"

UBOOT_MAKE_TARGET = "u-boot.bin"

# Please, add the following variables to conf/local.conf
# in order to use this u-boot version
# UBOOT_SUFFIX = "bin"
# UBOOT_PADDING = "2"
# PREFERRED_PROVIDER_u-boot = "u-boot-mars"

S = "${WORKDIR}/git"
EXTRA_OEMAKE += 'HOSTSTRIP=true'

PACKAGE_ARCH = "${MACHINE_ARCH}"

do_compile_prepend() {
	if [ "${@base_contains('DISTRO_FEATURES', 'ld-is-gold', 'ld-is-gold', '', d)}" = "ld-is-gold" ] ; then
		sed -i 's/$(CROSS_COMPILE)ld/$(CROSS_COMPILE)ld.bfd/g' config.mk
	fi
}

COMPATIBLE_MACHINE = "(marsboard)"
