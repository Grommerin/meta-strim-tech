DESCRIPTION = "Creat and set PPPoE connect to GSM modem"
SECTION = "Network"
LICENSE = "Strim"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"

SRC_URI = "file://options \
file://velcom-connect \
file://velcom-disconnect \
file://LICENSE"
#DEPENDS_prepend = " добавить initscripts как-нибудь если что"

S = "${WORKDIR}"

do_install() {
		mkdir -p ${D}${sysconfdir}/ppp/
		install -m 0755 ${WORKDIR}/options ${D}${sysconfdir}/ppp/options
		install -m 0755 ${WORKDIR}/velcom-connect ${D}${sysconfdir}/ppp/velcom-connect
		install -m 0755 ${WORKDIR}/velcom-disconnect ${D}${sysconfdir}/ppp/velcom-disconnect
}
