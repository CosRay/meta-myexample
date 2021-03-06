#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple modified helloworld application"
SECTION = "myexamples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file:///poky/meta/files/common-licenses/LICENSE;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
#FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRCREV = "$AUTOREV"
SRC_URI = "https://github.com/CosRay/mybbexample.git"

SRC_URI[md5sum] = "8468e4679005542f5d5c02e0989119fa"
SRC_URI[sha256sum] = "22c700c8d880764f42f1fee56f3d7495abca15dcdfb3c6ea66fbd956381d864c"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

