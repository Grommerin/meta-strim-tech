DESCRIPTION = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "packagegroup-core-boot \
		 packagegroup-core-ssh-openssh \
		 ${ROOTFS_PKGMANAGE_BOOTSTRAP} \
		 ${CORE_IMAGE_EXTRA_INSTALL} \
		 canutils mc"

IMAGE_LINGUAS = " "

LICENSE = "Strim-Tech"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a9a0c0aad1031f547ff57d2388966727"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_FSTYPES = "ext3 sdcard tar.gz"

ROOTFS_POSTPROCESS_COMMAND += "remove_packaging_data_files ; "

PREFERRED_VERSION_gcc = "4.7.2"
PREFERRED_VERSION_gcc-cross = "4.7.2"
