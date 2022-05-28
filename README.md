## Running Jenkins

`./gradlew docker dockerRun`

* We used Job DSL plugin to declare jobs programmatically
* There is one *seedJob* we defined that will create all the other pipelines defined in *createJobs.groovy* 
* This will allow us to recover from every crush jenkins may suffer and to re-create all the jobs we had before 

Jenkins will then be available at [http://localhost:8080](http://localhost:8080).

