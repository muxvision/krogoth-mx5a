CRIPTION = "Muxvision Image - Adds Qt5"
LICENSE = "MIT"


require recipes-fsl/images/fsl-image-qt5.bb

BBFILES += "${BSPDIR}/sources/meta-openembedded/meta-webserver/"

PACKAGECONFIG_remove_mx6 = " \
	opencv \
"
IMAGE_INSTALL_remove += " \
        packagegroup-fsl-tools-gpu-external \
        packagegroup-fsl-tools-testapps \
        packagegroup-fsl-tools-benchmark \
"

PYTHON_IMAGE_INSTALL = ""
PYTHON_IMAGE_INSTALL_mx6 = "\
    python-compile \
    python-compiler \
    python-compression \
    python-core \
    python-curses \
    python-datetime \
    python-difflib \
    python-distutils \
    python-git \
    python-json \
    python-logging \
    python-misc \
    python-mmap \
    python-multiprocessing \
    python-netclient \
    python-netserver \
    python-pickle \
    python-pkgutil \
    python-pprint \
    python-re \
    python-rpm \
    python-shell \
    python-sqlite3 \
    python-subprocess \
    python-textutils \
    python-unittest \
    python-unixadmin \
    python-xmlrpc \
    python-distribute \
    python-pip \
    python-dbus \
    python-paho-mqtt \
    "
MXAPP_DEPEND_INSTALL = "\
    udev \
    udev-extraconf \
    f2fs-tools \
    fsl-rc-local \
    libpcap \
    hostapd \
    ppp \
    iptables \
    tcpdump \
    iftop \
    lrzsz \
    nginx \
    zip \
    ffmpeg \
    unzip \
    curl \
    vsftpd \
"

IMAGE_INSTALL += " \
    qtmultimedia \
    qtwebkit \
    qtwebchannel \
    qtquickcontrols2 \
    qtquickcontrols \
    qtlocation \
    ${PYTHON_IMAGE_INSTALL} \
    ${MXAPP_DEPEND_INSTALL} \
"
