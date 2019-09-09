#!/usr/bin/env bash

# vor der Ausführung unter Lubuntu muss die Zeile
#   assistive_technologies=org.GNOME.Accessibility.AtkWrapper
# in der Datei /etc/java-8-openjdk/accessibility.properties
# auskommentiert werden (sudo)

./gradlew clean run
