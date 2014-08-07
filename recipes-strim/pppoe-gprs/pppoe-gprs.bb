DESCRIPTION = "Creat and set PPPoE connect to GSM modem"
SECTION = "Network"
LICENSE = "Strim"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"

SRC_URI = "file://options-mobile \
file://velcom \
file://velcom.chat \
file://wait-dialup-hardware \
file://pap-secrets \
file://LICENSE"
#DEPENDS_prepend = " добавить initscripts как-нибудь если что"

S = "${WORKDIR}"

do_install() {
		mkdir -p ${D}${sysconfdir}/ppp/chatscripts/
		mkdir -p ${D}${sysconfdir}/ppp/peers/
	     	install -m 0755 ${WORKDIR}/options-mobile ${D}${sysconfdir}/ppp/options-mobile
		install -m 0755 ${WORKDIR}/wait-dialup-hardware ${D}${sysconfdir}/ppp/wait-dialup-hardware
		install -m 0755 ${WORKDIR}/velcom ${D}${sysconfdir}/ppp/peers/velcom
		install -m 0755 ${WORKDIR}/velcom.chat ${D}${sysconfdir}/ppp/chatscripts/velcom.chat
		install -m 0755 ${WORKDIR}/pap-secrets ${D}${sysconfdir}/ppp/pap-secrets
}
