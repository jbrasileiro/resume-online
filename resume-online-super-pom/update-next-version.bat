@ECHO ON
SETLOCAL

::SET VARIABLE
SET VERSION=J7.0.0.4
SET NEXT_VERSION=J7.0.0.5-SNAPSHOT

::STARTING
echo executing in current dir "%~dp0"
CD "%~dp0"

::update version fro all current related project
::mvn release:clean release:prepare -Dresume=false -DreleaseVersion=%VERSION% -DdevelopmentVersion=%NEXT_VERSION%
::mvn --batch-mode release:update-versions -DreleaseVersion=%VERSION% -DdevelopmentVersion=%NEXT_VERSION% -DautoVersionSubmodules=true
::mvn versions:set -DnewVersion=%VERSION% -DprocessAllModules
::mvn clean install
::mvn versions:commit -DprocessAllModules
::git commit
::mvn release:perform
::GOTO:EOF

::update version fro all current related project
mvn versions:set -DnewVersion=%VERSION% 
mvn -N versions:update-child-modules
mvn versions:commit -DprocessAllModules
GOTO:EOF

:ROLLBACK
mvn release:rollback
mvn versions:revert

:FINISH
ENDLOCAL