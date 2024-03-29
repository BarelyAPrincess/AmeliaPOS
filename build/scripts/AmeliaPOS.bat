@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  AmeliaPOS startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and AMELIA_POS_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\AmeliaPOS-1.0.0-git+H7466245.jar;%APP_HOME%\lib\pos.v4.0001_02.jar;%APP_HOME%\lib\epsonupos.jar;%APP_HOME%\lib\epsonupos.T82II.jar;%APP_HOME%\lib\epsonupos.T81.jar;%APP_HOME%\lib\epsonupos.core.v1.14.0001.jar;%APP_HOME%\lib\epsonupos.H2000.jar;%APP_HOME%\lib\epsonupos.trace.jar;%APP_HOME%\lib\xml-apis.jar;%APP_HOME%\lib\epsonupos.T70II.jar;%APP_HOME%\lib\pos.jar;%APP_HOME%\lib\pos.v4.0001_01.jar;%APP_HOME%\lib\uposcommon.core.v1.14.0001.jar;%APP_HOME%\lib\epsonupos.admin.jar;%APP_HOME%\lib\epsonupos.T20II.jar;%APP_HOME%\lib\xercesImpl.jar;%APP_HOME%\lib\epsonupos.L90.jar;%APP_HOME%\lib\epsonupos.previous.jar;%APP_HOME%\lib\epsonupos.P80.jar;%APP_HOME%\lib\epsonupos.core.v1.14.0001m.jar;%APP_HOME%\lib\epsonupos.T20.jar;%APP_HOME%\lib\epsonupos.core.v1.14.0001T1.jar;%APP_HOME%\lib\epsonupos.Mobile1.jar;%APP_HOME%\lib\epsonupos.T88VI.jar;%APP_HOME%\lib\uposcommon.core.v1.14.0001m.jar;%APP_HOME%\lib\epsonupos.T88V.jar;%APP_HOME%\lib\epsonupos.L90LinerFree.jar;%APP_HOME%\lib\pos.v4.0001.jar;%APP_HOME%\lib\epsonupos.d30.jar;%APP_HOME%\lib\epsonupos.m30.jar;%APP_HOME%\lib\uposcommon.jar;%APP_HOME%\lib\epsonupos.T82.jar;%APP_HOME%\lib\epsonupos.H6000IV.jar;%APP_HOME%\lib\epsonupos.T81II.jar;%APP_HOME%\lib\epsonupos.P60II.jar;%APP_HOME%\lib\epsonupos.P20.jar;%APP_HOME%\lib\AmeliaAppLib-2018.0.jar;%APP_HOME%\lib\AmeliaNetworkingLib-2018.0.jar;%APP_HOME%\lib\AmeliaLogLib-2018.0.jar;%APP_HOME%\lib\AmeliaCommonLib-2018.0.jar;%APP_HOME%\lib\jopt-simple-4.7.jar;%APP_HOME%\lib\amqp-client-5.7.3.jar;%APP_HOME%\lib\rethinkdb-driver-2.3.3.jar;%APP_HOME%\lib\slf4j-simple-1.7.25.jar;%APP_HOME%\lib\slf4j-api-1.7.28.jar;%APP_HOME%\lib\jline-3.12.1.jar;%APP_HOME%\lib\jansi-1.11.jar;%APP_HOME%\lib\gson-2.8.1.jar;%APP_HOME%\lib\reflections-0.9.11.jar;%APP_HOME%\lib\guava-23.0.jar;%APP_HOME%\lib\xmlpull-1.1.3.4d_b4_min.jar;%APP_HOME%\lib\snakeyaml-1.13.jar;%APP_HOME%\lib\netty-buffer-4.1.24.Final.jar;%APP_HOME%\lib\bcpkix-jdk15on-1.53.jar;%APP_HOME%\lib\joda-time-2.7.jar;%APP_HOME%\lib\netty-all-4.1.39.Final.jar;%APP_HOME%\lib\mysql-connector-java-5.1.35.jar;%APP_HOME%\lib\sqlite-jdbc-3.8.11.2.jar;%APP_HOME%\lib\h2-1.4.187.jar;%APP_HOME%\lib\bcprov-jdk15on-1.53.jar;%APP_HOME%\lib\javax.servlet-api-4.0.1.jar;%APP_HOME%\lib\jsr305-1.3.9.jar;%APP_HOME%\lib\error_prone_annotations-2.0.18.jar;%APP_HOME%\lib\j2objc-annotations-1.1.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.14.jar;%APP_HOME%\lib\netty-common-4.1.24.Final.jar;%APP_HOME%\lib\json-simple-1.1.1.jar;%APP_HOME%\lib\javassist-3.21.0-GA.jar;%APP_HOME%\lib\junit-4.10.jar;%APP_HOME%\lib\hamcrest-core-1.1.jar

@rem Execute AmeliaPOS
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %AMELIA_POS_OPTS%  -classpath "%CLASSPATH%" io.amelia.pos.server.EntryPoint %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable AMELIA_POS_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%AMELIA_POS_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
