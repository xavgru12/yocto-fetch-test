DESCRIPTION = "Minimal git fetch example"
LICENSE = "MIT"

SRC_URI = "git://github.com/example/example.git;branch=main;protocol=https"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_compile() {
    echo "Compiling fetched source"
}

do_install() {
    install -d ${D}${bindir}
    echo "hello" > ${D}${bindir}/hello.txt
}
