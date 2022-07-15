#! /bin/sh -eux

mvn --quiet clean
mvn --quiet package
java -jar "target/${1}.jar" "${@:2}"
