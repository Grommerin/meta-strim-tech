DESCRIPTION = "This program worked with CAN on Marsboard"
SECTION = "Interfaces"
LICENSE = "Strim"
HOMEPAGE = "https://github.com/Grommerin/"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"
PN ?= "cancan"
PV = "0.1.0"

DEPENDS ?= "libsocketcan"

SRC_URI = "file://${P}.tar.gz \
file://LICENSE"

S = "${WORKDIR}"

inherit autotools pkgconfig

#md5sum=36fcd30be16f2ab4bef9bc455d14d991
