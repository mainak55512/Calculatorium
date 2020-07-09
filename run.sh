#!/bin/bash

# give here your javafx11 folder's full path in CLASSPATH & dest folder's full path in DEST:
#--------------------------------------------------------------------------------------------
export CLASSPATH=/home/mainak/programs/Java_Programmes_2020/Calculator/javafx11/lib
export DEST=/home/mainak/programs/Java_Programmes_2020/Calculator/dest

# after -d give dest folder's full path:
#--------------------------------------------------------
javac -d $DEST --module-path $CLASSPATH --add-modules javafx.fxml,javafx.controls,javafx.graphics Calc.java mainctrl.java

# after -cp give dest folder's full path:
#----------------------------------------------------------
java -cp $DEST --module-path $CLASSPATH --add-modules javafx.fxml,javafx.controls,javafx.graphics Calc
