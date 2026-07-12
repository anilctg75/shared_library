def call(String projectDir = '.') {
    sh """
    set -e

    echo "Preparing environment for ${projectDir}"

  
    sudo dnf install -y cmake git gcc gcc-c++ make clang clang-tools-extra

    export PATH=/opt/arm-gnu-toolchain-14.2.rel1-x86_64-arm-none-eabi/bin:\$PATH

    cmake --version
    arm-none-eabi-gcc --version
    """
}
