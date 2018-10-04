This project shows a basic set up for publishing to a local ivy repository.
Complete this exercise by running 'ant dist' followed by 'ant publish'
Open the ivysettings.xml file, update the repo.dir to be an absolute path to the chosen repo directory

clean -> Deletes the build directory and the distribution (dist) directory
init -> Create the build directory
compile -> Compile the code found in the source directory into into the build directory
dist -> Jar up the build directory and put the jar into the distribution (dist) directory
resolve-and-retrieve -> Read the ivy.xml file and the ivySettings.xml file
publish -> Use the resolved ivy pattern to publish the specified artifact to the repository

Check the repo directory, you should see the publish artifact