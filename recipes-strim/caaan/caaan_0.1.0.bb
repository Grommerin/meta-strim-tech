DESCRIPTION = "This program worked with CAN on Marsboard"
SECTION = "Interfaces"
HOMEPAGE = "https://github.com/Grommerin/"
SRC_DISTRIBUTE_LICENSES += "Strim"
LICENSE = "Strim"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"
PR = "r0"

SRC_URI = "file://${P}.tar.gz;name=caaan \
file://LICENSE"

SRC_URI[caaan.md5sum] = "23b1777e980d74a7c173df6f541c74e6"

S = "${WORKDIR}"

inherit cmake pkgconfig

do_install() {
	     install -d ${D}${bindir} ${D}${sysconfdir}
	     install -m 755 caaan ${D}${bindir}
}
