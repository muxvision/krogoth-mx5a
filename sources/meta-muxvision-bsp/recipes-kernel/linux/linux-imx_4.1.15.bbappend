
SRC_URI = "git://git@github.com:muxvision/linux-mx5a-4.1.15.git;branch=${SRCBRANCH};protocol=ssh \
"
SRCREV="${AUTOREV}"
SRCBRANCH="master"

SCMVERSION = ""
LOCALVERSION = "-generic"

PE = "1"
PR = "r3"

KBUILD_DEFCONFIG ?= "imx_mux_debug_defconfig"
 
do_copy_defconfig() {
    if [ -n "${KBUILD_DEFCONFIG}"  ]; then
        if [ -f "${S}/arch/${ARCH}/configs/${KBUILD_DEFCONFIG}"  ]; then
            cp -f ${S}/arch/${ARCH}/configs/${KBUILD_DEFCONFIG} ${WORKDIR}/defconfig
        fi
    fi
}

