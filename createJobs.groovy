pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job-1') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sfechisalin/spring-boot-api-example.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}