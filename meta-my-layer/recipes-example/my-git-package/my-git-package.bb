DESCRIPTION = "Minimal git fetch example"
LICENSE = "MIT"

SRC_URI = "git://github.com/swiftlang/swift.git;branch=main;protocol=https"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

BB_ENV_PASSTHROUGH_ADDITIONS += "http_proxy https_proxy HTTP_PROXY HTTPS_PROXY"

do_swift_checkout() {
    cd ${S}

    # extra fetch/update
    git fetch
}

addtask swift_checkout after do_unpack before do_patch

do_compile() {
    echo "Compiling fetched source"
}

do_install() {
    install -d ${D}${bindir}
    echo "hello" > ${D}${bindir}/hello.txt
}
