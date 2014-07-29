# adapted from linux-imx.inc, copyright (C) 2012 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-marsboard.inc

# MarS Board branch
SRCREV = "${AUTOREV}"
LOCALVERSION = "-marsboard+yocto"

COMPATIBLE_MACHINE = "(marsboard)"
