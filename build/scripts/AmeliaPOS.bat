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

set CLASSPATH=%APP_HOME%\lib\AmeliaPOS-1.0.jar;%APP_HOME%\lib\epsonupos.T88V.jar;%APP_HOME%\lib\epsonupos.H6000IV.jar;%APP_HOME%\lib\epsonupos.T70II.jar;%APP_HOME%\lib\epsonupos.previous.jar;%APP_HOME%\lib\pos.v4.0001.jar;%APP_HOME%\lib\xercesImpl.jar;%APP_HOME%\lib\pos.v4.0001_02.jar;%APP_HOME%\lib\epsonupos.m30.jar;%APP_HOME%\lib\epsonupos.Mobile1.jar;%APP_HOME%\lib\epsonupos.admin.jar;%APP_HOME%\lib\epsonupos.core.v1.14.0001m.jar;%APP_HOME%\lib\epsonupos.T81.jar;%APP_HOME%\lib\xml-apis.jar;%APP_HOME%\lib\epsonupos.P20.jar;%APP_HOME%\lib\epsonupos.trace.jar;%APP_HOME%\lib\epsonupos.T82II.jar;%APP_HOME%\lib\uposcommon.core.v1.14.0001m.jar;%APP_HOME%\lib\epsonupos.T81II.jar;%APP_HOME%\lib\epsonupos.T20II.jar;%APP_HOME%\lib\epsonupos.P60II.jar;%APP_HOME%\lib\epsonupos.jar;%APP_HOME%\lib\epsonupos.core.v1.14.0001.jar;%APP_HOME%\lib\pos.v4.0001_01.jar;%APP_HOME%\lib\epsonupos.T88VI.jar;%APP_HOME%\lib\epsonupos.H2000.jar;%APP_HOME%\lib\uposcommon.jar;%APP_HOME%\lib\epsonupos.L90.jar;%APP_HOME%\lib\epsonupos.core.v1.14.0001T1.jar;%APP_HOME%\lib\uposcommon.core.v1.14.0001.jar;%APP_HOME%\lib\epsonupos.P80.jar;%APP_HOME%\lib\pos.jar;%APP_HOME%\lib\epsonupos.T20.jar;%APP_HOME%\lib\epsonupos.T82.jar;%APP_HOME%\lib\epsonupos.d30.jar;%APP_HOME%\lib\epsonupos.L90LinerFree.jar;%APP_HOME%\lib\netty-all-4.1.39.Final.jar

@rem Execute AmeliaPOS
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %AMELIA_POS_OPTS%  -classpath "%CLASSPATH%" io.amelia.pos.Step9Main %CMD_LINE_ARGS%

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
