mkdir -p build/classes build/libs
javac -d build/classes -cp libs/Pokemon.jar src/com/volin/lab/{*,**/*}.java
jar -cvfm build/libs/main.jar src/META-INF/MANIFEST.mf -C build/classes .
cp libs/Pokemon.jar build/libs/Pokemon.jar
