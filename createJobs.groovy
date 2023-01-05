pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/GarethPark/spring-boot-api-example'
                    }
                    branch'master'
                }
            }
        }
    }
}
pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/GarethPark/spring-boot-api-example'
                    }
                    branch'master'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}