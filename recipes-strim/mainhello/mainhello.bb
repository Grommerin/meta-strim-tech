DESCRIPTION = "This program worked with CAN on Marsboard"
SECTION = "Interfaces"
HOMEPAGE = "https://github.com/Grommerin/"
SRC_DISTRIBUTE_LICENSES += "Strim"
LICENSE = "Strim"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"

PR = "r0"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/Grommerin/Can.git \
file://LICENSE"

SRC_URI[md5sum] = "47e67dc1710b146e49b48d666bbde257"
SRC_URI[sha256sum] = "c5cc9dfb59540394379dafa4db448dd28be1a67e4b60410e08d93a01a7978389"

S = "${WORKDIR}"
GIT = "${WORKDIR}/git"

do_install() {
		install -d ${D}${bindir} ${D}${sysconfdir}
		install -m 755 ${GIT}/mainhello ${D}${bindir}
}

