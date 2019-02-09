#This is to add to the core-image-minimal
#our application ie we are now extending the
#core-image-minimal to include our applications

#Here the bbexample is the recipe that eventually
#generates our executable file which is also named
#bbexample 

IMAGE_INSTALL +="bbexample"
