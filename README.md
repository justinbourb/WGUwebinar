# WGUwebinar
Software 1 java GUI webinar

#Getting started
##Requirements
1. IntelliJ (download and install)
2. JavaFX  (download and extract file)

##Setting up Intellij to recognize JavaFx
1. Create your JavaFX project with Intellij
2. Goto Run -> Edit Configurations  
    a. In the VM options field enter the following:  
    --module-path ${PATH_TO_FX} --add-modules javafx.fxml,javafx.controls,javafx.graphics
3. Goto File -> Settings -> Path Variables -> click the + to add a new path variable  
    a. Name: PATH_TO_FX  
       Value: your_path_to_FX (where ever you extracted the FX files)
