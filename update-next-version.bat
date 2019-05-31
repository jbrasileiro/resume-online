@ECHO ON
SETLOCAL

::SET VARIABLE
SET VERSION=J7.0.0.2
SET NEXT_VERSION=J7.0.0.3-SNAPSHOT

::STARTING
echo executing in current dir "%~dp0"
CD "%~dp0"

::update version fro all current related project
mvn release:clean release:prepare -Dresume=false -DreleaseVersion=%VERSION% -DdevelopmentVersion=%NEXT_VERSION%
mvn versions:set -DnewVersion=%VERSION% -DprocessAllModules
mvn clean install
mvn versions:commit -DprocessAllModules
git commit
mvn release:perform
GOTO:EOF

## LABEL
:ROLLBACK
mvn release:rollback
mvn versions:revert

:FINISH
ENDLOCAL