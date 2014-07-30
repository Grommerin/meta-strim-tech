DESCRIPTION = "This program worked with CAN on Marsboard"
SECTION = "Interfaces"
HOMEPAGE = "https://github.com/Grommerin/"
SRC_DISTRIBUTE_LICENSES += "Strim"
LICENSE = "Strim"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"
PR = "r0"

SRC_URI = "file://${P}.tar.gz;name=cancan \
file://LICENSE"

SRC_URI[cancan.md5sum] = "addc1e91b0da89959df973c6c98f323e"

S = "${WORKDIR}"

inherit autotools pkgconfig

