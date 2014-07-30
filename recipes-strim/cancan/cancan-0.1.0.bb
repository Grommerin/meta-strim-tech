DESCRIPTION = "This program worked with CAN on Marsboard"
SECTION = "Interfaces"
LICENSE = "Strim"
HOMEPAGE = "https://github.com/Grommerin/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"

DEPENDS ?= "libsocketcan"

SRC_URI = "file://${P}.tar.gz;md5sum=36fcd30be16f2ab4bef9bc455d14d991 \
	   file://LICENSE
	   "
S = "${WORKDIR}"

interinit autotools pkgconfig
