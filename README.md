This project shows a basic set up for grabbing dependencies from a local ivy repository.
We have a BrokenComputer java file which has a dependency on a StupidClass file
(Broken Computer doesn't compute very well)
We need to add StupidClass to the classpath in order to compile BrokenComputer
Earlier we jarred StupidClass into Stupid jar and added it to our ivy repo
We can now use this jar to compile our BrokenComputer

Complete this exercise by performing the following actions ->
1) Update the repo.dir in the ivySettings.xml file to point at the repo directory found in the root of this project (absolute path required)
2) Grab the dependencies => 'ant get-dependencies'
3) Build the distribution => 'ant dist'
(Optional) Publish the distribution => 'ant publish'

Get-Dependencies -> Grab the dependencies found in ivy.xml and throw them into the lib directory
Dist -> Successfully compile the source code by adding the lib directory to the classpath
Publish -> Use the resolved ivy pattern to publish the specified artifact to the repository

Test the compilation works by navigating to the build directory and running the command
( keep in mind that on linux to add a jar to your current path use :. on windows use;. )
java -cp ..\lib\StupidJar.jar;. shane.nolan.wit.BrokenComputer

Test the distribution works by navigating to the dist directory and running the command
java -jar [path]\BrokenComputer.jar